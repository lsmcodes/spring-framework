# Properties Value
As propriedades utilizadas no código-fonte podem ser definidas em arquivos externos como o `application.properties` e podem ser injetadas no código por meio da anotação `@Value`.

## Application Properties
O arquivo `application.properties` é utilizado para configurar a aplicação e para definir propriedades customizadas em pares de chave-valor. A seguir é possível observar a definição das propriedades customizadas `nome`, `email` e `telefones`.
```properties
nome=Lorena Medeiros
email=exemplo@gmail.com
telefones=(00)00000-0000, (11)11111-1111
```

## Value
A anotação `@Value` é usada em campos ou parâmetros de métodos/construtores e indica uma expressão de valor padrão para o elemento anotado. Os valores podem ser injetados usando o estilo `${my.app.myProp}` de placeholder que corresponde ao nome da propriedade definida externamente, como pode ser observado a seguir.
```java
@Value("${nome}")
private String nome;

@Value("${email}")
private String email;

@Value("${telefones}")
private List<String> telefones;
```
Caso uma propriedade definida na anotação @Value não for encontrada, uma exceção é lançada. Para evitar o lançamento de exceções, é possível definir um `valor padrão` para ser injetado nos campos ou parâmetros na ausência de valores definidos em application.properties, dessa forma:
```java
@Value("${nome:Desconhecido}")
private String nome;
```

## Referências
- Using @Value - https://docs.spring.io/spring-framework/reference/core/beans/annotation-config/value-annotations.html
- Spring Boot Application Properties - https://www.javatpoint.com/spring-boot-properties