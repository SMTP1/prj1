package com.web.psh1;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.web.psh1.exception.ResourceNotFoundException;


@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public String notFound() {
		//페이지 없을 경우 표시될 jsp파일명
		return "v1_pagenotfound"; 
	}

	
	
	@RequestMapping(value="/{name}", method=RequestMethod.GET)
	public String home1(@PathVariable("name")String name) {
		if(name.equals("home")) {
			return "home";
		}
		else {
			throw new ResourceNotFoundException();
		}
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
}


