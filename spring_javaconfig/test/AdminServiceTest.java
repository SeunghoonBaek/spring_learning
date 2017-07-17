import java.util.List;
import idv.bsh.spring.autowired.AdminService;
import idv.bsh.spring.autowired.ApplePusher;
import idv.bsh.spring.autowired.GooglePusher;
import idv.bsh.spring.autowired.Pusher;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by lineplus on 2017. 7. 17..
 */
public class AdminServiceTest {

    private List<Pusher> pusher;

    @Before
    public void setUp(){
        pusher = new ArrayList<>();
        pusher.add(new ApplePusher());
        pusher.add(new GooglePusher());
    }

    @Test
    public void doSomethingTest(){
        AdminService adminService = new AdminService(pusher);
        adminService.doSomethings();

        Assert.assertEquals(adminService.didSomething, true);
    }
}
