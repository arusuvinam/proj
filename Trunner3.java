package org.proj;

import java.util.Date;

import org.lll.PojoC;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Trunner3 {
	public class Trunner extends BaseClass {
		
		@Test
		private void tc1() {
			System.out.println("test case1");
			
		}
		@Test
		private void tc2() throws InterruptedException {
			Pojo l=new Pojo();
			sending(l.getText(),"toys");
			Thread.sleep(100);
			clicking(l.getSearch());
			
		
			}
		
		@Test
		private void tc3() {
			Pojo l=new Pojo();
			clicking(l.getDoll());
			

		}
			


		
		@BeforeClass
		private void befor() {
			openChrome();
			openWebpage("https://thulo.com/");
			maxWindow();

		}
	}}
	
