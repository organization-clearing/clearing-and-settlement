package org.clearing.frame.rpc.server;

import java.util.Map;

import org.clearing.frame.model.ReturnResult;

public interface RPCServer {
	
	ReturnResult doServer(Map<String, String> variableMap);
	
}
