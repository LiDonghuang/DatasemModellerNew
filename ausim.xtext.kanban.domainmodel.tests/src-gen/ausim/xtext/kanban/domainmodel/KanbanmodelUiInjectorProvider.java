/*
 * generated by Xtext
 */
package ausim.xtext.kanban.domainmodel;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class KanbanmodelUiInjectorProvider implements IInjectorProvider {
	
	@Override
	public Injector getInjector() {
		return ausim.xtext.kanban.domainmodel.ui.internal.KanbanmodelActivator.getInstance().getInjector("ausim.xtext.kanban.domainmodel.Kanbanmodel");
	}
	
}
