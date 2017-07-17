package idv.bsh.spring.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by lineplus on 2017. 7. 17..
 */

@Configuration
public class AConfig {

    @Bean
    public A a(){
        return new A();
    }
}
