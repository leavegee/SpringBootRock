package com.yingu.nativeservice.contractservice;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestString {

	@Test
	public void test() {
		//fail("Not yet implemented");
		String s = "\"{\"id\":\"475ACC86D8A848F8B267959B4CFA5F99\",\"input_customer_name\":\"田宏\",\"input_idcard_number\":\"432425197501032813\",\"input_customer_phone\":\"13334566543\",\"input_customer_home_addr\":\"额额\",\"input_customer_corp\":\"是\",\"input_customer_corp_addr\":\"问问\",\"input_customer_hukou_addr\":\"温柔\",\"input_customer_contact_list\":\"{\\\"Contact\\\":[{\\\"relation\\\":\\\"母亲\\\",\\\"phone\\\":\\\"13787656789\\\",\\\"name\\\":\\\"和人\\\"}]}\",\"final_score\":11.0,\"final_decision\":\"Accept\",\"report_id\":\"ER2016112216403417874199\",\"apply_time\":1479804034000,\"report_time\":1479804035000,\"id_card_address\":\"湖南省常德地区临澧县\",\"mobile_address\":\"null\",\"risk_items\":\"[{\\\"risk_level\\\":\\\"low\\\",\\\"item_detail\\\":{\\\"frequency_detail_list\\\":[{\\\"detail\\\":\\\"3个月身份证关联家庭地址数：0\\\"},{\\\"detail\\\":\\\"3个月身份证关联邮箱数：0\\\"},{\\\"data\\\":[\\\"13345678901\\\",\\\"13334566543\\\"],\\\"detail\\\":\\\"3个月身份证关联手机号数：2\\\"}],\\\"type\\\":\\\"frequency_detail\\\"},\\\"item_id\\\":300166,\\\"item_name\\\":\\\"3个月内身份证关联多个申请信息\\\",\\\"group\\\":\\\"客户行为检测\\\"},{\\\"risk_level\\\":\\\"low\\\",\\\"item_detail\\\":{\\\"frequency_detail_list\\\":[{\\\"detail\\\":\\\"7天内手机号申请次数：1\\\"}],\\\"type\\\":\\\"frequency_detail\\\"},\\\"item_id\\\":300182,\\\"item_name\\\":\\\"7天内设备或身份证或手机号申请次数过多\\\",\\\"group\\\":\\\"客户行为检测\\\"}]\",\"inputInfoDigest\":\"d4cd146f2e47c9e0b057e6d4ab50183a\",\"message\":\"null\",\"createTimeStamp\":\"Nov 22, 2016 11:30:42 AM\"}\"";
		System.out.println(s);
		
		String ss = s.replaceAll("\"\\{", "{");
		 ss = ss.replaceAll("\\}\"", "}");
		ss = ss.replaceAll("\\\\", "");
		System.out.println(ss);
	}

}
