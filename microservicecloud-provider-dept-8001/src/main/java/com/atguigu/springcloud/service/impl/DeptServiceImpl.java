

package com.atguigu.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.springcloud.dao.DeptDao;
import com.atguigu.springcloud.entities.Dept;
import com.atguigu.springcloud.service.DeptService;

/**
 * ClassName:DeptServiceImpl <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2019年4月11日 下午2:24:08 <br/>
 * @author   林海冰
 * @version  广州抵奥云信息科技有限公司
 * @since    JDK 1.8
 * @see 	 
 */

@Service
public class DeptServiceImpl implements DeptService
{
 @Autowired
 private DeptDao dao ;
 
 @Override
 public boolean add(Dept dept)
 {
  return dao.addDept(dept);
 }

 @Override
 public Dept get(Long id)
 {
  return dao.findById(id);
 }

 @Override
 public List<Dept> list()
 {
  return dao.findAll();
 }

}



