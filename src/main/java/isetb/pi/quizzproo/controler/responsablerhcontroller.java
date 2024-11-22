package isetb.pi.quizzproo.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import isetb.pi.quizzproo.entities.responsablerh;
import isetb.pi.quizzproo.services.responsablerhService;

//Annotation pour créer des web services REST avec le framework Spring WEB
@RestController

@RequestMapping("/responsablerh") // localhost:8080/responsablerh

public class responsablerhcontroller {


	@Autowired
	responsablerhService  responsablerhService;
	@GetMapping
	
	
	public List<responsablerh> getAllResponsablerh2() {
		return responsablerhService.getAllresponsablerh();
		}
	
		@PostMapping
		public responsablerh createResponsablerh(@RequestBody responsablerh responsablerh){
		return responsablerhService.addresponsablerh(responsablerh);
		}
		
		

		   // Update an existing responsablerh
		    @PutMapping("/{id}")
		    public responsablerh updateresponsablerh(@PathVariable Long id, @RequestBody responsablerh responsablerh) {
		        return responsablerhService.updateresponsablerh(responsablerh);
		    }

		    
		    @DeleteMapping(path="/{id}") // localhost:8080/responsablerh/3
		    public void deleletresponsablerh(@PathVariable Long id){
		    	responsablerhService.deleletresponsablerh(id);
		    }
		

}
