package com.ainq.caliphr.persistence.model.obj.caliphrDb.repository;

import  org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import com.ainq.caliphr.persistence.model.obj.caliphrDb.ValueSetCode;

/** 
 * Spring Data Repository for table: value_set_code.
 * @author autogenerated/custom
 */ 
public interface ValueSetCodeRepository extends JpaRepository<ValueSetCode, Integer>, QueryDslPredicateExecutor<ValueSetCode> {

	// Add any extra methods here. This file will not get overwritten unlike any other generated file
}
