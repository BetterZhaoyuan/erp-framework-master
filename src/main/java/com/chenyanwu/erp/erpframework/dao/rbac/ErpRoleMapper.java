package com.chenyanwu.erp.erpframework.dao.rbac;

import com.chenyanwu.erp.erpframework.entity.rbac.ErpRole;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.additional.insert.InsertListMapper;

/**
* <p>
    * </p>
*
* @author chenyanwu
* @date 2019-02-21 17:39:55
* @version
*/
public interface ErpRoleMapper extends Mapper<ErpRole>,InsertListMapper<ErpRole> {


}