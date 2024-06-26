package io.github.lsmcodes.beans_versus_components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;

@Component
public class ConversorJson {

        @Autowired
        private Gson gson;

        public String converterEnderecoParaJson(String cep, String cidade, String estado, String logradouro) {
                ViaCepDTO endereco = new ViaCepDTO(cep, cidade, estado, logradouro);
                String json = gson.toJson(endereco);
                return json;
        }

}