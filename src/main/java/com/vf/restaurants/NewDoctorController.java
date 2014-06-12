package com.vf.restaurants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NewDoctorController {
 
	@Autowired 
	private NewDoctor newDoc;

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ModelAndView indexDoctor( ModelMap model ) {
        return new ModelAndView("hello");
    }

	@RequestMapping(value = "/newdoc", method = RequestMethod.GET)
	public ModelAndView createDoctor( ModelMap model ) {
		return new ModelAndView("hello");
	}
	
	@RequestMapping(value = "/createdoc", method = RequestMethod.POST)
	public String createNewDoctor(Doctor doctor, ModelMap model) {
		
		model.addAttribute("message", "Spring 3 MVC Hello World");
		newDoc.addDoctor(doctor);
		return "hello";
 
	}
 
}
