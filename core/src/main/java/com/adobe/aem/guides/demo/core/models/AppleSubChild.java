package com.adobe.aem.guides.demo.core.models;



import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class AppleSubChild {

    @ValueMapValue
    private String publicationname;

    @ValueMapValue
    private String publishedyear;

    @ValueMapValue
    private int edition;

    public String getPublicationname() {
        return publicationname;
    }

    public String getPublishedyear() {
        return publishedyear;
    }

    public int getEdition() {
        return edition;
    }
    
}
