# Desafio - Bootcamp Dev Superior 👩🏻‍💻
<h1>
    <a href="https://www.baeldung.com/get-started-with-java-series">Java - API Rest</a>
</h1>

## Objetivo
<p>Entregar um projeto Spring Boot 2.4.x contendo um CRUD completo de web services REST para acessar um recurso de clientes.

## Requisitos
Um cliente possui nome, CPF, renda, data de nascimento, e quantidade de filhos. A especificação da entidade Client é mostrada a seguir (você deve seguir à risca os nomes de classe e atributos mostrados no diagrama):
	
<img width="210" alt="Captura de Tela 2021-10-01 às 7 13 42 AM" src="https://user-images.githubusercontent.com/19472198/135603659-8d4636c0-7b52-424c-b319-2670b1ffc335.png">

<h4 align="center"> 
	Finalizado
</h4>

### Features

- [x] Inserir novo recurso
- [x] Busca de recurso por id
- [x] Tratamento de exceções
- [x] Atualizar recurso
- [x] Deletar recurso
- [x] Busca paginada de recursos

### Resultado


### Pré-requisitos

Antes de começar, você vai precisar ter instalado em sua máquina as seguintes ferramentas:

- Java 8
- Maven 

### Instalação da aplicação

Primeiramente, faça o clone do repositório:
```
https://github.com/anadeso/bootcamp-rest-recurso-cliente.git
```
Feito isso, acesse o projeto:
```
cd bootcamp-rest-recurso-cliente
```
É preciso compilar o código e baixar as dependências do projeto:
```
mvn clean package
```
Finalizado esse passo, vamos iniciar a aplicação:
```
mvn spring-boot:run
```
Pronto. A aplicação está disponível em http://localhost:8080
```
Tomcat started on port(s): 8080 (http)
Started AppConfig in xxxx seconds (JVM running for xxxx)
```

### 🛠 Tecnologias

As seguintes ferramentas foram usadas na construção do projeto:

- [Java 8](https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html)
- [Spring Boot](https://spring.io/projects/spring-boot) 
  - [Spring Web](https://spring.io/projects/spring-framework)
  - [Spring Data JPA](https://spring.io/projects/spring-data)
- [Spring MVC](https://docs.spring.io/spring-framework/docs/current/reference/html/web.html#mvc) 
- [Lombok](https://projectlombok.org/)
- [Banco H2](https://gasparbarancelli.com/post/banco-de-dados-h2-com-spring-boot)


### Autor
---
Feito com ❤️ por Ana Sousa 👋🏽 Entre em contato!

[![Linkedin Badge](https://img.shields.io/badge/-Ana-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/ana-sousa-1841a6104/)](https://www.linkedin.com/in/ana-sousa-1841a6104/)

