

package com.atguigu.springcloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.atguigu.springcloud.entities.Dept;

/**
 * ClassName:DeptDao <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2019年4月11日 下午2:15:45 <br/>
 * @author   林海冰
 * @version  广州抵奥云信息科技有限公司
 * @since    JDK 1.8
 * @see 	 
 */
@Mapper
public interface DeptDao
{
  public boolean addDept(Dept dept);
 
  public Dept findById(Long id);
 
  public List<Dept> findAll();
}
