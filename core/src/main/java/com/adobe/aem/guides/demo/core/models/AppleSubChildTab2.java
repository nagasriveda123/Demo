package com.adobe.aem.guides.demo.core.models;


import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

public class AppleSubChildTab2 {

    @ValueMapValue
    private String companyname;

    @ValueMapValue
    private String expirydate;

    public String getCompanyname() {
        return companyname;
    }

    public String getExpirydate() {
        return expirydate;
    }

    
}
