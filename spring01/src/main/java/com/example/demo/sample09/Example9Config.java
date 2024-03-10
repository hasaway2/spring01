package com.example.demo.sample09;

import org.slf4j.*;
import org.springframework.context.annotation.*;

@Configuration
public class Example9Config {
	@Bean
	public Logger objectMapper() {
		return LoggerFactory.getLogger(this.getClass());
	}
}
