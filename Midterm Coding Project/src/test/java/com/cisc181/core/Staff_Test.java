package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import com.cisc181.core.Student;
import com.cisc181.eNums.eTitle;

import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
	
	}

	
	@Test
	public void test() throws PearsonException {
		ArrayList<Staff> list = new ArrayList<Staff>();
		
		Staff test1 = new Staff("Dean", "", "Hua", null, "mill", "302-897-2231", "deann@udel.edu", "Monday", 1, 60000, null, eTitle.MR);
		Staff test2 = new Staff("Dean", "", "Hua", null, "mill", "302-897-2231", "bolihua@udel.edu", "Sunday", 1, 40000, null, eTitle.MR);
		Staff test3 = new Staff("Dean", "", "Hua", null, "retreat", "302-897-2231", "deann@udel.edu", "Tuesday", 1, 90000, null, eTitle.MR);
		Staff test4 = new Staff("Dean", "", "Hua", null, "one easton", "302-897-2231", "bolihua@udel.edu", "Monday", 1, 70000, null, eTitle.MR);
		Staff test5 = new Staff("Dean", "", "Hua", null, "campus", "302-897-2231", "deann@udel.edu", "Sunday", 1, 100000, null, eTitle.MR);
		list.add(test1);
		list.add(test2);
		list.add(test3);
		list.add(test4);
		list.add(test5);
		
		double average = (test1.getSalary() + test2.getSalary() + test3.getSalary() + test4.getSalary() + test5.getSalary()) / 5;
		assertEquals(average, 90000);
	}	
}