package com.ainq.caliphr.persistence.model.obj.caliphrDb.repository;

import  org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import com.ainq.caliphr.persistence.model.obj.caliphrDb.ResultSupplemental;

/** 
 * Spring Data Repository for table: result_supplemental.
 * @author autogenerated/custom
 */ 
public interface ResultSupplementalRepository extends JpaRepository<ResultSupplemental, Integer>, QueryDslPredicateExecutor<ResultSupplemental> {

	// Add any extra methods here. This file will not get overwritten unlike any other generated file
}
