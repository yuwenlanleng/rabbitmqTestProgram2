package com.gomefinance.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;

/**
 * Created by Administrator on 2017/6/2.
 */
       public class Dao extends JdbcDaoSupport {

    /**
     * 查询systemINfolog中的mq消息
     * @param type
     * @return
     */
    public List<String> findMqMessages(String type){
               String sql = "SELECT MESSAGE_BODY FROM  ecms_system_infolog WHERE OPER_CODE ="+type+" AND OPER_RESULT = 'Y' " +
                       " AND BUSINESS_ID  = 'GMMJ-smallstage-app-20170620224413107714178' ";
               return  this.getJdbcTemplate().queryForList(sql,String.class );
   }
}
