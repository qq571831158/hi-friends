package com.hifriends.dao.impl;

import com.hifriends.dao.IUserpoolDAO;
import com.hifriends.model.Userpool;
import org.springframework.stereotype.Repository;

/**
 * Created by apple on 2017/7/18.
 */
@Repository
public class UserpoolDAOImpl extends BaseDAOImpl<Userpool> implements IUserpoolDAO{
    private static final String NAMESPACE = "com.hifriends.dao.UserpoolMapper.";

    public UserpoolDAOImpl(){
        super(NAMESPACE);
    }
}
