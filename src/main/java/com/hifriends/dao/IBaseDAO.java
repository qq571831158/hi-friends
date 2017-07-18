package com.hifriends.dao;

/**
 * Created by apple on 2017/7/18.
 */
public interface IBaseDAO<T> {
    int deleteByPrimaryKey(String id);

    int insert(T record);

    int insertSelective(T record);

    T selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);
}
