package com.sathya.Rest.Restcaller;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.RestTemplate;

import com.sathya.Rest.Entity.Hospital;
import com.sathya.Rest.model.Quote;

@RestController
public class Controller {
	 @GetMapping("/quotes")
	    public ResponseEntity<Quote> getAllQuotes() {
	        String url = "https://dummyjson.com/quotes";
	        RestTemplate restTemplate = new RestTemplate();
	        ResponseEntity<Quote> quote = restTemplate.getForEntity(url, Quote.class);
	        return quote;
	    }
	  	  @GetMapping("/quotes/{number}")
	    public ResponseEntity<Quote> getQuoteByNumber(@PathVariable int number) {
	        String url ="https://dummyjson.com/quotes/" + number; 
	        RestTemplate restTemplate = new RestTemplate();
	        ResponseEntity<Quote> quote = restTemplate.getForEntity(url, Quote.class);
	        return quote;
	    }
	  	  
	     
	    

	  
	
	

}
