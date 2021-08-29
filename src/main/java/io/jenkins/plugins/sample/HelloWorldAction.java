package io.jenkins.plugins.sample;


import hudson.model.Action;
import sun.jvm.hotspot.HelloWorld;

import javax.annotation.CheckForNull;

public class HelloWorldAction implements Action {
    private String name;

    public HelloWorldAction(String name){
        this.name = name;
    }

    @CheckForNull
    public String getName() {
        return name;
    }

    @CheckForNull
    @Override
    public String getIconFileName() {
        return "document.png";
    }

    @CheckForNull
    @Override
    public String getDisplayName() {
        return "Greeting";
    }

    @CheckForNull
    @Override
    public String getUrlName() {
        return "Greeting";
    }
}
