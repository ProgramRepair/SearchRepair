package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import Experiment.SearchCase;




public class Test {
	
	

	
	@org.junit.Test
	public void test2(){
		String filePath = "TestCases/examples/test1";
		SearchCase case1 = new SearchCase(filePath);
	}
	
	@org.junit.Test
	public void test3(){
		String filePath = "TestCases/examples/test2";
		SearchCase case1 = new SearchCase(filePath);
	}
	
	@org.junit.Test
	public void test4(){
		String filePath = "TestCases/examples/median";
		SearchCase case1 = new SearchCase("TestCases/examples/median");
	}
	
	
	@org.junit.Test
	public void test5(){
		String filePath = "TestCases/examples/smallest";
		SearchCase case1 = new SearchCase("TestCases/examples/smallest");
	}
	
	@org.junit.Test
	public void test6(){
		String filePath = "TestCases/examples/grade";
		SearchCase case1 = new SearchCase("TestCases/examples/grade");
	}
	
	@org.junit.Test
	public void testRecursion(){
		String filePath = "TestCases/examples/test6";
		SearchCase case1 = new SearchCase(filePath);
	}
	
	@org.junit.Test
	public void test7(){
		String filePath = "testCases/examples/returnTest";
		SearchCase case1 = new SearchCase(filePath);
	}
	
	
	@org.junit.Test
	public void test8(){
		String filePath = "testCases/examples/returnRecursion";
		SearchCase case1 = new SearchCase(filePath);
	}
	
	
	@org.junit.Test
	public void test9(){
		String filePath = "testCases/examples/scrape";
		SearchCase case1 = new SearchCase(filePath);
	}
	

	
	@org.junit.Test
	public void test10(){
		String filePath = "testCases/examples/medianBug";
		SearchCase case1 = new SearchCase(filePath);
	}
	
	
	@org.junit.Test
	public void test11(){
		String filePath = "testCases/all/4median";
		SearchCase case1 = new SearchCase(filePath);
	}
	
	
	@org.junit.Test
	public void test12(){
		String filePath = "testCases/all/5median";
		SearchCase case1 = new SearchCase(filePath);
	}
	
	

	

	
	
	@org.junit.Test
	public void test13(){
		String filePath = "testCases/all/0smallest";
		SearchCase case1 = new SearchCase(filePath);
	}
	
	
	@org.junit.Test
	public void test14(){
		String filePath = "testCases/all/1smallest";
		SearchCase case1 = new SearchCase(filePath);
	}
	
	
	@org.junit.Test
	public void test15(){
		String filePath = "testCases/all/2smallest";
		SearchCase case1 = new SearchCase(filePath);
	}
	

	
	@org.junit.Test
	public void test16(){
		String filePath = "testCases/all/3smallest";
		SearchCase case1 = new SearchCase(filePath);
	}
	
	
	@org.junit.Test
	public void test17(){
		String filePath = "testCases/all/4smallest";
		SearchCase case1 = new SearchCase(filePath);
	}
	
	
	@org.junit.Test
	public void test18(){
		String filePath = "testCases/all/5smallest";
		SearchCase case1 = new SearchCase(filePath);
	}
	
	
	
	
	
	
	
	
	
	
	
	@org.junit.Test
	public void createTestCases(){
		String folder = "testcases/examples";
		File dir = new File(folder);
		for(int i = 0; i < 15; i++)
			for(File file : dir.listFiles()){
				try{
					String name = file.getName();
					System.out.println(name);
					if(!name.contains("grade") && !name.contains("smallest") && !name.contains("median") ) continue;
					BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
					BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("testcases/repository test cases/" + i  + name)));
					String s = null;
					while((s = br.readLine()) != null){
						bw.write(s);
						bw.write("\n");
						bw.flush();
					}
					br.close();
					bw.close();
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		}
	}


