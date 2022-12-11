package elisa.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class ElisaConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElisaConfigServerApplication.class, args);
	}

}

