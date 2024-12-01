package SpringBoot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringBoot.entities.Responsablerh;
import SpringBoot.repository.ResponsablerhRepository;
@Service
public class ResponsablerhServiceImp implements ResponsablerhService{
    @Autowired
    private ResponsablerhRepository ResponsableRepo;
    
	@Override
	public List<Responsablerh> getAllResponsable() {
		
		 return ResponsableRepo.findByStatut(Responsablerh.Statut.ACTIF);
	}

	@Override
	public Responsablerh findResponsableById(Long id) {
		
		  Optional<Responsablerh> optional = ResponsableRepo.findById(id);
	        return optional.filter(r -> r.getStatut() == Responsablerh.Statut.ACTIF).orElse(null);
	    }
	

	@Override
	public Responsablerh addResponsable(Responsablerh responsable) {
		
		responsable.setStatut(Responsablerh.Statut.ACTIF);
        return ResponsableRepo.save(responsable);}
	
	 @Override
	    public Responsablerh updateResponsable(Long id, Responsablerh responsable) {
	        
	        Optional<Responsablerh> optional = ResponsableRepo.findById(id);
	        if (optional.isPresent()) {
	            Responsablerh existing = optional.get();
	            if (existing.getStatut() == Responsablerh.Statut.ACTIF) {
	                existing.setNom(responsable.getNom());
	                existing.setPrenom(responsable.getPrenom());
	                existing.setEmail(responsable.getEmail());
	                return ResponsableRepo.save(existing);
	            } else {
	                throw new IllegalArgumentException("Impossible de mettre à jour un responsable inactif.");
	            }
	        } else {
	            throw new IllegalArgumentException("Responsable introuvable.");
	        }
	    }

	 @Override

	    public void deleteResponsable(Long id) {
	        Optional<Responsablerh> optional = ResponsableRepo.findById(id);

	        if (optional.isPresent()) {

	        	Responsablerh responsablerh = optional.get();



	            if (responsablerh.getStatut() == Responsablerh.Statut.ACTIF) {

	            	responsablerh.setStatut(Responsablerh.Statut.INACTIF);

	                ResponsableRepo.save(responsablerh);

	            } else {

	                throw new IllegalArgumentException("Le responsablerh est déjà inactif ou introuvable.");

	            }

	        } else {

	            throw new IllegalArgumentException("responsable introuvable.");

	        }

	    }}


