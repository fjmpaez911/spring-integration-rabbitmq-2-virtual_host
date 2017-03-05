package com.fjmpaez.queuing;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.AmqpRejectAndDontRequeueException;
import org.springframework.stereotype.Component;
import org.springframework.util.ErrorHandler;

@Component
public class NotificationErrorHandler implements ErrorHandler {

    private static Logger LOG = LoggerFactory.getLogger(NotificationErrorHandler.class);

    @Override
    public void handleError(Throwable t) {
        LOG.warn("Unprocessable Notification", t);
        throw new AmqpRejectAndDontRequeueException(t);
    }

}
