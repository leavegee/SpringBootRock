package com.yingu.nativeservice.contractservice.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigInteger;


/**
 * The persistent class for the RMT_LOAN_CONTRACT_ATT database table.
 * 
 */
@Entity
@Table(name="RMT_LOAN_CONTRACT_ATT")
@NamedQuery(name="RmtLoanContractAtt.findAll", query="SELECT r FROM RmtLoanContractAtt r")
public class RmtLoanContractAtt implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;

	@Column(name="CJ_PRODUCT_CODE")
	private String cjProductCode;

	@Column(name="CREATE_BY")
	private BigInteger createBy;

	@Column(name="CREATE_TIME")
	private Timestamp createTime;

	@Column(name="FASTDFS_PATH")
	private String fastdfsPath;

	@Column(name="FK_LOAN_CONTRACT_ID")
	private BigInteger fkLoanContractId;

	@Column(name="FK_LOAN_CONTRACT_NUMBER")
	private String fkLoanContractNumber;

	@Column(name="FK_SUB_ID")
	private BigInteger fkSubId;

	@Column(name="MODIFY_BY")
	private BigInteger modifyBy;

	@Column(name="MODIFY_TIME")
	private Timestamp modifyTime;

	private String templatecode;

	private String valid;

	public RmtLoanContractAtt() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCjProductCode() {
		return this.cjProductCode;
	}

	public void setCjProductCode(String cjProductCode) {
		this.cjProductCode = cjProductCode;
	}

	public BigInteger getCreateBy() {
		return this.createBy;
	}

	public void setCreateBy(BigInteger createBy) {
		this.createBy = createBy;
	}

	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public String getFastdfsPath() {
		return this.fastdfsPath;
	}

	public void setFastdfsPath(String fastdfsPath) {
		this.fastdfsPath = fastdfsPath;
	}

	public BigInteger getFkLoanContractId() {
		return this.fkLoanContractId;
	}

	public void setFkLoanContractId(BigInteger fkLoanContractId) {
		this.fkLoanContractId = fkLoanContractId;
	}

	public String getFkLoanContractNumber() {
		return this.fkLoanContractNumber;
	}

	public void setFkLoanContractNumber(String fkLoanContractNumber) {
		this.fkLoanContractNumber = fkLoanContractNumber;
	}

	public BigInteger getFkSubId() {
		return this.fkSubId;
	}

	public void setFkSubId(BigInteger fkSubId) {
		this.fkSubId = fkSubId;
	}

	public BigInteger getModifyBy() {
		return this.modifyBy;
	}

	public void setModifyBy(BigInteger modifyBy) {
		this.modifyBy = modifyBy;
	}

	public Timestamp getModifyTime() {
		return this.modifyTime;
	}

	public void setModifyTime(Timestamp modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getTemplatecode() {
		return this.templatecode;
	}

	public void setTemplatecode(String templatecode) {
		this.templatecode = templatecode;
	}

	public String getValid() {
		return this.valid;
	}

	public void setValid(String valid) {
		this.valid = valid;
	}

}