package com.ainq.caliphr.persistence.model.obj.caliphrDb.repository;

import  org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import com.ainq.caliphr.persistence.model.obj.caliphrDb.PracticeGroup;
import com.mysema.query.types.Predicate;

import javax.persistence.QueryHint;

/** 
 * Spring Data Repository for table: practice_group.
 * @author autogenerated/custom
 */ 
public interface PracticeGroupRepository extends JpaRepository<PracticeGroup, Integer>, QueryDslPredicateExecutor<PracticeGroup> {

	// Add any extra methods here. This file will not get overwritten unlike any other generated file
	
	@QueryHints({ 
		@QueryHint(name = "org.hibernate.cacheable", value ="true"), 
		@QueryHint(name = "org.hibernate.cacheRegion", value = "com.ainq.caliphr.persistence.model.obj.caliphrDb.PracticeGroup.queryCache")
	})
	PracticeGroup findOne(Predicate predicate);
}
