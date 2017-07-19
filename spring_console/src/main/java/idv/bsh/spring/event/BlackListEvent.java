package idv.bsh.spring.event;

import org.springframework.context.ApplicationEvent;

/**
 * Created by baek on 2017. 7. 17..
 */
public class BlackListEvent extends ApplicationEvent {
    private String address;
    private String text;

    public BlackListEvent(Object source, String address, String text){
        super(source);

        this.address = address;
        this.text = text;
    }
}
