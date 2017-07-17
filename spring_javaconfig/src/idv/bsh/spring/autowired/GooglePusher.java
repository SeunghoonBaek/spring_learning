package idv.bsh.spring.autowired;

/**
 * Created by lineplus on 2017. 7. 17..
 */
public class GooglePusher implements Pusher {

    @Override
    public boolean push(String message) {
        return true;
    }
}
