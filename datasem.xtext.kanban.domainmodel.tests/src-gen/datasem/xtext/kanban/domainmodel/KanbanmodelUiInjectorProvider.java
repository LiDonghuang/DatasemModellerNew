/*
 * generated by Xtext
 */
package datasem.xtext.kanban.domainmodel;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class KanbanmodelUiInjectorProvider implements IInjectorProvider {
	
	@Override
	public Injector getInjector() {
		return datasem.xtext.kanban.domainmodel.ui.internal.KanbanmodelActivator.getInstance().getInjector("datasem.xtext.kanban.domainmodel.Kanbanmodel");
	}
	
}