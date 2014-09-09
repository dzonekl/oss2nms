package com.netxforge.oss2.poc.app;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;

public class Application implements IApplication {

	@Override
	public Object start(IApplicationContext context) throws Exception {
		System.out.println("Starting NMS Application");
		System.out.println(context);
		return null;
	}

	@Override
	public void stop() {

	}

}
