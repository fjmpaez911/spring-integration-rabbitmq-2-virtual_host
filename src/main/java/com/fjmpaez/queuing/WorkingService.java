package com.fjmpaez.queuing;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.fjmpaez.pojo.Request;

@Service
public class WorkingService {

	private static Logger LOG = LoggerFactory.getLogger(WorkingService.class);
	
	public void processMessageFromQueue (Request request) {
		
		LOG.info("Message recived from queue: " + request);
		
		
	}
}
