package com.gomefinance;


import net.sf.json.JSONObject;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

/**
 * Created by Administrator on 2017/3/27.
 */
public class QuequeListener implements MessageListener {
    private static int i =0;
    @Override
    public void onMessage(Message message) {

        byte[] body = message.getBody();
        String s = new String(body);
        JSONObject jb = JSONObject.fromObject(s);
        String msgInfo = (String) jb.get("msgInfo");
        System.out.println(msgInfo);

        JSONObject dataInfo = (JSONObject)jb.get("dataInfo");

        System.out.println(dataInfo.get("orgCode"));

        i++;
        System.out.println("已经接受消息:" + i + "条");
    }
}
