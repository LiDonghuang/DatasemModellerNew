/*
 * generated by Xtext
 */
package datasemModeller.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import datasemModeller.ui.internal.DmodelActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class DmodelExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return DmodelActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return DmodelActivator.getInstance().getInjector(DmodelActivator.DATASEMMODELLER_DMODEL);
	}
	
}
