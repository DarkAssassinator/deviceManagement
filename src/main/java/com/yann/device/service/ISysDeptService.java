package com.yann.device.service;


import com.yann.device.pojo.SysDept;
import com.yann.device.pojo.SysLoginRecord;
import com.yann.device.pojo.SysRole;
import com.yann.device.pojo.Ztree;

import java.util.List;

/**
 * @author Yann
 * @title: ISysDeptService
 * @projectName device
 * @description: 部门服务层
 * @date 2020/11/8 20:30
 */
public interface ISysDeptService {
    /**
     * 查询部门管理数据
     *
     * @param dept 部门信息
     * @return 部门信息集合
     */
    public List<SysDept> selectDeptList(SysDept dept);

    /**
     * 查询部门管理树
     *
     * @param dept 部门信息
     * @return 所有部门信息
     */
    public List<Ztree> selectDeptTree(SysDept dept);

    /**
     * 根据角色ID查询菜单
     *
     * @param role 角色对象
     * @return 菜单列表
     */
    public List<Ztree> roleDeptTreeData(SysRole role);

    /**
     * 查询部门人数
     *
     * @param parentId 父部门ID
     * @return 结果
     */
    public int selectDeptCount(Long parentId);

    /**
     * 查询部门是否存在用户
     *
     * @param deptId 部门ID
     * @return 结果 true 存在 false 不存在
     */
    public boolean checkDeptExistUser(Long deptId);

    /**
     * 删除部门管理信息
     *
     * @param deptId 部门ID
     * @return 结果
     */
    public int deleteDeptById(Long deptId);

    /**
     * 新增保存部门信息
     *
     * @param dept 部门信息
     * @return 结果
     */
    public int insertDept(SysDept dept);

    /**
     * 修改保存部门信息
     *
     * @param dept 部门信息
     * @return 结果
     */
    public int updateDept(SysDept dept);

    /**
     * 根据部门ID查询信息
     *
     * @param deptId 部门ID
     * @return 部门信息
     */
    public SysDept selectDeptById(Long deptId);

    /**
     * 校验部门名称是否唯一
     *
     * @param dept 部门信息
     * @return 结果
     */
    public String checkDeptNameUnique(SysDept dept);

    /**
     * @author Yann
     * @title: ISysLoginRecordService
     * @projectName device
     * @description: TODO
     * @date 2020/11/822:12
     */
    interface ISysLoginRecordService {

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
}
