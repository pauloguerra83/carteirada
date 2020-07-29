# Carteirada

Projeto [picpayclone](https://github.com/cicerojmm/picPayCloneMentoriaDIO) e fiz a seguintes alteracoes:

Trocar o nome do projeto para Carteira Digital

Objetivo é ter um projeto padrao para servir de consulta para outras implementações

## Desafios

  1. Padronizar o codigo
  2. Configurar docker-compose subir o banco junto
  3. Alterar codigo para postar e processar saldo usando Sistema de Mensagem ( Ex.: RabbitMQ )
  4. Configurar com docker o sistema de mensagem
    - (https://zgadzaj.com/developmeont/docker/docker-compose/containers/rabbitmq)
  5. Criar Suite de Teste
    - Testes de Negocio com RestAssured
    - Testes de Integração
    - Testes Unitarios
    - Automatizacao de teste
  6. Internacionalizacao das mensagens
  7. Incluir um provedor de autenticacao
    - Autenticacao OAuth2 embedded
    - Autenticacao OAuth2 externo
    - Autenticacao com redes sociais como google/facebook/linkedin
  8. Fazer deploy automatizado em alguma cloud
    - Escolher uma ferramenta de Pipeline 
      - githubAction 
      - jenkins
      - heroku
    - Definição de profiles de ambiente
  9. Criar o mesmo projeto em 4 versoes:
    - v1 - Springboot com apache camel 
    - v2 - Springboot com graalvm (https://spring.io/blog/2020/04/09/spring-graalvm-native-0-6-0-released)
    - v3 - Quakus com microprofile
    - v4 - Converter para Javascript
    - v5 - Converter para Python com Flask

## Releases

* Release 0.0.1
  - Primeiro Commit

* Release 0.0.2
  - Padronizacoes
  - Ajustes de padronizacao
  - Alterar para ingles todos os pacotes e sufixos das classes 

* Release 0.0.3
  - Pendente definição

* Release 0.1.0
  - Configurar docker-compose file para subir o banco junto com o codigo em desenvolvimento

* Release 0.2.0
  - Alterar codigo para postar e processar saldo usando Sistema de Mensagem ( Ex.: RabbitMQ ) 

* Release 0.3.0
  - Inclusao de cobertura de teste
    - Testes de Negocio com RestAssured
    - Testes de Integração
    - Testes Unitarios
    - Automatizacao de teste

* Release 0.4.0
  - Deploy em alguma cloud com CI e CD
  - usar a parte free do heroku 

* Release 0.5.0
  - Externalizacao de mensagens

* Release 0.6.0
  - Troca de framework para estudo de vantagens
  - Alterei de hibernate para o springData

* Release 1.0.0
  - Pendente definição

* Release 2.0.0
  - Springboot com apache camel 

* Release 3.0.0
  - Springboot com graalvm

* Release 4.0.0
  - Quakus com microprofile
  
* Release 5.0.0
  - Converter para Javascript

* Release 6.0.0
  - Converter para Python com Flask


# Bibliotecas usadas

  - [springData](https://docs.spring.io/spring-data/jpa/docs/2.3.2.RELEASE/reference/html/#reference) 