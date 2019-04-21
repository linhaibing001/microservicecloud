

package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * ClassName:EurekaServer7001_App <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2019年4月11日 下午4:40:47 <br/>
 * @author   林海冰
 * @version  广州抵奥云信息科技有限公司
 * @since    JDK 1.8
 * @see 	 
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7001_App {
	public static void main(String[] args) {
		SpringApplication.run(EurekaServer7001_App.class, args);
	}
}

