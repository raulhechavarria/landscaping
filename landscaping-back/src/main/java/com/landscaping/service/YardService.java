package com.landscaping.service;

import java.util.List;

import com.landscaping.entity.Yard;
import com.landscaping.service.dto.YardDto;

public interface YardService {

	List<Yard> find();

	Yard findByID(Long id);

	Yard save(Yard objRequest);

	List<YardDto> findByToDate();

	void deleteYardByCustomer(Long id);


}
