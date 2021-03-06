package com.ainq.caliphr.persistence.model.obj.caliphrDb.repository;

import  org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import com.ainq.caliphr.persistence.model.obj.caliphrDb.ApplicationUserAudit;

/** 
 * Spring Data Repository for table: application_user_audit.
 * @author autogenerated/custom
 */ 
public interface ApplicationUserAuditRepository extends JpaRepository<ApplicationUserAudit, Integer>, QueryDslPredicateExecutor<ApplicationUserAudit> {

	// Add any extra methods here. This file will not get overwritten unlike any other generated file
}
