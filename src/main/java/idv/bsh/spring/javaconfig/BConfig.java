package idv.bsh.spring.javaconfig;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by lineplus on 2017. 7. 17..
 */

@Configuration
@Import(AConfig.class)
public class BConfig {

    @Bean
    public B b(){
        return new B();
    }

}
