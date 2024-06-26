# Beans versus Components
Ambas as anotações `@Bean` e `@Component` são utilizadas para a criação de objetos gerenciados pelo container de inversão de controle do Spring. Porém, elas são utilizadas em contextos distintos.

## Bean
A anotação `@Bean` é utilizada para indicar que um método retorna um único bean que será gerenciado pelo container. Tipicamente, métodos anotados com @Bean são parte de classes de configuração (anotadas com `@Configuration`), o que não impede que eles sejam parte de outras classes.
```java
@Configuration
public class GsonConfig {
        
        @Bean
        Gson gson() {
                Gson gson = new Gson();
                return gson;
        }

}
```

## Component
Já a anotação `@Component` (assim como `@Repository`, `@Controller` e `@Service`) é utilizada para idicar que uma classe é um componente. Componentes são detectados automaticamente e gerenciados pelo container, ou seja, também são beans.
```java
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
```

## Referências
- Annotation Interface Bean - https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/annotation/Bean.html
- Annotation Interface Component - https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/stereotype/Component.html
