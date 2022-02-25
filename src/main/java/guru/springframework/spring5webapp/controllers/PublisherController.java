package guru.springframework.spring5webapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import guru.springframework.spring5webapp.repositories.AuthorRepository;
import guru.springframework.spring5webapp.repositories.PublisherRepository;

@Controller
public class PublisherController {
	
	@Autowired
	PublisherRepository publisherRepository;
	
	@GetMapping("/publishers")
	public String getAuthors(Model model) {
		model.addAttribute("publishers", publisherRepository.findAll());
		return "publishers/list";
	}

}