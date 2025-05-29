package com.adobe.aem.guides.demo.core.models;

import java.util.List;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class AppleParentTab2 {
    @ValueMapValue
    private String productname;

    public String getProductname() {
        return productname;
    }
    
    @ChildResource(name = "productdetails") 
    private List<AppleChildTab2> productdetails;

    public List<AppleChildTab2> getProductdetails() {
        return productdetails;
    }

    

}
