package io.github.lsmcodes.properties_value;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Contato implements CommandLineRunner {

        @Value("${nome:Desconhecido}")
        private String nome;

        @Value("${email}")
        private String email;

        @Value("${telefones}")
        private List<String> telefones;

        @Override
        public void run(String... args) throws Exception {
                System.out.println("Informacoes de contato:\n"
                                + "Nome: " + this.nome
                                + ", email: " + this.email
                                + ", telefones: " + this.telefones);
        }

}