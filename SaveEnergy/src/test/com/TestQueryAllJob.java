package com;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import classStatus.service.impl.QuartzServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classPath:config/spring-mybatis.xml")
public class TestQueryAllJob {
	
	@Autowired
	private QuartzServiceImpl quartz;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		quartz.queryAllJob();
	}

}
