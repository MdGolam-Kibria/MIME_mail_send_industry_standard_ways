# MIME_mail_send_industry_standard_ways
Spring boot complete how to send MIME mail industry standard ways from a company mail server to a specific person or other company


### In this project coverd how to send mail from a company mail server,a mail user to another mail user ,company mail server.


- For My testing purpose at first disabled my mail security from my mail then use the coding proses.
    - at first configure mail bean in application.properties file for inject JavaMailSender Class.
    here the all mail config = @https://github.com/MdGolam-Kibria/MIME_mail_send_industry_standard_ways/tree/master/src/main/java/com/example/mailSender/mailService
    after that...
    - send the mail from this class @https://github.com/MdGolam-Kibria/MIME_mail_send_industry_standard_ways/blob/master/src/main/java/com/example/mailSender/mailService/MailController.java
    
   ### For <b>JavaMailSender</b> add mail <b>Beans</b> in application.properties for future change below the properties <br/>
    
    `#obossoi mail ei mail er security off kore dite hobe
spring.mail.username=golamkibria.java@gmail.com<br/>
spring.mail.password=abboammo@gmail.com.bd<br/>
spring.mail.port=587<br/>
spring.mail.tls=true<br/>
spring.mail.isAuth=true<br/>
spring.mail.protocol=smtp<br/>
spring.mail.properties.mail.smtp.starttls.enable=true`
    
    -implement how to senf email from html code.
