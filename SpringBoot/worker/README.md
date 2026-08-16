# Worker API

Projeto de estudo desenvolvido em Java com Spring Boot a partir do curso de Java do Nélio Alves para calcular a renda mensal de um trabalhador a partir de um salario base e contratos por hora.

A aplicacao utiliza Spring Web MVC, Spring Data JPA e banco H2 em memoria. Ao iniciar, ela cria dados iniciais para teste por meio de uma configuracao de seed.

## Tecnologias

- Java 25
- Spring Boot 4.1.0
- Spring Web MVC
- Spring Data JPA
- H2 Database
- Maven

## Modelo do Projeto

O dominio principal e composto por:

- `Worker`: representa um trabalhador, contendo nome, nivel, salario base, departamento e contratos.
- `HourContract`: representa um contrato por hora, com data, valor por hora e quantidade de horas.
- `Departament`: representa o departamento do trabalhador.
- `WorkerLevel`: enum com os niveis `JUNIOR`, `MID` e `SENIOR`.

A regra principal de negocio esta no metodo `income(year, month)`, que calcula:

```text
renda mensal = salario base + soma dos contratos do mes/ano informado
```

## Como Executar

No Windows:

```bash
mvnw.cmd spring-boot:run
```

A aplicacao sobe, por padrao, em:

```text
http://localhost:8080
```

## Banco H2

O projeto usa H2 em memoria, configurado em `src/main/resources/application.properties`.

Console do H2:

```text
http://localhost:8080/h2-console
```

Configuracao padrao:

```text
JDBC URL: jdbc:h2:mem:testdb
User: sa
Password:
```

## Endpoint Disponivel

### Calcular renda mensal de um trabalhador

```http
GET /workers/{id}/income/{year}/{month}
```

Exemplo:

```http
GET http://localhost:8080/workers/1/income/2018/8
```

Resposta esperada:

```json
{
  "name": "Alex",
  "department": "Design",
  "income": 3000.0
}
```

## Dados Iniciais

Ao iniciar a aplicacao, a classe `SeedingConfig` cria:

- Departamento: `Design`
- Trabalhador: `Alex`
- Nivel: `MID`
- Salario base: `1200.0`
- Contratos:
  - 2018-08-20, 50 horas, 20.0 por hora
  - 2018-06-13, 30 horas, 18.0 por hora
  - 2018-08-25, 80 horas, 10.0 por hora

Para agosto de 2018, a renda calculada e:

```text
1200.0 + (50 * 20.0) + (80 * 10.0) = 3000.0
```

## Estrutura

```text
src
|-- main
|   |-- java/com/teste/worker
|   |   |-- config
|   |   |-- controllers
|   |   |-- dto
|   |   |-- entities
|   |   `-- repositories
|   `-- resources
|       `-- application.properties
`-- test
    `-- java/com/teste/worker
```

## Status

Projeto em desenvolvimento, criado com foco em aprendizado de Spring Boot, JPA, relacionamentos entre entidades e exposicao de endpoints REST.
