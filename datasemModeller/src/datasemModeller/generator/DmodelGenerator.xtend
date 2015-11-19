/*
 * generated by Xtext 2.9.0.rc1
 */
package datasemModeller.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import java.util.Random
import org.eclipse.emf.common.util.EList
import datasemModeller.dmodel.*
import java.text.DecimalFormat

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class DmodelGenerator implements IGenerator {
	private Random rng = new Random();
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		// Fixed Seeding
		this.setSeed(123456789)
		// Scenario Generator
		fsa.generateFile("ExperimentModel.xml",compile(resource))
		System.out.println("XML Scenario Built: "+resource.allContents.toIterable.filter(ModelBuilder).get(0).name)
		// ContractNetProtocol Java Complier
		//fsa.generateFile("AbstractAgentBehavior.java", compileCNP())	
	}
	
def setSeed(int seed) {
	this.rng.setSeed(seed);
}

// --------------------------------------------------------------------------
def compile(Resource res) '''	
�var modelBuilder = res.allContents.toIterable.filter(ModelBuilder).get(0)�
�var ExperimentModel emodel = modelBuilder.getExperimentModel()�
�var UserLibraries ulib = modelBuilder.getUserLibraries()�
<ExperimentModel experimentId="0" name="�modelBuilder.name�" description="�modelBuilder.description�">
�printIndicators(emodel.indicators)�
�printServiceProviderTypes(ulib.getServiceProviderTypes())�
�printWorkItemTypes(ulib.getWorkItemTypes())�
�printServices(ulib.getServices())�
�printClassOfServices(ulib.getClassOfServices())�	
	<Runs>
	<Run runId="1" description="�emodel.name�" numberOfReplications="100" numberOfSteps="10000">
		<OrganizationalModel>
		<ServiceProviders>
		�buildOrganization(emodel)�
		</ServiceProviders>
		</OrganizationalModel>
		<WorkItemNetworkModel>		
		<WorkSources>
		�FOR ws : emodel.getWorkSources()�
			�printWorkSource(ws)�
		�ENDFOR�	
		</WorkSources>	
		<WorkItems>
		�buildWorkItems(emodel)�
		</WorkItems>
		</WorkItemNetworkModel>
	</Run>
	</Runs>
</ExperimentModel>	
'''
// --------------------------------------------------------------------------
def compileCNP() '''
package contractNetProtocol;
'''

// --------------------------------------------------------------------------
	def assignWorkItemsId(WorkItemNetwork win, int startId) '''
		�var wiId=startId�
		�FOR wi: win.getWorkItems()�
			�wi.setId(wiId++)�
		�ENDFOR�
		
	'''
	def assignServiceProvidersId(EList<ServiceProvider> sps) '''
		�var serviceProviderId=1�
		�var resourceId=1�
		�FOR sp: sps�
			�sp.setId(serviceProviderId++)�
			�FOR r: sp.getResources()�
				�r.setId(resourceId++)�
			�ENDFOR�
		�ENDFOR�
	'''
	def buildWorkItems(ExperimentModel emodel) '''
		�var winId=1�
		�FOR win: emodel.workItemNetworks�
		�win.setId(winId++)�
		�ENDFOR�
		�var wiId=1�
		�FOR winRS: emodel.WINReplications� 
		�IF winRS.numReplications>0�
		�FOR r : 1..winRS.numReplications� 
		�FOR wi : winRS.workItemNetwork.workItems �
		�wi.setId(wiId++)�
		�ENDFOR�
		�FOR wi : winRS.workItemNetwork.workItems �
		�printWorkItem(wi,r)�
		�ENDFOR�
		�ENDFOR�
		�ENDIF�  
		�ENDFOR� 		 	
	'''
	def buildOrganization(ExperimentModel emodel) '''
		�var spId=1�
		�var resourceId=1�
		�FOR sp: emodel.serviceProviders� 
		�sp.setId(spId++)�
		�ENDFOR�
		�FOR sp: emodel.serviceProviders� 
		�printServiceProvider(sp)�
		<Resources>
		�FOR r : sp.resources� 
		�var int number = (readNumParameter(r.number)).intValue()�
		�IF number>0�
		�FOR n : 1..number�		
		�r.setId(resourceId++)�
		�printResource(r,n)�
		�ENDFOR�
		�ENDIF� 
		�ENDFOR�
		</Resources>
		</ServiceProvider> 
		�ENDFOR�    	
	'''	  

	def printServiceProvider(ServiceProvider sp) '''
			<ServiceProvider serviceProviderId="�sp.id�" name="�sp.name�" typeId="�sp.getType.id�" description="">
			<AssignWITo>
			�FOR tu : sp.getAssignTo()�
			<serviceProviderId>�tu.id�</serviceProviderId>
			�ENDFOR�
			</AssignWITo>
			<BorrowResourceFrom>
			�FOR tu : sp.getOutsourceFrom()�
			<serviceProviderId>�tu.id�</serviceProviderId>
			�ENDFOR�
			</BorrowResourceFrom>
			<GovernanceStrategy>
			<Mechanisms>
			�IF sp.governanceStrategy.isPull()�
			�FOR m:sp.governanceStrategy.pullStrategy.mechanisms�
			�printMechanism(m)�
			�ENDFOR�
			�ELSEIF sp.governanceStrategy.isPush()�
			�FOR m:sp.governanceStrategy.pullStrategy.mechanisms�
			�printMechanism(m)�
			�ENDFOR�
			�ENDIF�
			</Mechanisms>		
���					<AcceptanceRule>�sp.governanceStrategy.getWIAcceptanceRule.type.name�</AcceptanceRule>
���					<SelectionRule>�sp.governanceStrategy.getWISelectionRule.type.name�</SelectionRule>
���					<AssignmentRule>�sp.governanceStrategy.getWIAssignmentRule.type.name�</AssignmentRule>
���					<AllocationRule>�sp.governanceStrategy.getResourceAllocationRule.type.name�</AllocationRule>
���					<OutsourcingRule>�sp.governanceStrategy.getResourceOutsourcingRule.type.name�</OutsourcingRule>						
			</GovernanceStrategy>	
	'''
	def printResource(Asset r, int n) '''
			<Resource resourceId="�r.id�" name="�r.name+"."+n�" description="">
			<SkillSet>
			�FOR s : r.getSkillSet()� 
			�printSkill(s)�
			�ENDFOR�	
			</SkillSet>	
			</Resource>	
	'''	
	def printSkill(Skill s) '''
			<Skill serviceId="�s.service.id�" name="�s.service.name�" efficiency="�Math.max(readNumParameter(s.efficiency),0)�"></Skill>
	'''

	def printWorkSource(WorkSource ws) '''
			<WorkSource name="�ws.name�" description="�ws.description�">
			<AssignWITo>
			�FOR tu : ws.getAssignTo()�
			<serviceProviderId>�tu.id�</serviceProviderId>
			�ENDFOR�
			</AssignWITo>
���				�IF ws.getAssignmentRule() != null�
���				<AssignmentRule>�ws.getAssignmentRule().type.name�</AssignmentRule>						
���				�ELSE�
���				<AssignmentRule>�"null"�</AssignmentRule>
���				�ENDIF�				
			</WorkSource>
	'''
	def printWorkItem(WorkItem wi, int r) '''
			<WorkItem wiId="�wi.id�" name="�if(r>1){wi.name+"("+r+")"}else{wi.name}�" typeId="�wi.getType.id�" isAggregationNode="�wi.hasSubtasks�" hasPredecessors="�wi.hasPredecessors�" hasImpacts="�wi.hasImpacts�">
				<GovernanceAttributes>
���				�printGovernanceAttribute("ClassOfService",String.valueOf(wi.getClassOfService.id))�
				�IF	(readNumExpression(wi.value) > 0)�
				�printGovernanceAttribute("Value",String.valueOf(Math.max(readNumExpression(wi.value),0)))�
				�ENDIF�	
				�IF	(wi.arrivalTime > 0)�
				�printGovernanceAttribute("ArrivalTime",String.valueOf(wi.arrivalTime))�
				�ENDIF�	
				</GovernanceAttributes>
				�IF	wi.hasPredecessors�
				<Predecessors>
				�FOR ptask : wi.getPTasks()�
				<workItemId>�ptask.id�</workItemId>
				�ENDFOR�	
				</Predecessors>
				�ENDIF�	
				�IF	wi.hasSubtasks�
				<Subtasks>
				�FOR stask : wi.getSTasks()�				
				<workItemId>�stask.id�</workItemId>
				�ENDFOR�		
				</Subtasks>
				�ENDIF�	
				�IF	wi.hasImpacts�
				<Impacts>
				�FOR impact : wi.getImpacts()�			
				<Impact workItemId="�impact.impactWI.id�" likelihood="�Math.max(readNumParameter(impact.likelihood),0)�" risk="�Math.max(readNumParameter(impact.risk),0)�"></Impact>
				�ENDFOR�	
				</Impacts>
				�ENDIF�
				<RequiredAnalysis>
				�FOR ra : wi.getRequiredAnalysis()�	
				<RequiredService serviceId="�ra.serviceType.id�" efforts="�Math.max(readNumParameter(ra.efforts),1)�"></RequiredService>
				�ENDFOR�
				</RequiredAnalysis>
				<RequiredServices>
				�FOR rs : wi.getRequiredServices()�	
				<RequiredService serviceId="�rs.serviceType.id�" efforts="�Math.max(readNumParameter(rs.efforts),1)�"></RequiredService>
				�ENDFOR�
				</RequiredServices>
���				<ClassOfService>�wi.classOfService.name�</ClassOfService>
���				<Efforts>�wi.efforts�</Efforts>
���				<Value>�wi.value�</Value>	
���				�IF wi.getWorkSource() != null� 
���				<Source>�wi.getWorkSource().name�</Source>
���				�ELSE�
���				<Source>�"null"�</Source>
���				 �ENDIF�
���				<ArrivalTime>�wi.arrivalTime�</ArrivalTime>
���				<DueDate>�wi.dueDate�</DueDate>
			</WorkItem>
	'''
	def printGovernanceAttribute(String name, String value) '''
		<GovernanceAttribute name="�name�" value="�value�"></GovernanceAttribute>
	'''
	def printServices(EList<Service> ss) '''
		<Services>
		�var id=1�
		�FOR s : ss�		
			�s.setId(id++)�	
			<Service serviceId="�s.id�" name="�s.name�" description="�s.description�"></Service>
		�ENDFOR�
		</Services>
	'''	
	def printClassOfServices(EList<ClassOfService> cs) '''
		<ClassOfServices>
		�var id=1�
		�FOR c : cs�
			�c.setId(id++)�	
			<ClassOfService cosId="�c.id�" name="�c.name�" description="�c.description�" isDisruptive="�c.disruptive�"></ClassOfService>
		�ENDFOR�
		</ClassOfServices>
		
	'''	
	def printServiceProviderTypes(EList<ServiceProviderType> ts) '''
		<ServiceProviderTypes>
		�var id=1�
		�FOR t : ts�
			�t.setId(id++)�	
			<ServiceProviderType spTypeId="�t.id�" hierarchy="�t.hierarchy�" name="�t.name�" description="�t.description�"></ServiceProviderType>
		�ENDFOR�
		</ServiceProviderTypes>
	'''		
	def printWorkItemTypes(EList<WorkItemType> ts) '''
		<WorkItemTypes>
		�var id=1�
		�FOR t : ts�
			�t.setId(id++)�	
			<WorkItemType wiTypeId="�t.id�" hierarchy="�t.hierarchy�" name="�t.name�" description="�t.description�"></WorkItemType>
		�ENDFOR�
		</WorkItemTypes>
	'''	

	def printGovernanceStrategy(GovernanceStrategy govs) '''
		�FOR m: govs.pullStrategy.getMechanisms()�
		 	�printMechanism(m)�
		�ENDFOR�
	'''
	def printMechanism(Mechanism m) '''
		<Mechanism name="�m.name�" value="�m.value�">
		�FOR a: m.getAttributes()�
			<Attribute name="�a.attribute�" value="�a.value�"></Attribute> 
		�ENDFOR�
		</Mechanism>
	'''
	def printIndicators(EList<String> is) '''
		�FOR i : is�
		<Indicator name="�i�"></Indicator>
		�ENDFOR�
	'''
	
	def sampleDistribution(Distribution d) {
		var sampledValue = 0.0		
		if (d.isNormal) {			
			var double mean= Double.parseDouble(d.parameters.get(0))
			var double stdev= Double.parseDouble(d.parameters.get(1))
			var double rand = this.rng.nextGaussian()
			sampledValue = mean + stdev*rand
		}	
		else if (d.isUniform) {
			var double ll=Double.parseDouble(d.parameters.get(0))
			var double ul=Double.parseDouble(d.parameters.get(1))
			var double rand = this.rng.nextDouble()
			sampledValue = ll + (ul-ll)*rand
		}		
		return sampledValue
	}
	
	def readNumExpression(NumExpression e) {
		var numValue = 0.0
		if (e!=null) {
			if (e.isDistribution) {
				numValue = sampleDistribution(e.numDist)
				numValue =Double.parseDouble(new DecimalFormat("##.###").format(numValue));
			}
			else {numValue=Double.parseDouble(e.numValue)}
		}
		return numValue
	}
	def readNumParameter(AbstractParameter p) {
		var v= 0.0
		if (p.isVariable) {
			if (p.variable.isNum) {
				v = Double.parseDouble(p.variable.numValue)
			}
			else if (p.variable.isDistribution) {
				v = sampleDistribution(p.variable.numDist)
			}
		}
		else {v=Double.parseDouble(p.value)}
		v =Double.parseDouble(new DecimalFormat("##.###").format(v));	
		return v
	}
	def readStringParameter(AbstractParameter p) {
		var String value=""
		if (p.isVariable) {
			value=p.variable.stringValue
		}	
		else {value=p.value}		
		return value
	}
}