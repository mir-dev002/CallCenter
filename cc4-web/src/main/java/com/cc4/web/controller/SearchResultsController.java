package com.cc4.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SearchResultsController {
	
	@RequestMapping(value = { "/searchResults"}, method = RequestMethod.GET)
	public String searchResult(ModelMap model) {
		return "searchResults";
	}
	
}
