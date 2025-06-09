package com.adobe.aem.guides.demo.core.schedulers;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;
@ObjectClassDefinition(name="ArticleExpiryConfiguration")
public  @interface ArticleExpiryConfiguration {
    @AttributeDefinition(
        name="name",
        description="finest hotel",defaultValue = "udupi"
    )
    public String scheduler_name();

    @AttributeDefinition(
        name="cron Expression",
        description="finest hotel"
    )
    public String scheduler_cronExpression() default "*/1 * * * *?";

    @AttributeDefinition(
        name="scheduler-enabled",
        description="finest hotel"
    )
    public boolean scheduler_enabled() default true;

    @AttributeDefinition(
        name="scheduler_concurrent",
        description="finest hotel",defaultValue = "true"
    )
    public boolean scheduler_concurrent() default true;




}
