package fr.fms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.fms.dao.ArticleRepository;
import fr.fms.entities.Article;

@SpringBootApplication
public class SpringShopWebApplication implements CommandLineRunner {
	@Autowired
	ArticleRepository articleRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringShopWebApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		articleRepository.save(new Article(null,"Motorola G34",110));
//		articleRepository.save(new Article(null,"Motorola G75",335));
//		articleRepository.save(new Article(null,"Samsung S10",500));
		
//		articleRepository.findAll().forEach( a -> System.out.println(a));
	}
}
