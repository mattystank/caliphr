package com.ainq.caliphr.persistence.model.obj.caliphrDb.repository;

import  org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import com.ainq.caliphr.persistence.model.obj.caliphrDb.EhrVendor;

/** 
 * Spring Data Repository for table: ehr_vendor.
 * @author autogenerated/custom
 */ 
public interface EhrVendorRepository extends JpaRepository<EhrVendor, Integer>, QueryDslPredicateExecutor<EhrVendor> {

	// Add any extra methods here. This file will not get overwritten unlike any other generated file
}
