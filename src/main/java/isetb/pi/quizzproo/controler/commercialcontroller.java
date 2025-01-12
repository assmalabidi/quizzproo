package isetb.pi.quizzproo.controler;
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

import isetb.pi.quizzproo.entities.commercial;
import  isetb.pi.quizzproo.services.commercialService;



// Annotation pour créer des web services REST avec le framework Spring WEB
@RestController

@RequestMapping("/commercial") // localhost:8080/commercial
public class commercialcontroller{
	
@Autowired
commercialService  commercialService;

@GetMapping("/getAll")
@CrossOrigin(origins = "http://localhost:4200")
public List<commercial> getAllCommercial2() {
return commercialService.getAllcommercial();
}

// ajouter
@PostMapping("/add")
public commercial createCommercial(@RequestBody commercial commercial){
return commercialService.addcommercial(commercial);
}


   // Update an existing commercial
    @PutMapping("/update/{id}")
    public commercial updatecommercial(@PathVariable Long id, @RequestBody commercial commercial) {
        return commercialService.updatecommercial(id,  commercial);
    }

    
    
    @DeleteMapping(path="/delete/{id}") // localhost:8080/commercial
    public void deleletcommercial(@PathVariable Long id){
    	commercialService.deleletcommercial(id);
    }
}

