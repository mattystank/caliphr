package com.ainq.caliphr.persistence.model.obj.caliphrDb.iface;
import com.ainq.caliphr.persistence.model.obj.caliphrDb.OrganizationType;
import com.ainq.caliphr.persistence.model.obj.caliphrDb.PracticeGroup;
import com.ainq.caliphr.persistence.util.IPojoGenEntity;
import java.util.Date;
import java.util.Set;
import org.hibernate.annotations.*;
import org.hibernate.annotations.Cache;


/** 
 * Object interface mapping for hibernate-handled table: organization.
 * @author autogenerated
 */

public interface IOrganization {



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
     * Return the value associated with the column: organizationName.
	 * @return A String object (this.organizationName)
	 */
	String getOrganizationName();
	

  
    /**  
     * Set the value related to the column: organizationName.
	 * @param organizationName the organizationName value you wish to set
	 */
	void setOrganizationName(final String organizationName);

    /**
     * Return the value associated with the column: organizationNumber.
	 * @return A String object (this.organizationNumber)
	 */
	String getOrganizationNumber();
	

  
    /**  
     * Set the value related to the column: organizationNumber.
	 * @param organizationNumber the organizationNumber value you wish to set
	 */
	void setOrganizationNumber(final String organizationNumber);

    /**
     * Return the value associated with the column: practiceGroup.
	 * @return A Set&lt;PracticeGroup&gt; object (this.practiceGroup)
	 */
	Set<PracticeGroup> getPracticeGroups();
	
	/**
	 * Adds a bi-directional link of type PracticeGroup to the practiceGroups set.
	 * @param practiceGroup item to add
	 */
	void addPracticeGroup(PracticeGroup practiceGroup);

  
    /**  
     * Set the value related to the column: practiceGroup.
	 * @param practiceGroup the practiceGroup value you wish to set
	 */
	void setPracticeGroups(final Set<PracticeGroup> practiceGroup);

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
	 * @return A OrganizationType object (this.type)
	 */
	OrganizationType getType();
	

  
    /**  
     * Set the value related to the column: type.
	 * @param type the type value you wish to set
	 */
	void setType(final OrganizationType type);

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