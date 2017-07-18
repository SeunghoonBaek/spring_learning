package idv.bsh.spring.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by lineplus on 2017. 7. 17..
 */
public class XMLConfigMain {

    public static void main(String[] args){
        ApplicationContext context = new FileSystemXmlApplicationContext("src/idv/bsh/spring/javaconfig/xmlconfig.xml");
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");

        String message = helloWorld.getMessage();
        System.out.println(message);
    }
}
