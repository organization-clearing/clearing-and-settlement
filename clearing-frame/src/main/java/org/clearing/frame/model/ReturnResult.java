package org.clearing.frame.model;

import javax.naming.spi.DirStateFactory.Result;

//需要继承Serializable，这里暂时不继承。
public class ReturnResult {
	
	//枚举类,这里变量设置为包权限
	Result result;
	
	private boolean returnResult = false;
	
	public ReturnResult() {
		returnResult = true;
	}

	public boolean isReturnResult() {
		return returnResult;
	}

	public void setReturnResult(boolean returnResult) {
		this.returnResult = returnResult;
	}
	
}
