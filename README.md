# Moviemoon-Backend

## Es una aplicación que permite crear peliculas y usuarios, ademas de poder verlas y comentarlas 

### Stack: Java, Spring Boot, Postgresql

**Status: In Progress**

## Endpoints 

#Obtener todas las peliculas del sistema

#### GET localhost:8080/movies
**response status**
* 200:
```json
[{"titulo":"nombre","imagen":"url","trailer":"url","estreno":"year-month-day"}]
```

#Creacion de una nueva pelicula en el sistema 

#### POST localhost:8080/movies

**body**
```json
{"titulo":"Titanic",
"imagen":"url",
"trailer":"url",
"estreno":"year-month-day"}
```
**response status**
* 201
    create succesfull
* 400:
```json
{"message":"datos incorrectos"}
```
