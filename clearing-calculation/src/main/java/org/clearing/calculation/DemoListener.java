package org.clearing.calculation;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.clearing.commons.test.BiuBiuBiu;

public class DemoListener implements ServletContextListener {

	public void contextInitialized(ServletContextEvent sce) {
		DependenceTestForPRC dForPRC = new DependenceTestForPRC();
		System.out.println(dForPRC.getResult());
		
		BiuBiuBiu biu = new BiuBiuBiu();
		biu.getString();
	}

	public void contextDestroyed(ServletContextEvent sce) {

	}
}
