package com.tts.EurekaCalculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.tts.EurekaCalculator.Controller.CalcController;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTest  {
		
	@Autowired
	CalcController calcController;
	
	@Test
	public void getIntergersAndReturnSum() throws Exception {
		assertEquals("The output is 4", calcController.addSum(2,2));
	}
	
//	@Test
//	public void seeIfCaclMethodReturnsErrorWhenInputIsNull() {
//		assertEquals("The output is not available",calcController.addSum(4, ));
//	}
	
}
