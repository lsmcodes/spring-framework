# Spring Boot
`Spring Boot` é um framework baseado no Spring Framework que oferece uma forma rápida de construir aplicações por meio de configurações automáticas. Ele "observa" o classpath e os beans configurados, faz suposições razoáveis sobre quais itens estão faltando e os adiciona. Com Spring Boot, os desenvolvedores podem focar mais em regras de negócio e menos em infraestrutura.

## Starters
`Starters` são um conjunto de descritores de dependência que podem ser adicionados à aplicações. Os starters agrupam dependências compatíveis necessárias para a implementação de determinadas funcionalidades, dessa forma, não é preciso adicionar cada uma delas manualmente. Os starters mais utilizados são:

| Starter                            | Descrição                                                                                                                         |
|------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------|
| `spring-boot-starter`              | Starter principal, que inclui suporte para auto-configuração e YAML                                                               |
| `spring-boot-starter-actuator`     | Starter para a utilização do Spring Actuator, que provê ferramentas de produção para monitoramento e gerenciamento de aplicações  |
| `spring-boot-starter-batch`        | Starter para a utilização de Spring Batch, que facilita o desenvolvimento de aplicações que lidam com grandes volumes de dados    |
| `spring-boot-starter-data-jpa`     | Starter para a utilização de Spring JPA com Hibernate                                                                             |
| `spring-boot-starter-data-mongodb` | Starter para a utilização do banco de dados MongoDB e Spring Data MongoDB                                                         |
| `spring-boot-starter-test`         | Starter para a realização de testes usando bibliotecas como JUnit Jupiter, Hamcrest e Mockito                                     |
| `spring-boot-starter-web`          | Starter para a construção de aplicações web, incluindo aplicações RESTful e Spring MVC. Utiliza o Tomcat como container integrado |
| `spring-boot-starter-web-services` | Starter para a construção de serviços Spring Web                                                                                  |

## Spring Initializr
`Spring Initializr` é uma ferramenta online que permite a geração da estrutura de projetos Spring Boot. Na página do Spring Initializr, tudo o que é preciso fazer é preencher as informações requeridas, adicionar dependências (se desejar), gerar o projeto, extrair os arquivos .zip e por fim, começar a desenvolver a aplicação. As informações devem ser preenchidas da seguinte forma:

- `Group`: coordenadas do projeto, geralmente se trata do domínio da organização a qual pertence o projeto de trás para frente;

- `Artifact`: coordenadas do projeto, deve ser o nome do projeto;

- `Name`: nome de display do projeto, bem como o nome da aplicação Spring Boot;

- `Description`: descrição do projeto;

- `Package name`: pacote raiz da aplicação;

## Estrutura Gerada
Sendo o group `com.exemplo` e o artifact e o name `projeto`, a estrutura de arquivos extraídos do arquivo .zip gerados pelo Spring Initializr deve ser esta:
```markdown
mvnw
mvnw.cmd
pom.xml
src
├── main
│   ├── java
│   │   └── com
│   │       └── exemplo
│   │           └── ProjetoApplication.java
│   └── resources
│       ├── application.properties
│       ├── static
│       └── templates
└── test
    └── java
        └── com
            └── exemplo
                └── ProjetoApplicationTests.java
```

## Referências
- Building an Application with Spring Boot - https://spring.io/guides/gs/spring-boot
- Starters - https://docs.spring.io/spring-boot/reference/using/build-systems.html#using.build-systems.starters
- Spring Initializr Reference Guide - https://docs.spring.io/initializr/docs/0.4.x/reference/htmlsingle/

## Recursos
- Spring Initializr - https://start.spring.io/