# Book Store

API reponsavel por gerenciar uma livraria.

### Pré-requisitos
O que você precisa instalar para rodar o projeto?

* [Maven](https://maven.apache.org/)
* [JDK-8](https://www.oracle.com/technetwork/pt/java/javase/downloadsjdk8-downloads-2133151.html)
* [JRE-8](https://www.oracle.com/technetwork/pt/java/javase/downloadsjre8-downloads-2133155.html)
* [MySql](https://dev.mysql.com/doc/)

### Instalação

git clone https://github.com/anderson-luiz-sales/book-store.git

### Como rodar a API
```
mvn spring-boot:run
```

### Para validar se foi instalado corretamente:
```
http://localhost:8080/healthcheck
```
### Para acessar a documentação do Swagger:
```
http://localhost:8080/swagger-ui.html#/
```

## Tecnologias utilizadas

* [Maven](https://maven.apache.org/) - Gerenciamento de Dependência
* [Spring Boot Web Starter](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-web) - Starter para construção de web, incluindo aplicativos RESTful, usando o Spring MVC. Usa o Tomcat como o contêiner incorporado padrão
* [Lombok](https://projectlombok.org/) - O Projeto Lombok é uma biblioteca java que se conecta automaticamente ao seu editor e cria ferramentas, apimentando seu java. Nunca escreva outro método getter ou equals novamente, com uma anotação sua classe tem um construtor com todos os recursos, Automatize suas variáveis ​​de registro e muito mais.
* [Spring Boot Test Starter](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-test) - Starter para testar aplicativos Spring Boot com bibliotecas, incluindo JUnit, Hamcrest e Mockito.
* [Model Mapper](http://modelmapper.org/) - Os aplicativos geralmente consistem em modelos de objetos semelhantes, mas diferentes, em que os dados em dois modelos podem ser semelhantes, mas a estrutura e as preocupações dos modelos são diferentes. O mapeamento de objetos facilita a conversão de um modelo em outro, permitindo que modelos separados permaneçam segregados.
* [Swagger](https://swagger.io/) - Simplifique o desenvolvimento de API para usuários, equipes e empresas com o conjunto de ferramentas open source e profissional Swagger.
* [Redis](https://redis.io/) - O Redis é um armazenamento de estrutura de dados em memória de código aberto (licenciado por BSD), usado como banco de dados, cache e corretor de mensagens.
* [Hibernate](https://hibernate.org/) - O Hibernate é um framework para o mapeamento objeto-relacional escrito na linguagem Java.
* [Jaxb](https://mvnrepository.com/artifact/javax.xml.bind/jaxb-api) - É uma estrutura de software que permite aos desenvolvedores do Jakarta EE mapear classes Java para representações XML.
* [Spring Boot JPA](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/) - É uma estrutura de software que permite aos desenvolvedores do Jakarta EE mapear classes Java para representações XML.
* [Spring Boot Actuator Starter](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-actuator) - Iniciador para usar o Atuador do Spring Boot, que fornece recursos prontos para produção para ajudá-lo a monitorar e gerenciar seu aplicativo.

