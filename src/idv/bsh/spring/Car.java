package idv.bsh.spring;

/**
 * Created by lineplus on 2017. 7. 14..
 */
public class Car {
    private Tire tire;

    public Car(){
        tire = new Tire();
    }

    public String getTireBrand(){
        return tire.getBrand();
    }
}
