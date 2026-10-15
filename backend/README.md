# Superflix — Backend

API REST para o projeto Superflix, uma aplicação de catálogo de filmes desenvolvida para fins de estudo e portfólio.

## Tecnologias

- **Java:** linguagem de programação.
- **Spring Boot:** estrutura para desenvolvimento da aplicação backend.
- **Maven:** gerenciamento de dependências e build.
- **MySQL 8:** banco de dados utilizado no ambiente de desenvolvimento.
- **Docker:** execução do banco de dados em container.

## Estrutura do código

```text
backend/
├── pom.xml
├── mvnw
├── .mvn/
│   └── wrapper/
├── src/
│   ├── main/
│   │   ├── java/com/superflix/backend/
│   │   │   ├── BackendApplication.java
│   │   │   └── controller/
│   │   │       └── FilmeController.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/com/superflix/backend/
│           └── BackendApplicationTests.java
└── README.md
```

## Endpoint disponível

### Consultar filmes

**Método:** `GET`

**Rota:** `/api/filmes`

Exemplo de requisição:

```bash
curl http://localhost:8080/api/filmes
```

Na implementação inicial, o endpoint retorna a mensagem `Lista de filmes`.

## Executar localmente

A partir da pasta `backend/`, execute:

```bash
./mvnw spring-boot:run
```

O comando requer uma instalação de Java compatível com a versão configurada no projeto.

Para testar a API, com a aplicação em execução:

```bash
curl http://localhost:8080/api/filmes
```

## Testes

Execute os testes automatizados com:

```bash
./mvnw test
```

## Próximas etapas

- Criar o modelo de domínio `Filme`.
- Implementar a persistência com Spring Data JPA.
- Integrar a API ao MySQL.
- Implementar operações CRUD.
- Ampliar os testes automatizados.
- Documentar os endpoints e os contratos de resposta.

## Status

Em desenvolvimento.


## Ambiente de desenvolvimento

| Componente | Versão ou configuração |
|---|---|
| Java | 25 |
| Spring Boot | 4.1.1 |
| Maven | Maven Wrapper |
| MySQL | 8.0.46 |
| Banco de dados | `superflix_api` |
| Porta local do MySQL | `3307` |

As versões foram identificadas na configuração atual do projeto. A compatibilidade completa entre as dependências e o ambiente será validada durante os testes.

### Configuração de conexão

O backend utiliza variáveis de ambiente para obter as credenciais do banco de dados:

- `DB_URL`: URL JDBC do MySQL.
- `DB_USERNAME`: usuário do banco.
- `DB_PASSWORD`: senha do banco.

Não armazene credenciais reais nos arquivos versionados.
