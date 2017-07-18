package com.gomefinance;

import net.sf.json.JSONObject;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FK {

	private static AmqpTemplate amqpTemplate;
	private static QuequeListener quequeListener;

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:*.xml ");
		amqpTemplate = (AmqpTemplate) ac.getBean("amqpTemplateSend");
		String str = "{\"msgInfo\":\"LoanBankInfo\",\"dataInfo\":{\"appCode\":\"MF201705222300181540\",\"createTime\":\"2017-05-22 23:17:21\",\"custName\":\"许亚丹\",\"custCardNo\":\"410322198601174725\",\"instalments\":9,\"loanAmount\":999,\"custChannelName\":\"美易分\",\"custChannelCode\":\"MYF\",\"applyTypeName\":\"商品分期-外部商户常规\",\"applyTypeCode\":\"6701\",\"originChannelName\":\"外部商户\",\"originChannelCode\":\"20000000\"}}";

		JSONObject jsonObject = JSONObject.fromObject(str);
		
		System.out.println(jsonObject);
		
		amqpTemplate.convertAndSend("cms.mq.key_zhk", jsonObject);
		System.out.println("---end");

	}

	public static String replaceBlank(String str) {

		String dest = "";

		if (str != null) {

			Pattern p = Pattern.compile("\\s*|\t|\r|\n");

			Matcher m = p.matcher(str);

			dest = m.replaceAll("");

		}

		return dest;

	}
}
