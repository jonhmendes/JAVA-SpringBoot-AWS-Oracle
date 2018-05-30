
Springboot com o Amazon RDS
Um exemplo do uso do SpringBoot para gravar rapidamente uma API RESTful para acessar o banco de dados Oracle. Aqui usamos o AWS RDS, o serviço de banco de dados relacional da Amazon na nuvem.

Etapas para executar o projeto
Pré-requisito
Java 8
Maven
Conta da AWS (é grátis se você tiver cartão de crédito)
Driver Oracle JDBC
Configuração da instância do Oracle na AWS
Entre no console do AWS Management e vá para o serviço CloudFormation
Crie uma nova pilha fazendo upload do script fornecido: create-oracle-micro-instance-aws.json
Ele criará novo grupo de segurança e a nova instância do RDS com camada 2.micro não incorrerá em nenhuma cobrança.
A versão do banco de dados Oracle é 12.1 e será criada com a instância t2.micro, que é gratuita.
Obter o Driver Oracle JDBC
Baixe o driver JDBC do site da Oracle e coloque-o no diretório oracle-driver
Crie um repositório maven local e carregue esse jar do driver nele.
mvn install: arquivo-de-instalação -Dfile = oracle-driver / ojdbc7.jar -DgroupId = com.oracle -DartifactId = ojdbc7 -Dversion = 12.1.0.2 -Dpackaging = jar
Se uma versão diferente da acima foi usada, ajuste build.gradle
Executar e testar
java -jar target / spring-boot-oracle-aws-1.0-SNAPSHOT.jar
Procure a URL http: // localhost: 8080 / posts para listar todos os recursos
Procure a URL, por exemplo, http: // localhost: 8080 / posts / 1 (para obter um único recurso)
