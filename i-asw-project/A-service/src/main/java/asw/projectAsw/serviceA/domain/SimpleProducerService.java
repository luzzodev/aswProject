package asw.projectAsw.serviceA.domain;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.logging.*;

@Service
public class SimpleProducerService {

	private static final Logger logger = Logger.getLogger(SimpleProducerService.class.toString());

	@Autowired
	private SimpleMessagePublisher simpleMessagePublisher;

    public void publish(String message) {
		logger.info("PUBLISHING MESSAGE: " + message);
		simpleMessagePublisher.publish(message);  
	}

}
