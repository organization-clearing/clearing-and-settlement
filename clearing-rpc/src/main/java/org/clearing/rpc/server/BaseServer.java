package org.clearing.rpc.server;

import java.util.Map;

import org.clearing.rpc.model.ReturnResult;

public interface BaseServer {
	ReturnResult doServer(Map<String, String> variableMap);
}
