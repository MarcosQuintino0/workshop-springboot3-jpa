
# Projeto: Web services com Spring Boot e JPA/Hibernate
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/MarcosQuintino0/workshop-springboot3-jpa/blob/main/LICENSE) 

# Sobre o projeto
Esse projeto é um sistema de gerenciamento de pedidos desenvolvido durante o curso de Java do Professor Nélio Alves na plataforma Udemy. O objetivo da aplicação é simular o um sistema de gerenciamento de pedido.

## Modelo conceitual
![Modelo Conceitual](https://github.com/MarcosQuintino0/Assets/blob/main/Domain-Model.PNG)

## Funcionalidades
- Criação de usuários: É possível enviar uma requisição POST para a rota /users com os dados do usuário (name, email, phone, password) no formato JSON para criar um novo usuário.

- Criação de pedidos: Envia uma requisição POST para a rota /orders com os dados do pedido (cliente, itens, valor total) no formato JSON.

- Consulta de pedidos: Envia uma requisição GET para a rota /orders para obter a lista de todos os pedidos. É possível também enviar uma requisição GET para a rota /orders/{id} para obter os detalhes de um pedido específico.

# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven
- Postman
- H2
## Implantação em produção
- Back end: Heroku
obs: aplicação não esta mais em produção

# Como executar o projeto

## Back end
Pré-requisitos: Java 11

```bash
# clonar repositório
1 - git clone https://github.com/MarcosQuintino0/workshop-springboot3-jpa.git

# entrar na pasta do projeto back end
2 -cd workshop-springboot3-jpa

# executar o projeto
3 -mvn spring-boot:run

4 -Abra o Postman ou outra ferramenta de sua preferência para enviar requisições HTTP para a aplicação.

5 -Para testar algumas funcionalidades da aplicação, envie as seguintes requisições HTTP:
◉ Criação de usuário: Envie uma requisição POST para a rota /users com os dados do usuário (name, email, phone, password) no formato JSON.
◉ Consulta de usuário: Envie uma requisição GET para a rota /users.

# Autor

Marcos André Quintino

https://www.linkedin.com/in/marcos-andre-quintino/
