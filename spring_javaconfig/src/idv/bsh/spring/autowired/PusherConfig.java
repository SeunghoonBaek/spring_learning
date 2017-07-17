package idv.bsh.spring.autowired;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

/**
 * Created by lineplus on 2017. 7. 17..
 */

@Configuration
public class PusherConfig {

    @Bean
    public List<Pusher> pushers(){
        List<Pusher> pushers = new ArrayList<>();
        pushers.add(new ApplePusher());
        pushers.add(new GooglePusher());

        return pushers;
    }

    @Bean
    public AdminService adminService(){
        AdminService adminService = new AdminService(pushers());
        return adminService;
    }
}
