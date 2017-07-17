package idv.bsh.spring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * Created by lineplus on 2017. 7. 14..
 */

@Component
public class Car {

    @Autowired
    private Tire tire;

    @Autowired
    private Integer carNumber;

    public String getTireBrand(){
        return tire.getBrand();
    }

    @PostConstruct
    public void init(){
        System.out.println("init");
    }

    @PreDestroy
    public void cleanup(){
        System.out.println("cleanup");
    }

}


