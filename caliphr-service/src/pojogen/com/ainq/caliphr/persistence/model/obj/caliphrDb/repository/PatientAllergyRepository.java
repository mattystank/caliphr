package com.ainq.caliphr.persistence.model.obj.caliphrDb.repository;

import  org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import com.ainq.caliphr.persistence.model.obj.caliphrDb.PatientAllergy;

/** 
 * Spring Data Repository for table: patient_allergy.
 * @author autogenerated/custom
 */ 
public interface PatientAllergyRepository extends JpaRepository<PatientAllergy, Integer>, QueryDslPredicateExecutor<PatientAllergy> {

	// Add any extra methods here. This file will not get overwritten unlike any other generated file
}
