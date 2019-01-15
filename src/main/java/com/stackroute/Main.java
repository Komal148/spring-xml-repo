package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String[] args) {


        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Movie movie2=(Movie) context.getBean("movie");
        System.out.println(movie2.getActor());

        Movie movie3=(Movie) context.getBean("movieA");
        System.out.println(movie3.getActor());

        /*Movie movie4=(Movie) context.getBean("movieB");
        System.out.println(movie4.getActor());

        Movie movie5=(Movie) context.getBean("movieC");
        System.out.println(movie5.getActor());


        Movie movie6=(Movie) context.getBean("movieC");
        Movie movie7=(Movie) context.getBean("movieC");
        System.out.println("Equality Check before Scope in MovieC: "+ (movie7 == movie6) );


        movie6=(Movie) context.getBean("movie");
        movie7=(Movie) context.getBean("movie");
        System.out.println("Equality Check after Scope in Movie: "+ (movie7 == movie6) );
*/

        System.out.println("Using Name attribute");
        Movie movie8=(Movie) context.getBean("movieD");
        System.out.println(movie8.getActor());
        Movie movie9= (Movie) context.getBean("movieE");
        System.out.println(movie9.getActor());

    }
}
