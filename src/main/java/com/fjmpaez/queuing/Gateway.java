package com.fjmpaez.queuing;

import org.springframework.messaging.handler.annotation.Payload;

import com.fjmpaez.pojo.Request;

public interface Gateway {

	void send(@Payload Request request);
	
}
