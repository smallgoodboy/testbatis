package com.ql.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;

/**
 * Created by smallgoodboy on 2017/8/16.
 */
public class TestDao {

    @Autowired
    private SqlMapClientTemplate sqlMapClientTemplate;

    public void insert(String a){
        sqlMapClientTemplate.insert("testinsert", a);
    }

    public SqlMapClientTemplate getSqlMapClientTemplate() {
        return sqlMapClientTemplate;
    }

    public void setSqlMapClientTemplate(SqlMapClientTemplate sqlMapClientTemplate) {
        this.sqlMapClientTemplate = sqlMapClientTemplate;
    }
}
