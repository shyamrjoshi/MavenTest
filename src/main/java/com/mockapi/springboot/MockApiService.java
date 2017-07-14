package com.mockapi.springboot;

import org.springframework.stereotype.Component;

@Component
public class MockApiService{
	public String mockapidata() {
		return "Mock Api data updated";
	}
}