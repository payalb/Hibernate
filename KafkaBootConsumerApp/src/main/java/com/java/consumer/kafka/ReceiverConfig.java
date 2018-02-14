package com.java.consumer.kafka;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.IntegerDeserializer;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.config.KafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.listener.ConcurrentMessageListenerContainer;

@EnableKafka
@Configuration
public class ReceiverConfig {
	
	@Bean
	public Map<String, Object> config() {
		 Map<String, Object> prop= new HashMap<String, Object>();
		 prop.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		 prop.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, IntegerDeserializer.class);
		 prop.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		 prop.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
		 prop.put(ConsumerConfig.GROUP_ID_CONFIG, "test");
		return prop;
	}
	

	@Bean
	public ConsumerFactory<Integer, String> consumerFactory(){
		return new DefaultKafkaConsumerFactory<Integer, String>(config());
		
	}

	
	@Bean
	public KafkaListenerContainerFactory<ConcurrentMessageListenerContainer<Integer, String>> kafkaListenerContainerFactory(){
		ConcurrentKafkaListenerContainerFactory<Integer, String> factory= new ConcurrentKafkaListenerContainerFactory<>();
		factory.setConcurrency(3);
		factory.setConsumerFactory(consumerFactory());
		factory.getContainerProperties().setPollTimeout(3000);
		return factory;
	}
	
	@Bean
	public KafkaReceiver getReceiver(){
		return new KafkaReceiver();
	}
}
