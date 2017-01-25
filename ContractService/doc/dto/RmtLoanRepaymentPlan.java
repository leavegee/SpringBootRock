package com.yingu.nativeservice.contractservice.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;
import java.math.BigInteger;


/**
 * The persistent class for the RMT_LOAN_REPAYMENT_PLAN database table.
 * 
 */
@Entity
@Table(name="RMT_LOAN_REPAYMENT_PLAN")
@NamedQuery(name="RmtLoanRepaymentPlan.findAll", query="SELECT r FROM RmtLoanRepaymentPlan r")
public class RmtLoanRepaymentPlan implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;

	@Column(name="CREATE_BY")
	private BigInteger createBy;

	@Column(name="CREATE_TIME")
	private Timestamp createTime;

	@Column(name="FK_LOAN_CONTRACT_ID")
	private BigInteger fkLoanContractId;

	@Column(name="FK_LOAN_CONTRACT_NO")
	private String fkLoanContractNo;

	@Column(name="MONTH_REPAY_AMOUNT")
	private BigDecimal monthRepayAmount;

	@Column(name="MONTH_REPAY_BASE")
	private BigDecimal monthRepayBase;

	@Column(name="MONTH_REPAY_INTEREST")
	private BigDecimal monthRepayInterest;

	@Column(name="PERIOD_ACTIVE")
	private BigDecimal periodActive;

	@Column(name="PERIOD_EARLIER_REPAY_AMOUNT")
	private BigDecimal periodEarlierRepayAmount;

	@Column(name="PERIOD_TOTAL")
	private BigDecimal periodTotal;

	@Column(name="REFUND_FEE")
	private BigDecimal refundFee;

	@Column(name="REFUND_SERVICE_FEE")
	private BigDecimal refundServiceFee;

	@Column(name="REFUND_TOTAL")
	private BigDecimal refundTotal;

	@Temporal(TemporalType.DATE)
	@Column(name="REPAYMENT_DATE")
	private Date repaymentDate;

	@Column(name="RESPOND_BACK_F001")
	private BigDecimal respondBackF001;

	@Column(name="RESPOND_BACK_F002")
	private BigDecimal respondBackF002;

	@Column(name="RESPOND_BACK_F003")
	private BigDecimal respondBackF003;

	@Column(name="RESPOND_BACK_F004")
	private BigDecimal respondBackF004;

	@Column(name="RESPOND_BACK_F005")
	private BigDecimal respondBackF005;

	@Column(name="RESPOND_BACK_F006")
	private BigDecimal respondBackF006;

	@Column(name="RESPOND_BACK_F999")
	private BigDecimal respondBackF999;

	@Column(name="RESPOND_REPAY_F001")
	private BigDecimal respondRepayF001;

	@Column(name="RESPOND_REPAY_F002")
	private BigDecimal respondRepayF002;

	@Column(name="RESPOND_REPAY_F003")
	private BigDecimal respondRepayF003;

	@Column(name="RESPOND_REPAY_F004")
	private BigDecimal respondRepayF004;

	@Column(name="RESPOND_REPAY_F005")
	private BigDecimal respondRepayF005;

	@Column(name="RESPOND_REPAY_F006")
	private BigDecimal respondRepayF006;

	@Column(name="RESPOND_REPAY_F999")
	private BigDecimal respondRepayF999;

	@Column(name="SURPLUS_MONEY")
	private BigDecimal surplusMoney;

	public RmtLoanRepaymentPlan() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
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

	public BigDecimal getMonthRepayAmount() {
		return this.monthRepayAmount;
	}

	public void setMonthRepayAmount(BigDecimal monthRepayAmount) {
		this.monthRepayAmount = monthRepayAmount;
	}

	public BigDecimal getMonthRepayBase() {
		return this.monthRepayBase;
	}

	public void setMonthRepayBase(BigDecimal monthRepayBase) {
		this.monthRepayBase = monthRepayBase;
	}

	public BigDecimal getMonthRepayInterest() {
		return this.monthRepayInterest;
	}

	public void setMonthRepayInterest(BigDecimal monthRepayInterest) {
		this.monthRepayInterest = monthRepayInterest;
	}

	public BigDecimal getPeriodActive() {
		return this.periodActive;
	}

	public void setPeriodActive(BigDecimal periodActive) {
		this.periodActive = periodActive;
	}

	public BigDecimal getPeriodEarlierRepayAmount() {
		return this.periodEarlierRepayAmount;
	}

	public void setPeriodEarlierRepayAmount(BigDecimal periodEarlierRepayAmount) {
		this.periodEarlierRepayAmount = periodEarlierRepayAmount;
	}

	public BigDecimal getPeriodTotal() {
		return this.periodTotal;
	}

	public void setPeriodTotal(BigDecimal periodTotal) {
		this.periodTotal = periodTotal;
	}

	public BigDecimal getRefundFee() {
		return this.refundFee;
	}

	public void setRefundFee(BigDecimal refundFee) {
		this.refundFee = refundFee;
	}

	public BigDecimal getRefundServiceFee() {
		return this.refundServiceFee;
	}

	public void setRefundServiceFee(BigDecimal refundServiceFee) {
		this.refundServiceFee = refundServiceFee;
	}

	public BigDecimal getRefundTotal() {
		return this.refundTotal;
	}

	public void setRefundTotal(BigDecimal refundTotal) {
		this.refundTotal = refundTotal;
	}

	public Date getRepaymentDate() {
		return this.repaymentDate;
	}

	public void setRepaymentDate(Date repaymentDate) {
		this.repaymentDate = repaymentDate;
	}

	public BigDecimal getRespondBackF001() {
		return this.respondBackF001;
	}

	public void setRespondBackF001(BigDecimal respondBackF001) {
		this.respondBackF001 = respondBackF001;
	}

	public BigDecimal getRespondBackF002() {
		return this.respondBackF002;
	}

	public void setRespondBackF002(BigDecimal respondBackF002) {
		this.respondBackF002 = respondBackF002;
	}

	public BigDecimal getRespondBackF003() {
		return this.respondBackF003;
	}

	public void setRespondBackF003(BigDecimal respondBackF003) {
		this.respondBackF003 = respondBackF003;
	}

	public BigDecimal getRespondBackF004() {
		return this.respondBackF004;
	}

	public void setRespondBackF004(BigDecimal respondBackF004) {
		this.respondBackF004 = respondBackF004;
	}

	public BigDecimal getRespondBackF005() {
		return this.respondBackF005;
	}

	public void setRespondBackF005(BigDecimal respondBackF005) {
		this.respondBackF005 = respondBackF005;
	}

	public BigDecimal getRespondBackF006() {
		return this.respondBackF006;
	}

	public void setRespondBackF006(BigDecimal respondBackF006) {
		this.respondBackF006 = respondBackF006;
	}

	public BigDecimal getRespondBackF999() {
		return this.respondBackF999;
	}

	public void setRespondBackF999(BigDecimal respondBackF999) {
		this.respondBackF999 = respondBackF999;
	}

	public BigDecimal getRespondRepayF001() {
		return this.respondRepayF001;
	}

	public void setRespondRepayF001(BigDecimal respondRepayF001) {
		this.respondRepayF001 = respondRepayF001;
	}

	public BigDecimal getRespondRepayF002() {
		return this.respondRepayF002;
	}

	public void setRespondRepayF002(BigDecimal respondRepayF002) {
		this.respondRepayF002 = respondRepayF002;
	}

	public BigDecimal getRespondRepayF003() {
		return this.respondRepayF003;
	}

	public void setRespondRepayF003(BigDecimal respondRepayF003) {
		this.respondRepayF003 = respondRepayF003;
	}

	public BigDecimal getRespondRepayF004() {
		return this.respondRepayF004;
	}

	public void setRespondRepayF004(BigDecimal respondRepayF004) {
		this.respondRepayF004 = respondRepayF004;
	}

	public BigDecimal getRespondRepayF005() {
		return this.respondRepayF005;
	}

	public void setRespondRepayF005(BigDecimal respondRepayF005) {
		this.respondRepayF005 = respondRepayF005;
	}

	public BigDecimal getRespondRepayF006() {
		return this.respondRepayF006;
	}

	public void setRespondRepayF006(BigDecimal respondRepayF006) {
		this.respondRepayF006 = respondRepayF006;
	}

	public BigDecimal getRespondRepayF999() {
		return this.respondRepayF999;
	}

	public void setRespondRepayF999(BigDecimal respondRepayF999) {
		this.respondRepayF999 = respondRepayF999;
	}

	public BigDecimal getSurplusMoney() {
		return this.surplusMoney;
	}

	public void setSurplusMoney(BigDecimal surplusMoney) {
		this.surplusMoney = surplusMoney;
	}

}