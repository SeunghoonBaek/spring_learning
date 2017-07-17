package idv.bsh.spring.javaconfig;

/**
 * Created by lineplus on 2017. 7. 17..
 */
public class HelloWorld {
    private String message;

    public void init(){
        System.out.println("[HelloWorld] init");
    }

    public void cleanup(){
        System.out.println("[HelloWorld] cleanup");
    }

    public void setMessage(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}
