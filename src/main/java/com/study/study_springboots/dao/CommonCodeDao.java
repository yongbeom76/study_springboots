package com.study.study_springboots.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CommonCodeDao {

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate; // MyBatis 활용하기 위한 준비

    public Object getList() {
        String statement = "CommonCode.selectList";
        Object resultMap = sqlSessionTemplate.selectList(statement);
        return resultMap;
    }
}
