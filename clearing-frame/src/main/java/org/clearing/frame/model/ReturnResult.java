package org.clearing.frame.model;

import org.clearing.frame.constant.Result;

//需要继承Serializable，这里暂时不继承。
public class ReturnResult implements java.io.Serializable {
	
	//枚举类,这里变量设置为包权限
	Result result ;
	
	public ReturnResult(Result result) {
		this.result = result;
	}

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}
	
	
}
