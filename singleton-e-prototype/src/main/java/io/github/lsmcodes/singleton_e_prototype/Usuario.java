package io.github.lsmcodes.singleton_e_prototype;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
        
        private String nome;
        private String enderecoDeEmail;
        private List<String> emailsRecebidos;

        public Usuario() {
                this.emailsRecebidos = new ArrayList<>();
        }

        public String getNome() {
                return nome;
        }

        public String getEnderecoDeEmail() {
                return enderecoDeEmail;
        }

        public List<String> getEmailsRecebidos() {
                return emailsRecebidos;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }

        public void setEnderecoDeEmail(String enderecoDeEmail) {
                this.enderecoDeEmail = enderecoDeEmail;
        }

}
