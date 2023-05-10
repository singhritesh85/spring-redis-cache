package com.springredis.cache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootApplication
@Configuration
@EnableCaching
public class SpringRedisCacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRedisCacheApplication.class, args);
	}
	
	@Bean
	  JedisConnectionFactory redisConnectionFactory() {
	    return new JedisConnectionFactory();
	  }

	  @Bean
	  RedisTemplate<String, String> redisTemplate(RedisConnectionFactory redisConnectionFactory) {

	    RedisTemplate<String, String> template = new RedisTemplate<>();
	    template.setConnectionFactory(redisConnectionFactory);
	    return template;
	  }

}

