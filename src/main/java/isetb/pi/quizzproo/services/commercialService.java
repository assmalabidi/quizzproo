package isetb.pi.quizzproo.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import isetb.pi.quizzproo.entities.commercial;
import isetb.pi.quizzproo.repositry.commercialRepository;
@Service
public class commercialService  {
@Autowired


private commercialRepository commercialRepo;
public List<commercial> getAllcommercial() {
return commercialRepo.findAll();
}


public commercial addcommercial(commercial commercial) {
return commercialRepo.save(commercial);
}
// TODO : Compléter les autres méthodes en exploitant les méthodes prédéfinies de
 // IUtilisateurRepository
public commercial findcommercialById(Long id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'findCommercialById'");
}


public commercial updatecommercial(commercial commercial) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'updateCommercial'");
}


public void deleletcommercial(Long id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'deleletUtilisateur'");
}
}
