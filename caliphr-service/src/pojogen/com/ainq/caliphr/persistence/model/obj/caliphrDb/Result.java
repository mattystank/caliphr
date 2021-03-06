package com.ainq.caliphr.persistence.model.obj.caliphrDb;

import com.ainq.caliphr.persistence.model.obj.caliphrDb.ResultPatient;
import com.ainq.caliphr.persistence.model.obj.caliphrDb.ResultSupplemental;
import com.ainq.caliphr.persistence.model.obj.caliphrDb.iface.IResult;
import com.ainq.caliphr.persistence.util.IPojoGenEntity;
import java.io.Serializable;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;
import org.hibernate.annotations.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.Parameter;
import org.hibernate.proxy.HibernateProxy;

/**
 * Object mapping for hibernate-handled table: result.
 * 
 *
 * @author autogenerated
 */
		

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;


import javax.persistence.*;

@Entity
@Table(name = "result", catalog = "caliphr_db", schema = "caliphr")
@Cache(region = "com.ainq.caliphr.persistence.model.obj.caliphrDb.Result", usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Result implements Cloneable, Serializable, IPojoGenEntity, IResult {

	/** Serial Version UID. */
	private static final long serialVersionUID = -8148592787988159167L;

	/** Use a WeakHashMap so entries will be garbage collected once all entities 
		referring to a saved hash are garbage collected themselves. */
	private static final Map<Serializable, Long> SAVED_HASHES =
		Collections.synchronizedMap(new WeakHashMap<>());
	
	/** hashCode temporary storage. */
	private volatile Long hashCode;
	

	/** Field mapping. */
	private Date dateCreated;
	/** Field mapping. */
	private Date dateDisabled;
	/** Field mapping. */
	private Date dateUpdated;
	/** Field mapping. */
	private HqmfPopulationSet hqmfPopulationSet;
	/** Field mapping. */
	private Long id;
	/** Field mapping. */
	private Set<ResultPatient> resultPatients = new HashSet<>();

	/** Field mapping. */
	private Set<ResultSupplemental> resultSupplementals = new HashSet<>();

	/** Field mapping. */
	private Integer resultValue;
	/** Field mapping. */
	private Integer userCreated;
	/** Field mapping. */
	private Integer userUpdated;
	/**
	 * Default constructor, mainly for hibernate use.
	 */
	public Result() {
		// Default constructor
	} 

	/** Constructor taking a given ID.
	 * @param id to set
	 */
	public Result(Long id) {
		this.id = id;
	}
	
 


 
	/** Return the type of this class. Useful for when dealing with proxies.
	* @return Defining class.
	*/
	@Transient
	public Class<?> getClassType() {
		return Result.class;
	}


	 /**
	 * Return the value associated with the column: dateCreated.
	 * @return A Date object (this.dateCreated)
	 */
	@Basic( optional = true )
	@Column( name = "date_created"  )
	public Date getDateCreated() {
		return this.dateCreated;
		
	}
	

  
	 /**  
	 * Set the value related to the column: dateCreated.
	 * @param dateCreated the dateCreated value you wish to set
	 */
	public void setDateCreated(final Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	 /**
	 * Return the value associated with the column: dateDisabled.
	 * @return A Date object (this.dateDisabled)
	 */
	@Basic( optional = true )
	@Column( name = "date_disabled"  )
	public Date getDateDisabled() {
		return this.dateDisabled;
		
	}
	

  
	 /**  
	 * Set the value related to the column: dateDisabled.
	 * @param dateDisabled the dateDisabled value you wish to set
	 */
	public void setDateDisabled(final Date dateDisabled) {
		this.dateDisabled = dateDisabled;
	}

	 /**
	 * Return the value associated with the column: dateUpdated.
	 * @return A Date object (this.dateUpdated)
	 */
	@Basic( optional = true )
	@Column( name = "date_updated"  )
	public Date getDateUpdated() {
		return this.dateUpdated;
		
	}
	

  
	 /**  
	 * Set the value related to the column: dateUpdated.
	 * @param dateUpdated the dateUpdated value you wish to set
	 */
	public void setDateUpdated(final Date dateUpdated) {
		this.dateUpdated = dateUpdated;
	}

	 /**
	 * Return the value associated with the column: hqmfPopulationSet.
	 * @return A HqmfPopulationSet object (this.hqmfPopulationSet)
	 */

	@JsonBackReference @ManyToOne( cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.LAZY )
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = true )
	@JoinColumn(name = "hqmf_population_set_id", nullable = true )
	public HqmfPopulationSet getHqmfPopulationSet() {
		return this.hqmfPopulationSet;
		
	}
	

  
	 /**  
	 * Set the value related to the column: hqmfPopulationSet.
	 * @param hqmfPopulationSet the hqmfPopulationSet value you wish to set
	 */
	public void setHqmfPopulationSet(final HqmfPopulationSet hqmfPopulationSet) {
		this.hqmfPopulationSet = hqmfPopulationSet;
	}

	 /**
	 * Return the value associated with the column: id.
	 * @return A Long object (this.id)
	 */
    @Id 
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "resultResult_idGenerator")
	@Basic( optional = false )
	@Column( name = "result_id", nullable = false  )
	@SequenceGenerator(allocationSize = 50, name = "resultResult_idGenerator", sequenceName = "caliphr_db.caliphr.result_id_seq", schema = "caliphr", catalog = "caliphr_db")
	public Long getId() {
		return this.id;
		
	}
	

  
	 /**  
	 * Set the value related to the column: id.
	 * @param id the id value you wish to set
	 */
	public void setId(final Long id) {
		// If we've just been persisted and hashCode has been
		// returned then make sure other entities with this
		// ID return the already returned hash code
		if ( (this.id == null || this.id == 0L) &&
				(id != null) &&
				(this.hashCode != null) ) {
		SAVED_HASHES.put( id, this.hashCode );
		}
		this.id = id;
	}

	 /**
	 * Return the value associated with the column: resultPatient.
	 * @return A Set&lt;ResultPatient&gt; object (this.resultPatient)
	 */
	@JsonManagedReference @OneToMany( fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE }, mappedBy = "result"  )
 	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = false )
	@Column( name = "result_id", nullable = false  )
	public Set<ResultPatient> getResultPatients() {
		return this.resultPatients;
		
	}
	
	/**
	 * Adds a bi-directional link of type ResultPatient to the resultPatients set.
	 * @param resultPatient item to add
	 */
	public void addResultPatient(ResultPatient resultPatient) {
		resultPatient.setResult(this);
		this.resultPatients.add(resultPatient);
	}

  
	 /**  
	 * Set the value related to the column: resultPatient.
	 * @param resultPatient the resultPatient value you wish to set
	 */
	public void setResultPatients(final Set<ResultPatient> resultPatient) {
		this.resultPatients = resultPatient;
	}

	 /**
	 * Return the value associated with the column: resultSupplemental.
	 * @return A Set&lt;ResultSupplemental&gt; object (this.resultSupplemental)
	 */
	@JsonManagedReference @OneToMany( fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE }, mappedBy = "result"  )
 	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = false )
	@Column( name = "result_id", nullable = false  )
	public Set<ResultSupplemental> getResultSupplementals() {
		return this.resultSupplementals;
		
	}
	
	/**
	 * Adds a bi-directional link of type ResultSupplemental to the resultSupplementals set.
	 * @param resultSupplemental item to add
	 */
	public void addResultSupplemental(ResultSupplemental resultSupplemental) {
		resultSupplemental.setResult(this);
		this.resultSupplementals.add(resultSupplemental);
	}

  
	 /**  
	 * Set the value related to the column: resultSupplemental.
	 * @param resultSupplemental the resultSupplemental value you wish to set
	 */
	public void setResultSupplementals(final Set<ResultSupplemental> resultSupplemental) {
		this.resultSupplementals = resultSupplemental;
	}

	 /**
	 * Return the value associated with the column: resultValue.
	 * @return A Integer object (this.resultValue)
	 */
	@Basic( optional = true )
	@Column( name = "result_value"  )
	public Integer getResultValue() {
		return this.resultValue;
		
	}
	

  
	 /**  
	 * Set the value related to the column: resultValue.
	 * @param resultValue the resultValue value you wish to set
	 */
	public void setResultValue(final Integer resultValue) {
		this.resultValue = resultValue;
	}

	 /**
	 * Return the value associated with the column: userCreated.
	 * @return A Integer object (this.userCreated)
	 */
	@Basic( optional = true )
	@Column( name = "user_created"  )
	public Integer getUserCreated() {
		return this.userCreated;
		
	}
	

  
	 /**  
	 * Set the value related to the column: userCreated.
	 * @param userCreated the userCreated value you wish to set
	 */
	public void setUserCreated(final Integer userCreated) {
		this.userCreated = userCreated;
	}

	 /**
	 * Return the value associated with the column: userUpdated.
	 * @return A Integer object (this.userUpdated)
	 */
	@Basic( optional = true )
	@Column( name = "user_updated"  )
	public Integer getUserUpdated() {
		return this.userUpdated;
		
	}
	

  
	 /**  
	 * Set the value related to the column: userUpdated.
	 * @param userUpdated the userUpdated value you wish to set
	 */
	public void setUserUpdated(final Integer userUpdated) {
		this.userUpdated = userUpdated;
	}


   /**
    * Deep copy.
	* @return cloned object
	* @throws CloneNotSupportedException on error
    */
    @Override
    public Result clone() throws CloneNotSupportedException {
		
        final Result copy = (Result)super.clone();

 		copy.setDateCreated(this.getDateCreated());
 		copy.setDateDisabled(this.getDateDisabled());
 		copy.setDateUpdated(this.getDateUpdated());
 		copy.setHqmfPopulationSet(this.getHqmfPopulationSet());
 		copy.setId(this.getId());
		if (this.getResultPatients() != null) {
			copy.getResultPatients().addAll(this.getResultPatients());
		}
		if (this.getResultSupplementals() != null) {
			copy.getResultSupplementals().addAll(this.getResultSupplementals());
		}
 		copy.setResultValue(this.getResultValue());
 		copy.setUserCreated(this.getUserCreated());
 		copy.setUserUpdated(this.getUserUpdated());
		return copy;
	}
	


	/** Provides toString implementation.
	 * @see java.lang.Object#toString()
	 * @return String representation of this class.
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("dateCreated: " + this.getDateCreated() + ", ");
		sb.append("dateDisabled: " + this.getDateDisabled() + ", ");
		sb.append("dateUpdated: " + this.getDateUpdated() + ", ");
		sb.append("id: " + this.getId() + ", ");
		sb.append("resultValue: " + this.getResultValue() + ", ");
		sb.append("userCreated: " + this.getUserCreated() + ", ");
		sb.append("userUpdated: " + this.getUserUpdated());
		return sb.toString();		
	}


	/** Equals implementation. 
	 * @param aThat Object to compare with
	 * @return true/false
	 */
	@Override
	public boolean equals(final Object aThat) {
		Object proxyThat = aThat;
		
		if ( this == aThat ) {
			 return true;
		}

		
		if (aThat instanceof HibernateProxy) {
 			// narrow down the proxy to the class we are dealing with.
 			try {
				proxyThat = ((HibernateProxy) aThat).getHibernateLazyInitializer().getImplementation(); 
			} catch (org.hibernate.ObjectNotFoundException e) {
				return false;
		   	}
		}
		if (aThat == null)  {
			 return false;
		}
		
		final Result that; 
		try {
			that = (Result) proxyThat;
			if ( !(that.getClassType().equals(this.getClassType()))){
				return false;
			}
		} catch (org.hibernate.ObjectNotFoundException e) {
				return false;
		} catch (ClassCastException e) {
				return false;
		}
		
		
		boolean result = true;
		result = result && (((this.getId() == null) && ( that.getId() == null)) || (this.getId() != null  && this.getId().equals(that.getId())));
		result = result && (((getDateCreated() == null) && (that.getDateCreated() == null)) || (getDateCreated() != null && getDateCreated().equals(that.getDateCreated())));
		result = result && (((getDateDisabled() == null) && (that.getDateDisabled() == null)) || (getDateDisabled() != null && getDateDisabled().equals(that.getDateDisabled())));
		result = result && (((getDateUpdated() == null) && (that.getDateUpdated() == null)) || (getDateUpdated() != null && getDateUpdated().equals(that.getDateUpdated())));
		result = result && (((getHqmfPopulationSet() == null) && (that.getHqmfPopulationSet() == null)) || (getHqmfPopulationSet() != null && getHqmfPopulationSet().getId().equals(that.getHqmfPopulationSet().getId())));	
		result = result && (((getResultValue() == null) && (that.getResultValue() == null)) || (getResultValue() != null && getResultValue().equals(that.getResultValue())));
		result = result && (((getUserCreated() == null) && (that.getUserCreated() == null)) || (getUserCreated() != null && getUserCreated().equals(that.getUserCreated())));
		result = result && (((getUserUpdated() == null) && (that.getUserUpdated() == null)) || (getUserUpdated() != null && getUserUpdated().equals(that.getUserUpdated())));
		return result;
	}
	
	/** Calculate the hashcode.
	 * @see java.lang.Object#hashCode()
	 * @return a calculated number
	 */
	@Override
	public int hashCode() {
		if ( this.hashCode == null ) {
			synchronized ( this ) {
				if ( this.hashCode == null ) {
					Long newHashCode = null;

					if ( getId() != null ) {
					newHashCode = SAVED_HASHES.get( getId() );
					}
					
					if ( newHashCode == null ) {
						if ( getId() != null && getId() != 0L) {
							newHashCode = getId();
						} else {
							newHashCode = (long) super.hashCode();

						}
					}
					
					this.hashCode = newHashCode;
				}
			}
		}
		return (int) (this.hashCode & 0xffffff);
	}
	

	
	@PreUpdate
	public void preUpdate() {
		this.dateUpdated = new Date();
	}
}
