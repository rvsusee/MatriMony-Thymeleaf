package com.ta.matrimony.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ta.matrimony.model.Person;

@Controller
@RequestMapping("/")
public class PersonsListController {

	@RequestMapping(value = "/listview", method = RequestMethod.GET)
	public String getPersonsList(Model m) {

		
		List<Person> personsList = new ArrayList<>();
		personsList.add(new Person(1001, "AAA", 20, "aaa@gmail.com"));
		personsList.add(new Person(1002, "BBB", 22, "bbb@gmail.com"));
		personsList.add(new Person(1003, "CCC", 21, "ccc@gmail.com"));
		
		m.addAttribute("persons", personsList);
		
		return "personList";
	}
}




