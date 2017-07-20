package idv.bsh.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by baek on 2017. 7. 20..
 */

@Configuration
@ComponentScan(
        basePackages = {"idv.bsh.web"},
        excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,
                                                value = EnableWebMvc.class)}
)
public class RootConfig {

}
