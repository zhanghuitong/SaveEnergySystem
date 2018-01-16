package com;

import java.lang.reflect.Field;

import classStatus.pojo.ClassStatus;

/**
 * 获取类中的成员方法名
 * @author 惠通
 *
 */
public class GetNameTest {
	
	public static void getName(Object obj) {
		Field[] fields=obj.getClass().getDeclaredFields();
		for(int i=0;i<fields.length;i++) {
			System.out.println("变量名:"+fields[i].getName());
		}
	}
	public static void main(String[] args) {
		ClassStatus cls=new ClassStatus();
		GetNameTest.getName(cls);
	}
}
