package com.landscaping.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.landscaping.entity.Yard;
import com.landscaping.repository.YardRepository;
import com.landscaping.service.dto.YardDto;

@Service
public class YardServiceImpl implements YardService {

	@Autowired
	YardRepository repository;

	@Override
	public List<Yard> find() {
		// TODO Auto-generated method stub
		return (List<Yard>) repository.findAll();
	}

	@Override
	public Yard findByID(Long id) {
		try {
			Yard obj = repository.findById(id).get();
			return obj;
		} catch (NumberFormatException e) {
			e.getMessage();
		}
		return null;
	}

	@Override
	public Yard save(Yard objRequest) {
		try {
			return repository.save(objRequest);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public List<YardDto> findByToDate() {
		List<Yard> list = (List<Yard>) repository.findAll();
		List<YardDto> listResult = new ArrayList<YardDto>();

		for (Yard yard : list) {
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(yard.getDateDone()); // Configuramos la fecha que se recibe
			calendar.add(Calendar.DAY_OF_YEAR, yard.getFrequenceSummer()); // numero de días a añadir, o restar en caso
																			// de días<0
			if (calendar.getTime().before(new Date())) {
				
				YardDto dto = new YardDto(yard.getId(), yard.getStreetandnumber(), yard.getCity(), yard.getFrequenceSummer(), yard.getFrequenceWinter(), yard.getDateDone(), yard.getCustomer());
				
				listResult.add(dto);
			}
		}

		return listResult;
	}

	@Override
	public void deleteYardByCustomer(Long id) {
		try {
		//	Customer customer = new Customer();
		//	customer.setId(id);
			repository.deleteByCustomer(id);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
