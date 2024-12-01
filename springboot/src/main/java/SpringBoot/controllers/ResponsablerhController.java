package SpringBoot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import SpringBoot.entities.Responsablerh;
import SpringBoot.services.ResponsablerhService;

@RestController
@RequestMapping("/ResponsablesRh")
@CrossOrigin(origins = "http://localhost:4200")
public class ResponsablerhController {
	@Autowired
	ResponsablerhService responsableser;
	
	@GetMapping ("/getAllResponsablerh")
	public List<Responsablerh>getAllResponsablesrh(){
	return responsableser.getAllResponsable()  ;
	

}
	 @PostMapping ("/addResponsable")
	 public Responsablerh createResponsable(@RequestBody Responsablerh responsable ){ 
	 return responsableser.addResponsable(responsable); 
	 }
	 @DeleteMapping(path="/{id}")  
	 public void deleteRespon(@PathVariable Long id){ 
		 responsableser.deleteResponsable(id); 
	 }
	 
	 @GetMapping("/{id}")
	    public Responsablerh getResponById(@PathVariable Long id) {
		 Responsablerh responsable= responsableser.findResponsableById(id);
		 if (responsable == null) {
	            throw new IllegalArgumentException("Le responsable n'est pas actif ou inexistant.");
	        }
	        return responsable;
	    }
	 @PutMapping("/{id}")
	    public Responsablerh update(@PathVariable Long id, @RequestBody Responsablerh responsable) {
	        return responsableser.updateResponsable(id,responsable);
	    }
	 
	 
	}
