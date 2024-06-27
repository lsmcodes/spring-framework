package io.github.lsmcodes.configuration_properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UsuarioConfig {
        
        @Bean
        @ConfigurationProperties(prefix = "usuario")
        Usuario usuario() {
                Usuario usuario = new Usuario();
                return usuario;
        }

}