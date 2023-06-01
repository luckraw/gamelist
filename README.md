# Sobre o projeto

Este projeto é uma pesquisa de games que permite aos usuários encontrar informações sobre diferentes jogos.

# Tecnologias utilizadas

- Java
- Spring boot
- H2
- Hibernate
- Maven

 # End Points

`GET` games: busca a lista de jogos.

`GET` games by id: busca um jogo por meio de id.

`GET` games lists: busca a categoria das listas de jogos.

`GET` games by lists: busca uma lista por meio de seu ID mostrando quais jogos estão dentro desta categoria.

`POST` list replacement: organiza a lista como o usuário preferir.

# Como usar


clonar repositório
```
git clone https://github.com/luckraw/gamelist
```

entrar na pasta do projeto
```
cd gamelist
```

executar o projeto
```
./mvnw spring-boot:run
```

