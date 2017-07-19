package idv.bsh.spring.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by lineplus on 2017. 7. 18..
 */

@Configuration
@EnableAspectJAutoProxy
public class AOPConfig {

    @Bean
    public CustomerBo customerBo(){
        return new CustomerBoImpl();
    }

    @Bean
    public LoggingAspect loggingAspect(){
        return new LoggingAspect();
    }
}
