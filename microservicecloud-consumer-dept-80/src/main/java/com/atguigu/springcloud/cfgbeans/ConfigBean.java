

package com.atguigu.springcloud.cfgbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * ClassName:ConfigBean <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2019年4月11日 下午2:59:03 <br/>
 * @author   林海冰
 * @version  广州抵奥云信息科技有限公司
 * @since    JDK 1.8
 * @see 	 
 */
@Configuration
public class ConfigBean {
	@Bean
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}
}

