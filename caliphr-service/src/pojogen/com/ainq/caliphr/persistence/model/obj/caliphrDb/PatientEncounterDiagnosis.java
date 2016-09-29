package com.ainq.caliphr.persistence.model.obj.caliphrDb;

import com.ainq.caliphr.persistence.model.obj.caliphrDb.iface.IPatientEncounterDiagnosis;
import com.ainq.caliphr.persistence.util.IPojoGenEntity;
import java.io.Serializable;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;
import org.hibernate.annotations.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.Parameter;
import org.hibernate.proxy.HibernateProxy;

/**
 * Object mapping for hibernate-handled table: patient_encounter_diagnosis.
 * 
 *
 * @author autogenerated
 */
		

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;


import javax.persistence.*;

@Entity
@Table(name = "patient_encounter_diagnosis", catalog = "caliphr_db", schema = "caliphr")
@Cache(region = "com.ainq.caliphr.persistence.model.obj.caliphrDb.PatientEncounterDiagnosis", usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class PatientEncounterDiagnosis implements Cloneable, Serializable, IPojoGenEntity, IPatientEncounterDiagnosis {

	/** Serial Version UID. */
	private static final long serialVersionUID = 7021951984494096238L;

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
	private Date effectiveTimeEnd;
	/** Field mapping. */
	private Date effectiveTimeStart;
	/** Field mapping. */
	private PatientEncounter encounter;
	/** Field mapping. */
	private String externalId;
	/** Field mapping. */
	private Long id;
	/** Field mapping. */
	private Code problemCode;
	/** Field mapping. */
	private String problemCodeDescription;
	/** Field mapping. */
	private StatusCode statusCode;
	/** Field mapping. */
	private String statusCodeName;
	/** Field mapping. */
	private TemplateRoot template;
	/** Field mapping. */
	private Integer userCreated;
	/** Field mapping. */
	private Integer userUpdated;
	/**
	 * Default constructor, mainly for hibernate use.
	 */
	public PatientEncounterDiagnosis() {
		// Default constructor
	} 

	/** Constructor taking a given ID.
	 * @param id to set
	 */
	public PatientEncounterDiagnosis(Long id) {
		this.id = id;
	}
	
 


 
	/** Return the type of this class. Useful for when dealing with proxies.
	* @return Defining class.
	*/
	@Transient
	public Class<?> getClassType() {
		return PatientEncounterDiagnosis.class;
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
	 * Return the value associated with the column: effectiveTimeEnd.
	 * @return A Date object (this.effectiveTimeEnd)
	 */
	@Basic( optional = true )
	@Column( name = "effective_time_end"  )
	public Date getEffectiveTimeEnd() {
		return this.effectiveTimeEnd;
		
	}
	

  
	 /**  
	 * Set the value related to the column: effectiveTimeEnd.
	 * @param effectiveTimeEnd the effectiveTimeEnd value you wish to set
	 */
	public void setEffectiveTimeEnd(final Date effectiveTimeEnd) {
		this.effectiveTimeEnd = effectiveTimeEnd;
	}

	 /**
	 * Return the value associated with the column: effectiveTimeStart.
	 * @return A Date object (this.effectiveTimeStart)
	 */
	@Basic( optional = true )
	@Column( name = "effective_time_start"  )
	public Date getEffectiveTimeStart() {
		return this.effectiveTimeStart;
		
	}
	

  
	 /**  
	 * Set the value related to the column: effectiveTimeStart.
	 * @param effectiveTimeStart the effectiveTimeStart value you wish to set
	 */
	public void setEffectiveTimeStart(final Date effectiveTimeStart) {
		this.effectiveTimeStart = effectiveTimeStart;
	}

	 /**
	 * Return the value associated with the column: encounter.
	 * @return A PatientEncounter object (this.encounter)
	 */

	@JsonBackReference @ManyToOne( cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.LAZY )
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = true )
	@JoinColumn(name = "encounter_id", nullable = true )
	public PatientEncounter getEncounter() {
		return this.encounter;
		
	}
	

  
	 /**  
	 * Set the value related to the column: encounter.
	 * @param encounter the encounter value you wish to set
	 */
	public void setEncounter(final PatientEncounter encounter) {
		this.encounter = encounter;
	}

	 /**
	 * Return the value associated with the column: externalId.
	 * @return A String object (this.externalId)
	 */
	@Basic( optional = true )
	@Column( name = "external_id", length = 2147483647  )
	public String getExternalId() {
		return this.externalId;
		
	}
	

  
	 /**  
	 * Set the value related to the column: externalId.
	 * @param externalId the externalId value you wish to set
	 */
	public void setExternalId(final String externalId) {
		this.externalId = externalId;
	}

	 /**
	 * Return the value associated with the column: id.
	 * @return A Long object (this.id)
	 */
    @Id 
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "patientEncounterDiagnosisRecord_idGenerator")
	@Basic( optional = false )
	@Column( name = "record_id", nullable = false  )
	@SequenceGenerator(allocationSize = 50, name = "patientEncounterDiagnosisRecord_idGenerator", sequenceName = "caliphr_db.caliphr.patient_encounter_diagnosis_id_seq", schema = "caliphr", catalog = "caliphr_db")
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
	 * Return the value associated with the column: problemCode.
	 * @return A Code object (this.problemCode)
	 */

	@JsonBackReference @ManyToOne( cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.LAZY )
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = true )
	@JoinColumn(name = "problem_code_id", nullable = true )
	public Code getProblemCode() {
		return this.problemCode;
		
	}
	

  
	 /**  
	 * Set the value related to the column: problemCode.
	 * @param problemCode the problemCode value you wish to set
	 */
	public void setProblemCode(final Code problemCode) {
		this.problemCode = problemCode;
	}

	 /**
	 * Return the value associated with the column: problemCodeDescription.
	 * @return A String object (this.problemCodeDescription)
	 */
	@Basic( optional = true )
	@Column( name = "problem_code_description", length = 2147483647  )
	public String getProblemCodeDescription() {
		return this.problemCodeDescription;
		
	}
	

  
	 /**  
	 * Set the value related to the column: problemCodeDescription.
	 * @param problemCodeDescription the problemCodeDescription value you wish to set
	 */
	public void setProblemCodeDescription(final String problemCodeDescription) {
		this.problemCodeDescription = problemCodeDescription;
	}

	 /**
	 * Return the value associated with the column: statusCode.
	 * @return A StatusCode object (this.statusCode)
	 */

	@JsonBackReference @ManyToOne( cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.LAZY )
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = true )
	@JoinColumn(name = "status_code_id", nullable = true )
	public StatusCode getStatusCode() {
		return this.statusCode;
		
	}
	

  
	 /**  
	 * Set the value related to the column: statusCode.
	 * @param statusCode the statusCode value you wish to set
	 */
	public void setStatusCode(final StatusCode statusCode) {
		this.statusCode = statusCode;
	}

	 /**
	 * Return the value associated with the column: statusCodeName.
	 * @return A String object (this.statusCodeName)
	 */
	@Basic( optional = true )
	@Column( name = "status_code_name", length = 2147483647  )
	public String getStatusCodeName() {
		return this.statusCodeName;
		
	}
	

  
	 /**  
	 * Set the value related to the column: statusCodeName.
	 * @param statusCodeName the statusCodeName value you wish to set
	 */
	public void setStatusCodeName(final String statusCodeName) {
		this.statusCodeName = statusCodeName;
	}

	 /**
	 * Return the value associated with the column: template.
	 * @return A TemplateRoot object (this.template)
	 */

	@JsonBackReference @ManyToOne( cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.LAZY )
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = true )
	@JoinColumn(name = "template_id", nullable = true )
	public TemplateRoot getTemplate() {
		return this.template;
		
	}
	

  
	 /**  
	 * Set the value related to the column: template.
	 * @param template the template value you wish to set
	 */
	public void setTemplate(final TemplateRoot template) {
		this.template = template;
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
    public PatientEncounterDiagnosis clone() throws CloneNotSupportedException {
		
        final PatientEncounterDiagnosis copy = (PatientEncounterDiagnosis)super.clone();

 		copy.setDateCreated(this.getDateCreated());
 		copy.setDateDisabled(this.getDateDisabled());
 		copy.setDateUpdated(this.getDateUpdated());
 		copy.setEffectiveTimeEnd(this.getEffectiveTimeEnd());
 		copy.setEffectiveTimeStart(this.getEffectiveTimeStart());
 		copy.setEncounter(this.getEncounter());
 		copy.setExternalId(this.getExternalId());
 		copy.setId(this.getId());
 		copy.setProblemCode(this.getProblemCode());
 		copy.setProblemCodeDescription(this.getProblemCodeDescription());
 		copy.setStatusCode(this.getStatusCode());
 		copy.setStatusCodeName(this.getStatusCodeName());
 		copy.setTemplate(this.getTemplate());
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
		sb.append("effectiveTimeEnd: " + this.getEffectiveTimeEnd() + ", ");
		sb.append("effectiveTimeStart: " + this.getEffectiveTimeStart() + ", ");
		sb.append("externalId: " + this.getExternalId() + ", ");
		sb.append("id: " + this.getId() + ", ");
		sb.append("problemCodeDescription: " + this.getProblemCodeDescription() + ", ");
		sb.append("statusCodeName: " + this.getStatusCodeName() + ", ");
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
		
		final PatientEncounterDiagnosis that; 
		try {
			that = (PatientEncounterDiagnosis) proxyThat;
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
		result = result && (((getEffectiveTimeEnd() == null) && (that.getEffectiveTimeEnd() == null)) || (getEffectiveTimeEnd() != null && getEffectiveTimeEnd().equals(that.getEffectiveTimeEnd())));
		result = result && (((getEffectiveTimeStart() == null) && (that.getEffectiveTimeStart() == null)) || (getEffectiveTimeStart() != null && getEffectiveTimeStart().equals(that.getEffectiveTimeStart())));
		result = result && (((getEncounter() == null) && (that.getEncounter() == null)) || (getEncounter() != null && getEncounter().getId().equals(that.getEncounter().getId())));	
		result = result && (((getExternalId() == null) && (that.getExternalId() == null)) || (getExternalId() != null && getExternalId().equals(that.getExternalId())));
		result = result && (((getProblemCode() == null) && (that.getProblemCode() == null)) || (getProblemCode() != null && getProblemCode().getId().equals(that.getProblemCode().getId())));	
		result = result && (((getProblemCodeDescription() == null) && (that.getProblemCodeDescription() == null)) || (getProblemCodeDescription() != null && getProblemCodeDescription().equals(that.getProblemCodeDescription())));
		result = result && (((getStatusCode() == null) && (that.getStatusCode() == null)) || (getStatusCode() != null && getStatusCode().getId().equals(that.getStatusCode().getId())));	
		result = result && (((getStatusCodeName() == null) && (that.getStatusCodeName() == null)) || (getStatusCodeName() != null && getStatusCodeName().equals(that.getStatusCodeName())));
		result = result && (((getTemplate() == null) && (that.getTemplate() == null)) || (getTemplate() != null && getTemplate().getId().equals(that.getTemplate().getId())));	
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
