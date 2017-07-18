package com.hifriends.dao.impl;

import com.hifriends.dao.IEmailCodeDAO;
import com.hifriends.model.EmailCode;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by apple on 2017/7/18.
 */
@Repository
public class EmailCodeDAOImpl extends BaseDAOImpl<EmailCode> implements IEmailCodeDAO {
    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    public SqlSession getSession(){
        return this.sqlSessionFactory.openSession();
    }

    private static final String NAPESPACE = "com.hifriends.dao.EmailCodeMapper.";
    public EmailCodeDAOImpl(){
        super(NAPESPACE);
    }

    public EmailCode selectByUsername(String username) {
        return this.getSession().selectOne(NAPESPACE+"selectByUsername",username);
    }
}
