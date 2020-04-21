/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.utp.isc.gia.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author wilso
 */
@SpringBootApplication
@RestController
@RequestMapping("calc")
public class CalculadoraController {
    public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}
    
    @GetMapping("/suma")
    public String suma(
           @RequestParam("num1") int num1,
           @RequestParam("num2") int num2){
        int suma = num1 + num2;
        return Integer.toString(suma);
    }
    
    @GetMapping("/resta")
    public String resta(
           @RequestParam("num1") int num1,
           @RequestParam("num2") int num2){
        int suma = num1 - num2;
        return Integer.toString(suma);
    }
    
    @GetMapping("/multiplicacion")
    public String multiplicacion(
           @RequestParam("num1") int num1,
           @RequestParam("num2") int num2){
        int suma = num1 * num2;
        return Integer.toString(suma);
    }
    
    @GetMapping("/division")
    public String division(
           @RequestParam("num1") int num1,
           @RequestParam("num2") int num2){
        int suma = num1 / num2;
        return Integer.toString(suma);
    }

}
