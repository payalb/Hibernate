package com.sender.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.IntegerSerializer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
@EnableKafka
public class SenderConfig {

	@Bean
	public Map<String, Object> getConfig(){
		Map<String, Object> prop= new HashMap<String, Object>();
		prop.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		prop.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, IntegerSerializer.class);
		prop.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		return prop;
	}
	
	@Bean
	public ProducerFactory<Integer, String> getFactory(){
		return new DefaultKafkaProducerFactory<>(getConfig());
	}
	
	@Bean
	public KafkaTemplate<Integer, String> getTemplate(){
		return new KafkaTemplate<>(getFactory());		
	}
	
	@Bean
	public KafkaSender getProducer(){
		return new KafkaSender();
	}
	
	@Bean
	public ObjectMapper getMapper(){
		return new ObjectMapper();
	}
}
