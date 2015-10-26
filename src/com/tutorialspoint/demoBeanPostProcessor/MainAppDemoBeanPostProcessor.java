package com.tutorialspoint.demoBeanPostProcessor;

/**This MainApp is working fine.*/
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tutorialspoint.demoCommon.HelloChina;
import com.tutorialspoint.demoCommon.HelloWorld;

public class MainAppDemoBeanPostProcessor {
    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext(
                "com/tutorialspoint/demoBeanPostProcessor/beansForDemoBeanPostProcessor.xml");

        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.getMessage();
        
        HelloChina obj2 = (HelloChina) context.getBean("helloChina");
        obj2.setMessage("China is saying hello to the rest of the world!");
        obj2.getMessage();
        
        context.registerShutdownHook();

        System.out.println("The program ended! Cool!");
    }
}