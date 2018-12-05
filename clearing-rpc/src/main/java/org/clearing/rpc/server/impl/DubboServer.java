package org.clearing.rpc.server.impl;

import java.util.Map;

import org.clearing.rpc.model.ReturnResult;
import org.clearing.rpc.server.BaseServer;

public interface DubboServer extends BaseServer {
	
	@Override
	default public ReturnResult doServer(Map<String, String> variableMap) {
		return null;
	}

}
