package com.example.goodsCenter.dao;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.goodsCenter.model.Hospital;

public interface HospitalDao extends JpaRepository<Hospital, Long>{
	
	Hospital findByHospitalName(String hospitalname);
	
	List<Hospital> findTop10ByHospitalName(String hospitalname, Pageable pageable);
}
