package com.study.study_springboots.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.study_springboots.dao.AttachFileDao;

@Service
public class AttachFileService { // 비지니스를 담당
    @Autowired
    AttachFileDao attachFileDao;

    public Object deleteAndGetList(Object dataMap) { // 이 펑션을 보면 service가 왜 필요한가를 알수 있다. 두가지를 동시에 진행할때 service가 필요하다.
        Object result = this.delete(dataMap); /* 이미 이 클래스 내에서 delete가 있기 때문 */
        result = this.getList(dataMap);
        return result;
    }

    public Object insertWithFilesAndGetList(Object dataMap) { // 이 펑션을 보면 service가 왜 필요한가를 알수 있다. 두가지를 동시에 진행할때 service가
        // insert files
        Object result = this.insertOne(dataMap); /* 이미 이 클래스 내에서 delete가 있기 때문 */
        result = this.getList(dataMap);
        return result;
    }

    public Object getList(Object dataMap) {
        String sqlMapId = "AttachFile.selectListByUID";
        Object result = attachFileDao.getList(sqlMapId, dataMap);
        return result;
    }

    public Object getOne(Object dataMap) {
        String sqlMapId = "AttachFile.selectByUID";

        Object result = attachFileDao.getOne(sqlMapId, dataMap);
        return result;
    }

    public Object updateOne(Object dataMap) {
        String sqlMapId = "AttachFile.updateByUID";
        Object result = attachFileDao.update(sqlMapId, dataMap);
        return result;
    }

    public Object updateAndGetList(Object dataMap) {
        Object result = this.updateOne(dataMap);
        result = this.getList(dataMap);
        return result;
    }

    public Object insertOne(Object dataMap) {
        String sqlMapId = "AttachFile.insertWithUID";
        Object result = attachFileDao.insert(sqlMapId, dataMap);
        return result;
    }

    public Object insertMulti(Object dataMap) {
        String sqlMapId = "AttachFile.insertMulti";
        Object result = attachFileDao.insert(sqlMapId, dataMap);
        return result;
    }

    public Object delete(Object dataMap) {
        String sqlMapId = "AttachFile.deleteByUID";
        Object result = attachFileDao.delete(sqlMapId, dataMap);
        return result;
    }

    public Object deleteMulti(Object dataMap) {
        String sqlMapId = "AttachFile.deleteMultiByUIDs";
        Object result = attachFileDao.delete(sqlMapId, dataMap);
        return result;
    }
}
