package com.landscaping.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.landscaping.entity.Yard;
import com.landscaping.service.YardService;
import com.landscaping.service.dto.YardDto;

@RestController
@CrossOrigin
@RequestMapping("/yard")
public class YardController {

	@Autowired
	YardService service;

	@GetMapping
	public @ResponseBody List<Yard> find() {
		return service.find();
	}

	@GetMapping("today")
	public @ResponseBody List<YardDto> findByToDate() {
		return service.findByToDate();
	}
	
	@GetMapping("/{id}")
	public @ResponseBody Yard findByID(@PathVariable Long id) {
		return service.findByID(id);
	}

	@PostMapping
	public @ResponseBody Yard save(@RequestBody Yard objRequest) {
		return service.save(objRequest);

	}

	@PutMapping
	public @ResponseBody Yard update(@RequestBody Yard objRequest) {
		return service.save(objRequest);

	}
}
