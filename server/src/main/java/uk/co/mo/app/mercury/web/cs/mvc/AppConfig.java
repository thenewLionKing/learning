package uk.co.mo.app.mercury.web.cs.mvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * <p/>
 * User: prabat
 * Date: 22-Feb-2011
 * Time: 14:16:09
 * <p/>
 * Change Log - Who : When : Comment
 */
@Configuration
public class AppConfig {

    // Resolve logical view names to .jsp resources in the /WEB-INF/views directory
    @Bean
    ViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
}
