package com.ainq.caliphr.persistence.model.obj.caliphrDb;

import com.ainq.caliphr.persistence.model.obj.caliphrDb.PracticeGroup;
import com.ainq.caliphr.persistence.model.obj.caliphrDb.iface.IPracticeGroupType;
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
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;
import org.hibernate.annotations.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.Parameter;
import org.hibernate.proxy.HibernateProxy;

/**
 * Object mapping for hibernate-handled table: practice_group_type.
 * 
 *
 * @author autogenerated
 */
		

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;


import javax.persistence.*;

@Entity
@Table(name = "practice_group_type", catalog = "caliphr_db", schema = "caliphr")
@Cache(region = "com.ainq.caliphr.persistence.model.obj.caliphrDb.PracticeGroupType", usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class PracticeGroupType implements Cloneable, Serializable, IPojoGenEntity, IPracticeGroupType {

	/** Serial Version UID. */
	private static final long serialVersionUID = -4318803960200833675L;

	/** Use a WeakHashMap so entries will be garbage collected once all entities 
		referring to a saved hash are garbage collected themselves. */
	private static final Map<Serializable, Integer> SAVED_HASHES =
		Collections.synchronizedMap(new WeakHashMap<>());
	
	/** hashCode temporary storage. */
	private volatile Integer hashCode;
	

	/** Field mapping. */
	private Date dateCreated;
	/** Field mapping. */
	private Date dateDisabled;
	/** Field mapping. */
	private Date dateUpdated;
	/** Field mapping. */
	private String description;
	/** Field mapping. */
	private Integer id;
	/** Field mapping. */
	private String name;
	/** Field mapping. */
	private Set<PracticeGroup> practiceGroups = new HashSet<>();

	/** Field mapping. */
	private Integer userCreated;
	/** Field mapping. */
	private Integer userUpdated;
	/**
	 * Default constructor, mainly for hibernate use.
	 */
	public PracticeGroupType() {
		// Default constructor
	} 

	/** Constructor taking a given ID.
	 * @param id to set
	 */
	public PracticeGroupType(Integer id) {
		this.id = id;
	}
	
 


 
	/** Return the type of this class. Useful for when dealing with proxies.
	* @return Defining class.
	*/
	@Transient
	public Class<?> getClassType() {
		return PracticeGroupType.class;
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
	 * Return the value associated with the column: description.
	 * @return A String object (this.description)
	 */
	@Basic( optional = true )
	@Column( length = 2147483647  )
	public String getDescription() {
		return this.description;
		
	}
	

  
	 /**  
	 * Set the value related to the column: description.
	 * @param description the description value you wish to set
	 */
	public void setDescription(final String description) {
		this.description = description;
	}

	 /**
	 * Return the value associated with the column: id.
	 * @return A Integer object (this.id)
	 */
    @Id 
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "practiceGroupTypeType_idGenerator")
	@Basic( optional = false )
	@Column( name = "type_id", nullable = false  )
	@SequenceGenerator(allocationSize = 1, name = "practiceGroupTypeType_idGenerator", sequenceName = "caliphr_db.caliphr.practice_group_type_id_seq", schema = "caliphr", catalog = "caliphr_db")
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
	 * Return the value associated with the column: name.
	 * @return A String object (this.name)
	 */
	@Basic( optional = true )
	@Column( length = 2147483647  )
	public String getName() {
		return this.name;
		
	}
	

  
	 /**  
	 * Set the value related to the column: name.
	 * @param name the name value you wish to set
	 */
	public void setName(final String name) {
		this.name = name;
	}

	 /**
	 * Return the value associated with the column: practiceGroup.
	 * @return A Set&lt;PracticeGroup&gt; object (this.practiceGroup)
	 */
	@JsonManagedReference @OneToMany( fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE }, mappedBy = "type"  )
 	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = false )
	@Column( name = "type_id", nullable = false  )
	public Set<PracticeGroup> getPracticeGroups() {
		return this.practiceGroups;
		
	}
	
	/**
	 * Adds a bi-directional link of type PracticeGroup to the practiceGroups set.
	 * @param practiceGroup item to add
	 */
	public void addPracticeGroup(PracticeGroup practiceGroup) {
		practiceGroup.setType(this);
		this.practiceGroups.add(practiceGroup);
	}

  
	 /**  
	 * Set the value related to the column: practiceGroup.
	 * @param practiceGroup the practiceGroup value you wish to set
	 */
	public void setPracticeGroups(final Set<PracticeGroup> practiceGroup) {
		this.practiceGroups = practiceGroup;
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
    public PracticeGroupType clone() throws CloneNotSupportedException {
		
        final PracticeGroupType copy = (PracticeGroupType)super.clone();

 		copy.setDateCreated(this.getDateCreated());
 		copy.setDateDisabled(this.getDateDisabled());
 		copy.setDateUpdated(this.getDateUpdated());
 		copy.setDescription(this.getDescription());
 		copy.setId(this.getId());
 		copy.setName(this.getName());
		if (this.getPracticeGroups() != null) {
			copy.getPracticeGroups().addAll(this.getPracticeGroups());
		}
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
		sb.append("description: " + this.getDescription() + ", ");
		sb.append("id: " + this.getId() + ", ");
		sb.append("name: " + this.getName() + ", ");
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
		
		final PracticeGroupType that; 
		try {
			that = (PracticeGroupType) proxyThat;
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
		result = result && (((getDescription() == null) && (that.getDescription() == null)) || (getDescription() != null && getDescription().equals(that.getDescription())));
		result = result && (((getName() == null) && (that.getName() == null)) || (getName() != null && getName().equals(that.getName())));
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