package com.sender.config;

import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/kafka")
public class SenderController {
	
	@Autowired
	KafkaSender sender;
	@Autowired
	ObjectMapper mapper;

	@RequestMapping(path="/send/{topic}", method=RequestMethod.POST )
	public KafkaVO sendMessage(@RequestBody KafkaVO message, @PathVariable("topic")String topic) throws InterruptedException, ExecutionException, JsonProcessingException{
		sender.sendMessage(topic, message.getKey(), mapper.writeValueAsString(message));
		return message;
	}
}
