# Moviemoon-Backend

## Es una aplicación que permite crear peliculas y usuarios, ademas de poder verlas y comentarlas 

### Stack: Java, Spring Boot, Postgresql

**Status: In Progress**

## Endpoints 

Obtener todas las peliculas del sistema

#### GET localhost:8080/peliculas
**response status**
* 200:
```json
[{"titulo":"Titanic","imagen":"url","trailer":"url","estreno":"fecha"},
 {"titulo":"Titanic","imagen":"url","trailer":"url","estreno":"fecha"},
 {"titulo":"Titanic","imagen":"url","trailer":"url","estreno":"fecha"}]
```

#### POST localhost:8080/peliculas

**body**
```json
{"titulo":"Titanic",
"imagen":"url",
"trailer":"url",
"estreno":"fecha"}
```
**response status**
* 201
```json
{"message":"create succesfull"}
```

* 400:
```json
{"message":"datos incorrectos"}
```
