package com.chenyanwu.erp.erpframework.dao.rbac;

import java.util.List;
import com.chenyanwu.erp.erpframework.entity.rbac.ErpRoleUser;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.additional.insert.InsertListMapper;

/**
* <p>
    * </p>
*
* @author chenyanwu
* @date 2019-02-27 17:28:29
* @version
*/
public interface ErpRoleUserMapper extends Mapper<ErpRoleUser>,InsertListMapper<ErpRoleUser> {


}