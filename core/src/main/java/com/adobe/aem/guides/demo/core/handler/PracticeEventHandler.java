package com.adobe.aem.guides.demo.core.handler;

import org.apache.sling.api.SlingConstants;
import org.osgi.service.component.annotations.*;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventConstants;
import org.osgi.service.event.EventHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(service=EventHandler.class,immediate=true,enabled=true,
           property={EventConstants.EVENT_TOPIC + "=org/apache/sling/api/resource/Resource/*"})

public class PracticeEventHandler implements EventHandler {

    private final Logger log=LoggerFactory.getLogger(getClass());

    @Override
    public void handleEvent(Event event) {
        log.info("Event Topic = {},path= {}", event.getTopic(),event.getProperty(SlingConstants.PROPERTY_PATH));
        
    }

}
