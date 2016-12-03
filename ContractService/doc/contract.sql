/*
Navicat MySQL Data Transfer

Source Server         : dev1-10.0.130.80
Source Server Version : 50711
Source Host           : localhost:3306
Source Database       : contract

Target Server Type    : MYSQL
Target Server Version : 50711
File Encoding         : 65001

Date: 2016-12-03 19:02:17
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for LB_T_CONTRACT_NO_GEN
-- ----------------------------
DROP TABLE IF EXISTS `LB_T_CONTRACT_NO_GEN`;
CREATE TABLE `LB_T_CONTRACT_NO_GEN` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `GEN_DATE` date NOT NULL COMMENT '生成日期',
  `ORG_ID` varchar(50) NOT NULL COMMENT '机构ID',
  `SERIAL_NUMBER` bigint(4) NOT NULL COMMENT '序号',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='合同编号生成表';

-- ----------------------------
-- Records of LB_T_CONTRACT_NO_GEN
-- ----------------------------

-- ----------------------------
-- Table structure for RMT_CONTRACT_INTANCE
-- ----------------------------
DROP TABLE IF EXISTS `RMT_CONTRACT_INTANCE`;
CREATE TABLE `RMT_CONTRACT_INTANCE` (
  `SHILI_ID` bigint(20) NOT NULL COMMENT '主键ID',
  `FK_LOAN_CONTRACT_ID` bigint(20) DEFAULT NULL COMMENT '借款合同主表ID',
  `FK_LOAN_CONTRACT_NO` varchar(100) DEFAULT NULL COMMENT '借款合同编号',
  `LOAN_NAME` varchar(100) DEFAULT NULL COMMENT '借款人姓名',
  `REA_MATCH_MONEY` decimal(10,0) DEFAULT NULL COMMENT '实撮合金额(实计划放款金额)',
  `PLAN_LOAN_MONEY` decimal(10,0) DEFAULT NULL COMMENT '预借款金额',
  `LOAN_PRODUCT_CODE` varchar(100) DEFAULT NULL COMMENT '借款产品编码',
  `LOAN_ID_NUMBER` bigint(20) DEFAULT NULL COMMENT '借款人ID',
  `FK_LEND_CONTRACT_ID` bigint(20) DEFAULT NULL COMMENT '出借合同主表ID',
  `FK_LEND_CONTRACT_NO` varchar(100) DEFAULT NULL COMMENT '出借合同编号',
  `LEND_NAME` varchar(100) DEFAULT NULL COMMENT '出借人姓名',
  `LEND_PRODUCT_CODE` varchar(100) DEFAULT NULL COMMENT '产品编码',
  `LEND_ID_NUMBER` bigint(20) DEFAULT NULL COMMENT '出借人ID',
  `APPROVEMONEY` decimal(10,0) DEFAULT NULL COMMENT '审批金额',
  `LOAN_DATE` timestamp NULL DEFAULT NULL COMMENT '放款日期',
  `MONTHLYOVERALLRATE` decimal(10,0) DEFAULT NULL COMMENT '月综合费率',
  `PERIOD` bigint(20) DEFAULT NULL COMMENT '借款期限',
  `URGENTRATE` decimal(10,0) DEFAULT NULL COMMENT '加急费率',
  `LOAN_BANK_CODE` varchar(200) DEFAULT NULL COMMENT '放款开户行代码',
  `LOAN_SUB_BRANCH_NAME` varchar(200) DEFAULT NULL COMMENT '放款开户行支行名称(开户网点)',
  `LOAN_BANK_ACCOUNT` varchar(50) DEFAULT NULL COMMENT '放款账号',
  `LOAN_USER_NAME` varchar(100) DEFAULT NULL COMMENT '放款户名',
  `RECEIVE_BANK_CODE` varchar(100) DEFAULT NULL COMMENT '还款开户行代码',
  `RECEIVE_SUB_BRANCH_NAME` varchar(200) DEFAULT NULL COMMENT '还款开户行支行名称(开户网点)',
  `RECEIVE_BANK_ACCOUNT` varchar(50) DEFAULT NULL COMMENT '还款账号',
  `RECEIVE_USER_NAME` varchar(100) DEFAULT NULL COMMENT '还款户名',
  `LOAN_BANK_RESERVED_PHONE` varchar(20) DEFAULT NULL COMMENT '预留手机号',
  `INTERESTTYPE` varchar(100) DEFAULT NULL COMMENT '计息方式',
  `INTERESTRATE` decimal(10,0) DEFAULT NULL COMMENT '利率',
  `QUIRY_RATE` decimal(10,0) DEFAULT NULL COMMENT '服务费',
  `LOAN_RATE` decimal(10,0) DEFAULT NULL COMMENT '贷款利率(%)',
  `REPAYMENT_WAY` varchar(20) DEFAULT NULL COMMENT '还款方式',
  `DAY_DEFAULT_INTEREST` decimal(10,0) DEFAULT NULL COMMENT '日罚息(%);百分比(6位小数)-',
  `PENALTY` decimal(10,0) DEFAULT NULL COMMENT '违约金(%);百分比(2位小数)',
  `PUNITIVE_CALCULATION` varchar(20) DEFAULT NULL COMMENT '罚息计算方式--进件获取',
  `PENALTY_CALCULATION` varchar(20) DEFAULT NULL COMMENT '违约金计算方式 --进件获取',
  `URGENT_RATE` decimal(10,0) DEFAULT NULL COMMENT '加急费率(%);百分比(2位小数)',
  `REPAYDATE_CALCULATION` varchar(20) DEFAULT NULL COMMENT '还款日计算方式--进件获取',
  `loan_channel` varchar(2) DEFAULT NULL COMMENT '放款渠道(1:我司  2：合作机构)',
  `plan_loan_date` date DEFAULT NULL COMMENT '预放款日期',
  `TOTAL_INTEREST` decimal(10,0) DEFAULT NULL COMMENT '利息总额',
  `REPAYMENT_START_DATE` date DEFAULT NULL COMMENT '还款起始日期 --还款计划接口',
  `REPAYMENT_END_DATE` date DEFAULT NULL COMMENT '还款到期日期 --还款计划接口',
  `STATE` varchar(4) DEFAULT NULL COMMENT '合同状态(00：签约中，01：待审核，02：审核通过，03：回退，04：放款中，05：已放款，06：放款失败，07：拒贷，08：客户放弃， 09：正常（正常还款），10：逾期，11：结清，12：撤销)',
  `CREATE_BY` bigint(20) DEFAULT NULL COMMENT '创建人',
  `CREATE_TIME` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `MODIFY_BY` bigint(20) DEFAULT NULL COMMENT '修改人',
  `MODIFY_TIME` timestamp NULL DEFAULT NULL COMMENT '修改时间',
  `valid` varchar(50) DEFAULT NULL COMMENT '有效状态(1有效,0无效)',
  `ORG_ID` bigint(20) DEFAULT NULL COMMENT '数据归属机构',
  `OWNER_ID` bigint(20) DEFAULT NULL COMMENT '数据归属人',
  PRIMARY KEY (`SHILI_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='合同实例子表';

-- ----------------------------
-- Records of RMT_CONTRACT_INTANCE
-- ----------------------------

-- ----------------------------
-- Table structure for RMT_LEND_CONTRACT
-- ----------------------------
DROP TABLE IF EXISTS `RMT_LEND_CONTRACT`;
CREATE TABLE `RMT_LEND_CONTRACT` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `CONTRACT_NO` varchar(100) DEFAULT NULL COMMENT '借款合同编号',
  `LEND_PRODUCT_CODE` varchar(100) DEFAULT NULL COMMENT '产品编码',
  `REA_MATCH_MONEY` decimal(10,0) DEFAULT NULL COMMENT '实撮合金额(实计划放款金额)',
  `PLAN_LOAN_MONEY` decimal(10,0) DEFAULT NULL COMMENT '预借款金额',
  `LEND_PERIOD` decimal(10,0) DEFAULT NULL COMMENT '预借款金额',
  `LEND_NAME` varchar(100) DEFAULT NULL COMMENT '借款人姓名',
  `LEND_PHONE` varchar(50) DEFAULT NULL COMMENT '借款人手机号',
  `LEND_NUMBER` varchar(50) DEFAULT NULL COMMENT '借款人身份证号',
  `LEND_ADDRESS` varchar(300) DEFAULT NULL COMMENT '借款人住址',
  `LEND_MAIL` varchar(50) DEFAULT NULL COMMENT '借款人邮箱',
  `FK_CUST_ID` varchar(100) DEFAULT NULL COMMENT '客户编号',
  `FK_INTO_ID` varchar(100) DEFAULT NULL COMMENT '进件主表ID',
  `FK_INTO_NO` varchar(100) DEFAULT NULL COMMENT '进件编号',
  `LOAN_BANK_CODE` varchar(200) DEFAULT NULL COMMENT '放款开户行代码',
  `LOAN_SUB_BRANCH_NAME` varchar(200) DEFAULT NULL COMMENT '放款开户行支行名称(开户网点)',
  `LOAN_BANK_ACCOUNT` varchar(50) DEFAULT NULL COMMENT '放款账号',
  `LOAN_USER_NAME` varchar(100) DEFAULT NULL COMMENT '放款户名',
  `RECEIVE_BANK_CODE` varchar(100) DEFAULT NULL COMMENT '还款开户行代码',
  `RECEIVE_SUB_BRANCH_NAME` varchar(200) DEFAULT NULL COMMENT '还款开户行支行名称(开户网点)',
  `RECEIVE_BANK_ACCOUNT` varchar(50) DEFAULT NULL COMMENT '还款账号',
  `RECEIVE_USER_NAME` varchar(100) DEFAULT NULL COMMENT '还款户名',
  `LOAN_BANK_RESERVED_PHONE` varchar(20) DEFAULT NULL COMMENT '预留手机号',
  `MONTHLYOVERALLRATE` decimal(10,0) DEFAULT NULL COMMENT '月综合费率',
  `INTERESTTYPE` varchar(100) DEFAULT NULL COMMENT '计息方式',
  `INTERESTRATE` decimal(10,0) DEFAULT NULL COMMENT '利率',
  `QUIRY_RATE` decimal(10,0) DEFAULT NULL COMMENT '服务费',
  `LOAN_RATE` decimal(10,0) DEFAULT NULL COMMENT '贷款利率(%)',
  `REPAYMENT_WAY` varchar(20) DEFAULT NULL COMMENT '还款方式',
  `DAY_DEFAULT_INTEREST` decimal(10,0) DEFAULT NULL COMMENT '日罚息(%);百分比(6位小数)-',
  `PENALTY` decimal(10,0) DEFAULT NULL COMMENT '违约金(%);百分比(2位小数)',
  `PUNITIVE_CALCULATION` varchar(20) DEFAULT NULL COMMENT '罚息计算方式--进件获取',
  `PENALTY_CALCULATION` varchar(20) DEFAULT NULL COMMENT '违约金计算方式 --进件获取',
  `URGENT_RATE` decimal(10,0) DEFAULT NULL COMMENT '加急费率(%);百分比(2位小数)',
  `REPAYDATE_CALCULATION` varchar(20) DEFAULT NULL COMMENT '还款日计算方式--进件获取',
  `loan_channel` varchar(2) DEFAULT NULL COMMENT '放款渠道(1:我司  2：合作机构)',
  `plan_loan_date` date DEFAULT NULL COMMENT '预放款日期-',
  `TOTAL_INTEREST` decimal(10,0) DEFAULT NULL COMMENT '利息总额',
  `REPAYMENT_START_DATE` date DEFAULT NULL COMMENT '还款起始日期',
  `REPAYMENT_END_DATE` date DEFAULT NULL COMMENT '还款到期日期',
  `STATE` varchar(4) DEFAULT NULL COMMENT '合同状态(00：签约中，01：待审核，02：审核通过，03：回退，04：放款中，05：已放款，06：放款失败，07：拒贷，08：客户放弃， 09：正常（正常还款），10：逾期，11：结清，12：撤销)',
  `CREATE_BY` bigint(20) DEFAULT NULL COMMENT '创建人',
  `CREATE_TIME` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `MODIFY_BY` bigint(20) DEFAULT NULL COMMENT '修改人',
  `MODIFY_TIME` timestamp NULL DEFAULT NULL COMMENT '修改时间',
  `valid` varchar(50) DEFAULT NULL COMMENT '有效状态(1有效,0无效)',
  `ORG_ID` bigint(20) DEFAULT NULL COMMENT '数据归属机构',
  `OWNER_ID` bigint(20) DEFAULT NULL COMMENT '数据归属人',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='出借人合同主表';

-- ----------------------------
-- Records of RMT_LEND_CONTRACT
-- ----------------------------

-- ----------------------------
-- Table structure for RMT_LEND_CONTRACT_ATT
-- ----------------------------
DROP TABLE IF EXISTS `RMT_LEND_CONTRACT_ATT`;
CREATE TABLE `RMT_LEND_CONTRACT_ATT` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `FK_LEND_CONTRACT_ID` bigint(20) DEFAULT NULL COMMENT '出借人主表实例ID',
  `FK_LEND_CONTRACT_NUMBER` varchar(50) DEFAULT NULL COMMENT '出借合同编号',
  `FK_SUB_ID` bigint(20) DEFAULT NULL COMMENT '合同子实例ID',
  `CJ_PRODUCT_CODE` varchar(50) DEFAULT NULL COMMENT '合同文件名称',
  `UPLOAD_TIME` timestamp NULL DEFAULT NULL COMMENT '上传时间',
  `FASTDFS_PATH` varchar(1000) DEFAULT NULL COMMENT '影像存储文件路径',
  `TEMPLATECODE` varchar(200) DEFAULT NULL COMMENT '附件类型（也相当于合同模板编码通过它可以锁定到一份协议）',
  `CREATE_BY` bigint(20) DEFAULT NULL COMMENT '创建人',
  `CREATE_TIME` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `MODIFY_BY` bigint(20) DEFAULT NULL COMMENT '修改人',
  `MODIFY_TIME` timestamp NULL DEFAULT NULL COMMENT '修改时间',
  `valid` varchar(50) DEFAULT NULL COMMENT '有效状态(1有效,0无效)',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='出借人合同附件表';

-- ----------------------------
-- Records of RMT_LEND_CONTRACT_ATT
-- ----------------------------

-- ----------------------------
-- Table structure for RMT_LOAN_CONTRACT
-- ----------------------------
DROP TABLE IF EXISTS `RMT_LOAN_CONTRACT`;
CREATE TABLE `RMT_LOAN_CONTRACT` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '借款合同ID',
  `CONTRACT_NO` varchar(100) DEFAULT NULL COMMENT '借款合同编号',
  `LOAN_PRODUCT_CODE` varchar(100) DEFAULT NULL COMMENT '产品编码',
  `REA_MATCH_MONEY` decimal(10,0) DEFAULT NULL COMMENT '实撮合金额(实计划放款金额)',
  `PLAN_LOAN_MONEY` decimal(10,0) DEFAULT NULL COMMENT '预借款金额',
  `LOAN_PERIOD` decimal(10,0) DEFAULT NULL COMMENT '预借款金额',
  `LOAN_NAME` varchar(100) DEFAULT NULL COMMENT '借款人姓名',
  `LOAN_PHONE` varchar(50) DEFAULT NULL COMMENT '借款人手机号',
  `LOAN_NUMBER` varchar(50) DEFAULT NULL COMMENT '借款人身份证号',
  `LOAN_ADDRESS` varchar(300) DEFAULT NULL COMMENT '借款人住址',
  `LOAN_MAIL` varchar(50) DEFAULT NULL COMMENT '借款人邮箱',
  `FK_CUST_ID` varchar(100) DEFAULT NULL COMMENT '客户编号',
  `FK_INTO_ID` varchar(100) DEFAULT NULL COMMENT '进件主表ID',
  `FK_INTO_NO` varchar(100) DEFAULT NULL COMMENT '进件编号',
  `LOAN_BANK_CODE` varchar(200) DEFAULT NULL COMMENT '放款开户行代码',
  `LOAN_SUB_BRANCH_NAME` varchar(200) DEFAULT NULL COMMENT '放款开户行支行名称(开户网点)',
  `LOAN_BANK_ACCOUNT` varchar(50) DEFAULT NULL COMMENT '放款账号',
  `LOAN_USER_NAME` varchar(100) DEFAULT NULL COMMENT '放款户名',
  `RECEIVE_BANK_CODE` varchar(100) DEFAULT NULL COMMENT '还款开户行代码',
  `RECEIVE_SUB_BRANCH_NAME` varchar(200) DEFAULT NULL COMMENT '还款开户行支行名称(开户网点)',
  `RECEIVE_BANK_ACCOUNT` varchar(50) DEFAULT NULL COMMENT '还款账号',
  `RECEIVE_USER_NAME` varchar(100) DEFAULT NULL COMMENT '还款户名',
  `LOAN_BANK_RESERVED_PHONE` varchar(20) DEFAULT NULL COMMENT '预留手机号',
  `MONTHLYOVERALLRATE` decimal(10,0) DEFAULT NULL COMMENT '月综合费率',
  `INTERESTTYPE` varchar(100) DEFAULT NULL COMMENT '计息方式',
  `INTERESTRATE` decimal(10,0) DEFAULT NULL COMMENT '利率',
  `QUIRY_RATE` decimal(10,0) DEFAULT NULL COMMENT '服务费',
  `LOAN_RATE` decimal(10,0) DEFAULT NULL COMMENT '贷款利率(%)',
  `REPAYMENT_WAY` varchar(20) DEFAULT NULL COMMENT '还款方式',
  `DAY_DEFAULT_INTEREST` decimal(10,0) DEFAULT NULL COMMENT '日罚息(%);百分比(6位小数)-',
  `PENALTY` decimal(10,0) DEFAULT NULL COMMENT '违约金(%);百分比(2位小数)',
  `PUNITIVE_CALCULATION` varchar(20) DEFAULT NULL COMMENT '罚息计算方式--进件获取',
  `PENALTY_CALCULATION` varchar(20) DEFAULT NULL COMMENT '违约金计算方式 --进件获取',
  `URGENT_RATE` decimal(10,0) DEFAULT NULL COMMENT '加急费率(%);百分比(2位小数)',
  `REPAYDATE_CALCULATION` varchar(20) DEFAULT NULL COMMENT '还款日计算方式--进件获取',
  `loan_channel` varchar(2) DEFAULT NULL COMMENT '放款渠道(1:我司  2：合作机构)',
  `plan_loan_date` date DEFAULT NULL COMMENT '预放款日期',
  `TOTAL_INTEREST` decimal(10,0) DEFAULT NULL COMMENT '利息总额',
  `REPAYMENT_START_DATE` date DEFAULT NULL COMMENT '还款起始日期 --还款计划接口',
  `REPAYMENT_END_DATE` date DEFAULT NULL COMMENT '还款到期日期 --还款计划接口',
  `STATE` varchar(4) DEFAULT NULL COMMENT '合同状态(00：登记，01：待撮合，02：撮合成功，03：撮合失败，04：放款中，05：已放款，06：放款失败，07：拒贷，08：客户放弃， 09：正常（正常还款），10：逾期，11：结清，12：撤销)',
  `CREATE_BY` bigint(20) DEFAULT NULL COMMENT '创建人',
  `CREATE_TIME` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `MODIFY_BY` bigint(20) DEFAULT NULL COMMENT '修改人',
  `MODIFY_TIME` timestamp NULL DEFAULT NULL COMMENT '修改时间',
  `valid` varchar(50) DEFAULT NULL COMMENT '有效状态(1有效,0无效)',
  `ORG_ID` bigint(20) DEFAULT NULL COMMENT '数据归属机构',
  `OWNER_ID` bigint(20) DEFAULT NULL COMMENT '数据归属人',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='借款人合同主表';

-- ----------------------------
-- Records of RMT_LOAN_CONTRACT
-- ----------------------------

-- ----------------------------
-- Table structure for RMT_LOAN_CONTRACT_ATT
-- ----------------------------
DROP TABLE IF EXISTS `RMT_LOAN_CONTRACT_ATT`;
CREATE TABLE `RMT_LOAN_CONTRACT_ATT` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `FK_LOAN_CONTRACT_ID` bigint(20) DEFAULT NULL COMMENT '借款人主表实例ID',
  `FK_SUB_ID` bigint(20) DEFAULT NULL COMMENT '合同子实例ID',
  `FK_LOAN_CONTRACT_NUMBER` varchar(50) DEFAULT NULL COMMENT '借款合同编号',
  `CJ_PRODUCT_CODE` varchar(50) DEFAULT NULL COMMENT '文件名称',
  `FASTDFS_PATH` varchar(1000) DEFAULT NULL COMMENT '影像存储文件路径',
  `TEMPLATECODE` varchar(200) DEFAULT NULL COMMENT '附件类型（也相当于合同模板编码通过它可以锁定到一份协议）',
  `CREATE_BY` bigint(20) DEFAULT NULL COMMENT '创建人',
  `CREATE_TIME` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `MODIFY_BY` bigint(20) DEFAULT NULL COMMENT '修改人',
  `MODIFY_TIME` timestamp NULL DEFAULT NULL COMMENT '修改时间',
  `valid` varchar(50) DEFAULT NULL COMMENT '有效状态(1有效,0无效)',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='借款人合同附件表';

-- ----------------------------
-- Records of RMT_LOAN_CONTRACT_ATT
-- ----------------------------

-- ----------------------------
-- Table structure for RMT_LOAN_REPAYMENT_PLAN
-- ----------------------------
DROP TABLE IF EXISTS `RMT_LOAN_REPAYMENT_PLAN`;
CREATE TABLE `RMT_LOAN_REPAYMENT_PLAN` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `FK_LOAN_CONTRACT_ID` bigint(20) DEFAULT NULL COMMENT '借款人主表合同ID',
  `FK_LOAN_CONTRACT_NO` varchar(100) DEFAULT NULL COMMENT '借款主表合同编号',
  `REPAYMENT_DATE` date DEFAULT NULL COMMENT '每期还款日期',
  `MONTH_REPAY_AMOUNT` decimal(10,0) DEFAULT NULL COMMENT '月还款金额',
  `MONTH_REPAY_BASE` decimal(10,0) DEFAULT NULL COMMENT '月还本金',
  `MONTH_REPAY_INTEREST` decimal(10,0) DEFAULT NULL COMMENT '月还利息',
  `SURPLUS_MONEY` decimal(10,0) DEFAULT NULL COMMENT '剩余本金',
  `PERIOD_ACTIVE` decimal(10,0) DEFAULT NULL COMMENT '月还款实际利率',
  `RESPOND_REPAY_F001` decimal(10,0) DEFAULT NULL COMMENT '应还服务费',
  `RESPOND_REPAY_F002` decimal(10,0) DEFAULT NULL COMMENT '应还停车费',
  `RESPOND_REPAY_F003` decimal(10,0) DEFAULT NULL COMMENT '应还GPS安装费',
  `RESPOND_REPAY_F004` decimal(10,0) DEFAULT NULL COMMENT '应还GPS拆卸费',
  `RESPOND_REPAY_F005` decimal(10,0) DEFAULT NULL COMMENT '应还抵押登记费',
  `RESPOND_REPAY_F006` decimal(10,0) DEFAULT NULL COMMENT '应还公证费',
  `RESPOND_REPAY_F999` decimal(10,0) DEFAULT NULL COMMENT '应还其他费',
  `PERIOD_TOTAL` decimal(10,0) DEFAULT NULL COMMENT '每期还款合计',
  `PERIOD_EARLIER_REPAY_AMOUNT` decimal(10,0) DEFAULT NULL COMMENT '每期提前还款应还款额',
  `REFUND_SERVICE_FEE` decimal(10,0) DEFAULT NULL COMMENT '每期提前还款应退还服务费',
  `REFUND_TOTAL` decimal(10,0) DEFAULT NULL COMMENT '每期提前还款合计',
  `RESPOND_BACK_F001` decimal(10,0) DEFAULT NULL COMMENT '应退服务费',
  `RESPOND_BACK_F002` decimal(10,0) DEFAULT NULL COMMENT '应退停车费',
  `RESPOND_BACK_F003` decimal(10,0) DEFAULT NULL COMMENT '应退GPS安装费',
  `RESPOND_BACK_F004` decimal(10,0) DEFAULT NULL COMMENT '应退GPS拆卸费',
  `RESPOND_BACK_F005` decimal(10,0) DEFAULT NULL COMMENT '应退抵押登记费',
  `RESPOND_BACK_F006` decimal(10,0) DEFAULT NULL COMMENT '应退公证费',
  `RESPOND_BACK_F999` decimal(10,0) DEFAULT NULL COMMENT '应退其他费',
  `REFUND_FEE` decimal(10,0) DEFAULT NULL COMMENT '提前结清合同减免金额',
  `CREATE_BY` bigint(20) DEFAULT NULL COMMENT '创建人',
  `CREATE_TIME` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='借款人的还款计划';

-- ----------------------------
-- Records of RMT_LOAN_REPAYMENT_PLAN
-- ----------------------------
