package io.github.lsmcodes.beans_versus_components;

/**
 * Classe que simula respostas da API ViaCep que consulta endereços por meio do CEP
 */
public class ViaCepDTO {

        private String cep;
        private String cidade;
        private String estado;
        private String logradouro;

        public ViaCepDTO (String cep, String cidade, String estado, String logradouro) {
                this.cep = cep;
                this.cidade = cidade;
                this.estado = estado;
                this.logradouro = logradouro;
        }

        public String getCep() {
                return cep;
        }

        public String getCidade() {
                return cidade;
        }

        public String getEstado() {
                return estado;
        }

        public String getLogradouro() {
                return logradouro;
        }

        @Override
        public String toString() {
                return "CEP: \"" + getCep()
                                + "\", cidade: \"" + getCidade()
                                + "\", estado: \"" + getEstado()
                                + "\", logradouro: \"" + getLogradouro() + "\"";
        }

}