package com.project.notation.rpnNotationTest;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.project.notation.rpnNotation.RpnNotation;
import com.project.notation.rpnNotation.RpnNotationConfig;




@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader = AnnotationConfigContextLoader.class, classes = RpnNotationConfig.class)
public class RpnNotationTest {

	@Autowired
	private RpnNotation rpnNotation;

	@Test
	public void RpnNotationTest2() {
		assertEquals(new BigDecimal(6), rpnNotation.factorial(new BigDecimal(3)));
	}

	@Test
	public void RpnNotationTest3() {
		assertEquals(new BigDecimal(8), rpnNotation.exponent(new BigDecimal(2), new BigDecimal(3)));
	}

	@Test
	public void RpnNotationTest4() {
		assertEquals("8", rpnNotation.executeCode("5 3 +"));
	}
}
