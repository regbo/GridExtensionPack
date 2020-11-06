package org.vaadin.teemusav7.gridextensions.demo;

import javax.servlet.annotation.WebServlet;

import com.vaadin.v7.annotations.Theme;
import com.vaadin.v7.annotations.Title;
import com.vaadin.v7.annotations.VaadinServletConfiguration;
import com.vaadin.v7.server.VaadinRequest;
import com.vaadin.v7.server.VaadinServlet;
import com.vaadin.v7.ui.TabSheet;
import com.vaadin.v7.ui.UI;

@Theme("demo")
@Title("GridExtensionPack Add-on Demo")
@SuppressWarnings("serial")
public class DemoUI extends UI {

    @WebServlet(value = "/*", asyncSupported = true)
    @VaadinServletConfiguration(productionMode = false, ui = DemoUI.class, widgetset = "org.vaadin.teemusav7.gridextensions.demo.DemoWidgetSet")
    public static class Servlet extends VaadinServlet {
    }

    @Override
    protected void init(VaadinRequest request) {
        TabSheet tabSheet = new TabSheet();
        tabSheet.addTab(new DemoContentLayout(), "main demo");
        tabSheet.addTab(new SidebarMenuExtensionLayout(), "sidebar extension demo");
        tabSheet.addTab(new HeaderWrapExtensionLayout(), "header wrap demo");
        tabSheet.setSizeFull();
        setContent(tabSheet);
    }
}
