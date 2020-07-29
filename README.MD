# Carteirada

Um codigo aberto de carteira digital para vc dizer que é sua.

Faça um fork e implemente os desafios e entre em contato para discutirmos as soluções aplicadas.

Objetivo é ter um projeto padrão para servir de consulta para outras implementações

Baseado no Projeto [picpayclone](https://github.com/cicerojmm/picPayCloneMentoriaDIO).

picpayclone foi desenvolvido em um live code da [digitalinnovation.one/live-coding](https://web.digitalinnovation.one/live-coding)

## Desafios

+ 1. Padronizar o codigo e pequenos ajustes

+ 2. Configurar docker-compose subir o banco junto

+ 3. Alterar codigo para postar e processar saldo usando Sistema de Mensagem ( Ex.: RabbitMQ )

+ 4. Configurar com docker o sistema de mensagem
  + 4.1 link de exemplo: https://zgadzaj.com/developmeont/docker/docker-compose/containers/rabbitmq

+ 5. Criar Suite de Teste
  - 5.1 Testes de Negocio com RestAssured
  - 5.2 Testes de Integração
  - 5.3 Testes Unitarios
  - 5.4 Automatizacao de teste

+ 6. Internacionalizacao das mensagens (pt-BR/en-US/es-ar)

+ 7. Incluir um provedor de autenticacao
  - 7.1 Autenticacao OAuth2 embedded
  - 7.2 Autenticacao OAuth2 externo
  - 7.3 Autenticacao com redes sociais como google/facebook/linkedin

+ 8. Fazer deploy automatizado em alguma cloud
  - 8.1 Escolher uma ferramenta de Pipeline 
    - 8.1.1 githubAction 
    - 8.1.2 jenkins
    - 8.1.3 heroku
  - 8.2 Definição de profiles de ambiente

+ 9. Integracao com o PIX do Banco Central

+ 10. Integracao com outros meios de pagamento
  - 10.1 integracao com a Rede do itaú
  - 10.2 integracao com a Rede do itaú
  - 10.3 integracao com o Nubank

+ 13. Criar o mesmo projeto em 6 versoes:
  - 13.1 versao 2 - Springboot com apache camel 
  - 13.2 versao 3 - Springboot com graalvm
  - 13.3 versao 4 - Springboot com Quakus
  - 13.4 versao 5 - Quakus com microprofile
  - 13.5 versao 6 - Converter para Javascript
  - 13.6 versao 7 - Converter para Python com Flask

## Plano de releases sugerido

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
  - Springboot com quarkus

* Release 5.0.0
  - Quakus com microprofile
  
* Release 6.0.0
  - Converter para Javascript

* Release 7.0.0
  - Converter para Python com Flask


# Bibliotecas usadas

  - [spring-data](https://docs.spring.io/spring-data/jpa/docs/2.3.2.RELEASE/reference/html/#reference)
  - [spring-boot e graalvm](https://spring.io/blog/2020/04/09/spring-graalvm-native-0-6-0-released)