# Configuração do ambiente local

## 1. Pré-requisitos

- Git
- Java Development Kit (JDK), compatível com a versão definida no `backend/pom.xml`
- Docker
- Docker Compose
- Terminal Linux ou ambiente equivalente

## 2. Clonar o repositório

```bash
git clone https://github.com/MarcelloFranca616/SuperFlix.git
cd SuperFlix
```

## 3. Configurar as variáveis de ambiente

Verifique se existe um arquivo `.env.example` na raiz do projeto.

Se existir, copie-o:

```bash
cp .env.example .env
```

Edite o arquivo `.env` e configure as credenciais locais do MySQL. Não compartilhe nem versione o arquivo `.env`.

## 4. Iniciar o banco de dados

Na raiz do projeto, execute:

```bash
docker compose up -d
```

Confira o estado dos contêineres:

```bash
docker compose ps
```

Se o banco não iniciar, consulte os logs:

```bash
docker compose logs mysqldb
```

## 5. Executar o backend

Entre na pasta do backend:

```bash
cd backend
```

Execute a aplicação usando o Maven Wrapper:

```bash
./mvnw spring-boot:run
```

Se houver erro de permissão:

```bash
chmod +x mvnw
./mvnw spring-boot:run
```

## 6. Testar a API

Em outro terminal, execute:

```bash
curl http://localhost:8080/api/filmes
```

O endpoint inicial retorna uma resposta textual estática. A integração completa com o banco de dados e as operações CRUD serão implementadas nas próximas etapas.

## 7. Encerrar o ambiente

Para parar os contêineres:

```bash
docker compose down
```

Esse comando não remove o volume de dados local configurado como bind mount.

## 8. Solução de problemas

Consulte [troubleshooting.md](troubleshooting.md) para investigar falhas de inicialização, conexão com o banco de dados e problemas de configuração.