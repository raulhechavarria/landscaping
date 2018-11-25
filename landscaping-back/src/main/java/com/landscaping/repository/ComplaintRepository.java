package com.landscaping.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.landscaping.entity.Complaint;

@Repository
public interface ComplaintRepository extends CrudRepository<Complaint, Long>{

	
}
