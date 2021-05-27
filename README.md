# NTConsult

# Obs: Infelizmente tive problemas para subir a aplicação no Heroku, portanto, os testes são feitos somente na máquina local. 

# Segue o erro ao tentar fazer o deploy da aplicação no Heroku:
Receive code from GitHub
Build main 9f99ccae
There was an issue deploying your app. View the build log for details.

-----> Building on the Heroku-20 stack
-----> Using buildpack: heroku/java
-----> App not compatible with buildpack: https://buildpack-registry.s3.amazonaws.com/buildpacks/heroku/java.tgz
       Could not find a pom.xml file! Please check that it exists and is committed to Git.
       More info: https://devcenter.heroku.com/articles/buildpacks#detection-failure
 !     Push failed
 
 # Se possível me enviar por email a solução para este problema: ricardorolim27@gmail.com
   

Usando o aplicativo Postman é possivel fazer alguns testes.

Exemplos

Criar Nova Pauta

* Requisição: Post
* Link: http://localhost:8080/pautas
* ir em Body, Raw > JSON
* {
    "descricao": "Distribuição de lucros"   
}

Criar Associado

* Requisição: Post
* Link: http://localhost:8080/associados
* ir em Body, Raw > JSON
* {
     "cpf": "123.654.456.85"   
}

Votação

* Requisição: Post
* Link: http://localhost:8080/votacao

FindAll Pautas
 * Requisição: Get
 * Link: http://localhost:8080/pautas

FindAll Associados
* Requisição: Get
* Link: http://localhost:8080/associados
 
