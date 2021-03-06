package com.ainq.caliphr.persistence.model.obj.caliphrDb;

import com.ainq.caliphr.persistence.model.obj.caliphrDb.ValueSetCode;
import com.ainq.caliphr.persistence.model.obj.caliphrDb.iface.IValueSet;
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
 * Object mapping for hibernate-handled table: value_set.
 * 
 *
 * @author autogenerated
 */
		

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;


import javax.persistence.*;

@Entity
@Table(name = "value_set", catalog = "caliphr_db", schema = "caliphr")
@Cache(region = "com.ainq.caliphr.persistence.model.obj.caliphrDb.ValueSet", usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class ValueSet implements Cloneable, Serializable, IPojoGenEntity, IValueSet {

	/** Serial Version UID. */
	private static final long serialVersionUID = 3777650747369961525L;

	/** Use a WeakHashMap so entries will be garbage collected once all entities 
		referring to a saved hash are garbage collected themselves. */
	private static final Map<Serializable, Integer> SAVED_HASHES =
		Collections.synchronizedMap(new WeakHashMap<>());
	
	/** hashCode temporary storage. */
	private volatile Integer hashCode;
	

	/** Field mapping. */
	private Bundle bundle;
	/** Field mapping. */
	private Date dateCreated;
	/** Field mapping. */
	private Date dateDisabled;
	/** Field mapping. */
	private Date dateUpdated;
	/** Field mapping. */
	private String hl7Oid;
	/** Field mapping. */
	private Integer id;
	/** Field mapping. */
	private Integer userCreated;
	/** Field mapping. */
	private Integer userUpdated;
	/** Field mapping. */
	private Set<ValueSetCode> valueSetCodes = new HashSet<>();

	/** Field mapping. */
	private String valueSetName;
	/**
	 * Default constructor, mainly for hibernate use.
	 */
	public ValueSet() {
		// Default constructor
	} 

	/** Constructor taking a given ID.
	 * @param id to set
	 */
	public ValueSet(Integer id) {
		this.id = id;
	}
	
 


 
	/** Return the type of this class. Useful for when dealing with proxies.
	* @return Defining class.
	*/
	@Transient
	public Class<?> getClassType() {
		return ValueSet.class;
	}


	 /**
	 * Return the value associated with the column: bundle.
	 * @return A Bundle object (this.bundle)
	 */

	@JsonBackReference @ManyToOne( cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.LAZY )
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = true )
	@JoinColumn(name = "bundle_id", nullable = true )
	public Bundle getBundle() {
		return this.bundle;
		
	}
	

  
	 /**  
	 * Set the value related to the column: bundle.
	 * @param bundle the bundle value you wish to set
	 */
	public void setBundle(final Bundle bundle) {
		this.bundle = bundle;
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
	 * Return the value associated with the column: hl7Oid.
	 * @return A String object (this.hl7Oid)
	 */
	@Basic( optional = true )
	@Column( name = "hl7_oid", length = 250  )
	public String getHl7Oid() {
		return this.hl7Oid;
		
	}
	

  
	 /**  
	 * Set the value related to the column: hl7Oid.
	 * @param hl7Oid the hl7Oid value you wish to set
	 */
	public void setHl7Oid(final String hl7Oid) {
		this.hl7Oid = hl7Oid;
	}

	 /**
	 * Return the value associated with the column: id.
	 * @return A Integer object (this.id)
	 */
    @Id 
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "valueSetValue_set_idGenerator")
	@Basic( optional = false )
	@Column( name = "value_set_id", nullable = false  )
	@SequenceGenerator(allocationSize = 1, name = "valueSetValue_set_idGenerator", sequenceName = "caliphr_db.caliphr.value_set_id_seq", schema = "caliphr", catalog = "caliphr_db")
	public Integer getId() {
		return this.id;
		
	}
	

  
	 /**  
	 * Set the value related to the column: id.
	 * @param id the id value you wish to set
	 */
	public void setId(final Integer id) {
		// If we've just been persisted and hashCode has been
		// returned then make sure other entities with this
		// ID return the already returned hash code
		if ( (this.id == null || this.id == 0) &&
				(id != null) &&
				(this.hashCode != null) ) {
		SAVED_HASHES.put( id, this.hashCode );
		}
		this.id = id;
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
	 * Return the value associated with the column: valueSetCode.
	 * @return A Set&lt;ValueSetCode&gt; object (this.valueSetCode)
	 */
	@JsonManagedReference @OneToMany( fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE }, mappedBy = "valueSet"  )
 	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = false )
	@Column( name = "value_set_id", nullable = false  )
	public Set<ValueSetCode> getValueSetCodes() {
		return this.valueSetCodes;
		
	}
	
	/**
	 * Adds a bi-directional link of type ValueSetCode to the valueSetCodes set.
	 * @param valueSetCode item to add
	 */
	public void addValueSetCode(ValueSetCode valueSetCode) {
		valueSetCode.setValueSet(this);
		this.valueSetCodes.add(valueSetCode);
	}

  
	 /**  
	 * Set the value related to the column: valueSetCode.
	 * @param valueSetCode the valueSetCode value you wish to set
	 */
	public void setValueSetCodes(final Set<ValueSetCode> valueSetCode) {
		this.valueSetCodes = valueSetCode;
	}

	 /**
	 * Return the value associated with the column: valueSetName.
	 * @return A String object (this.valueSetName)
	 */
	@Basic( optional = true )
	@Column( name = "value_set_name", length = 2147483647  )
	public String getValueSetName() {
		return this.valueSetName;
		
	}
	

  
	 /**  
	 * Set the value related to the column: valueSetName.
	 * @param valueSetName the valueSetName value you wish to set
	 */
	public void setValueSetName(final String valueSetName) {
		this.valueSetName = valueSetName;
	}


   /**
    * Deep copy.
	* @return cloned object
	* @throws CloneNotSupportedException on error
    */
    @Override
    public ValueSet clone() throws CloneNotSupportedException {
		
        final ValueSet copy = (ValueSet)super.clone();

 		copy.setBundle(this.getBundle());
 		copy.setDateCreated(this.getDateCreated());
 		copy.setDateDisabled(this.getDateDisabled());
 		copy.setDateUpdated(this.getDateUpdated());
 		copy.setHl7Oid(this.getHl7Oid());
 		copy.setId(this.getId());
 		copy.setUserCreated(this.getUserCreated());
 		copy.setUserUpdated(this.getUserUpdated());
		if (this.getValueSetCodes() != null) {
			copy.getValueSetCodes().addAll(this.getValueSetCodes());
		}
 		copy.setValueSetName(this.getValueSetName());
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
		sb.append("hl7Oid: " + this.getHl7Oid() + ", ");
		sb.append("id: " + this.getId() + ", ");
		sb.append("userCreated: " + this.getUserCreated() + ", ");
		sb.append("userUpdated: " + this.getUserUpdated() + ", ");
		sb.append("valueSetName: " + this.getValueSetName());
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
		
		final ValueSet that; 
		try {
			that = (ValueSet) proxyThat;
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
		result = result && (((getBundle() == null) && (that.getBundle() == null)) || (getBundle() != null && getBundle().getId().equals(that.getBundle().getId())));	
		result = result && (((getDateCreated() == null) && (that.getDateCreated() == null)) || (getDateCreated() != null && getDateCreated().equals(that.getDateCreated())));
		result = result && (((getDateDisabled() == null) && (that.getDateDisabled() == null)) || (getDateDisabled() != null && getDateDisabled().equals(that.getDateDisabled())));
		result = result && (((getDateUpdated() == null) && (that.getDateUpdated() == null)) || (getDateUpdated() != null && getDateUpdated().equals(that.getDateUpdated())));
		result = result && (((getHl7Oid() == null) && (that.getHl7Oid() == null)) || (getHl7Oid() != null && getHl7Oid().equals(that.getHl7Oid())));
		result = result && (((getUserCreated() == null) && (that.getUserCreated() == null)) || (getUserCreated() != null && getUserCreated().equals(that.getUserCreated())));
		result = result && (((getUserUpdated() == null) && (that.getUserUpdated() == null)) || (getUserUpdated() != null && getUserUpdated().equals(that.getUserUpdated())));
		result = result && (((getValueSetName() == null) && (that.getValueSetName() == null)) || (getValueSetName() != null && getValueSetName().equals(that.getValueSetName())));
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
					Integer newHashCode = null;

					if ( getId() != null ) {
					newHashCode = SAVED_HASHES.get( getId() );
					}
					
					if ( newHashCode == null ) {
						if ( getId() != null && getId() != 0) {
							newHashCode = getId();
						} else {
							newHashCode = super.hashCode();

						}
					}
					
					this.hashCode = newHashCode;
				}
			}
		}
	return this.hashCode;
	}
	

	
	@PreUpdate
	public void preUpdate() {
		this.dateUpdated = new Date();
	}
}
