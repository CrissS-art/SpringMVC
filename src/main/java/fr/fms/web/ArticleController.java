package fr.fms.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import fr.fms.dao.ArticleRepository;
import fr.fms.entities.Article;

import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ArticleController {
	@Autowired
	ArticleRepository articleRepository;
	
	@GetMapping("/index")
	public String index() { //model is provided by spring : 	public String index(Model model) 		List<Article> articles = articleRepository.findAll();		model.addAttribute("listArticle",articles);
		return "articles"; //returns dispatcherServlet = vue, returns articles.html
	}
	
}
