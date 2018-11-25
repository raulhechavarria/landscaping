package com.landscaping.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.landscaping.entity.Complaint;
import com.landscaping.repository.ComplaintRepository;

@Service
public class ComplaintServiceImpl implements ComplaintService{
	
	@Autowired
	ComplaintRepository repository;

	@Override
	public List<Complaint> find() {
		// TODO Auto-generated method stub
		return (List<Complaint>) repository.findAll();
	}

	

	@Override
	public Complaint save(Complaint objRequest) {
		try {
			
			objRequest.setDate(new Date());		
			return  repository.save(objRequest);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	
	
}
