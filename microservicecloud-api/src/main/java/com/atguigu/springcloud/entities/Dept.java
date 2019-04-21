

package com.atguigu.springcloud.entities;

import java.io.Serializable;

/**
 * ClassName:Dept <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2019年4月11日 下午2:18:07 <br/>
 * @author   林海冰
 * @version  广州抵奥云信息科技有限公司
 * @since    JDK 1.8
 * @see 	 
 */

public class Dept implements  Serializable //必须序列化
{
  private Long  deptno;   //主键
  private String  dname;   //部门名称
  private String  db_source;//来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库
  
  
  public Dept() {
	super();
}


public Dept(String dname)
  {
   super();
   this.dname = dname;
  }

  
public Dept(Long deptno, String dname, String db_source) {
	super();
	this.deptno = deptno;
	this.dname = dname;
	this.db_source = db_source;
}


public Long getDeptno() {
	return deptno;
}

public void setDeptno(Long deptno) {
	this.deptno = deptno;
}

public String getDname() {
	return dname;
}

public void setDname(String dname) {
	this.dname = dname;
}

public String getDb_source() {
	return db_source;
}

public void setDb_source(String db_source) {
	this.db_source = db_source;
}
  
}