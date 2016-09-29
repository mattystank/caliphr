package com.ainq.caliphr.persistence.model.obj.caliphrDb;

import com.ainq.caliphr.persistence.enums.subtype.caliphrDb.PatientInfoSubclassType;
import com.ainq.caliphr.persistence.model.obj.caliphrDb.PatientInfo;
import com.ainq.caliphr.persistence.model.obj.caliphrDb.iface.IPatientInfoSecure;
import java.util.Arrays;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;
import org.hibernate.annotations.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.Parameter;
import org.hibernate.proxy.HibernateProxy;

/**
 * Object mapping for hibernate-handled table: patient_info_secure.
 * 
 *
 * @author autogenerated
 */
		

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;


import javax.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name = "patient_id")
@Table(name = "patient_info_secure", catalog = "caliphr_db", schema = "caliphr")
@Cache(region = "com.ainq.caliphr.persistence.model.obj.caliphrDb.PatientInfoSecure", usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class PatientInfoSecure extends PatientInfo implements IPatientInfoSecure {

	/** Serial Version UID. */
	private static final long serialVersionUID = -5901847575806265678L;

	

	/** Field mapping. */
	private Byte[] address;
	/** Field mapping. */
	private Byte[] address2;
	/** Field mapping. */
	private Byte[] birthTime;
	/** Field mapping. */
	private Byte[] city;
	/** Field mapping. */
	private Byte[] country;
	/** Field mapping. */
	private Date dateCreated;
	/** Field mapping. */
	private Date dateDisabled;
	/** Field mapping. */
	private Date dateUpdated;
	/** Field mapping. */
	private Byte[] deathDate;
	/** Field mapping. */
	private Byte[] firstName;
	/** Field mapping. */
	private Byte[] lastName;
	/** Field mapping. */
	private Byte[] medicalRecordNumber;
	/** Field mapping. */
	private Byte[] mrnHash;
	/** Field mapping. */
	private Byte[] ssn;
	/** Field mapping. */
	private Byte[] stateId;
	/** Field mapping. */
	private Byte[] stateValue;
	/** Field mapping. */
	private Integer userCreated;
	/** Field mapping. */
	private Integer userUpdated;
	/** Field mapping. */
	private Byte[] zipcode;
 

	/**
 	 * Return an enum of the type of this subclass. This is useful to be able to use switch/case in your code.
 	 *
 	 * @return PatientInfoSubclassType enum.
 	 */
 	@Transient
 	@Override
 	public PatientInfoSubclassType getPatientInfoSubclassType() {
		return PatientInfoSubclassType.PATIENT_INFO_SECURE;
 	}  

 
	/** Return the type of this class. Useful for when dealing with proxies.
	* @return Defining class.
	*/
	@Override
	@Transient
	public Class<?> getClassType() {
		return PatientInfoSecure.class;
	}


	 /**
	 * Return the value associated with the column: address.
	 * @return A Byte[] object (this.address)
	 */
	public Byte[] getAddress() {
		return this.address;
		
	}
	

  
	 /**  
	 * Set the value related to the column: address.
	 * @param address the address value you wish to set
	 */
	public void setAddress(final Byte[] address) {
		this.address = address;
	}

	 /**
	 * Return the value associated with the column: address2.
	 * @return A Byte[] object (this.address2)
	 */
	public Byte[] getAddress2() {
		return this.address2;
		
	}
	

  
	 /**  
	 * Set the value related to the column: address2.
	 * @param address2 the address2 value you wish to set
	 */
	public void setAddress2(final Byte[] address2) {
		this.address2 = address2;
	}

	 /**
	 * Return the value associated with the column: birthTime.
	 * @return A Byte[] object (this.birthTime)
	 */
	@Basic( optional = true )
	@Column( name = "birth_time"  )
	public Byte[] getBirthTime() {
		return this.birthTime;
		
	}
	

  
	 /**  
	 * Set the value related to the column: birthTime.
	 * @param birthTime the birthTime value you wish to set
	 */
	public void setBirthTime(final Byte[] birthTime) {
		this.birthTime = birthTime;
	}

	 /**
	 * Return the value associated with the column: city.
	 * @return A Byte[] object (this.city)
	 */
	public Byte[] getCity() {
		return this.city;
		
	}
	

  
	 /**  
	 * Set the value related to the column: city.
	 * @param city the city value you wish to set
	 */
	public void setCity(final Byte[] city) {
		this.city = city;
	}

	 /**
	 * Return the value associated with the column: country.
	 * @return A Byte[] object (this.country)
	 */
	public Byte[] getCountry() {
		return this.country;
		
	}
	

  
	 /**  
	 * Set the value related to the column: country.
	 * @param country the country value you wish to set
	 */
	public void setCountry(final Byte[] country) {
		this.country = country;
	}

	 /**
	 * Return the value associated with the column: dateCreated.
	 * @return A Date object (this.dateCreated)
	 */
	@Basic( optional = true )
	@Column( name = "date_created"  )
	@Override
	public Date getDateCreated() {
		return this.dateCreated;
		
	}
	

  
	 /**  
	 * Set the value related to the column: dateCreated.
	 * @param dateCreated the dateCreated value you wish to set
	 */
	@Override
	public void setDateCreated(final Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	 /**
	 * Return the value associated with the column: dateDisabled.
	 * @return A Date object (this.dateDisabled)
	 */
	@Basic( optional = true )
	@Column( name = "date_disabled"  )
	@Override
	public Date getDateDisabled() {
		return this.dateDisabled;
		
	}
	

  
	 /**  
	 * Set the value related to the column: dateDisabled.
	 * @param dateDisabled the dateDisabled value you wish to set
	 */
	@Override
	public void setDateDisabled(final Date dateDisabled) {
		this.dateDisabled = dateDisabled;
	}

	 /**
	 * Return the value associated with the column: dateUpdated.
	 * @return A Date object (this.dateUpdated)
	 */
	@Basic( optional = true )
	@Column( name = "date_updated"  )
	@Override
	public Date getDateUpdated() {
		return this.dateUpdated;
		
	}
	

  
	 /**  
	 * Set the value related to the column: dateUpdated.
	 * @param dateUpdated the dateUpdated value you wish to set
	 */
	@Override
	public void setDateUpdated(final Date dateUpdated) {
		this.dateUpdated = dateUpdated;
	}

	 /**
	 * Return the value associated with the column: deathDate.
	 * @return A Byte[] object (this.deathDate)
	 */
	@Basic( optional = true )
	@Column( name = "death_date"  )
	public Byte[] getDeathDate() {
		return this.deathDate;
		
	}
	

  
	 /**  
	 * Set the value related to the column: deathDate.
	 * @param deathDate the deathDate value you wish to set
	 */
	public void setDeathDate(final Byte[] deathDate) {
		this.deathDate = deathDate;
	}

	 /**
	 * Return the value associated with the column: firstName.
	 * @return A Byte[] object (this.firstName)
	 */
	@Basic( optional = true )
	@Column( name = "first_name"  )
	public Byte[] getFirstName() {
		return this.firstName;
		
	}
	

  
	 /**  
	 * Set the value related to the column: firstName.
	 * @param firstName the firstName value you wish to set
	 */
	public void setFirstName(final Byte[] firstName) {
		this.firstName = firstName;
	}

	 /**
	 * Return the value associated with the column: lastName.
	 * @return A Byte[] object (this.lastName)
	 */
	@Basic( optional = true )
	@Column( name = "last_name"  )
	public Byte[] getLastName() {
		return this.lastName;
		
	}
	

  
	 /**  
	 * Set the value related to the column: lastName.
	 * @param lastName the lastName value you wish to set
	 */
	public void setLastName(final Byte[] lastName) {
		this.lastName = lastName;
	}

	 /**
	 * Return the value associated with the column: medicalRecordNumber.
	 * @return A Byte[] object (this.medicalRecordNumber)
	 */
	@Basic( optional = true )
	@Column( name = "medical_record_number"  )
	public Byte[] getMedicalRecordNumber() {
		return this.medicalRecordNumber;
		
	}
	

  
	 /**  
	 * Set the value related to the column: medicalRecordNumber.
	 * @param medicalRecordNumber the medicalRecordNumber value you wish to set
	 */
	public void setMedicalRecordNumber(final Byte[] medicalRecordNumber) {
		this.medicalRecordNumber = medicalRecordNumber;
	}

	 /**
	 * Return the value associated with the column: mrnHash.
	 * @return A Byte[] object (this.mrnHash)
	 */
	@Basic( optional = true )
	@Column( name = "mrn_hash"  )
	public Byte[] getMrnHash() {
		return this.mrnHash;
		
	}
	

  
	 /**  
	 * Set the value related to the column: mrnHash.
	 * @param mrnHash the mrnHash value you wish to set
	 */
	public void setMrnHash(final Byte[] mrnHash) {
		this.mrnHash = mrnHash;
	}

	 /**
	 * Return the value associated with the column: ssn.
	 * @return A Byte[] object (this.ssn)
	 */
	public Byte[] getSsn() {
		return this.ssn;
		
	}
	

  
	 /**  
	 * Set the value related to the column: ssn.
	 * @param ssn the ssn value you wish to set
	 */
	public void setSsn(final Byte[] ssn) {
		this.ssn = ssn;
	}

	 /**
	 * Return the value associated with the column: stateId.
	 * @return A Byte[] object (this.stateId)
	 */
	@Basic( optional = true )
	@Column( name = "state_id"  )
	public Byte[] getStateId() {
		return this.stateId;
		
	}
	

  
	 /**  
	 * Set the value related to the column: stateId.
	 * @param stateId the stateId value you wish to set
	 */
	public void setStateId(final Byte[] stateId) {
		this.stateId = stateId;
	}

	 /**
	 * Return the value associated with the column: stateValue.
	 * @return A Byte[] object (this.stateValue)
	 */
	@Basic( optional = true )
	@Column( name = "state_value"  )
	public Byte[] getStateValue() {
		return this.stateValue;
		
	}
	

  
	 /**  
	 * Set the value related to the column: stateValue.
	 * @param stateValue the stateValue value you wish to set
	 */
	public void setStateValue(final Byte[] stateValue) {
		this.stateValue = stateValue;
	}

	 /**
	 * Return the value associated with the column: userCreated.
	 * @return A Integer object (this.userCreated)
	 */
	@Basic( optional = true )
	@Column( name = "user_created"  )
	@Override
	public Integer getUserCreated() {
		return this.userCreated;
		
	}
	

  
	 /**  
	 * Set the value related to the column: userCreated.
	 * @param userCreated the userCreated value you wish to set
	 */
	@Override
	public void setUserCreated(final Integer userCreated) {
		this.userCreated = userCreated;
	}

	 /**
	 * Return the value associated with the column: userUpdated.
	 * @return A Integer object (this.userUpdated)
	 */
	@Basic( optional = true )
	@Column( name = "user_updated"  )
	@Override
	public Integer getUserUpdated() {
		return this.userUpdated;
		
	}
	

  
	 /**  
	 * Set the value related to the column: userUpdated.
	 * @param userUpdated the userUpdated value you wish to set
	 */
	@Override
	public void setUserUpdated(final Integer userUpdated) {
		this.userUpdated = userUpdated;
	}

	 /**
	 * Return the value associated with the column: zipcode.
	 * @return A Byte[] object (this.zipcode)
	 */
	public Byte[] getZipcode() {
		return this.zipcode;
		
	}
	

  
	 /**  
	 * Set the value related to the column: zipcode.
	 * @param zipcode the zipcode value you wish to set
	 */
	public void setZipcode(final Byte[] zipcode) {
		this.zipcode = zipcode;
	}


   /**
    * Deep copy.
	* @return cloned object
	* @throws CloneNotSupportedException on error
    */
    @Override
    public PatientInfoSecure clone() throws CloneNotSupportedException {
		
        final PatientInfoSecure copy = (PatientInfoSecure)super.clone();

 		copy.setAddress(this.getAddress());
 		copy.setAddress2(this.getAddress2());
 		copy.setBirthTime(this.getBirthTime());
 		copy.setCity(this.getCity());
 		copy.setCountry(this.getCountry());
 		copy.setDateCreated(this.getDateCreated());
 		copy.setDateDisabled(this.getDateDisabled());
 		copy.setDateUpdated(this.getDateUpdated());
 		copy.setDeathDate(this.getDeathDate());
 		copy.setFirstName(this.getFirstName());
 		copy.setLastName(this.getLastName());
 		copy.setMedicalRecordNumber(this.getMedicalRecordNumber());
 		copy.setMrnHash(this.getMrnHash());
 		copy.setSsn(this.getSsn());
 		copy.setStateId(this.getStateId());
 		copy.setStateValue(this.getStateValue());
 		copy.setUserCreated(this.getUserCreated());
 		copy.setUserUpdated(this.getUserUpdated());
 		copy.setZipcode(this.getZipcode());
		return copy;
	}
	


	/** Provides toString implementation.
	 * @see java.lang.Object#toString()
	 * @return String representation of this class.
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("address: " + (this.address == null ? null : Arrays.toString(this.getAddress())) + ", ");
		sb.append("address2: " + (this.address2 == null ? null : Arrays.toString(this.getAddress2())) + ", ");
		sb.append("birthTime: " + (this.birthTime == null ? null : Arrays.toString(this.getBirthTime())) + ", ");
		sb.append("city: " + (this.city == null ? null : Arrays.toString(this.getCity())) + ", ");
		sb.append("country: " + (this.country == null ? null : Arrays.toString(this.getCountry())) + ", ");
		sb.append("dateCreated: " + this.getDateCreated() + ", ");
		sb.append("dateDisabled: " + this.getDateDisabled() + ", ");
		sb.append("dateUpdated: " + this.getDateUpdated() + ", ");
		sb.append("deathDate: " + (this.deathDate == null ? null : Arrays.toString(this.getDeathDate())) + ", ");
		sb.append("firstName: " + (this.firstName == null ? null : Arrays.toString(this.getFirstName())) + ", ");
		sb.append("lastName: " + (this.lastName == null ? null : Arrays.toString(this.getLastName())) + ", ");
		sb.append("medicalRecordNumber: " + (this.medicalRecordNumber == null ? null : Arrays.toString(this.getMedicalRecordNumber())) + ", ");
		sb.append("mrnHash: " + (this.mrnHash == null ? null : Arrays.toString(this.getMrnHash())) + ", ");
		sb.append("ssn: " + (this.ssn == null ? null : Arrays.toString(this.getSsn())) + ", ");
		sb.append("stateId: " + (this.stateId == null ? null : Arrays.toString(this.getStateId())) + ", ");
		sb.append("stateValue: " + (this.stateValue == null ? null : Arrays.toString(this.getStateValue())) + ", ");
		sb.append("userCreated: " + this.getUserCreated() + ", ");
		sb.append("userUpdated: " + this.getUserUpdated() + ", ");
		sb.append("zipcode: " + (this.zipcode == null ? null : Arrays.toString(this.getZipcode())));
		if (this.getClass().getSuperclass() != this.getClass()) {
			sb.append("(super.toString=" + super.toString() + ")");
		}
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
		
		final PatientInfoSecure that; 
		try {
			that = (PatientInfoSecure) proxyThat;
			if ( !(that.getClassType().equals(this.getClassType()))){
				return false;
			}
		} catch (org.hibernate.ObjectNotFoundException e) {
				return false;
		} catch (ClassCastException e) {
				return false;
		}
		
		
		boolean result = true;
		if (this.getClass().getSuperclass() != this.getClass()) {
			result = super.equals(that);
		}
		result = result && (((this.getId() == null) && ( that.getId() == null)) || (this.getId() != null  && this.getId().equals(that.getId())));
		result = result && (((getAddress() == null) && (that.getAddress() == null)) || (getAddress() != null && getAddress().equals(that.getAddress())));
		result = result && (((getAddress2() == null) && (that.getAddress2() == null)) || (getAddress2() != null && getAddress2().equals(that.getAddress2())));
		result = result && (((getBirthTime() == null) && (that.getBirthTime() == null)) || (getBirthTime() != null && getBirthTime().equals(that.getBirthTime())));
		result = result && (((getCity() == null) && (that.getCity() == null)) || (getCity() != null && getCity().equals(that.getCity())));
		result = result && (((getCountry() == null) && (that.getCountry() == null)) || (getCountry() != null && getCountry().equals(that.getCountry())));
		result = result && (((getDateCreated() == null) && (that.getDateCreated() == null)) || (getDateCreated() != null && getDateCreated().equals(that.getDateCreated())));
		result = result && (((getDateDisabled() == null) && (that.getDateDisabled() == null)) || (getDateDisabled() != null && getDateDisabled().equals(that.getDateDisabled())));
		result = result && (((getDateUpdated() == null) && (that.getDateUpdated() == null)) || (getDateUpdated() != null && getDateUpdated().equals(that.getDateUpdated())));
		result = result && (((getDeathDate() == null) && (that.getDeathDate() == null)) || (getDeathDate() != null && getDeathDate().equals(that.getDeathDate())));
		result = result && (((getFirstName() == null) && (that.getFirstName() == null)) || (getFirstName() != null && getFirstName().equals(that.getFirstName())));
		result = result && (((getLastName() == null) && (that.getLastName() == null)) || (getLastName() != null && getLastName().equals(that.getLastName())));
		result = result && (((getMedicalRecordNumber() == null) && (that.getMedicalRecordNumber() == null)) || (getMedicalRecordNumber() != null && getMedicalRecordNumber().equals(that.getMedicalRecordNumber())));
		result = result && (((getMrnHash() == null) && (that.getMrnHash() == null)) || (getMrnHash() != null && getMrnHash().equals(that.getMrnHash())));
		result = result && (((getSsn() == null) && (that.getSsn() == null)) || (getSsn() != null && getSsn().equals(that.getSsn())));
		result = result && (((getStateId() == null) && (that.getStateId() == null)) || (getStateId() != null && getStateId().equals(that.getStateId())));
		result = result && (((getStateValue() == null) && (that.getStateValue() == null)) || (getStateValue() != null && getStateValue().equals(that.getStateValue())));
		result = result && (((getUserCreated() == null) && (that.getUserCreated() == null)) || (getUserCreated() != null && getUserCreated().equals(that.getUserCreated())));
		result = result && (((getUserUpdated() == null) && (that.getUserUpdated() == null)) || (getUserUpdated() != null && getUserUpdated().equals(that.getUserUpdated())));
		result = result && (((getZipcode() == null) && (that.getZipcode() == null)) || (getZipcode() != null && getZipcode().equals(that.getZipcode())));
		return result;
	}
	
	

	
	@PreUpdate
	public void preUpdate() {
		this.dateUpdated = new Date();
	}
}
