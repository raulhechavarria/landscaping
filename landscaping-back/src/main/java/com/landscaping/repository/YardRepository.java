package com.landscaping.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.landscaping.entity.Yard;

@Repository
public interface YardRepository extends CrudRepository<Yard, Long>{
	
	
	@Query("delete from Yard where customer_id=?1")
	void deleteByCustomer(Long customer_id);

//	@Query("from yard y where y.streetandnumber = 1")// where y.dateDone + y.frequencesummer > current_date()")
//	List<Yard> findByIdDateDone();

}
