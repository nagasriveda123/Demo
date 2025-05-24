
package com.adobe.aem.guides.demo.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class AppleChild {

    @ValueMapValue
    private String bookname;

    @ValueMapValue
    private String date;

    @ValueMapValue
    private String author;

    public String getDate() {
        return date;
    }

    public String getAuthor() {
        return author;
    }

    public String getBookname() {
        return bookname;
    }
}
