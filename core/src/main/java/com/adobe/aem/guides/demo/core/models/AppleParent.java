
package com.adobe.aem.guides.demo.core.models;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ScriptVariable;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.day.cq.wcm.api.Page;

@Model(adaptables = {Resource.class,SlingHttpServletRequest.class}, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class AppleParent {

    @ValueMapValue
    private String text;

    @ValueMapValue
    private String des;

    @ValueMapValue
    private int num;

    @ValueMapValue
    private String color;

    @ScriptVariable
    Page currentPage;

    @Inject
    ResourceResolver resolver;

    @ValueMapValue
    @Named(value="jcr:createdBy")
    public String author;
    public String getAuthor()
    {
        return author;
    }

    public String getArticletitle()
    {
        return currentPage.getTitle();
    }

    public String getArticlePagePath()
    {
        return currentPage.getPath();
    }

    public Page getArticlePageParent()
    {
        return currentPage.getParent();
    }

    public String getWebContentNode()
    {
        return resolver.getUserID();
    }

    @ChildResource(name = "bookdetails") 
    private List<AppleChild> bookdetails;

    public String getText() {
        return text;
    }

    public String getDes() {
        return des;
    }

    public int getNum() {
        return num;
    }

    public String getColor() {
        return color;
    }

    public List<AppleChild> getBookdetails() {
        return bookdetails;
    }
}
