package io.github.lsmcodes.beans_versus_components;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.gson.Gson;

@Configuration
public class GsonConfig {
        
        @Bean
        Gson gson() {
                Gson gson = new Gson();
                return gson;
        }

}