/**
 * @Title: ShiftServiceTest.java 
 * @Package sdsmesplus.service.test 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author lihuan lihuanwk@126.com
 * @date 2019年6月29日 上午10:31:36 
 * @version V1.0 
 */
package sdsmesplus.service.test;

import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.uspring.sdsmesplus.common.DateUtils;
import com.uspring.sdsmesplus.entity.po.ShiftPO;
import com.uspring.sdsmesplus.service.ShiftService;

import sdsmesplus.BaseTest;

/** 
 * @ClassName: ShiftServiceTest 
 * @Description: 班次服务测试类
 * @author lihuan lihuan@uspring.cn 
 * @date 2019年6月29日 上午10:31:36 
 *  
 */
public class ShiftServiceTest extends BaseTest{

	@Autowired
	private ShiftService shiftService;
	
	private int fcId = 1;
	
	private Date time = new Date();
	
	@Test
	public void getShiftOfTimeTest(){
		ShiftPO shift = shiftService.getShiftOfTime(time, fcId);
		System.out.println(shift.getSfName());
	}
	
	@Test
	public void getShiftDateOfTimeTest(){
		Date shiftDay = shiftService.getShiftDateOfTime(time, fcId);
		System.out.println("Shift Day is: " + DateUtils.sdf_yMd.format(shiftDay));
	}
	
	@Test
	public void getShiftTimeTest(){
		ShiftPO shift = shiftService.getShiftOfTime(time, fcId);
		Date shiftDay = shiftService.getShiftDateOfTime(time, fcId);
		Date shiftStartTime = shiftService.getShiftStartTime(shiftDay, shift);
		Date shiftEndTime = shiftService.getShiftEndTime(shiftDay, shift);
		
		System.out.println("Shift start Time is : " + DateUtils.sdf_yMdHms.format(shiftStartTime));
		System.out.println("Shift end Time is : " + DateUtils.sdf_yMdHms.format(shiftEndTime));
	}
}
