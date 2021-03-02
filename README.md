# mystore
Aplicação de exemplo Spring Boot + Hibernate + REST Api + Maven, que disponibiliza um seviço com uma lista vinda de um BD mysql.
Para rodar:

1-) Download e instalação do jdk 11 aqui:

https://www.oracle.com/br/java/technologies/javase-jdk11-downloads.html

Abra e clique em instalar até o fim.

2-)Download do eclipse aqui:
https://www.eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/2020-12/R/eclipse-jee-2020-12-R-win32-x86_64.zip

Descompacte a pasta em um diretório de preferência e abra clicando no ícone do eclipse.

3-Download do Maven:
https://maven.apache.org/download.cgi

Descompacte a pasta em um diretório de preferência e configure ele nas variáveis de ambiente do Windows seguindo esse tutorial:
https://www.devmedia.com.br/introducao-ao-maven/25128

No eclipse vá em Window-preferences-Maven-Instalattions-Add.
Coloque o caminho do seu Maven, ex:C:\apache-maven-3.6.3-bin\apache-maven-3.6.3, Aplly.

4-)Download dos fontes da raiz desse projeto(botão "code"dessa página, escolha a opção.zip),descompacte e no eclipse importe "Existing Maven projects".

5-)Download do MySQL aqui:

https://dev.mysql.com/downloads/

Crie uma data base mystore com usuário root e sem senha, porta 3306 e uma tabela products com essa estrutura:

1	id int(30),	2	name	varchar(30)	,	3	price	int(30)	,4	description	varchar(100)

Suba a data base.

Faça alguns inserts na mão.

6-)No eclipse botão direito no projeto: run as-java application, escolha a classe MyStoreApplication.java para rodar, espere subir.

O serviço está disponível em:http://localhost:8080/products





