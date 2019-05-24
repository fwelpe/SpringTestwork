# SpringTestwork
You need Postgresql installed with db 'srprng' created, and Maven to compile and run the project.
1. git clone https://github.com/fwelpe/SpringTestwork.git
2. cd SpringTestwork
3. vim (or emacs, nano etc.) src/main/resources/application.properties
3.1 Change password field, insert spring.datasource.password of your 'postgres' user
4. mvn spring-boot:run
5. go to 'localhost:8080' to see project mainpage
