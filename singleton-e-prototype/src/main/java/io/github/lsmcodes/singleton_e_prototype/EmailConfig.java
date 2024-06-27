package io.github.lsmcodes.singleton_e_prototype;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class EmailConfig {
        
        @Bean
        @Scope("prototype")
        Usuario usuario() {
                Usuario usuario = new Usuario();
                System.out.println("Nova instancia criada.");
                return usuario;
        }

}
