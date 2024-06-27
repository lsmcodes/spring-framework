package io.github.lsmcodes.configuration_properties;

import java.util.List;

public class Usuario {

        private String nome;
        private String email;
        private List<String> telefones;

        public String getNome() {
                return nome;
        }

        public String getEmail() {
                return email;
        }

        public List<String> getTelefones() {
                return telefones;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public void setTelefones(List<String> telefones) {
                this.telefones = telefones;
        }

}