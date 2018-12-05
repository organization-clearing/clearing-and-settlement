package org.clearing.calculation;

import org.clearing.rpc.model.ReturnResult;
import org.clearing.rpc.server.impl.DubboServer;

public class DependenceTestForPRC {
	DubboServer dubboServer;
	
	ReturnResult result = new ReturnResult();
	
	public ReturnResult getResult(){
		return this.result;
	}
	
	
}
