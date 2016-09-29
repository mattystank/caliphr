package com.ainq.caliphr.persistence.model.obj.caliphrDb;

import com.ainq.caliphr.persistence.model.obj.caliphrDb.Result;
import com.ainq.caliphr.persistence.model.obj.caliphrDb.iface.IHqmfPopulationSet;
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
 * Object mapping for hibernate-handled table: hqmf_population_set.
 * 
 *
 * @author autogenerated
 */
		

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;


import javax.persistence.*;

@Entity
@Table(name = "hqmf_population_set", catalog = "caliphr_db", schema = "caliphr")
@Cache(region = "com.ainq.caliphr.persistence.model.obj.caliphrDb.HqmfPopulationSet", usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class HqmfPopulationSet implements Cloneable, Serializable, IPojoGenEntity, IHqmfPopulationSet {

	/** Serial Version UID. */
	private static final long serialVersionUID = -8205651229330910595L;

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
	private HqmfDocument hqmfDocument;
	/** Field mapping. */
	private Long id;
	/** Field mapping. */
	private Integer index;
	/** Field mapping. */
	private String key;
	/** Field mapping. */
	private Set<Result> results = new HashSet<>();

	/** Field mapping. */
	private Integer userCreated;
	/** Field mapping. */
	private Integer userUpdated;
	/** Field mapping. */
	private String value;
	/**
	 * Default constructor, mainly for hibernate use.
	 */
	public HqmfPopulationSet() {
		// Default constructor
	} 

	/** Constructor taking a given ID.
	 * @param id to set
	 */
	public HqmfPopulationSet(Long id) {
		this.id = id;
	}
	
 


 
	/** Return the type of this class. Useful for when dealing with proxies.
	* @return Defining class.
	*/
	@Transient
	public Class<?> getClassType() {
		return HqmfPopulationSet.class;
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
	 * Return the value associated with the column: hqmfDocument.
	 * @return A HqmfDocument object (this.hqmfDocument)
	 */

	@JsonBackReference @ManyToOne( cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.LAZY )
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = true )
	@JoinColumn(name = "hqmf_document_id", nullable = true )
	public HqmfDocument getHqmfDocument() {
		return this.hqmfDocument;
		
	}
	

  
	 /**  
	 * Set the value related to the column: hqmfDocument.
	 * @param hqmfDocument the hqmfDocument value you wish to set
	 */
	public void setHqmfDocument(final HqmfDocument hqmfDocument) {
		this.hqmfDocument = hqmfDocument;
	}

	 /**
	 * Return the value associated with the column: id.
	 * @return A Long object (this.id)
	 */
    @Id 
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hqmfPopulationSetRecord_idGenerator")
	@Basic( optional = false )
	@Column( name = "record_id", nullable = false  )
	@SequenceGenerator(allocationSize = 50, name = "hqmfPopulationSetRecord_idGenerator", sequenceName = "caliphr_db.caliphr.hqmf_population_set_id_seq", schema = "caliphr", catalog = "caliphr_db")
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
	 * Return the value associated with the column: index.
	 * @return A Integer object (this.index)
	 */
	public Integer getIndex() {
		return this.index;
		
	}
	

  
	 /**  
	 * Set the value related to the column: index.
	 * @param index the index value you wish to set
	 */
	public void setIndex(final Integer index) {
		this.index = index;
	}

	 /**
	 * Return the value associated with the column: key.
	 * @return A String object (this.key)
	 */
	@Basic( optional = true )
	@Column( length = 2147483647  )
	public String getKey() {
		return this.key;
		
	}
	

  
	 /**  
	 * Set the value related to the column: key.
	 * @param key the key value you wish to set
	 */
	public void setKey(final String key) {
		this.key = key;
	}

	 /**
	 * Return the value associated with the column: result.
	 * @return A Set&lt;Result&gt; object (this.result)
	 */
	@JsonManagedReference @OneToMany( fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE }, mappedBy = "hqmfPopulationSet"  )
 	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = false )
	@Column( name = "record_id", nullable = false  )
	public Set<Result> getResults() {
		return this.results;
		
	}
	
	/**
	 * Adds a bi-directional link of type Result to the results set.
	 * @param result item to add
	 */
	public void addResult(Result result) {
		result.setHqmfPopulationSet(this);
		this.results.add(result);
	}

  
	 /**  
	 * Set the value related to the column: result.
	 * @param result the result value you wish to set
	 */
	public void setResults(final Set<Result> result) {
		this.results = result;
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
	 * Return the value associated with the column: value.
	 * @return A String object (this.value)
	 */
	@Basic( optional = true )
	@Column( length = 2147483647  )
	public String getValue() {
		return this.value;
		
	}
	

  
	 /**  
	 * Set the value related to the column: value.
	 * @param value the value value you wish to set
	 */
	public void setValue(final String value) {
		this.value = value;
	}


   /**
    * Deep copy.
	* @return cloned object
	* @throws CloneNotSupportedException on error
    */
    @Override
    public HqmfPopulationSet clone() throws CloneNotSupportedException {
		
        final HqmfPopulationSet copy = (HqmfPopulationSet)super.clone();

 		copy.setDateCreated(this.getDateCreated());
 		copy.setDateDisabled(this.getDateDisabled());
 		copy.setDateUpdated(this.getDateUpdated());
 		copy.setHqmfDocument(this.getHqmfDocument());
 		copy.setId(this.getId());
 		copy.setIndex(this.getIndex());
 		copy.setKey(this.getKey());
		if (this.getResults() != null) {
			copy.getResults().addAll(this.getResults());
		}
 		copy.setUserCreated(this.getUserCreated());
 		copy.setUserUpdated(this.getUserUpdated());
 		copy.setValue(this.getValue());
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
		sb.append("index: " + this.getIndex() + ", ");
		sb.append("key: " + this.getKey() + ", ");
		sb.append("userCreated: " + this.getUserCreated() + ", ");
		sb.append("userUpdated: " + this.getUserUpdated() + ", ");
		sb.append("value: " + this.getValue());
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
		
		final HqmfPopulationSet that; 
		try {
			that = (HqmfPopulationSet) proxyThat;
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
		result = result && (((getHqmfDocument() == null) && (that.getHqmfDocument() == null)) || (getHqmfDocument() != null && getHqmfDocument().getId().equals(that.getHqmfDocument().getId())));	
		result = result && (((getIndex() == null) && (that.getIndex() == null)) || (getIndex() != null && getIndex().equals(that.getIndex())));
		result = result && (((getKey() == null) && (that.getKey() == null)) || (getKey() != null && getKey().equals(that.getKey())));
		result = result && (((getUserCreated() == null) && (that.getUserCreated() == null)) || (getUserCreated() != null && getUserCreated().equals(that.getUserCreated())));
		result = result && (((getUserUpdated() == null) && (that.getUserUpdated() == null)) || (getUserUpdated() != null && getUserUpdated().equals(that.getUserUpdated())));
		result = result && (((getValue() == null) && (that.getValue() == null)) || (getValue() != null && getValue().equals(that.getValue())));
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
