package com.ainq.caliphr.persistence.model.obj.caliphrDb.repository;

import  org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import com.ainq.caliphr.persistence.model.obj.caliphrDb.PatientPlanOfCare;

/** 
 * Spring Data Repository for table: patient_plan_of_care.
 * @author autogenerated/custom
 */ 
public interface PatientPlanOfCareRepository extends JpaRepository<PatientPlanOfCare, Integer>, QueryDslPredicateExecutor<PatientPlanOfCare> {

	// Add any extra methods here. This file will not get overwritten unlike any other generated file
}
