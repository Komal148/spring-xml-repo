package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware, BeanNameAware, BeanFactoryAware {

    public Movie()
    {

    }

    public Movie(Actor actor) {
        this.actor = actor;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    private Actor actor;

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

        Actor actor= (Actor) beanFactory.getBean("actorB");
        System.out.println("From BeanFactoryAware : "+actor);
    }

    public void setBeanName(String s) {
        System.out.println("BeanName is : "+s);
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        Actor actor= (Actor) applicationContext.getBean("actorB");
        System.out.println("From ApplicationContextAware : "+actor);
    }
}
