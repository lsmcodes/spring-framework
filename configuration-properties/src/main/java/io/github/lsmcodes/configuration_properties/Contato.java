package io.github.lsmcodes.configuration_properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Contato implements CommandLineRunner {

        @Autowired
        Usuario usuario;

        @Override
        public void run(String... args) throws Exception {
                System.out.println("Informacoes de contato:\n"
                                + "Nome: " + this.usuario.getNome()
                                + ", email: " + this.usuario.getEmail()
                                + ", telefones: " + this.usuario.getTelefones());
        }

}
