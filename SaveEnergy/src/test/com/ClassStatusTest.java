package com;

import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import classStatus.pojo.ClassStatus;
import classStatus.service.impl.ClassStatusServiceImpl;

public class ClassStatusTest {
	@Autowired
	private ClassStatusServiceImpl cls;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void queryAllStatus() {
		List<ClassStatus> list=cls.queryAllClassroomStatus();
		for(ClassStatus cla:list) {
			System.out.println(cla.toString());
		}
	}

}
