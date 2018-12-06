package org.clearing.frame.server;

import java.util.Map;

import org.clearing.frame.model.ReturnResult;

public class AbstractBaseServer implements BaseServer {

	// default public ReturnResult doServer(Map<String, String> variableMap){..}

	/**
	 * 抽象类存在的意义：
	 * 前提：dubbo暴露的接口，而接口的实现交由实现类完成。由于该接口的doServer实现方法都一致，因此需要在高层中实现统一doServer方法。
	 * 
	 * 方法一：使用jdk1.8的default功能。【错误：报错实现类中没有doServer方法（Duboo不支持该方法）】
	 * 方法二：使用抽象类实现接口。
	 */
	@Override
	public ReturnResult doServer(Map<String, String> variableMap) {
		return new ReturnResult();
	}

}
