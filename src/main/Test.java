package main;

import java.io.File;

import util.Utility;




public class Test {
	
	

	
//	@org.junit.Test
//	public void test2(){
//		String filePath = "TestCases/examples/test1";
//		SearchCase case1 = new SearchCase(filePath);
//	}
//	
//	@org.junit.Test
//	public void test3(){
//		String filePath = "TestCases/examples/test2";
//		SearchCase case1 = new SearchCase(filePath);
//	}
//	
//	@org.junit.Test
//	public void test4(){
//		String filePath = "TestCases/examples/median";
//		SearchCase case1 = new SearchCase("TestCases/examples/median");
//	}
//	
//	
//	@org.junit.Test
//	public void test5(){
//		String filePath = "TestCases/examples/smallest";
//		SearchCase case1 = new SearchCase("TestCases/examples/smallest");
//	}
//	
//	@org.junit.Test
//	public void test6(){
//		String filePath = "TestCases/examples/grade";
//		SearchCase case1 = new SearchCase("TestCases/examples/grade");
//	}
//	
//	@org.junit.Test
//	public void testRecursion(){
//		String filePath = "TestCases/examples/test6";
//		SearchCase case1 = new SearchCase(filePath);
//	}
//	
//	@org.junit.Test
//	public void test7(){
//		String filePath = "testCases/examples/returnTest";
//		SearchCase case1 = new SearchCase(filePath);
//	}
//	
//	
//	@org.junit.Test
//	public void test8(){
//		String filePath = "testCases/examples/returnRecursion";
//		SearchCase case1 = new SearchCase(filePath);
//	}
//	
//	
//	@org.junit.Test
//	public void test9(){
//		String filePath = "testCases/examples/scrape";
//		SearchCase case1 = new SearchCase(filePath);
//	}
//	
//
//	
//	@org.junit.Test
//	public void test10(){
//		String filePath = "testCases/examples/medianBug";
//		SearchCase case1 = new SearchCase(filePath);
//	}
//	
//	
//	@org.junit.Test
//	public void test11(){
//		String filePath = "testCases/all/4median";
//		SearchCase case1 = new SearchCase(filePath);
//	}
//	
//	
//	@org.junit.Test
//	public void test12(){
//		String filePath = "testCases/all/5median";
//		SearchCase case1 = new SearchCase(filePath);
//	}
//	
//	
//
//	
//
//	
//	
//	@org.junit.Test
//	public void test13(){
//		String filePath = "testCases/all/0smallest";
//		SearchCase case1 = new SearchCase(filePath);
//	}
//	
//	
//	@org.junit.Test
//	public void test14(){
//		String filePath = "testCases/all/1smallest";
//		SearchCase case1 = new SearchCase(filePath);
//	}
//	
//	
//	@org.junit.Test
//	public void test15(){
//		String filePath = "testCases/all/2smallest";
//		SearchCase case1 = new SearchCase(filePath);
//	}
//	
//
//	
//	@org.junit.Test
//	public void test16(){
//		String filePath = "testCases/all/3smallest";
//		SearchCase case1 = new SearchCase(filePath);
//	}
//	
//	
//	@org.junit.Test
//	public void test17(){
//		String filePath = "testCases/all/4smallest";
//		SearchCase case1 = new SearchCase(filePath);
//	}
//	
//	
//	@org.junit.Test
//	public void test18(){
//		String filePath = "testCases/all/5smallest";
//		SearchCase case1 = new SearchCase(filePath);
//	}
	
	
	
	
	
	
	
	
	
	
	
	@org.junit.Test
	public void createTestCases(){
		String input = "./repository/future";
		String output = "./repository/future2";
		int count = 200;
		for(File file : new File(input).listFiles()){
			String path = file.getAbsolutePath();
			String name = "test" + (count++) + ".c";
			Utility.copy(path, output + "/" + name);
		}
	}
}


