package idv.bsh.spring.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by lineplus on 2017. 7. 17..
 */

@Configuration
public class HelloWorldConfig {

    @Bean(initMethod = "init", destroyMethod = "cleanup")
    public HelloWorld helloWorld(){
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello");

        return helloWorld;
    }
}
