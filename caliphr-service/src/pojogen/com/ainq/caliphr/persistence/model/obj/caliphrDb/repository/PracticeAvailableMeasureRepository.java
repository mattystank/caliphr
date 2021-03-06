package com.ainq.caliphr.persistence.model.obj.caliphrDb.repository;

import  org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import com.ainq.caliphr.persistence.model.obj.caliphrDb.PracticeAvailableMeasure;

/** 
 * Spring Data Repository for table: practice_available_measure.
 * @author autogenerated/custom
 */ 
public interface PracticeAvailableMeasureRepository extends JpaRepository<PracticeAvailableMeasure, Integer>, QueryDslPredicateExecutor<PracticeAvailableMeasure> {

	// Add any extra methods here. This file will not get overwritten unlike any other generated file
}
