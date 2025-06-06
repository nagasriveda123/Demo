package com.adobe.aem.guides.demo.core.servlets;

import java.io.IOException;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
//import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
//import org.apache.sling.servlets.annotations.SlingServletPaths;
import org.apache.sling.servlets.annotations.SlingServletResourceTypes;
import org.osgi.service.component.annotations.Component;

@Component(service = Servlet.class, immediate = true, enabled = true)
@SlingServletResourceTypes(resourceTypes = "surge/beml")
public class DemoServlet extends SlingAllMethodsServlet {

    @Override
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response)
            throws ServletException, IOException {
        response.getWriter().write("Data coming from the SlingSafeMethodServlet -->doGet");
    }

     @Override
    protected void doPost(SlingHttpServletRequest request, SlingHttpServletResponse response)
            throws ServletException, IOException {
        response.getWriter().write("Data coming from the SlingSafeMethodServlet -->doPost");
    }

     @Override
    protected void doPut(SlingHttpServletRequest request, SlingHttpServletResponse response)
            throws ServletException, IOException {
        response.getWriter().write("Data coming from the SlingSafeMethodServlet -->doPut");
    }

     @Override
    protected void doDelete(SlingHttpServletRequest request, SlingHttpServletResponse response)
            throws ServletException, IOException {
        response.getWriter().write("Data coming from the SlingSafeMethodServlet -->doDelete");
    }
}
