/*
 * generated by Xtext
 */
package de.tu_bs.cs.isf.mbse.mbtimes;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class NplStandaloneSetup extends NplStandaloneSetupGenerated{

	public static void doSetup() {
		new NplStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
