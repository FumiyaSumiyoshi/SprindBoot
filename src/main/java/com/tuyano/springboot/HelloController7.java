////フォームコントロールもろもろ
//package com.tuyano.springboot;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.ModelAndView;
//
//
//@Controller//「Rest」(Representational State Transfer)専用のコントローラ
//public class HelloController7 {
//	
//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public ModelAndView index (ModelAndView mav) {
//		
//		mav.setViewName("index4");
//		mav.addObject("msg", "フォームを書いて送信してください。");
//		
//		return mav;
//		
//	}
//	
//	
//	@RequestMapping(value = "/", method = RequestMethod.POST)
//	public ModelAndView send (
//			@RequestParam(value="check1", required = false)boolean check1,//チェックBOX
//			@RequestParam(value="radio1", required = false)String radio1,//ラジオボタン
//			@RequestParam(value="select1", required = false)String select1,//選択リスト
//			@RequestParam(value="select2", required = false)String[] select2,//選択リスト
//			//requiredがあることによって, 値が入力されなくてもエラーにならずnullで実行される
//			
//			ModelAndView mav) {
//			
//			String res = "";
//			try {
//				res = "check:" + check1 + 
//						"radio:" + radio1 + 
//						"select:" + select1 +
//						"\nselect2:";
//			
//			} catch (NullPointerException e) {}
//			
//			try {
//				res += select2 [0];
//				for(int i = 1;i < select2.length;i++)
//					res += ", " + select2[i];
//			} catch (NullPointerException e) {
//				
//				res += "null";
//				
//			}
//			
//			mav.addObject("msg", res);
//			mav.setViewName("index4");
//			return mav;
//	}
//	
//}
