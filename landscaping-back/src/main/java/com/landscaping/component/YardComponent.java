package com.landscaping.component;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.landscaping.service.YardService;

@Component
public class YardComponent implements CommandLineRunner {

	
	@Autowired
	@Qualifier("ShortYardServiceImpl")
	private YardService serviceShort;
	
	@Autowired
	@Qualifier("BigYardServiceImpl")
	private YardService serviceBig;
	// this one is for to inject  more that one service 
    
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

	}

}
