package com.ainq.caliphr.persistence.model.obj.caliphrDb.iface;
import com.ainq.caliphr.persistence.model.obj.caliphrDb.CodeMapping;
import com.ainq.caliphr.persistence.model.obj.caliphrDb.EhrVendor;
import com.ainq.caliphr.persistence.model.obj.caliphrDb.Organization;
import com.ainq.caliphr.persistence.model.obj.caliphrDb.PatientInfo;
import com.ainq.caliphr.persistence.model.obj.caliphrDb.PracticeAvailableMeasure;
import com.ainq.caliphr.persistence.model.obj.caliphrDb.PracticeGroupType;
import com.ainq.caliphr.persistence.model.obj.caliphrDb.Provider;
import com.ainq.caliphr.persistence.util.IPojoGenEntity;
import java.util.Date;
import java.util.Set;
import org.hibernate.annotations.*;
import org.hibernate.annotations.Cache;


/** 
 * Object interface mapping for hibernate-handled table: practice_group.
 * @author autogenerated
 */

public interface IPracticeGroup {



    /**
     * Return the value associated with the column: activeProblemsOnlyFlag.
	 * @return A Boolean object (this.activeProblemsOnlyFlag)
	 */
	Boolean isActiveProblemsOnlyFlag();
	

  
    /**  
     * Set the value related to the column: activeProblemsOnlyFlag.
	 * @param activeProblemsOnlyFlag the activeProblemsOnlyFlag value you wish to set
	 */
	void setActiveProblemsOnlyFlag(final Boolean activeProblemsOnlyFlag);

    /**
     * Return the value associated with the column: address2.
	 * @return A String object (this.address2)
	 */
	String getAddress2();
	

  
    /**  
     * Set the value related to the column: address2.
	 * @param address2 the address2 value you wish to set
	 */
	void setAddress2(final String address2);

    /**
     * Return the value associated with the column: address1.
	 * @return A String object (this.address1)
	 */
	String getAddress1();
	

  
    /**  
     * Set the value related to the column: address1.
	 * @param address1 the address1 value you wish to set
	 */
	void setAddress1(final String address1);

    /**
     * Return the value associated with the column: city.
	 * @return A String object (this.city)
	 */
	String getCity();
	

  
    /**  
     * Set the value related to the column: city.
	 * @param city the city value you wish to set
	 */
	void setCity(final String city);

    /**
     * Return the value associated with the column: codeMapping.
	 * @return A Set&lt;CodeMapping&gt; object (this.codeMapping)
	 */
	Set<CodeMapping> getCodeMappings();
	
	/**
	 * Adds a bi-directional link of type CodeMapping to the codeMappings set.
	 * @param codeMapping item to add
	 */
	void addCodeMapping(CodeMapping codeMapping);

  
    /**  
     * Set the value related to the column: codeMapping.
	 * @param codeMapping the codeMapping value you wish to set
	 */
	void setCodeMappings(final Set<CodeMapping> codeMapping);

    /**
     * Return the value associated with the column: dateCreated.
	 * @return A Date object (this.dateCreated)
	 */
	Date getDateCreated();
	

  
    /**  
     * Set the value related to the column: dateCreated.
	 * @param dateCreated the dateCreated value you wish to set
	 */
	void setDateCreated(final Date dateCreated);

    /**
     * Return the value associated with the column: dateDisabled.
	 * @return A Date object (this.dateDisabled)
	 */
	Date getDateDisabled();
	

  
    /**  
     * Set the value related to the column: dateDisabled.
	 * @param dateDisabled the dateDisabled value you wish to set
	 */
	void setDateDisabled(final Date dateDisabled);

    /**
     * Return the value associated with the column: dateUpdated.
	 * @return A Date object (this.dateUpdated)
	 */
	Date getDateUpdated();
	

  
    /**  
     * Set the value related to the column: dateUpdated.
	 * @param dateUpdated the dateUpdated value you wish to set
	 */
	void setDateUpdated(final Date dateUpdated);

    /**
     * Return the value associated with the column: groupName.
	 * @return A String object (this.groupName)
	 */
	String getGroupName();
	

  
    /**  
     * Set the value related to the column: groupName.
	 * @param groupName the groupName value you wish to set
	 */
	void setGroupName(final String groupName);

    /**
     * Return the value associated with the column: id.
	 * @return A Integer object (this.id)
	 */
	Integer getId();
	

  
    /**  
     * Set the value related to the column: id.
	 * @param id the id value you wish to set
	 */
	void setId(final Integer id);

    /**
     * Return the value associated with the column: organization.
	 * @return A Organization object (this.organization)
	 */
	Organization getOrganization();
	

  
    /**  
     * Set the value related to the column: organization.
	 * @param organization the organization value you wish to set
	 */
	void setOrganization(final Organization organization);

    /**
     * Return the value associated with the column: patientInfo.
	 * @return A Set&lt;PatientInfo&gt; object (this.patientInfo)
	 */
	Set<PatientInfo> getPatientInfoes();
	
	/**
	 * Adds a bi-directional link of type PatientInfo to the patientInfoes set.
	 * @param patientInfo item to add
	 */
	void addPatientInfo(PatientInfo patientInfo);

  
    /**  
     * Set the value related to the column: patientInfo.
	 * @param patientInfo the patientInfo value you wish to set
	 */
	void setPatientInfoes(final Set<PatientInfo> patientInfo);

    /**
     * Return the value associated with the column: practiceAvailableMeasure.
	 * @return A Set&lt;PracticeAvailableMeasure&gt; object (this.practiceAvailableMeasure)
	 */
	Set<PracticeAvailableMeasure> getPracticeAvailableMeasures();
	
	/**
	 * Adds a bi-directional link of type PracticeAvailableMeasure to the practiceAvailableMeasures set.
	 * @param practiceAvailableMeasure item to add
	 */
	void addPracticeAvailableMeasure(PracticeAvailableMeasure practiceAvailableMeasure);

  
    /**  
     * Set the value related to the column: practiceAvailableMeasure.
	 * @param practiceAvailableMeasure the practiceAvailableMeasure value you wish to set
	 */
	void setPracticeAvailableMeasures(final Set<PracticeAvailableMeasure> practiceAvailableMeasure);

    /**
     * Return the value associated with the column: practiceNpi.
	 * @return A String object (this.practiceNpi)
	 */
	String getPracticeNpi();
	

  
    /**  
     * Set the value related to the column: practiceNpi.
	 * @param practiceNpi the practiceNpi value you wish to set
	 */
	void setPracticeNpi(final String practiceNpi);

    /**
     * Return the value associated with the column: provider.
	 * @return A Set&lt;Provider&gt; object (this.provider)
	 */
	Set<Provider> getProviders();
	
	/**
	 * Adds a bi-directional link of type Provider to the providers set.
	 * @param provider item to add
	 */
	void addProvider(Provider provider);

  
    /**  
     * Set the value related to the column: provider.
	 * @param provider the provider value you wish to set
	 */
	void setProviders(final Set<Provider> provider);

    /**
     * Return the value associated with the column: senderOid.
	 * @return A String object (this.senderOid)
	 */
	String getSenderOid();
	

  
    /**  
     * Set the value related to the column: senderOid.
	 * @param senderOid the senderOid value you wish to set
	 */
	void setSenderOid(final String senderOid);

    /**
     * Return the value associated with the column: stateName.
	 * @return A String object (this.stateName)
	 */
	String getStateName();
	

  
    /**  
     * Set the value related to the column: stateName.
	 * @param stateName the stateName value you wish to set
	 */
	void setStateName(final String stateName);

    /**
     * Return the value associated with the column: type.
	 * @return A PracticeGroupType object (this.type)
	 */
	PracticeGroupType getType();
	

  
    /**  
     * Set the value related to the column: type.
	 * @param type the type value you wish to set
	 */
	void setType(final PracticeGroupType type);

    /**
     * Return the value associated with the column: userCreated.
	 * @return A Integer object (this.userCreated)
	 */
	Integer getUserCreated();
	

  
    /**  
     * Set the value related to the column: userCreated.
	 * @param userCreated the userCreated value you wish to set
	 */
	void setUserCreated(final Integer userCreated);

    /**
     * Return the value associated with the column: userUpdated.
	 * @return A Integer object (this.userUpdated)
	 */
	Integer getUserUpdated();
	

  
    /**  
     * Set the value related to the column: userUpdated.
	 * @param userUpdated the userUpdated value you wish to set
	 */
	void setUserUpdated(final Integer userUpdated);

    /**
     * Return the value associated with the column: vendor.
	 * @return A EhrVendor object (this.vendor)
	 */
	EhrVendor getVendor();
	

  
    /**  
     * Set the value related to the column: vendor.
	 * @param vendor the vendor value you wish to set
	 */
	void setVendor(final EhrVendor vendor);

    /**
     * Return the value associated with the column: zipcode.
	 * @return A String object (this.zipcode)
	 */
	String getZipcode();
	

  
    /**  
     * Set the value related to the column: zipcode.
	 * @param zipcode the zipcode value you wish to set
	 */
	void setZipcode(final String zipcode);

	// end of interface
}