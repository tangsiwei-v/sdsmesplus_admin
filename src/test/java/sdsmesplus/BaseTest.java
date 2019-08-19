/**
 * @Title: BaseTest.java 
 * @Package natiefu_mes 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author lihuan lihuanwk@126.com
 * @date 2018年8月1日 下午10:03:57 
 * @version V1.0 
 */
package sdsmesplus;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/** 
 * @ClassName: BaseTest 
 * @Description: 测试基类
 * @author lihuan lihuan@uspring.cn 
 * @date 2018年8月1日 下午10:03:57 
 *  
 */

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration("classpath:spring-context.xml")
public class BaseTest extends AbstractJUnit4SpringContextTests{

}
