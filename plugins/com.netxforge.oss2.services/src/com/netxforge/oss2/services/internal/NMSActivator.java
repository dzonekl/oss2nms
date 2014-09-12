package com.netxforge.oss2.services.internal;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class NMSActivator implements BundleActivator {

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		NMSActivator.context = bundleContext;
		
		// Kick start our Services here. 
		System.out.println("starting bundle");
		
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		NMSActivator.context = null;
		System.out.println("stoping bundle");
	}

}
