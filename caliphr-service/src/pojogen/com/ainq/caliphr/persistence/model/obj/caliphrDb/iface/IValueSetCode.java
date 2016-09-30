package com.ainq.caliphr.persistence.model.obj.caliphrDb.iface;
import com.ainq.caliphr.persistence.model.obj.caliphrDb.Code;
import com.ainq.caliphr.persistence.model.obj.caliphrDb.ValueSet;
import com.ainq.caliphr.persistence.util.IPojoGenEntity;
import java.util.Date;
import org.hibernate.annotations.*;
import org.hibernate.annotations.Cache;


/** 
 * Object interface mapping for hibernate-handled table: value_set_code.
 * @author autogenerated
 */

public interface IValueSetCode {



    /**
     * Return the value associated with the column: code.
	 * @return A Code object (this.code)
	 */
	Code getCode();
	

  
    /**  
     * Set the value related to the column: code.
	 * @param code the code value you wish to set
	 */
	void setCode(final Code code);

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
     * Return the value associated with the column: valueSet.
	 * @return A ValueSet object (this.valueSet)
	 */
	ValueSet getValueSet();
	

  
    /**  
     * Set the value related to the column: valueSet.
	 * @param valueSet the valueSet value you wish to set
	 */
	void setValueSet(final ValueSet valueSet);

	// end of interface
}