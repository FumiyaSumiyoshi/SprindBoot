//package com.tuyano.springboot;
//
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.servlet.ModelAndView;
//
//
//@RestController//「Rest」(Representational State Transfer)専用のコントローラ
//public class HelloController16 {
//	
//	String[] names = {"tuyano",
//			"hanako", "taro",
//			"sachiko", "ichiro"};
//	
//	String[] mails = {"syoda@tuuyano.com",
//		"hanako@flower","taro@yamda",
//		"sachiko@happy","ichiro@baseball"};
//	
//	@RequestMapping("/")
//	public ModelAndView index13(ModelAndView mav) {
//		
//		mav.setViewName("index13");
//		mav.addObject("msg", "message 1<hr/>message 2<br/>message 3");
//		return mav;
//		
//	}
//}
//
//class DataObject {
//	private int id;
//	private String name;
//	private String value;
//	
//	public DataObject(int id, String name, String value) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.value = value;
//	}
//	
//	public int getId() { return id; }
//	
//	public void setId(int id) { this.id = id; }
//	
//	public String getName() { return name; }
//	
//	public void setName(String name) {
//		this.name = name;
//	}
//	
//	public String getValue() {
//		return value;
//	}
//	
//	public void setValue(String value) {
//		this.value = value;
//	}
//	
//}