package com.yingu.nativeservice.contractservice.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigInteger;


/**
 * The persistent class for the RMT_LEND_CONTRACT_ATT database table.
 * 
 */
@Entity
@Table(name="RMT_LEND_CONTRACT_ATT")
@NamedQuery(name="RmtLendContractAtt.findAll", query="SELECT r FROM RmtLendContractAtt r")
public class RmtLendContractAtt implements Serializable {
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

	@Column(name="FK_LEND_CONTRACT_ID")
	private BigInteger fkLendContractId;

	@Column(name="FK_LEND_CONTRACT_NUMBER")
	private String fkLendContractNumber;

	@Column(name="FK_SUB_ID")
	private BigInteger fkSubId;

	@Column(name="MODIFY_BY")
	private BigInteger modifyBy;

	@Column(name="MODIFY_TIME")
	private Timestamp modifyTime;

	private String templatecode;

	@Column(name="UPLOAD_TIME")
	private Timestamp uploadTime;

	private String valid;

	public RmtLendContractAtt() {
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

	public BigInteger getFkLendContractId() {
		return this.fkLendContractId;
	}

	public void setFkLendContractId(BigInteger fkLendContractId) {
		this.fkLendContractId = fkLendContractId;
	}

	public String getFkLendContractNumber() {
		return this.fkLendContractNumber;
	}

	public void setFkLendContractNumber(String fkLendContractNumber) {
		this.fkLendContractNumber = fkLendContractNumber;
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

	public Timestamp getUploadTime() {
		return this.uploadTime;
	}

	public void setUploadTime(Timestamp uploadTime) {
		this.uploadTime = uploadTime;
	}

	public String getValid() {
		return this.valid;
	}

	public void setValid(String valid) {
		this.valid = valid;
	}

}