package com.study.superset.presentation.view;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class ViewController {
	
	@Value("${superset.link}")
    private String myLink;
	
	@GetMapping("/")
	public String rootPage(Model model) {
		model.addAttribute("linkValue", myLink);
        return "index.html";
	}
}
