# Sobre o projeto

O projeto Parking Control é uma aplicação Back-End web utilizando SpringBoot, com integração com banco de dados, construído ao longo do curso de SpringBoot da Michelli Brito (https://www.youtube.com/@MichelliBrito).

A aplicação consiste em um sistema de vagas de estacionamento para um condomínio residencial, permitindo criar, alterar e deletar as vagas baseado em informações que seriam utilizadas em um registro real:

  - Id 
  - Número da vaga 
  - placa do veículo 
  - marca 
  - modelo 
  - cor 
  - data de registro da vaga 
  - nome do responsável 
  - apartamento 
  - bloco

O sistema também conta com verificações, impedindo o registro pelo usuário de vagas inválidas, como vagas com o número da vaga ou placa do carro igual a outras já existentes, registrar a vaga com algum campo necessário em branco, etc. Assim somente vagas válidas serão salvas no banco de dados.

# Tecnologias utilizadas

## Back end

- Java 11
- Spring Boot

## Front end

- Há de ser implementado 

## Outras tecnologias

- Ferramenta de teste: Postman
- Banco de dados: PostgreSQL

# Como executar o projeto

Primeiramente é necessário estar com a JDK instalada e uma IDE para desenvolvimento Java a sua escolha (IntelliJ, Eclipse, etc).

Depois, instale a ferramenta Postman para executar e testar as requisições da aplicação, e o pgAdmin (plataforma utilizada para administrar bancos de dados PostgreSQL).

Defina o usuário, a senha e a porta do PostgreSQL ao instalar o pgAdmin, então crie um banco de dados para manter salvas as vagas de estacionamento.

Na IDE, vá até o arquivo src/main/resources/application.properties, e informe o nome do usuário e a senha do banco de dados (como definido no pgAdmin), e o url para integração com o banco de dados (jdbc:postgresql://localhost:PORTA_DO_POSTGRESQL/NOME_DO_BANCO_DE_DADOS).

A aplicação, por ser somente do lado do servidor, funciona via requisições http (GET, SET, POST, DELETE), e recebe os registros das vagas via JSON; que podem ser testadas e visualizadas pela ferramenta Postman, lembrando sempre de definir o url da aplicação (por padrão localhost:8080).

Abaixo um exemplo de método SET, para registrarmos uma vaga: 

``` JSON
    {
        "parkingSpotNumber": "A01",
        "licensePlateCar": "AAA0123",
        "brandCar": "Volkswagen",
        "modelCar": "Fusca",
        "colorCar": "Azul",
        "responsibleName": "João da Silva",
        "apartment": "123",
        "block": "A"
    }
```

# Autor

Sinta-se à vontade para tirar dúvidas sobre o projeto e sugerir melhorias!

Leonardo Lima

https://www.linkedin.com/in/leonardo-torquato-b4a20521a/
