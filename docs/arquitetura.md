# Arquitetura do Superflix

## 1. Visão geral

O Superflix é um projeto de estudo que tem como objetivo desenvolver uma aplicação de catálogo de filmes, utilizando tecnologias de desenvolvimento backend, banco de dados, conteinerização e práticas DevOps.

O projeto será desenvolvido incrementalmente, com documentação das decisões técnicas e evolução da infraestrutura.

## 2. Arquitetura atual

### Backend
- Linguagem: Java
- Framework: Spring Boot
- Gerenciador de dependências: Maven
- API REST: endpoint inicial para consulta de filmes

### Banco de dados
- SGBD: MySQL 8
- Banco: `superflix_api`
- Execução em contêiner Docker
- Persistência dos dados por volume local

### Conteinerização
- Docker Compose para configuração do banco de dados.
- O backend é executado separadamente durante o desenvolvimento local.

## 3. Endpoint implementado

| Método | Rota | Estado |
|---|---|---|
| GET | `/api/filmes` | Implementado; retorna uma resposta textual estática |

## 4. Componentes planejados

- Modelagem da entidade `Filme`.
- Integração do backend com o MySQL usando Spring Data JPA.
- Operações CRUD para filmes.
- Testes automatizados.
- Pipeline de integração contínua (CI).
- Frontend responsivo.
- Proxy reverso com Nginx.
- Implantação em ambiente de nuvem.

Os itens desta seção são objetivos futuros e não devem ser considerados funcionalidades concluídas.

## 5. Princípios do projeto

- Versionar o código e a documentação com Git.
- Não versionar credenciais ou arquivos de configuração secretos.
- Manter a configuração reproduzível por meio de Docker Compose.
- Evoluir a arquitetura em pequenas etapas.
- Registrar problemas encontrados e suas soluções.

## 6. Fluxo previsto

Navegador ou cliente HTTP → Frontend → API Spring Boot → MySQL.

O frontend ainda será desenvolvido. Atualmente, o endpoint pode ser testado diretamente por um cliente HTTP, como o `curl`.
