package idv.bsh.spring.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by lineplus on 2017. 7. 14..
 */


public class IoCMain {
    public static void main(String[] args){

        ApplicationContext context =
                new FileSystemXmlApplicationContext(
                        "src/main/java/idv/bsh/spring/bean/beanconfig.xml");

        Car car = (Car)context.getBean("car");

        String tireBrand = car.getTireBrand();

        System.out.println(tireBrand);
    }
}