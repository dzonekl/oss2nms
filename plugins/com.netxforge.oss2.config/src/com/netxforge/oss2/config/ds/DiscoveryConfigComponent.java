package com.netxforge.oss2.config.ds;

import java.io.IOException;

import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.ValidationException;

import com.netxforge.oss2.config.DiscoveryConfigFactory;

public class DiscoveryConfigComponent implements IDiscoveryConfigComponent {

	public void activate() {

		Exception t = null;

		System.out.println("Starting Discovery Config service");
		try {
			DiscoveryConfigFactory.init();
		} catch (MarshalException e) {
			// e.printStackTrace();
			t = e;
		} catch (ValidationException e) {
			// e.printStackTrace();
			t = e;
		} catch (IOException e) {
			// e.printStackTrace();
			t = e;
		} finally {
			if (t != null) {
				System.out
						.println("Failed to initialize the Discovery config service, exception: "
								+ t.getMessage());
			}
		}
	}

	public void deactivate() {
		System.out
				.println("Stopping Discovery Config service (This service can't be stopped)");
	}

	@Override
	public DiscoveryConfigFactory getDiscoveryConfigFactory() {
		return DiscoveryConfigFactory.getInstance();
	}

}
