package idv.bsh.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by lineplus on 2017. 7. 14..
 */


public class IoC {
    public static void main(String[] args){
        ApplicationContext context =
                new FileSystemXmlApplicationContext(
                        "/src/idv/bsh/spring/beanconfig.xml");

        Car car = (Car)context.getBean("car");

        String tireBrand = car.getTireBrand();

        System.out.println(tireBrand);
    }
}



// Tire tire = (Tire)context.getBean("tire");
//car.setTire(tire);