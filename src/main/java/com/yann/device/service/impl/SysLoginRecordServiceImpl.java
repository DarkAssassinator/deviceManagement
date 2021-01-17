package com.yann.device.service.impl;

import com.yann.device.mapper.SysLoginRecordMapper;
import com.yann.device.pojo.SysLoginRecord;
import com.yann.device.service.ISysLoginRecordService;
import com.yann.device.utils.ConvertUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @program: device
 * @description: 访问记录服务层处理
 * @author: Yann
 * @created: 2020/11/08 22:19
 */
public class SysLoginRecordServiceImpl implements ISysLoginRecordService {

    @Autowired
    private SysLoginRecordMapper sysLoginRecordMapper;

    /**
     * 新增系统登录日志
     *
     * @param loginRecord 访问日志对象
     */
    @Override
    public void insertLoginRecord(SysLoginRecord loginRecord) {
        sysLoginRecordMapper.insertLoginRecord(loginRecord);
    }

    /**
     * 查询系统登录日志集合
     *
     * @param loginRecord 访问日志对象
     * @return 登录记录集合
     */
    @Override
    public List<SysLoginRecord> selectLoginRecordList(SysLoginRecord loginRecord) {
        return sysLoginRecordMapper.selectLoginRecordList(loginRecord);
    }

    /**
     * 批量删除系统登录日志
     *
     * @param ids 需要删除的数据
     * @return
     */
    @Override
    public int deleteLoginRecordByIds(String ids) {
        return sysLoginRecordMapper.deleteLoginRecordByIds(ConvertUtils.toStrArray(ids));
    }

    /**
     * 清空系统登录日志
     */
    @Override
    public void cleanLoginRecord() {
        sysLoginRecordMapper.cleanLoginRecord();
    }
}

