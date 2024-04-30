package com.codingdojo.daikichicontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class daikichicontrollerr {
	
	
	@RequestMapping("/")
		public String demo(	Model model) {
			model.addAttribute("fruit", "apple");
			return "demo.jsp";
	}
	
	
	

    @GetMapping("/daikichi/travel/{city}")
    public String travelToCity(@PathVariable("city") String city) {
        return "Congratulations! You will soon travel to " + city + "!";
    }

    @GetMapping("/daikichi/lotto/{number}")
    public String checkLottoNumber(@PathVariable("number") int number) {
    	if (number % 2 == 0) {
           return "You will take a grand journey in the near future, but be wary of tempting offers.";
        } else {
        	return "You have enjoyed the fruits of your labor, but now is a great time to spend time with family and friends.";
        }
    }
    
    
    
    
}


