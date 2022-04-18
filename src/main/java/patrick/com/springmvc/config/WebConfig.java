package patrick.com.springmvc.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import patrick.com.springmvc.formatter.PersonFormatter;

@Configuration
public class WebConfig implements WebMvcConfigurer {

/*    @Override
    public void addFormatters(FormatterRegistry formatterRegistry){
        formatterRegistry.addFormatter(new PersonFormatter());
    }*/
}
