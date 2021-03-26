package com.dogametal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class MongopostApplication {

    @RequestMapping("/")
    @ResponseBody
    String home() {
      return "Viviane deu ruim a conexão !";
    }
    
	public static void main(String[] args) {
		SpringApplication.run(MongopostApplication.class, args);
	}

}
