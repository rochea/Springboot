package com.appweb.demo.Service;

import org.springframework.stereotype.Service;

@Service

public class MyServiceClass {
	
	
	public int factorial(int n){
		if (n==0) {
			return 1;
		}
		else {
			return n*factorial(n-1);
		}
	}

}
