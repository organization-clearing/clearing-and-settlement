package org.clearing.frame.server;

import java.util.Map;

import org.clearing.frame.model.ReturnResult;

public interface BaseServer {
	ReturnResult doServer(Map<String, String> variableMap);
}
