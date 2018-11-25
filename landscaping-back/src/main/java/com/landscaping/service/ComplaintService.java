package com.landscaping.service;

import java.util.List;

import com.landscaping.entity.Complaint;

public interface ComplaintService {

	List<Complaint> find();

	Complaint save(Complaint objRequest);

}
