package idv.bsh.spring.autowired;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by lineplus on 2017. 7. 17..
 */
public class AdminService {

    //@Autowired
    private List<Pusher> pushers;

    public boolean didSomething;

    @Autowired
    public AdminService(List<Pusher> pushers){
        this.pushers = pushers;
    }

    public void doSomethings(){
        for(Pusher pusher : pushers){
            didSomething = pusher.push("Somethings");
        }
    }
}
