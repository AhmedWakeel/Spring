package com.springmvc;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

@Controller
public class StudentAdmissionController {

	@RequestMapping(value = "/admissionForm", method = RequestMethod.GET)
	public ModelAndView getAdmissionFrom() {
		ModelAndView model = new ModelAndView("AdmissionForm");
		return model;
	}

 
	@RequestMapping(value="/submitAdmissionForm",method=RequestMethod.POST)
/*	public ModelAndView submitAdmissionForm(@RequestParam("studentName") String name,@RequestParam("studentHobby") String hobby)*/
	public ModelAndView submitAdmissionForm(@RequestParam Map<String,String> mp)
	{
		String name=mp.get("studentName");
		String hobby=mp.get("studentHobby");
		
		ModelAndView model1=new ModelAndView("AdmissionSuccesForm");
	    model1.addObject("msg","Details submitted By you map without extension ::"+name+", Hobby :"+hobby);
	    return model1;
	}
}
