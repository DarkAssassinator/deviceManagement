package com.yann.device.service;

import com.yann.device.pojo.SysLoginRecord;

import java.util.List;

/**
 * @author Yann
 * @title: ISysLoginRecordService
 * @projectName device
 * @description: TODO
 * @date 2020/11/822:15
 */
public interface ISysLoginRecordService {
    /**
     * 新增系统登录日志
     *
     * @param loginRecord 访问日志对象
     */
    public void insertLoginRecord(SysLoginRecord loginRecord);

    /**
     * 查询系统登录日志集合
     *
     * @param loginRecord 访问日志对象
     * @return 登录记录集合
     */
    public List<SysLoginRecord> selectLoginRecordList(SysLoginRecord loginRecord);

    /**
     * 批量删除系统登录日志
     *
     * @param ids 需要删除的数据
     * @return
     */
    public int deleteLoginRecordByIds(String ids);

    /**
     * 清空系统登录日志
     */
    public void cleanLoginRecord();
}
