package idv.bsh.spring;

/**
 * Created by lineplus on 2017. 7. 14..
 */
public class IoC {
    public static void main(String[] args){
        Car car = new Car();

        String tireBrand = car.getTireBrand();
        System.out.println(tireBrand);
    }
}
