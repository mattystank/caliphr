package com.ainq.caliphr.persistence.model.obj.caliphrDb.iface;
import com.ainq.caliphr.persistence.model.obj.caliphrDb.ClinicalDocument;
import com.ainq.caliphr.persistence.util.IPojoGenEntity;
import java.util.Date;
import org.hibernate.annotations.*;
import org.hibernate.annotations.Cache;


/** 
 * Object interface mapping for hibernate-handled table: clinical_document_parse_error.
 * @author autogenerated
 */

public interface IClinicalDocumentParseError {



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
     * Return the value associated with the column: document.
	 * @return A ClinicalDocument object (this.document)
	 */
	ClinicalDocument getDocument();
	

  
    /**  
     * Set the value related to the column: document.
	 * @param document the document value you wish to set
	 */
	void setDocument(final ClinicalDocument document);

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
     * Return the value associated with the column: stackTrace.
	 * @return A String object (this.stackTrace)
	 */
	String getStackTrace();
	

  
    /**  
     * Set the value related to the column: stackTrace.
	 * @param stackTrace the stackTrace value you wish to set
	 */
	void setStackTrace(final String stackTrace);

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

	// end of interface
}