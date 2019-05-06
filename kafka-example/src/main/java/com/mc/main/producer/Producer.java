/**
 * 
 */
package com.mc.main.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.mc.main.entity.Temperature;

/**
 * @author SAMARESH
 *
 */
@Service
public class Producer {
	private static final Logger logger = LoggerFactory.getLogger(Producer.class);
	private static final String TOPIC = "users";
	@Autowired
	private KafkaTemplate<String, Temperature> kafkaTemplate;

	public void sendMessage(Temperature temperature) {
		logger.info(String.format("$$ -> Producing message --> %s", temperature));
		this.kafkaTemplate.send(TOPIC, temperature);
	}
}