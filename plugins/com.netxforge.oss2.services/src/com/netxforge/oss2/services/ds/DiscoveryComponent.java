package com.netxforge.oss2.services.ds;

import com.netxforge.oss2.config.DiscoveryConfigFactory;
import com.netxforge.oss2.config.ds.IDiscoveryConfigComponent;
import com.netxforge.oss2.services.discovery.Discovery;

/**
 * Wraps the {@link Discovery} daemon as a DS Service.
 * 
 * @author Christophe Bouhier
 */
public class DiscoveryComponent implements IDiscoveryComponent {

	private Discovery delegateDaemon;

	public void activate() {
		System.out.println("Starting service");
		delegateDaemon = new Discovery();
		delegateDaemon.start();
	}

	public void deactivate() {
		System.out.println("Stopping service");
		if (delegateDaemon != null) {
			delegateDaemon.stop();
		}
	}

	@Override
	public synchronized void setDiscoveryConfigComponent(
			IDiscoveryConfigComponent discoveryConfigComponent) {
		DiscoveryConfigFactory discoveryConfigFactory = discoveryConfigComponent
				.getDiscoveryConfigFactory();
		delegateDaemon.setDiscoveryFactory(discoveryConfigFactory);
	}

	@Override
	public synchronized void unsetDiscoveryConfigComponent(
			IDiscoveryConfigComponent discoveryConfigComponent) {
		delegateDaemon.setDiscoveryFactory(null);

	}
}
