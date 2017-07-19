package idv.bsh.web.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by lineplus on 2017. 7. 19..
 */

@Configuration
public class ClinicConfig {

    @Bean
    public Clinic clinic(){
        return new Clinic();
    }
}
