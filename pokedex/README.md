# 🐉 Pokémon API

API REST desenvolvida em **Java 17** com **Spring Boot 3**, que permite gerenciar Pokémons de forma simples.  
O projeto foi criado para fins de estudo, abordando os principais conceitos de **APIs REST**, **JPA/Hibernate**, **H2/MySQL** e **Swagger**.

---

## 🚀 Tecnologias Utilizadas

- Java 17  
- Spring Boot 3  
- Spring Data JPA  
- Spring Web  
- H2 Database (para testes)  
- MySQL (produção)  
- Maven  
- Swagger / OpenAPI 3  

---

## ⚙️ Pré-requisitos

- [Java 17+](https://adoptium.net/temurin/releases/?version=17) instalado  
- [Maven 3.8+](https://maven.apache.org/install.html) instalado  
- IDE de sua preferência (IntelliJ, Eclipse, VS Code)  

---

## 📖 Endpoints principais
🔹 Pokémons

GET /api/pokemons → Lista todos os Pokémons

GET /api/pokemons/{id} → Busca um Pokémon por ID

POST /api/pokemons → Cria um novo Pokémon

PUT /api/pokemons/{id} → Atualiza um Pokémon existente

DELETE /api/pokemons/{id} → Remove um Pokémon


