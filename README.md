# springboot-google-reCaptcha-demo

- Open Google reCaptcha site by hitting url: https://www.google.com/recaptcha/admin 

- Read all the development docs, and generate ur own serverSide & clientSide keys.

- Don't forget to add your own "serverSideCaptchaKey" in application.properties file. Remove the given clientSideCaptchaKey in "Register.html" and keep your own key there.

- Now after coding, run program as spring boot. Go to browser hit : http://localhost:8080/employee/register 

- Try to register employees in opened register.html

- When you make mistake or do bulk loading, google reCaptcha will appear to verify u are human and not robot. It helps to detect zombies attack on network traffic.
