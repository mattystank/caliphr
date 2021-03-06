package com.ainq.caliphr.persistence.model.obj.caliphrDb.iface;
import com.ainq.caliphr.persistence.model.obj.caliphrDb.Code;
import com.ainq.caliphr.persistence.model.obj.caliphrDb.CodeMapping;
import com.ainq.caliphr.persistence.model.obj.caliphrDb.PatientInfo;
import com.ainq.caliphr.persistence.model.obj.caliphrDb.PatientNegationDetail;
import com.ainq.caliphr.persistence.model.obj.caliphrDb.PatientProcedure;
import com.ainq.caliphr.persistence.model.obj.caliphrDb.StatusCode;
import com.ainq.caliphr.persistence.model.obj.caliphrDb.TemplateRoot;
import com.ainq.caliphr.persistence.util.IPojoGenEntity;
import java.util.Date;
import java.util.Set;
import org.hibernate.annotations.*;
import org.hibernate.annotations.Cache;


/** 
 * Object interface mapping for hibernate-handled table: patient_procedure.
 * @author autogenerated
 */

public interface IPatientProcedure {



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
     * Return the value associated with the column: codeDescription.
	 * @return A String object (this.codeDescription)
	 */
	String getCodeDescription();
	

  
    /**  
     * Set the value related to the column: codeDescription.
	 * @param codeDescription the codeDescription value you wish to set
	 */
	void setCodeDescription(final String codeDescription);

    /**
     * Return the value associated with the column: codeMapping.
	 * @return A CodeMapping object (this.codeMapping)
	 */
	CodeMapping getCodeMapping();
	

  
    /**  
     * Set the value related to the column: codeMapping.
	 * @param codeMapping the codeMapping value you wish to set
	 */
	void setCodeMapping(final CodeMapping codeMapping);

    /**
     * Return the value associated with the column: connectedRecord.
	 * @return A PatientProcedure object (this.connectedRecord)
	 */
	PatientProcedure getConnectedRecord();
	

  
    /**  
     * Set the value related to the column: connectedRecord.
	 * @param connectedRecord the connectedRecord value you wish to set
	 */
	void setConnectedRecord(final PatientProcedure connectedRecord);

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
     * Return the value associated with the column: effectiveTimeEnd.
	 * @return A Date object (this.effectiveTimeEnd)
	 */
	Date getEffectiveTimeEnd();
	

  
    /**  
     * Set the value related to the column: effectiveTimeEnd.
	 * @param effectiveTimeEnd the effectiveTimeEnd value you wish to set
	 */
	void setEffectiveTimeEnd(final Date effectiveTimeEnd);

    /**
     * Return the value associated with the column: effectiveTimeStart.
	 * @return A Date object (this.effectiveTimeStart)
	 */
	Date getEffectiveTimeStart();
	

  
    /**  
     * Set the value related to the column: effectiveTimeStart.
	 * @param effectiveTimeStart the effectiveTimeStart value you wish to set
	 */
	void setEffectiveTimeStart(final Date effectiveTimeStart);

    /**
     * Return the value associated with the column: externalId.
	 * @return A String object (this.externalId)
	 */
	String getExternalId();
	

  
    /**  
     * Set the value related to the column: externalId.
	 * @param externalId the externalId value you wish to set
	 */
	void setExternalId(final String externalId);

    /**
     * Return the value associated with the column: id.
	 * @return A Long object (this.id)
	 */
	Long getId();
	

  
    /**  
     * Set the value related to the column: id.
	 * @param id the id value you wish to set
	 */
	void setId(final Long id);

    /**
     * Return the value associated with the column: negationDetail.
	 * @return A PatientNegationDetail object (this.negationDetail)
	 */
	PatientNegationDetail getNegationDetail();
	

  
    /**  
     * Set the value related to the column: negationDetail.
	 * @param negationDetail the negationDetail value you wish to set
	 */
	void setNegationDetail(final PatientNegationDetail negationDetail);

    /**
     * Return the value associated with the column: ordinalityCode.
	 * @return A Code object (this.ordinalityCode)
	 */
	Code getOrdinalityCode();
	

  
    /**  
     * Set the value related to the column: ordinalityCode.
	 * @param ordinalityCode the ordinalityCode value you wish to set
	 */
	void setOrdinalityCode(final Code ordinalityCode);

    /**
     * Return the value associated with the column: ordinalityCodeDescription.
	 * @return A Integer object (this.ordinalityCodeDescription)
	 */
	Integer getOrdinalityCodeDescription();
	

  
    /**  
     * Set the value related to the column: ordinalityCodeDescription.
	 * @param ordinalityCodeDescription the ordinalityCodeDescription value you wish to set
	 */
	void setOrdinalityCodeDescription(final Integer ordinalityCodeDescription);

    /**
     * Return the value associated with the column: ordinalityCodeName.
	 * @return A String object (this.ordinalityCodeName)
	 */
	String getOrdinalityCodeName();
	

  
    /**  
     * Set the value related to the column: ordinalityCodeName.
	 * @param ordinalityCodeName the ordinalityCodeName value you wish to set
	 */
	void setOrdinalityCodeName(final String ordinalityCodeName);

    /**
     * Return the value associated with the column: ordinalityCodeSystem.
	 * @return A String object (this.ordinalityCodeSystem)
	 */
	String getOrdinalityCodeSystem();
	

  
    /**  
     * Set the value related to the column: ordinalityCodeSystem.
	 * @param ordinalityCodeSystem the ordinalityCodeSystem value you wish to set
	 */
	void setOrdinalityCodeSystem(final String ordinalityCodeSystem);

    /**
     * Return the value associated with the column: patient.
	 * @return A PatientInfo object (this.patient)
	 */
	PatientInfo getPatient();
	

  
    /**  
     * Set the value related to the column: patient.
	 * @param patient the patient value you wish to set
	 */
	void setPatient(final PatientInfo patient);

    /**
     * Return the value associated with the column: patientProcedure.
	 * @return A Set&lt;PatientProcedure&gt; object (this.patientProcedure)
	 */
	Set<PatientProcedure> getPatientProcedures();
	
	/**
	 * Adds a bi-directional link of type PatientProcedure to the patientProcedures set.
	 * @param patientProcedure item to add
	 */
	void addPatientProcedure(PatientProcedure patientProcedure);

  
    /**  
     * Set the value related to the column: patientProcedure.
	 * @param patientProcedure the patientProcedure value you wish to set
	 */
	void setPatientProcedures(final Set<PatientProcedure> patientProcedure);

    /**
     * Return the value associated with the column: reasonCode.
	 * @return A Code object (this.reasonCode)
	 */
	Code getReasonCode();
	

  
    /**  
     * Set the value related to the column: reasonCode.
	 * @param reasonCode the reasonCode value you wish to set
	 */
	void setReasonCode(final Code reasonCode);

    /**
     * Return the value associated with the column: reasonCodeDescription.
	 * @return A String object (this.reasonCodeDescription)
	 */
	String getReasonCodeDescription();
	

  
    /**  
     * Set the value related to the column: reasonCodeDescription.
	 * @param reasonCodeDescription the reasonCodeDescription value you wish to set
	 */
	void setReasonCodeDescription(final String reasonCodeDescription);

    /**
     * Return the value associated with the column: reasonCodeName.
	 * @return A String object (this.reasonCodeName)
	 */
	String getReasonCodeName();
	

  
    /**  
     * Set the value related to the column: reasonCodeName.
	 * @param reasonCodeName the reasonCodeName value you wish to set
	 */
	void setReasonCodeName(final String reasonCodeName);

    /**
     * Return the value associated with the column: reasonCodeSystem.
	 * @return A String object (this.reasonCodeSystem)
	 */
	String getReasonCodeSystem();
	

  
    /**  
     * Set the value related to the column: reasonCodeSystem.
	 * @param reasonCodeSystem the reasonCodeSystem value you wish to set
	 */
	void setReasonCodeSystem(final String reasonCodeSystem);

    /**
     * Return the value associated with the column: reasonEffectiveTime.
	 * @return A Date object (this.reasonEffectiveTime)
	 */
	Date getReasonEffectiveTime();
	

  
    /**  
     * Set the value related to the column: reasonEffectiveTime.
	 * @param reasonEffectiveTime the reasonEffectiveTime value you wish to set
	 */
	void setReasonEffectiveTime(final Date reasonEffectiveTime);

    /**
     * Return the value associated with the column: resultValueCode.
	 * @return A Code object (this.resultValueCode)
	 */
	Code getResultValueCode();
	

  
    /**  
     * Set the value related to the column: resultValueCode.
	 * @param resultValueCode the resultValueCode value you wish to set
	 */
	void setResultValueCode(final Code resultValueCode);

    /**
     * Return the value associated with the column: resultValueCodeDescription.
	 * @return A String object (this.resultValueCodeDescription)
	 */
	String getResultValueCodeDescription();
	

  
    /**  
     * Set the value related to the column: resultValueCodeDescription.
	 * @param resultValueCodeDescription the resultValueCodeDescription value you wish to set
	 */
	void setResultValueCodeDescription(final String resultValueCodeDescription);

    /**
     * Return the value associated with the column: resultValueCodeName.
	 * @return A String object (this.resultValueCodeName)
	 */
	String getResultValueCodeName();
	

  
    /**  
     * Set the value related to the column: resultValueCodeName.
	 * @param resultValueCodeName the resultValueCodeName value you wish to set
	 */
	void setResultValueCodeName(final String resultValueCodeName);

    /**
     * Return the value associated with the column: resultValueCodeSystem.
	 * @return A String object (this.resultValueCodeSystem)
	 */
	String getResultValueCodeSystem();
	

  
    /**  
     * Set the value related to the column: resultValueCodeSystem.
	 * @param resultValueCodeSystem the resultValueCodeSystem value you wish to set
	 */
	void setResultValueCodeSystem(final String resultValueCodeSystem);

    /**
     * Return the value associated with the column: statusCode.
	 * @return A StatusCode object (this.statusCode)
	 */
	StatusCode getStatusCode();
	

  
    /**  
     * Set the value related to the column: statusCode.
	 * @param statusCode the statusCode value you wish to set
	 */
	void setStatusCode(final StatusCode statusCode);

    /**
     * Return the value associated with the column: statusCodeName.
	 * @return A String object (this.statusCodeName)
	 */
	String getStatusCodeName();
	

  
    /**  
     * Set the value related to the column: statusCodeName.
	 * @param statusCodeName the statusCodeName value you wish to set
	 */
	void setStatusCodeName(final String statusCodeName);

    /**
     * Return the value associated with the column: template.
	 * @return A TemplateRoot object (this.template)
	 */
	TemplateRoot getTemplate();
	

  
    /**  
     * Set the value related to the column: template.
	 * @param template the template value you wish to set
	 */
	void setTemplate(final TemplateRoot template);

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
     * Return the value associated with the column: valueCode.
	 * @return A Code object (this.valueCode)
	 */
	Code getValueCode();
	

  
    /**  
     * Set the value related to the column: valueCode.
	 * @param valueCode the valueCode value you wish to set
	 */
	void setValueCode(final Code valueCode);

    /**
     * Return the value associated with the column: valueCodeDescription.
	 * @return A String object (this.valueCodeDescription)
	 */
	String getValueCodeDescription();
	

  
    /**  
     * Set the value related to the column: valueCodeDescription.
	 * @param valueCodeDescription the valueCodeDescription value you wish to set
	 */
	void setValueCodeDescription(final String valueCodeDescription);

    /**
     * Return the value associated with the column: valueString.
	 * @return A String object (this.valueString)
	 */
	String getValueString();
	

  
    /**  
     * Set the value related to the column: valueString.
	 * @param valueString the valueString value you wish to set
	 */
	void setValueString(final String valueString);

    /**
     * Return the value associated with the column: valueUnit.
	 * @return A String object (this.valueUnit)
	 */
	String getValueUnit();
	

  
    /**  
     * Set the value related to the column: valueUnit.
	 * @param valueUnit the valueUnit value you wish to set
	 */
	void setValueUnit(final String valueUnit);

	// end of interface
}