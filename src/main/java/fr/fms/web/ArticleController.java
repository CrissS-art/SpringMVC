package fr.fms.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import fr.fms.dao.ArticleRepository;
import fr.fms.entities.Article;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ArticleController {
	@Autowired
	ArticleRepository articleRepository;
	
	@GetMapping("/index")
	public String index(Model model, @RequestParam(name="page", defaultValue = "0") int page) { //model is provided by spring :
		Page<Article> articles = articleRepository.findAll(PageRequest.of(page, 5));
		model.addAttribute("listArticle",articles.getContent());

		model.addAttribute("currentPage", page);

		return "articles"; //returns dispatcherServlet = vue, returns articles.html
	}
	
}
