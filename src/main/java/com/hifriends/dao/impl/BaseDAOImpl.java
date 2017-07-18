package com.hifriends.dao.impl;

import com.hifriends.dao.IBaseDAO;
import com.hifriends.model.Userinfo;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by apple on 2017/7/18.
 */
public class BaseDAOImpl<T> implements IBaseDAO<T> {
    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    public SqlSession getSqlSession(){
        return this.sqlSessionFactory.openSession();
    }

    private String namespace;
    public BaseDAOImpl(){}
    public BaseDAOImpl(String namespace){
        this.namespace = namespace;
    }
    public int deleteByPrimaryKey(String id) {
        return 0;
    }

    public int insert(T record) {
        return 0;
    }

    public int insertSelective(T record) {
        return this.getSqlSession().insert(namespace+"insertSelective",record);
    }

    public T selectByPrimaryKey(String id) {
        System.out.println("执行到这儿啦"+namespace);
        return this.getSqlSession().selectOne(namespace+"selectByPrimaryKey",id);

    }

    public int updateByPrimaryKeySelective(T record) {
         return this.getSqlSession().selectOne(namespace+"updateByPrimaryKeySelective",record);
    }

    public int updateByPrimaryKey(T record) {
        return 0;
    }
}
