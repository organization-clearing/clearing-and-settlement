package org.clearing.frame.rpc.server.impl;

import java.util.Map;

import org.clearing.frame.constant.Result;
import org.clearing.frame.model.ReturnResult;
import org.clearing.frame.rpc.server.RPCServer;

public class DubboRPCServer implements RPCServer{

	@Override
	public ReturnResult doServer(Map<String, String> variableMap) {

		//根据variableMap参数进行操作，在返回结果
		if (variableMap !=null) {
			return new ReturnResult(Result.SUCCESS);
		}
		
		return new ReturnResult(Result.ERROR);
	
	}

}
