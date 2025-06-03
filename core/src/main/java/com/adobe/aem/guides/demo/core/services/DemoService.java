package com.adobe.aem.guides.demo.core.services;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(service=DemoService.class,immediate=true,enabled=true)
public class DemoService {

     private static final Logger LOG=LoggerFactory.getLogger(DemoService.class);
    @Reference
    DemoService demoService;
    @Activate
    public void activateContent()
    {
       LOG.info("msg is coming from the DemoService activate()");
    }
  
    @Deactivate
    public void Deactivate()
    {
       LOG.info("msg is coming from the DemoService deactivate()");
    }

    @Modified
    public void update()
    {
       LOG.info("msg is coming from the DemoService modified()");
    }
}
