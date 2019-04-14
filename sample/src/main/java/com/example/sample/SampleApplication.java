package com.example.sample;

import com.example.sample.dao.DataBase;
import com.example.sample.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import secondTask.Item;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@Configuration
//@PropertySource({"classpath:database.properties","classpath:email.properties"})

public class SampleApplication {
	public static void
	/*		@PropertySources({
			@PropertySource("classpath:database.properties"),
			@PropertySource("classpath:email.properties")
	})*/
	main(String[] args) {
		ConfigurableApplicationContext cnt = SpringApplication.run(SampleApplication.class, args);
		SampleApplication objCls=new SampleApplication();
		objCls.getDataitem();
		HashMap<String,String> map=new HashMap<String, String>();
		map.put("Item "," Apple");


//		Item itemObj=(Item) cnt.getBean(Item.class);
//		System.out.println(itemObj.getItem1());
//		DataBase db=(DataBase) cnt.getBean(DataBase.class);
//		System.out.println("Name : "+db.getName()+"\n  Pasword  : "+db.getPassword());
//
//		Contact cn=(Contact)cnt.getBean(Contact.class);
//		System.out.println("Email : "+cn.getEmail()+"\n  PhoneNumber : "+cn.getPhone());


}
//	@Autowired
//	Environment env;
//
//	@Value("${mehranName}")
//	public String name;
//	@Value("${mehranPassword}")
//	public String pass;
//	@Value("${Myemail}")
//	public String email;
//	@Value("${phone}")
//	public String phone;
//
//
//	@Bean
//	public DataBase getData(){
//		DataBase db=new DataBase();
//		db.setName(env.getProperty("mehranName"));
//		db.setPassword(pass);
//		return db;
//	}
	//@Bean
//	public Contact getContact(){
//		Contact cnt=new Contact();
//		cnt.setEmail(appl);
//			return cnt;
//	}

	//@Bean
//	public static PropertySourcesPlaceholderConfigurer property(){
//		return new PropertySourcesPlaceholderConfigurer();

		// New Project...............
		//@Value("${Myemail}")
//		@Autowired





//		@Value("${item.apple}")
//		public  String appl ;

	    //@Bean
		public  void  getDataitem(){
			ArrayList<String > studentTokens = new ArrayList<String>();
			 String strLine = null;
			HashMap<String,String> map=new HashMap<String, String>();

			try{
				// Open the file that is the first
				// command line parameter
				FileInputStream fstream = new  FileInputStream("D:/javaRead.txt");

				// Get the object of DataInputStream
				DataInputStream in = new DataInputStream(fstream);
				BufferedReader br = new BufferedReader(new InputStreamReader(in));
				//String strLine;

				//Read File Line By Line
				while ((strLine = br.readLine()) != null)   {
					// Print the content on the console
					//HashMap<String,String> map=new HashMap<String, String>();
					map.put(null,strLine);
					//System.out.println (map);

				}

				//Close the input stream
				in.close();
			}catch (Exception e){//Catch exception if any
				System.err.println("Error: " + e.getMessage());
			}

//			System.out.println (map);
		}




	}




