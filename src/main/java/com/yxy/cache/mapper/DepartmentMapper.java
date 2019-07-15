package com.yxy.cache.mapper;

import com.yxy.cache.bean.Department;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author yuxiangying
 * @description TODO
 * @date 2019/7/11
 * @vesion 1.0
 */
@Mapper
public interface DepartmentMapper {
    @Select("SELECT * FROM department where id=#{id}")
    public Department getDeptById(Integer id);
}
