package com.lovehurts.handler;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Exception<E> {

	private String path;
	
	private Date createTime;
	
	private String hostName;
	
	private E message;
	
	 public String getPath() {
	        return path;
	    }

	    public void setPath(String path) {
	        this.path = path;
	    }

	    public Date getCreateTime() {
	        return createTime;
	    }

	    public void setCreateTime(Date createTime) {
	        this.createTime = createTime;
	    }

	    public String getHostName() {
	        return hostName;
	    }

	    public void setHostName(String hostName) {
	        this.hostName = hostName;
	    }

	    public E getMessage() {
	        return message;
	    }

	    public void setMessage(E message) {
	        this.message = message;
	    }
}
