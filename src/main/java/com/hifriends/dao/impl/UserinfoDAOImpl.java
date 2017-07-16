package com.hifriends.dao.impl;

import com.hifriends.dao.UserinfoDAO;
import com.hifriends.model.Userinfo;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by apple on 2017/7/16.
 */
@Repository
public class UserinfoDAOImpl implements UserinfoDAO {
    private final static String NAMESPACE = "com.ch.mapping.UserinfoMapper.";

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    public SqlSession getSession(){
        return  this.sqlSessionFactory.openSession();
    }

    public UserinfoDAOImpl() {
        super();
    }

    public Userinfo selectOne(String username) {
        return this.getSession().selectOne(NAMESPACE+"selectOne",username);
    }

    public void insert(Userinfo userinfo) {

    }

    public void updateOne(Userinfo userinfo) {

    }

    public void delete(String username) {

    }
}
