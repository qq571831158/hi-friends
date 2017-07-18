package com.hifriends.dao.impl;

import com.hifriends.dao.IUserDAO;
import com.hifriends.model.Userinfo;
//import org.apache.ibatis.session.SqlSession;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.springframework.beans.factory.annotation.Autowired;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by apple on 2017/7/18.
 */
@Repository
public class UserDAOImpl extends BaseDAOImpl<Userinfo> implements IUserDAO {
    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    public SqlSession getSession(){
        return this.sqlSessionFactory.openSession();
    }
    private static final String NAMESPACE = "com.hifriends.dao.UserinfoMapper.";

    public UserDAOImpl(){
        super(NAMESPACE);
    }

    public int updateLastLogin(Userinfo userinfo) {
        return this.getSession().update(NAMESPACE+"updateLastLogin",userinfo);
    }

    public int updateActiveStatusByUsername(String username){

        return this.getSession().update(NAMESPACE+"updateActiveStatusByUsername",username);
    }


}
