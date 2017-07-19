package idv.bsh.spring.proxyfactorybean;

/**
 * Created by lineplus on 2017. 7. 18..
 */


public class ServiceImpl implements Service{
    @Override
    public void begin() {
        System.out.println("begin service");
    }

    @Override
    public void stop() {
        System.out.println("stop service");
    }
}
