package com.ainq.caliphr.persistence.model.obj.caliphrDb.repository;

import  org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import com.ainq.caliphr.persistence.model.obj.caliphrDb.HqmfPopulation;

/** 
 * Spring Data Repository for table: hqmf_population.
 * @author autogenerated/custom
 */ 
public interface HqmfPopulationRepository extends JpaRepository<HqmfPopulation, Long>, QueryDslPredicateExecutor<HqmfPopulation> {

	// Add any extra methods here. This file will not get overwritten unlike any other generated file
}
