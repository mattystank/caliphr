package com.ainq.caliphr.persistence.model.obj.caliphrDb.iface;
import com.ainq.caliphr.persistence.model.obj.caliphrDb.Bundle;
import com.ainq.caliphr.persistence.model.obj.caliphrDb.ValueSetCode;
import com.ainq.caliphr.persistence.util.IPojoGenEntity;
import java.util.Date;
import java.util.Set;
import org.hibernate.annotations.*;
import org.hibernate.annotations.Cache;


/** 
 * Object interface mapping for hibernate-handled table: value_set.
 * @author autogenerated
 */

public interface IValueSet {



    /**
     * Return the value associated with the column: bundle.
	 * @return A Bundle object (this.bundle)
	 */
	Bundle getBundle();
	

  
    /**  
     * Set the value related to the column: bundle.
	 * @param bundle the bundle value you wish to set
	 */
	void setBundle(final Bundle bundle);

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
     * Return the value associated with the column: hl7Oid.
	 * @return A String object (this.hl7Oid)
	 */
	String getHl7Oid();
	

  
    /**  
     * Set the value related to the column: hl7Oid.
	 * @param hl7Oid the hl7Oid value you wish to set
	 */
	void setHl7Oid(final String hl7Oid);

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
     * Return the value associated with the column: valueSetCode.
	 * @return A Set&lt;ValueSetCode&gt; object (this.valueSetCode)
	 */
	Set<ValueSetCode> getValueSetCodes();
	
	/**
	 * Adds a bi-directional link of type ValueSetCode to the valueSetCodes set.
	 * @param valueSetCode item to add
	 */
	void addValueSetCode(ValueSetCode valueSetCode);

  
    /**  
     * Set the value related to the column: valueSetCode.
	 * @param valueSetCode the valueSetCode value you wish to set
	 */
	void setValueSetCodes(final Set<ValueSetCode> valueSetCode);

    /**
     * Return the value associated with the column: valueSetName.
	 * @return A String object (this.valueSetName)
	 */
	String getValueSetName();
	

  
    /**  
     * Set the value related to the column: valueSetName.
	 * @param valueSetName the valueSetName value you wish to set
	 */
	void setValueSetName(final String valueSetName);

	// end of interface
}