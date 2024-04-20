package az.edu.compar.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


@Component
public class PasswordHelper {


    @Bean
    public String passwordHash()
    {
        return  "sfdsfasfad";
    }
}
