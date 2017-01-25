package com.yingu.nativeservice.contractservice.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the LB_T_CONTRACT_NO_GEN database table.
 * 
 */
@Entity
@Table(name="LB_T_CONTRACT_NO_GEN")
@NamedQuery(name="LbTContractNoGen.findAll", query="SELECT l FROM LbTContractNoGen l")
public class LbTContractNoGen implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;

	@Temporal(TemporalType.DATE)
	@Column(name="GEN_DATE")
	private Date genDate;

	@Column(name="ORG_ID")
	private String orgId;

	@Column(name="SERIAL_NUMBER")
	private BigInteger serialNumber;

	public LbTContractNoGen() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getGenDate() {
		return this.genDate;
	}

	public void setGenDate(Date genDate) {
		this.genDate = genDate;
	}

	public String getOrgId() {
		return this.orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public BigInteger getSerialNumber() {
		return this.serialNumber;
	}

	public void setSerialNumber(BigInteger serialNumber) {
		this.serialNumber = serialNumber;
	}

}