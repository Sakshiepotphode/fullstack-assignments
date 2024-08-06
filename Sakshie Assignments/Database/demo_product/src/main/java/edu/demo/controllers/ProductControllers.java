package edu.demo.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.demo.entities.Product;
import edu.demo.repos.ProductRepository;

@CrossOrigin("*")
@RestController
public class ProductControllers {

	 @Autowired
	 private ProductRepository repo;
	 
	 @GetMapping ("/allProducts")
	 public List<Product> getProduct()
	 {
		 return repo.findAll();
	 }
	 
	 @PostMapping ("/saveProduct")
	 public String addProduct(@RequestBody Product product)
	 {
		 String res;
		 try {
			 repo.save(product);
			 res="Success";
		 }
		 catch(Exception e) {
			 e.printStackTrace();
			 res=e.getMessage();
		 }
		 return res;
	 }
		/*
		 * @DeleteMapping ("/deleteBook") public String removeBook(@RequestBody Book
		 * book) { Long id= (Long )(book.getId()); String res; try {
		 * repo.deleteById(id); res="Success"; } catch(Exception e) {
		 * e.printStackTrace(); res=e.getMessage(); } return res; }
		 * 
		 * @PutMapping ("/updateBook") public String modifyBook(@RequestBody Book book)
		 * { String res; try { repo.save(book); res="Success"; } catch(Exception e) {
		 * e.printStackTrace(); res=e.getMessage(); } return res; }
		 */
}

