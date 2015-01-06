/*
 * generated by Xtext
 */
package ausim.xtext.kanban.domainmodel.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess

import ausim.xtext.kanban.domainmodel.kanbanmodel.Team
import ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem
import ausim.xtext.kanban.domainmodel.kanbanmodel.Task
import ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanWorkFlow



/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class KanbanmodelGenerator implements IGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
//		fsa.generateFile('greetings.txt', 'People to greet: ' + 
//			resource.allContents
//				.filter(typeof(Greeting))
//				.map[name]
//				.join(', '))

			fsa.generateFile("KSS-Scenario.xml", compile(resource))	
	}
	
def compile(Resource res) '''
		<?xml version="1.0"?>
		«FOR km : res.allContents.toIterable.filter(KanbanSchedulingSystem)» <KSSWorkFlowModel> «ENDFOR»
		<OrganizationDataModel>
		«FOR t : res.allContents.toIterable.filter(Team)»  
			<Team>
				<name> «t.name» </name>
				«FOR st : t.getGroupmembers()» 
					<subteam>«st.name»</subteam>
				«ENDFOR»	
				«FOR k : t.getServices()» 
					<service>«k.name»</service>
				«ENDFOR»			
			</Team>
		«ENDFOR»
		</OrganizationDataModel>
		<WorkflowDataModel>
		«FOR wftask : res.allContents.toIterable.filter(Task)»
			<workItem>
				<name> «wftask.name» </name>
				«FOR stask : wftask.getSTasks()»
					<subtask> «stask.name» </subtask>
				«ENDFOR»
			</workItem>
		«ENDFOR»
		</WorkflowDataModel>	
		«FOR kanbanWFlow : res.allContents.toIterable.filter(KanbanWorkFlow)» <KanbanWorkFlow>
				<capabilities>
				«FOR wfcap : kanbanWFlow.getCaps()»
					<capability>
						<name> «wfcap.name» </name>
						<requirements>
						«FOR wfreq : wfcap.getReqs()»
							<requirement>
								<name>« wfreq.name» </name>
								<tasks>
								«FOR wftask : wfreq.getRTasks()»
								<task>
									<name> «wftask.name» </name>	
								</task>
								«ENDFOR»
								</tasks>
								<process>
								«FOR wfpr : wfreq.getMechanisms()»
								<mechanism>
									<sourceTask> «wfpr.getSourceTask().name» </sourceTask>	
									<targetTask> «wfpr.getTargetTask().name» </targetTask>
								</mechanism>
								«ENDFOR»
								</process>
							</requirement>
						«ENDFOR»
						</requirements>
					</capability>
				«ENDFOR»
				</capabilities>
			«ENDFOR»
		</KanbanWorkFlow>
		</KSSWorkFlowModel>
	'''
}