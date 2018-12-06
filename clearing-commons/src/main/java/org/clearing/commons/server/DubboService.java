package org.clearing.commons.server;

import java.util.Map;

import org.clearing.commons.dubbo.model.ReturnResult;

public interface DubboService {
	default public ReturnResult doDubboService(Map<String, String> variableMap){
		return null;
	}
}
