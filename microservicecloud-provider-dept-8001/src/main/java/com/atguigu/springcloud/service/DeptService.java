

package com.atguigu.springcloud.service;

import java.util.List;

import com.atguigu.springcloud.entities.Dept;

/**
 * ClassName:DeptService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2019年4月11日 下午2:23:29 <br/>
 * @author   林海冰
 * @version  广州抵奥云信息科技有限公司
 * @since    JDK 1.8
 * @see 	 
 */
public interface DeptService
{
  public boolean add(Dept dept);
  public Dept    get(Long id);
  public List<Dept> list();
}

