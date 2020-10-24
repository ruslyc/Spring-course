package configs;

import interfaces.ExtraSessions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import services.Java;
import services.OfficeHours;
import services.Selenium;

@Configuration
@ComponentScan
@PropertySource("classpath:application.properties")
public class CybertekAppConfig {

    @Bean
    public Java java(){
        return new Java(extraSessions());
    }
    @Bean
    public Selenium selenium(){
        return new Selenium();
    }
    @Bean
    public ExtraSessions extraSessions(){
        return new OfficeHours();
    }
}
