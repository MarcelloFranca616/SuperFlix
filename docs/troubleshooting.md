# Troubleshooting — Superflix

## 1. Docker Compose não inicia

**Sintoma:** erro ao executar `docker compose up -d`.

Verifique a configuração:

```bash
docker compose config
```

Confira se o arquivo `.env` existe e contém as variáveis exigidas pelo `docker-compose.yaml`.

## 2. Contêiner MySQL não inicia

Verifique o estado:

```bash
docker compose ps
```

Consulte os logs:

```bash
docker compose logs mysqldb
```

Verifique também se a porta `3307` já está sendo utilizada por outro processo.

## 3. Erro de conexão com o MySQL

Confira os seguintes pontos:

- O contêiner `mysqldb` está em execução.
- A URL JDBC utiliza a porta `3307` quando o backend é executado diretamente no host.
- O banco `superflix_api` existe.
- `DB_USERNAME` e `DB_PASSWORD` correspondem às credenciais válidas do banco.

## 4. Erro de compilação Java

Verifique a versão instalada:

```bash
java -version
javac -version
```

Confira a versão configurada em `backend/pom.xml` e utilize um JDK compatível.

## 5. Maven Wrapper sem permissão

Se ocorrer um erro de permissão ao executar o Maven Wrapper:

```bash
chmod +x backend/mvnw
```

Depois, execute:

```bash
cd backend
./mvnw spring-boot:run
```

## 6. Porta 8080 ocupada

Verifique se outro processo está utilizando a porta:

```bash
sudo ss -ltnp | grep :8080
```

Identifique o processo antes de decidir como liberar a porta.

## 7. API não responde

Teste o endpoint:

```bash
curl -i http://localhost:8080/api/filmes
```

Se necessário, verifique os logs do backend e confirme se a aplicação iniciou corretamente.

## 8. Cuidados com os dados

O diretório `mysql-data/` contém os dados persistidos do banco.

Evite excluí-lo durante o diagnóstico. Não publique credenciais, arquivos `.env` ou dados sensíveis nos logs e no GitHub.

## 9. Registro de incidentes

Ao investigar um problema, registre:

- Sintoma observado.
- Mensagem de erro.
- Causa identificada.
- Solução aplicada.
- Como verificar que o problema foi resolvido.