package co.edu.utp.isc.gia.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("hello")
public class HelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}
        
        @GetMapping("/{firstname}/{lastname}")
        public String sayHello(
               @PathVariable("firstname")String firstname,
               @PathVariable("lastname")String lastname) {
            return String.format("Hello %s %s", firstname, lastname);
        }
        
        @GetMapping()
        public String sayHello2(
               @RequestParam("firstname")String firstname,
               @RequestParam("lastname")String lastname){
            return String.format("Hello %s %s", firstname, lastname);
        }

}
