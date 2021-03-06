package com.ainq.caliphr.persistence.model.obj.caliphrDb.repository;

import  org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import com.ainq.caliphr.persistence.model.obj.caliphrDb.PatientProcedure;

/** 
 * Spring Data Repository for table: patient_procedure.
 * @author autogenerated/custom
 */ 
public interface PatientProcedureRepository extends JpaRepository<PatientProcedure, Integer>, QueryDslPredicateExecutor<PatientProcedure> {

	// Add any extra methods here. This file will not get overwritten unlike any other generated file
}
