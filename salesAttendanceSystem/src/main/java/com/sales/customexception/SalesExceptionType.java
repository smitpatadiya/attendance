package com.sales.customexception;

public class SalesExceptionType {
	 
   private String status;
   private int code;
   private Object Data;
	private String message;
  
	
  

	public SalesExceptionType(String status, int code, String message,Object data) {
		super();
		this.status = status;
		this.code = code;
		Data = data;
		this.message = message;
	}

	public SalesExceptionType(String message){
        this.message = message;
    }
 
    public String getMessage() {
        return message;
    }

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public Object getData() {
		return Data;
	}

	public void setData(Object data) {
		Data = data;
	}

	public void setMessage(String message) {
		this.message = message;
	}
    
    
 
}