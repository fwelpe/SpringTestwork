# SpringTestwork
You need Postgresql installed with db 'srprng' created, and Maven to compile and run the project.
1. git clone https://github.com/fwelpe/SpringTestwork.git
2. cd SpringTestwork
3. vim (or emacs, nano etc.) src/main/resources/application.properties<br>
3.1 Change password field, insert your 'postgres' user password in <b>spring.datasource.password</b>
4. mvn spring-boot:run
5. go to 'localhost:8080' to see project mainpage
