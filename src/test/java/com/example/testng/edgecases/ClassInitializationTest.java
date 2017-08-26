package com.example.testng.edgecases;

import org.testng.annotations.Test;

import com.example.edgecases.ClassInitialization;

public class ClassInitializationTest {

	/**
	 * The order: parent static, static parent, block parent, constructor, block,
	 * constructor
	 */
	@Test
	public void testInitialization() {
		new ClassInitialization();
	}
}
