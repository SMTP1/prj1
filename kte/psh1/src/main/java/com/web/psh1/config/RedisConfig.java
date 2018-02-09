package com.web.psh1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.StringRedisTemplate;

/*@Configuration*/
public class RedisConfig {

	/*
	<bean id="connectionFactory" 
		class="org.springframework.data.redis.connection.jedis.JedisConnectionFactory">
		<property name="hostName" value="211.110.165.201" />
		<property name="port" value="6379" />
		<property name="password" value="class901" />
		<property name="usePool" value="true" />
	</bean>
	*/
		
	@Bean
	public JedisConnectionFactory a() {
		JedisConnectionFactory jcf = new JedisConnectionFactory();
		jcf.setHostName("211.110.165.201");
		jcf.setPort(6379);
		jcf.setPassword("class901");
		jcf.setUsePool(true);
		return jcf;
	}
	/*
	<bean id="redisTemplate" 
			class="org.springframework.data.redis.core.RedisTemplate">
			<property name="connectionFactory" ref="connectionFactory" />
	</bean>
	*/
	@Bean 
	public StringRedisTemplate b(JedisConnectionFactory jcf) {
		StringRedisTemplate srt = new StringRedisTemplate();
		srt.setConnectionFactory(jcf);
		return srt;
	}
}
