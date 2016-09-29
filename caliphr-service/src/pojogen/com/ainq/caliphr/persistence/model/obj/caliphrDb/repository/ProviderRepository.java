package com.ainq.caliphr.persistence.model.obj.caliphrDb.repository;

import  org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import com.ainq.caliphr.persistence.model.obj.caliphrDb.Provider;
import com.mysema.query.types.Predicate;

import javax.persistence.QueryHint;

/** 
 * Spring Data Repository for table: provider.
 * @author autogenerated/custom
 */ 
public interface ProviderRepository extends JpaRepository<Provider, Integer>, QueryDslPredicateExecutor<Provider> {
	
	// Add any extra methods here. This file will not get overwritten unlike any other generated file

	@QueryHints({ 
		@QueryHint(name = "org.hibernate.cacheable", value ="true"), 
		@QueryHint(name = "org.hibernate.cacheRegion", value = "com.ainq.caliphr.persistence.model.obj.caliphrDb.Provider.queryCache")
	})
	Iterable<Provider> findAll(Predicate predicate);
	
	@QueryHints({ 
		@QueryHint(name = "org.hibernate.cacheable", value ="true"), 
		@QueryHint(name = "org.hibernate.cacheRegion", value = "com.ainq.caliphr.persistence.model.obj.caliphrDb.Provider.queryCache")
	})
	Provider findOne(Predicate predicate);

}
