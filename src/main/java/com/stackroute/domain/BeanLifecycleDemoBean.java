package com.stackroute.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {
    public void destroy() throws Exception {
        System.out.println("Inside Destroy Method.");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("Inside AfterPropertiesSet");

    }
    public void customInit() throws Exception
    {
        System.out.println("Inside CustomInit Method");
    }
    public void customDestroy() throws Exception
    {
        System.out.println("Inside CustomDestroy Method");
    }
}
