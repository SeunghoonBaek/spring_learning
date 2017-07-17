package idv.bsh.spring.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by lineplus on 2017. 7. 17..
 */
public class JavaConfigMain {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class, BConfig.class);
        HelloWorld helloWorld = context.getBean(HelloWorld.class);

        String message = helloWorld.getMessage();
        System.out.println(message);

        System.out.println("==");
        String[] beansName = context.getBeanDefinitionNames();
        for(String name : beansName ){
            System.out.println(name);
        }

        System.out.println("==");
    }
}


