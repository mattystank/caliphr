package com.ainq.caliphr.persistence.model.obj.caliphrDb.repository;

import  org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import com.ainq.caliphr.persistence.model.obj.caliphrDb.ParseStatusType;
import com.mysema.query.types.Predicate;

import javax.persistence.QueryHint;

/** 
 * Spring Data Repository for table: parse_status_type.
 * @author autogenerated/custom
 */ 
public interface ParseStatusTypeRepository extends JpaRepository<ParseStatusType, Integer>, QueryDslPredicateExecutor<ParseStatusType> {

	// Add any extra methods here. This file will not get overwritten unlike any other generated file
	
	@QueryHints({ 
		@QueryHint(name = "org.hibernate.cacheable", value ="true"), 
		@QueryHint(name = "org.hibernate.cacheRegion", value = "com.ainq.caliphr.persistence.model.obj.caliphrDb.ParseStatusType.queryCache")
	})
	ParseStatusType findOne(Predicate predicate);
}