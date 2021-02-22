package mystore.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import mystore.repository.ProductsRepository;

/**
 * @author Charles Curi
 * Classe que disponibiliza a url do serviço
 * a anotação de origem para testes em localhost
 */

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/products")
public class ProductsController {
	
	 private ProductsRepository repository;

	 ProductsController(ProductsRepository productsRepository) {
	       this.repository = productsRepository;
	   }
	 
	 @GetMapping
	 public List findAll(){
	    return repository.findAll();
	 }

}
