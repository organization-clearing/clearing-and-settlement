package org.clearing.calculation;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class DemoListener implements ServletContextListener {

	public void contextInitialized(ServletContextEvent sce) {
		DependenceTestForPRC dForPRC = new DependenceTestForPRC();
		System.out.println(dForPRC.getResult());
	}

	public void contextDestroyed(ServletContextEvent sce) {

	}
}
