package com.landscaping.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.landscaping.entity.Complaint;
import com.landscaping.service.ComplaintService;



@RestController
@CrossOrigin
@RequestMapping("/complaint")
public class ComplaintController {
	
	@Autowired
	ComplaintService service;
	
	
	@GetMapping
	public @ResponseBody List<Complaint> find(){
		return service.find();
	}
	

	
	@PostMapping
	public @ResponseBody Complaint save(@RequestBody Complaint objRequest) {
		return service.save(objRequest);

	}

	

}
