package info.inetsolv;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan
@EnableWebMvc
public class InternalDemo {
 @Bean
 public InternalResourceViewResolver internalResourceViewResolver() {
	InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
	viewResolver.setPrefix("/pages/");
	 viewResolver.setSuffix(".jsp");
	 
	return viewResolver;
	 
	 
	 
 }
}
