package isetb.pi.quizzproo.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import isetb.pi.quizzproo.entities.commercial;
import isetb.pi.quizzproo.repositry.commercialRepository;
@Service
public class commercialService implements commercialServiceInterface {
@Autowired


private commercialRepository commercialRepo;







@Override
public List<commercial> getAllcommercial() {
return commercialRepo.findAll();
}

@Override
public commercial addcommercial(commercial commercial) {
return commercialRepo.save(commercial);
}


//afficher par id
@Override
public commercial findcommercialById(Long id) {
	Optional<commercial> commercial = commercialRepo.findById(id);
	return  commercial.orElse(null);
}
   
   
//update
@Override
public commercial updatecommercial(long id, commercial commercial) {
	Optional<commercial> optionalcommercial = commercialRepo.findById(id);
	if(optionalcommercial.isPresent()) {
		commercial existingcomercial=optionalcommercial.get();
		 existingcomercial.setNom( commercial.getNom());
		 existingcomercial.setPrenom(commercial.getPrenom());
		 existingcomercial.setAdresse(commercial.getAdresse());
		 
		 return commercialRepo.save( existingcomercial);
		
	}else {
		return null;
	}
	
	
	
	
	
}


//delete
@Override
public void deleletcommercial(Long id) {
	
	commercialRepo.deleteById(id);
}
}
