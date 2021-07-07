package com.task.calc;

import com.task.calc.controller.CalcController;
import com.task.calc.entity.Calculator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CalcApplicationTests {

	@Autowired
	public CalcController service;

	Calculator test;
	@Test
	public void test_POSITIVE_AddMethod_ON_ProjectController() {
		int[][] data = {{20, 10}, {10, 10}, {10, 5}, {200, 10}};
		String[] inOperation = {"+", "-", "*", "/"};
		double[] result = {30.0, 0.0, 50.0, 20.0};
		for (int i = 0; i < data.length; i++) {
			test = new Calculator(data[i][0], data[i][1], inOperation[i]);
			assertEquals(result[i] , service.Calc(test), "Error at iteration no: " + (i + 1));

		}
	}

}
