package com.yingu.config;

public class Test {
	
	static String s = "1、北京市维世达诊所，距离约67米，北京市朝阳区光华路一号嘉里中心商场三层2、时代星联口腔，距离约91米，光华路丙12号数码01大厦3层3013、北京瑞特口腔，距离约181米，朝阳区东三环中路9号富尔大厦2楼206号";
	
	public static void main(String[] args) {
		formatGeo(s);
	}

	public static String formatGeo(String str) {
		String[] ss = str.split("[1-9]{1,}、");
		String[] sss = new String[ss.length-1];
		for(int i=1;i<ss.length;i++){
			sss[i-1] = ss[i];
		}
		StringBuilder geo = new StringBuilder();
		for(int i=0;i<sss.length;i++){
			geo.append(i+1).append(".").append(sss[i]).append("</br>");
		}
		System.out.println(geo.toString());
		return geo.toString();
	}
}
