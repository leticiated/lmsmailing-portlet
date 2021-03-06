/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.tls.liferaylms.mail.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the AuditReceiverMail service. Represents a row in the &quot;lmsmail_AuditReceiverMail&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.tls.liferaylms.mail.model.impl.AuditReceiverMailModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.tls.liferaylms.mail.model.impl.AuditReceiverMailImpl}.
 * </p>
 *
 * @author je03042
 * @see AuditReceiverMail
 * @see com.tls.liferaylms.mail.model.impl.AuditReceiverMailImpl
 * @see com.tls.liferaylms.mail.model.impl.AuditReceiverMailModelImpl
 * @generated
 */
public interface AuditReceiverMailModel extends BaseModel<AuditReceiverMail> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a audit receiver mail model instance should use the {@link AuditReceiverMail} interface instead.
	 */

	/**
	 * Returns the primary key of this audit receiver mail.
	 *
	 * @return the primary key of this audit receiver mail
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this audit receiver mail.
	 *
	 * @param primaryKey the primary key of this audit receiver mail
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the audit receiver mail ID of this audit receiver mail.
	 *
	 * @return the audit receiver mail ID of this audit receiver mail
	 */
	public long getAuditReceiverMailId();

	/**
	 * Sets the audit receiver mail ID of this audit receiver mail.
	 *
	 * @param auditReceiverMailId the audit receiver mail ID of this audit receiver mail
	 */
	public void setAuditReceiverMailId(long auditReceiverMailId);

	/**
	 * Returns the audit send mails ID of this audit receiver mail.
	 *
	 * @return the audit send mails ID of this audit receiver mail
	 */
	public long getAuditSendMailsId();

	/**
	 * Sets the audit send mails ID of this audit receiver mail.
	 *
	 * @param auditSendMailsId the audit send mails ID of this audit receiver mail
	 */
	public void setAuditSendMailsId(long auditSendMailsId);

	/**
	 * Returns the to of this audit receiver mail.
	 *
	 * @return the to of this audit receiver mail
	 */
	@AutoEscape
	public String getTo();

	/**
	 * Sets the to of this audit receiver mail.
	 *
	 * @param to the to of this audit receiver mail
	 */
	public void setTo(String to);

	/**
	 * Returns the status of this audit receiver mail.
	 *
	 * @return the status of this audit receiver mail
	 */
	public Integer getStatus();

	/**
	 * Sets the status of this audit receiver mail.
	 *
	 * @param status the status of this audit receiver mail
	 */
	public void setStatus(Integer status);

	/**
	 * Returns the send date of this audit receiver mail.
	 *
	 * @return the send date of this audit receiver mail
	 */
	public Date getSendDate();

	/**
	 * Sets the send date of this audit receiver mail.
	 *
	 * @param sendDate the send date of this audit receiver mail
	 */
	public void setSendDate(Date sendDate);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(AuditReceiverMail auditReceiverMail);

	public int hashCode();

	public CacheModel<AuditReceiverMail> toCacheModel();

	public AuditReceiverMail toEscapedModel();

	public String toString();

	public String toXmlString();
}