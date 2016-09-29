package com.ainq.caliphr.persistence.model.obj.caliphrDb.repository;

import  org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import com.ainq.caliphr.persistence.model.obj.caliphrDb.HqmfAttribute;

/** 
 * Spring Data Repository for table: hqmf_attribute.
 * @author autogenerated/custom
 */ 
public interface HqmfAttributeRepository extends JpaRepository<HqmfAttribute, Long>, QueryDslPredicateExecutor<HqmfAttribute> {

	// Add any extra methods here. This file will not get overwritten unlike any other generated file
}
