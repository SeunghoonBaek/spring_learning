import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * Created by lineplus on 2017. 7. 19..
 */
public class MyWebApplicationInitializer implements WebApplicationInitializer {
    public void onStartup(javax.servlet.ServletContext servletContext) throws ServletException {
//        ServletRegistration.Dynamic registration = servletContext.addServlet("dispatcher", new DispatcherServlet());
//        registration.setLoadOnStartup(1);
//        registration.addMapping("/example/*");

    }
}
