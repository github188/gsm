package org.zxl.utils;

/**
 * Created by zxl_lls@foxmail.com on 2018/2/28.
 */
public class StatusTool {
	private String status;

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

	private Object obj;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public StatusTool getStatusObj(String status, Object obj){
		this.status = status;
		this.obj = obj;
		return this;
	}
}
