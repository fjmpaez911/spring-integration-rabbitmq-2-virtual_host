package com.fjmpaez.queuing;

import org.springframework.messaging.handler.annotation.Payload;

import com.fjmpaez.pojo.Request;

public interface Gateway2 {

	void send(@Payload Request request);
	
}
