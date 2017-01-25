package com.yingu.nativeservice.contractservice.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;
import java.math.BigInteger;


/**
 * The persistent class for the RMT_CONTRACT_INTANCE database table.
 * 
 */
@Entity
@Table(name="RMT_CONTRACT_INTANCE")
@NamedQuery(name="RmtContractIntance.findAll", query="SELECT r FROM RmtContractIntance r")
public class RmtContractIntance implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="SHILI_ID")
	private String shiliId;

	private BigDecimal approvemoney;

	@Column(name="CREATE_BY")
	private BigInteger createBy;

	@Column(name="CREATE_TIME")
	private Timestamp createTime;

	@Column(name="DAY_DEFAULT_INTEREST")
	private BigDecimal dayDefaultInterest;

	@Column(name="FK_LEND_CONTRACT_ID")
	private BigInteger fkLendContractId;

	@Column(name="FK_LEND_CONTRACT_NO")
	private String fkLendContractNo;

	@Column(name="FK_LOAN_CONTRACT_ID")
	private BigInteger fkLoanContractId;

	@Column(name="FK_LOAN_CONTRACT_NO")
	private String fkLoanContractNo;

	private BigDecimal interestrate;

	private String interesttype;

	@Column(name="LEND_ID_NUMBER")
	private BigInteger lendIdNumber;

	@Column(name="LEND_NAME")
	private String lendName;

	@Column(name="LEND_PRODUCT_CODE")
	private String lendProductCode;

	@Column(name="LOAN_BANK_ACCOUNT")
	private String loanBankAccount;

	@Column(name="LOAN_BANK_CODE")
	private String loanBankCode;

	@Column(name="LOAN_BANK_RESERVED_PHONE")
	private String loanBankReservedPhone;

	@Column(name="loan_channel")
	private String loanChannel;

	@Column(name="LOAN_DATE")
	private Timestamp loanDate;

	@Column(name="LOAN_ID_NUMBER")
	private BigInteger loanIdNumber;

	@Column(name="LOAN_NAME")
	private String loanName;

	@Column(name="LOAN_PRODUCT_CODE")
	private String loanProductCode;

	@Column(name="LOAN_RATE")
	private BigDecimal loanRate;

	@Column(name="LOAN_SUB_BRANCH_NAME")
	private String loanSubBranchName;

	@Column(name="LOAN_USER_NAME")
	private String loanUserName;

	@Column(name="MODIFY_BY")
	private BigInteger modifyBy;

	@Column(name="MODIFY_TIME")
	private Timestamp modifyTime;

	private BigDecimal monthlyoverallrate;

	@Column(name="ORG_ID")
	private BigInteger orgId;

	@Column(name="OWNER_ID")
	private BigInteger ownerId;

	private BigDecimal penalty;

	@Column(name="PENALTY_CALCULATION")
	private String penaltyCalculation;

	private BigInteger period;

	@Temporal(TemporalType.DATE)
	@Column(name="plan_loan_date")
	private Date planLoanDate;

	@Column(name="PLAN_LOAN_MONEY")
	private BigDecimal planLoanMoney;

	@Column(name="PUNITIVE_CALCULATION")
	private String punitiveCalculation;

	@Column(name="QUIRY_RATE")
	private BigDecimal quiryRate;

	@Column(name="REA_MATCH_MONEY")
	private BigDecimal reaMatchMoney;

	@Column(name="RECEIVE_BANK_ACCOUNT")
	private String receiveBankAccount;

	@Column(name="RECEIVE_BANK_CODE")
	private String receiveBankCode;

	@Column(name="RECEIVE_SUB_BRANCH_NAME")
	private String receiveSubBranchName;

	@Column(name="RECEIVE_USER_NAME")
	private String receiveUserName;

	@Column(name="REPAYDATE_CALCULATION")
	private String repaydateCalculation;

	@Temporal(TemporalType.DATE)
	@Column(name="REPAYMENT_END_DATE")
	private Date repaymentEndDate;

	@Temporal(TemporalType.DATE)
	@Column(name="REPAYMENT_START_DATE")
	private Date repaymentStartDate;

	@Column(name="REPAYMENT_WAY")
	private String repaymentWay;

	private String state;

	@Column(name="TOTAL_INTEREST")
	private BigDecimal totalInterest;

	@Column(name="URGENT_RATE")
	private BigDecimal urgentRate;

	private BigDecimal urgentrate;

	private String valid;

	public RmtContractIntance() {
	}

	public String getShiliId() {
		return this.shiliId;
	}

	public void setShiliId(String shiliId) {
		this.shiliId = shiliId;
	}

	public BigDecimal getApprovemoney() {
		return this.approvemoney;
	}

	public void setApprovemoney(BigDecimal approvemoney) {
		this.approvemoney = approvemoney;
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

	public BigDecimal getDayDefaultInterest() {
		return this.dayDefaultInterest;
	}

	public void setDayDefaultInterest(BigDecimal dayDefaultInterest) {
		this.dayDefaultInterest = dayDefaultInterest;
	}

	public BigInteger getFkLendContractId() {
		return this.fkLendContractId;
	}

	public void setFkLendContractId(BigInteger fkLendContractId) {
		this.fkLendContractId = fkLendContractId;
	}

	public String getFkLendContractNo() {
		return this.fkLendContractNo;
	}

	public void setFkLendContractNo(String fkLendContractNo) {
		this.fkLendContractNo = fkLendContractNo;
	}

	public BigInteger getFkLoanContractId() {
		return this.fkLoanContractId;
	}

	public void setFkLoanContractId(BigInteger fkLoanContractId) {
		this.fkLoanContractId = fkLoanContractId;
	}

	public String getFkLoanContractNo() {
		return this.fkLoanContractNo;
	}

	public void setFkLoanContractNo(String fkLoanContractNo) {
		this.fkLoanContractNo = fkLoanContractNo;
	}

	public BigDecimal getInterestrate() {
		return this.interestrate;
	}

	public void setInterestrate(BigDecimal interestrate) {
		this.interestrate = interestrate;
	}

	public String getInteresttype() {
		return this.interesttype;
	}

	public void setInteresttype(String interesttype) {
		this.interesttype = interesttype;
	}

	public BigInteger getLendIdNumber() {
		return this.lendIdNumber;
	}

	public void setLendIdNumber(BigInteger lendIdNumber) {
		this.lendIdNumber = lendIdNumber;
	}

	public String getLendName() {
		return this.lendName;
	}

	public void setLendName(String lendName) {
		this.lendName = lendName;
	}

	public String getLendProductCode() {
		return this.lendProductCode;
	}

	public void setLendProductCode(String lendProductCode) {
		this.lendProductCode = lendProductCode;
	}

	public String getLoanBankAccount() {
		return this.loanBankAccount;
	}

	public void setLoanBankAccount(String loanBankAccount) {
		this.loanBankAccount = loanBankAccount;
	}

	public String getLoanBankCode() {
		return this.loanBankCode;
	}

	public void setLoanBankCode(String loanBankCode) {
		this.loanBankCode = loanBankCode;
	}

	public String getLoanBankReservedPhone() {
		return this.loanBankReservedPhone;
	}

	public void setLoanBankReservedPhone(String loanBankReservedPhone) {
		this.loanBankReservedPhone = loanBankReservedPhone;
	}

	public String getLoanChannel() {
		return this.loanChannel;
	}

	public void setLoanChannel(String loanChannel) {
		this.loanChannel = loanChannel;
	}

	public Timestamp getLoanDate() {
		return this.loanDate;
	}

	public void setLoanDate(Timestamp loanDate) {
		this.loanDate = loanDate;
	}

	public BigInteger getLoanIdNumber() {
		return this.loanIdNumber;
	}

	public void setLoanIdNumber(BigInteger loanIdNumber) {
		this.loanIdNumber = loanIdNumber;
	}

	public String getLoanName() {
		return this.loanName;
	}

	public void setLoanName(String loanName) {
		this.loanName = loanName;
	}

	public String getLoanProductCode() {
		return this.loanProductCode;
	}

	public void setLoanProductCode(String loanProductCode) {
		this.loanProductCode = loanProductCode;
	}

	public BigDecimal getLoanRate() {
		return this.loanRate;
	}

	public void setLoanRate(BigDecimal loanRate) {
		this.loanRate = loanRate;
	}

	public String getLoanSubBranchName() {
		return this.loanSubBranchName;
	}

	public void setLoanSubBranchName(String loanSubBranchName) {
		this.loanSubBranchName = loanSubBranchName;
	}

	public String getLoanUserName() {
		return this.loanUserName;
	}

	public void setLoanUserName(String loanUserName) {
		this.loanUserName = loanUserName;
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

	public BigDecimal getMonthlyoverallrate() {
		return this.monthlyoverallrate;
	}

	public void setMonthlyoverallrate(BigDecimal monthlyoverallrate) {
		this.monthlyoverallrate = monthlyoverallrate;
	}

	public BigInteger getOrgId() {
		return this.orgId;
	}

	public void setOrgId(BigInteger orgId) {
		this.orgId = orgId;
	}

	public BigInteger getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(BigInteger ownerId) {
		this.ownerId = ownerId;
	}

	public BigDecimal getPenalty() {
		return this.penalty;
	}

	public void setPenalty(BigDecimal penalty) {
		this.penalty = penalty;
	}

	public String getPenaltyCalculation() {
		return this.penaltyCalculation;
	}

	public void setPenaltyCalculation(String penaltyCalculation) {
		this.penaltyCalculation = penaltyCalculation;
	}

	public BigInteger getPeriod() {
		return this.period;
	}

	public void setPeriod(BigInteger period) {
		this.period = period;
	}

	public Date getPlanLoanDate() {
		return this.planLoanDate;
	}

	public void setPlanLoanDate(Date planLoanDate) {
		this.planLoanDate = planLoanDate;
	}

	public BigDecimal getPlanLoanMoney() {
		return this.planLoanMoney;
	}

	public void setPlanLoanMoney(BigDecimal planLoanMoney) {
		this.planLoanMoney = planLoanMoney;
	}

	public String getPunitiveCalculation() {
		return this.punitiveCalculation;
	}

	public void setPunitiveCalculation(String punitiveCalculation) {
		this.punitiveCalculation = punitiveCalculation;
	}

	public BigDecimal getQuiryRate() {
		return this.quiryRate;
	}

	public void setQuiryRate(BigDecimal quiryRate) {
		this.quiryRate = quiryRate;
	}

	public BigDecimal getReaMatchMoney() {
		return this.reaMatchMoney;
	}

	public void setReaMatchMoney(BigDecimal reaMatchMoney) {
		this.reaMatchMoney = reaMatchMoney;
	}

	public String getReceiveBankAccount() {
		return this.receiveBankAccount;
	}

	public void setReceiveBankAccount(String receiveBankAccount) {
		this.receiveBankAccount = receiveBankAccount;
	}

	public String getReceiveBankCode() {
		return this.receiveBankCode;
	}

	public void setReceiveBankCode(String receiveBankCode) {
		this.receiveBankCode = receiveBankCode;
	}

	public String getReceiveSubBranchName() {
		return this.receiveSubBranchName;
	}

	public void setReceiveSubBranchName(String receiveSubBranchName) {
		this.receiveSubBranchName = receiveSubBranchName;
	}

	public String getReceiveUserName() {
		return this.receiveUserName;
	}

	public void setReceiveUserName(String receiveUserName) {
		this.receiveUserName = receiveUserName;
	}

	public String getRepaydateCalculation() {
		return this.repaydateCalculation;
	}

	public void setRepaydateCalculation(String repaydateCalculation) {
		this.repaydateCalculation = repaydateCalculation;
	}

	public Date getRepaymentEndDate() {
		return this.repaymentEndDate;
	}

	public void setRepaymentEndDate(Date repaymentEndDate) {
		this.repaymentEndDate = repaymentEndDate;
	}

	public Date getRepaymentStartDate() {
		return this.repaymentStartDate;
	}

	public void setRepaymentStartDate(Date repaymentStartDate) {
		this.repaymentStartDate = repaymentStartDate;
	}

	public String getRepaymentWay() {
		return this.repaymentWay;
	}

	public void setRepaymentWay(String repaymentWay) {
		this.repaymentWay = repaymentWay;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public BigDecimal getTotalInterest() {
		return this.totalInterest;
	}

	public void setTotalInterest(BigDecimal totalInterest) {
		this.totalInterest = totalInterest;
	}

	public BigDecimal getUrgentRate() {
		return this.urgentRate;
	}

	public void setUrgentRate(BigDecimal urgentRate) {
		this.urgentRate = urgentRate;
	}

	public BigDecimal getUrgentrate() {
		return this.urgentrate;
	}

	public void setUrgentrate(BigDecimal urgentrate) {
		this.urgentrate = urgentrate;
	}

	public String getValid() {
		return this.valid;
	}

	public void setValid(String valid) {
		this.valid = valid;
	}

}