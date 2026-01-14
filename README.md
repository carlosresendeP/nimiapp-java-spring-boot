# Miniapp

Este projeto é uma aplicação web simples desenvolvida com Spring Boot em Java.

## Estrutura do Projeto

```
miniapp/
├── src/
│   ├── main/
│   │   ├── java/com/resende/miniapp/
│   │   │   ├── MiniappApplication.java
│   │   │   ├── controller/
│   │   │   │   ├── helloWorldController.java
│   │   │   │   └── UserController.java
│   │   │   ├── model/
│   │   │   │   └── User.java
│   │   │   └── service/
│   │   │       └── UserService.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/com/resende/miniapp/
│           └── MiniappApplicationTests.java
├── pom.xml
├── mvnw / mvnw.cmd
└── HELP.md
```

## Funcionalidades

- **Hello World:** Endpoint `/hello` retorna uma mensagem de boas-vindas.
- **Usuários:** Endpoints para criar e listar usuários.

## Como Executar

1. **Pré-requisitos:**

   - Java 17+
   - Maven

2. **Build do projeto:**

   ```sh
   ./mvnw clean install
   ```

3. **Executar a aplicação:**

   ```sh
   ./mvnw spring-boot:run
   ```

4. **Testar endpoints:**
   - [http://localhost:8080/hello](http://localhost:8080/hello)
   - [http://localhost:8080/users](http://localhost:8080/users)

## Testes

Para rodar os testes:

```sh
./mvnw test
```

## Configuração

As configurações estão em `src/main/resources/application.properties`.

## Licença

Projeto para fins de estudo.

---

Desenvolvido por Resende.
