# Singleton e Prototype
`Singleton` e `Prototype` são dois dos seis escopos suportados pelo Spring Framework. Escopo se refere ao ciclo de vida dos beans, ou seja, por quanto tempo os beans existem e quantas instâncias dos beans serão criadas.

## Singleton
`Singleton` é escopo padrão dos objetos anotados com `@Bean`, `@Component` ou outras anotações especializadas como `@Repository`, `@Service`, etc. Define que apenas uma instância do bean será criada para o container de inversão de controle. A injeção de dependência injetará a mesma instância do bean onde ele for exigido ao longo de toda a aplicação. Exemplo de definição de um bean com escopo singleton:
```java
@Component
public class EnviarEmail {
        @Autowired
        Usuario remetente;
        @Autowired
        Usuario destinatario;
}
```

## Prototype
`Prototype` define que uma instância do bean será criada toda vez que o bean for requisitado. Ou seja, a injeção de dependência injetará uma instância nova do bean onde ele for necessário. Exemplo de definição de bean com escopo prototype:
```java
@Bean
@Scope("prototype")
Usuario usuario() {
        Usuario usuario = newUsuario();
        return usuario;
}
```

## Referências
- Singleton and Prototype Bean Scopes in Java Spring - https://www.geeksforgeeks.org/singleton-and-prototype-bean-scopes-in-java-spring/