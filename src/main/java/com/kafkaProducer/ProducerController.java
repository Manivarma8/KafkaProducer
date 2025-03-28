package com.kafkaProducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produce")
public class ProducerController {
@Autowired
KafkaProducer kp;

@PostMapping("/send/{word}")
	public String sendThis(@PathVariable String word) {
	kp.sendMessage(word);
	return word + " msg is sent";
}

}
