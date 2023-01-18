package com.study.study_springboots.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// @Repository
@Component
public class CommonCodeDaoJinsu {
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    public Object getList() {
        String statement = "CommonCodeJinsu.selectCommon_Code_idNameOrder_Number";
        Object object = sqlSessionTemplate.selectList(statement);
        return object;
    }
}
