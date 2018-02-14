package day3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

	@Bean
	public Point getOneObj() throws Exception {
		return Point.getInstance();
	}
}