package com.yingu.nativeservice.contractservice.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;
import java.math.BigInteger;


/**
 * The persistent class for the RMT_LEND_CONTRACT database table.
 * 
 */
@Entity
@Table(name="RMT_LEND_CONTRACT")
@NamedQuery(name="RmtLendContract.findAll", query="SELECT r FROM RmtLendContract r")
public class RmtLendContract implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;

	@Column(name="CONTRACT_NO")
	private String contractNo;

	@Column(name="CREATE_BY")
	private BigInteger createBy;

	@Column(name="CREATE_TIME")
	private Timestamp createTime;

	@Column(name="DAY_DEFAULT_INTEREST")
	private BigDecimal dayDefaultInterest;

	@Column(name="FK_CUST_ID")
	private String fkCustId;

	@Column(name="FK_INTO_ID")
	private String fkIntoId;

	@Column(name="FK_INTO_NO")
	private String fkIntoNo;

	private BigDecimal interestrate;

	private String interesttype;

	@Column(name="LEND_ADDRESS")
	private String lendAddress;

	@Column(name="LEND_MAIL")
	private String lendMail;

	@Column(name="LEND_NAME")
	private String lendName;

	@Column(name="LEND_NUMBER")
	private String lendNumber;

	@Column(name="LEND_PERIOD")
	private BigDecimal lendPeriod;

	@Column(name="LEND_PHONE")
	private String lendPhone;

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

	private String valid;

	public RmtLendContract() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getContractNo() {
		return this.contractNo;
	}

	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
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

	public String getFkCustId() {
		return this.fkCustId;
	}

	public void setFkCustId(String fkCustId) {
		this.fkCustId = fkCustId;
	}

	public String getFkIntoId() {
		return this.fkIntoId;
	}

	public void setFkIntoId(String fkIntoId) {
		this.fkIntoId = fkIntoId;
	}

	public String getFkIntoNo() {
		return this.fkIntoNo;
	}

	public void setFkIntoNo(String fkIntoNo) {
		this.fkIntoNo = fkIntoNo;
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

	public String getLendAddress() {
		return this.lendAddress;
	}

	public void setLendAddress(String lendAddress) {
		this.lendAddress = lendAddress;
	}

	public String getLendMail() {
		return this.lendMail;
	}

	public void setLendMail(String lendMail) {
		this.lendMail = lendMail;
	}

	public String getLendName() {
		return this.lendName;
	}

	public void setLendName(String lendName) {
		this.lendName = lendName;
	}

	public String getLendNumber() {
		return this.lendNumber;
	}

	public void setLendNumber(String lendNumber) {
		this.lendNumber = lendNumber;
	}

	public BigDecimal getLendPeriod() {
		return this.lendPeriod;
	}

	public void setLendPeriod(BigDecimal lendPeriod) {
		this.lendPeriod = lendPeriod;
	}

	public String getLendPhone() {
		return this.lendPhone;
	}

	public void setLendPhone(String lendPhone) {
		this.lendPhone = lendPhone;
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

	public String getValid() {
		return this.valid;
	}

	public void setValid(String valid) {
		this.valid = valid;
	}

}