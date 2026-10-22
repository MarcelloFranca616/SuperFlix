# Banco de dados

## 1. Tecnologia

O Superflix utiliza MySQL 8 como sistema gerenciador de banco de dados.

- Banco de dados: `superflix_api`
- Serviço Docker Compose: `mysqldb`
- Porta publicada no host: `3307`
- Porta interna do MySQL: `3306`
- Persistência: diretório local `mysql-data/`

## 2. Configuração

As configurações são separadas entre o banco de dados e a aplicação.

### Docker Compose

As variáveis `MYSQL_ROOT_PASSWORD` e `MYSQL_DATABASE` configuram a inicialização do contêiner MySQL.

### Backend

O Spring Boot utiliza as seguintes variáveis:

- `DB_URL`: endereço de conexão JDBC.
- `DB_USERNAME`: usuário do banco.
- `DB_PASSWORD`: senha do banco.

As credenciais reais devem permanecer no arquivo `.env` local, que não deve ser versionado.

## 3. Persistência

O volume configurado em `docker-compose.yaml` utiliza:

`./mysql-data:/var/lib/mysql`

Isso mantém os dados no diretório local mesmo quando o contêiner é recriado.

Não exclua `mysql-data/` para resolver problemas de inicialização sem antes avaliar a necessidade de preservar os dados.

## 4. Comandos úteis

Iniciar o banco:

```bash
docker compose up -d mysqldb
```

Verificar o contêiner:

```bash
docker compose ps
```

Consultar logs:

```bash
docker compose logs mysqldb
```

Parar os contêineres:

```bash
docker compose down
```

## 5. Estado atual e próximos passos

O MySQL está configurado no Docker Compose. A integração efetiva entre a aplicação Spring Boot e o banco deve ser validada.

Próximas etapas previstas:

- Criar a entidade `Filme`.
- Configurar o repositório com Spring Data JPA.
- Implementar operações CRUD.
- Validar a persistência com testes automatizados.