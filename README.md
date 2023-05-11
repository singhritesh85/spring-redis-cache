# spring-redis-cache
Application showcasing simple write through cache implementation using spring-redis module and jedis client

```@Cacheable(value = "product", key = "#productId")```
```@CachePut(value = "product", key = "#productDTO.productId")```
  ```@CacheEvict(cacheNames="product", key="#productId") ```

![image](https://github.com/souravkantha/spring-redis-cache/assets/32014166/89e2cd91-e9cf-4af4-99e3-70bc0aca2749)

## Java Version
Used open-jdk **version 17** (https://openjdk.org/projects/jdk/17/)

## Redis Installation 
https://redis.io/docs/getting-started/installation/

Upon successful redis installation and running standalone redis, you should be able to view below screenshot

<img width="1170" alt="Screenshot 2023-05-11 at 2 01 30 AM" src="https://github.com/souravkantha/spring-redis-cache/assets/32014166/f76f484c-a578-441d-bc45-2d0f60d07562">


## Build Tool
### We are using maven tool to build the project. You can download & install maven from official website (https://maven.apache.org/install.html)

## Making the build
### Download the source code using git ssh or https from https://github.com/souravkantha/spring-redis-cache

#### - [x] **Check if maven is installed by putting 'mvn' command in command prompt or terminal**
* Go the root directory i.e; **spring-redis-cache**
* Use command ```mvn clean package```. After the build is successful, run the program using following command

     ```java -jar target/cache-1.0.jar```
 
Upon successful start of the service, you should see the h2 database console

Open h2 console : http://localhost:8080/h2-console/login.jsp
    
<img width="462" alt="Screenshot 2023-05-10 at 11 44 29 PM" src="https://github.com/souravkantha/spring-redis-cache/assets/32014166/65ce330f-7ad6-40c9-848e-324b35917d06">


<img width="1119" alt="Screenshot 2023-05-10 at 11 56 25 PM" src="https://github.com/souravkantha/spring-redis-cache/assets/32014166/035f5634-7347-4d21-94d0-583830328994">





   
