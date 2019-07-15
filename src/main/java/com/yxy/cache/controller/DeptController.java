package com.yxy.cache.controller;

import com.yxy.cache.bean.Department;
import com.yxy.cache.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 余想英
 * @version V1.0
 * @ClassName: DeptController
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @date: 2019年07月15日 14:35
 * @Copyright: 2019 www.ti-t.cn Inc. All rights reserved.
 * 注意：本内容仅限于福建创昱达信息技术有限公司内部传阅，禁止外泄以及用于其他的商业目
 **/
@RestController
public class DeptController {

    @Autowired
    DeptService deptService;

    @GetMapping("/dept/{id}")
    public Department getDept(@PathVariable("id")Integer id){
        Department deptById = deptService.getDeptById(id);
        return deptById;
    }
}
