package com.framework.demo;
import org.springframework.web.client.RestTemplate;
import com.rest.wsClient.Input;
import com.rest.wsClient.Output;

public class RestClientMain {

	public static void main(String[] args) {
	//changes
		//	testAdd();
	//	testSub();
		
	//	testMultiplyJsonReq();
		testJsonRes();
	}
	public static void testAdd() {
		RestTemplate getTest=new RestTemplate(); // similar to soap stub program
		int res=getTest.getForObject("http://localhost/addCal/10/20", Integer.class);
		System.out.println("Add rest service result :"+res);
	}
	public static void testSub() {
		RestTemplate getTest=new RestTemplate();
		int res=getTest.getForObject("http://localhost/subCal?param1=100&param2=20", Integer.class);
		System.out.println("Sub rest service result :"+res);
	}
	public static void testMultiplyJsonReq()
	{
		RestTemplate postTest=new RestTemplate();
		Input input=new Input();
		input.param1=20; 
		input.param2=50; 
		// { "param1":10 , "param2":50 }
		int res=postTest.postForObject("http://localhost/jsonReqMul", input,Integer.class);
		System.out.println("Mul rest service with json input result:"+res);
	}
	public static void testJsonRes()
	{
		RestTemplate postTest=new RestTemplate();
		Output res=postTest.getForObject("http://localhost/jsonRes/10/5", Output.class);
		/*
		{
		    "sum": 15,
		    "sub": 5,
		    "mul": 50,
		    "div": 2
		}
		*/
		System.out.println(res.sum);
		System.out.println(res.sub);
		System.out.println(res.mul);
		System.out.println(res.div);
		
		
	}
}
