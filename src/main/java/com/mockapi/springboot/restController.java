package com.mockapi.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restController {

	@Autowired
	private MockApiService mockapiService;

	
//	@RequestMapping("/mockapi")
//	public String mockapidata() {
//		return mockapiService.mockapidata();
//	}
	
	@PostMapping("/mockapi")	
	public String requestdata(@RequestBody String data){
		System.out.println(data);
		return data;		
	}


}
