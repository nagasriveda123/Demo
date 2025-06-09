package com.adobe.aem.guides.demo.core.schedulers;

import org.apache.sling.commons.scheduler.ScheduleOptions;
import org.apache.sling.commons.scheduler.Scheduler;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Component(service=Runnable.class,enabled=true,immediate=true)
@Designate(ocd=ArticleExpiryConfiguration.class)
public class ArticleExpiryImpl implements Runnable {
    private static final Logger LOG=LoggerFactory.getLogger(ArticleExpiryImpl.class);

    @Reference
    Scheduler scheduler;
    @Override
    public void run() {
        LOG.info("Data coming from ArticleExpiryScheduler");
    
    }

    @Activate
    public void activate(ArticleExpiryConfiguration aec)
    {
     updateConfigurations(aec);   
    }

    @Deactivate
    public void deactivate(ArticleExpiryConfiguration aec)
    {
        updateConfigurations(aec);   
    }
    @Modified
    public void modified(ArticleExpiryConfiguration aec)
    {
        updateConfigurations(aec);   
    }

    public void updateConfigurations(ArticleExpiryConfiguration aec)
    {
             if(aec.scheduler_enabled())
             {
                ScheduleOptions options=scheduler.EXPR(aec.scheduler_cronExpression());
            options.name(aec.scheduler_name());
            options.canRunConcurrently( aec.scheduler_concurrent());
            scheduler.schedule(this,options);
            LOG.info("Scheduler added Successfully name'{}'",aec.scheduler_name());
             }
             else{
                LOG.info("ArticleExpiry Task disabled");
             }

    }
}