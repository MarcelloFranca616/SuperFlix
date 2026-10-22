# Roadmap — Superflix

## Objetivo

Desenvolver uma aplicação de catálogo de filmes e evoluí-la gradualmente com práticas de backend, testes, conteinerização, automação e implantação.

## Fase 1 — Estrutura inicial

- [x] Criar o projeto Spring Boot.
- [x] Criar o endpoint inicial `GET /api/filmes`.
- [x] Configurar o MySQL com Docker Compose.
- [x] Configurar variáveis de ambiente para as credenciais.
- [x] Criar a documentação inicial.
- [ ] Validar a inicialização completa do ambiente em uma máquina limpa.

## Fase 2 — Backend e banco de dados

- [ ] Criar a entidade `Filme`.
- [ ] Configurar o Spring Data JPA.
- [ ] Validar a conexão com o MySQL.
- [ ] Criar operações CRUD.
- [ ] Implementar validação de dados.
- [ ] Tratar erros e respostas HTTP adequadamente.

## Fase 3 — Qualidade de código

- [ ] Criar testes unitários.
- [ ] Criar testes de integração.
- [ ] Validar os principais cenários da API.
- [ ] Automatizar a execução dos testes.

## Fase 4 — Frontend

- [ ] Desenvolver uma interface responsiva.
- [ ] Consumir a API de filmes.
- [ ] Implementar listagem e visualização dos filmes.

## Fase 5 — DevOps

- [ ] Padronizar a execução do ambiente com Docker Compose.
- [ ] Criar um pipeline de CI com GitHub Actions.
- [ ] Executar testes automaticamente em pull requests.
- [ ] Avaliar a conteinerização do backend.
- [ ] Configurar Nginx como proxy reverso.
- [ ] Preparar uma implantação em ambiente de nuvem.
- [ ] Documentar o processo de deploy e rollback.

## Fase 6 — Segurança e observabilidade

- [ ] Revisar o gerenciamento de segredos.
- [ ] Configurar logs úteis para diagnóstico.
- [ ] Implementar verificações de saúde.
- [ ] Documentar procedimentos de recuperação.

## Critério de conclusão

Uma fase é considerada concluída somente quando a funcionalidade foi implementada, testada e documentada. As caixas de seleção devem refletir o estado real do projeto.