/**
 * 
 */
package com.mc.main.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.mc.main.entity.Temperature;	

/**
 * @author SAMARESH
 *
 */
@Service
public class Consumer {
	private final Logger logger = LoggerFactory.getLogger(Consumer.class);
	
	@Autowired
	MongoTemplate template;

	@KafkaListener(topics = "users", groupId = "group_id")
	public void consume(Temperature tempObj) {
		logger.info(String.format("$$ -> Consumed Message -> %s", tempObj));
		logger.info(String.format("$$ -> Consumed UUID -> %s", tempObj.getUuid()));
		template.save(tempObj);
	}
}