package com.fjmpaez.pojo;

public class Request {
	
	private String msisdn;
	private String user_id;
	private String recurrence;
	private String request_trx_id;
	private String channel;
	
	public Request() {
		super();
	}

	public Request(String msisdn, String user_id, String recurrence, String request_trx_id, String channel) {
		super();
		this.msisdn = msisdn;
		this.user_id = user_id;
		this.recurrence = recurrence;
		this.request_trx_id = request_trx_id;
		this.channel = channel;
	}

	public String getMsisdn() {
		return msisdn;
	}
	
	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}
	
	public String getUser_id() {
		return user_id;
	}
	
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	
	public String getRecurrence() {
		return recurrence;
	}
	
	public void setRecurrence(String recurrence) {
		this.recurrence = recurrence;
	}
	
	public String getRequest_trx_id() {
		return request_trx_id;
	}
	
	public void setRequest_trx_id(String request_trx_id) {
		this.request_trx_id = request_trx_id;
	}
	
	public String getChannel() {
		return channel;
	}
	
	public void setChannel(String channel) {
		this.channel = channel;
	}

	@Override
	public String toString() {
		return "Request [msisdn=" + msisdn + ", user_id=" + user_id + ", recurrence=" + recurrence + ", request_trx_id="
				+ request_trx_id + ", channel=" + channel + "]";
	}
	
}
