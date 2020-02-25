/**
 * 
 */
package com.knossys.rnd.test;

import org.apache.log4j.Logger;

/**
 * @author vvelsen
 */
public class KThreadTestApp extends KModuleThreadManager  {

	/**
	 * 
	 */
	public KThreadTestApp () {
		setLogger(Logger.getLogger(KThreadTestApp.class));
	}	
	
	/**
	 * 
	 */
	public void startDriver () {
		debug ("startDriver ()");
		
		boot ();
		
		addThread (new KModuleTimer());
		addThread (new KModuleTimer());
		addThread (new KmoduleConsole());
		// This one will be rejected because it's marked as a singleton
		addThread (new KmoduleConsole());
		addThread (new KModuleTemplate ());
		addThread (new KModuleTemplate ());
	}
		
	/**
	 * @param args
	 */
	public static void main(String args[]) {

		KThreadTestApp driver=new KThreadTestApp();
						
    driver.startDriver();
	}
}
