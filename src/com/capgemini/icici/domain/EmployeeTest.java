package com.capgemini.icici.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest {
Employee employee;
@BeforeEach
void setUp(){
	employee = new Employee(68,"sam");
}
	@Test
	void test() {
		assertEquals(18600,employee.salaryCalculation(10000,5000));
	}

}
