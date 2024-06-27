# Configuration Properties
A anotação `@ConfigurationProperties` é uma anotação para configuração externalizada. Anota declarações de classes ou métodos (anotados com @Bean) para vincular ou validar um grupo de configurações externalizadas, ao contrário de `@Value` que acessa uma propriedade por vez. A seguir é possível observar um grupo de propriedades que compartilham o mesmo prefixo `usuario`.
```properties
usuario.nome=Lorena Medeiros
usuario.email=exemplo@gmail.com
usuario.telefones=(00)00000-0000,(11)11111-1111
```
Para vincular o valor dessas propriedades externas às propriedades de uma classe, é possível fazer isso da seguinte forma:

### Classe
```java
public class Usuario {
        private String nome;
        private String email;
        private List<String> telefones;
}
```

### Classe de Configuração
```java
@Configuration
public class UsuarioConfig {
        @Bean
        @ConfigurationProperties(prefix = "usuario")
        Usuario usuario() {
                Usuario usuario = new Usuario();
                return usuario;
        }
}
```

## Referências
- Annotation Interface ConfigurationProperties - https://docs.spring.io/spring-boot/api/java/org/springframework/boot/context/properties/ConfigurationProperties.html