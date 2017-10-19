package com.cc4.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cc4.web.model.Hotel;
import com.cc4.web.services.SearchResultService;

@Controller
public class SearchResultsController {
	
	@Autowired
	private SearchResultService searchResultService;
	
	@RequestMapping(value = { "/searchResults"}, method = RequestMethod.GET)
	public String searchResult(ModelMap model) {
		
		
		List<Hotel> hoteles = searchResultService.searchHotelsAvail();
	
		for(Hotel hotel : hoteles){
			System.out.println(hotel);
		}
	
		
		return "searchResults";
	}
	
}
