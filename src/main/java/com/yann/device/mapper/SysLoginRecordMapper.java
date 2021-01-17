package com.yann.device.mapper;

import com.yann.device.pojo.SysLoginRecord;

import java.util.List;

/**
 * @author Yann
 * @title: SysLoginRecordMapper
 * @projectName device
 * @description: TODO
 * @date 2020/11/8 21:39
 */
public interface SysLoginRecordMapper {

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
     * @return 结果
     */
    public int deleteLoginRecordByIds(String[] ids);

    /**
     * 清空系统登录日志
     *
     * @return 结果
     */
    public int cleanLoginRecord();
}
