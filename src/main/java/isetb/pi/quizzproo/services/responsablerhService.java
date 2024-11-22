package isetb.pi.quizzproo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import isetb.pi.quizzproo.entities.responsablerh;

import isetb.pi.quizzproo.repositry.responsablerhRepository;


@Service
public class responsablerhService {
	
	@Autowired
	private responsablerhRepository  responsablerhRepo;
	
	
	public List<responsablerh> getAllresponsablerh() {
	return responsablerhRepo.findAll();
	}
	
	public responsablerh addresponsablerh(responsablerh responsablerh) {
		return responsablerhRepo.save(responsablerh);
		}

	
	// TODO : Compléter les autres méthodes en exploitant les méthodes prédéfinies de
	 // IUtilisateurRepository
	public responsablerh findResponsablerhById(Long id) {
	    // TODO Auto-generated method stub
	    throw new UnsupportedOperationException("Unimplemented method 'findResponsablerhById'");
	}
	
	public responsablerh updateresponsablerh(responsablerh responsablerh) {
	    // TODO Auto-generated method stub
	    throw new UnsupportedOperationException("Unimplemented method 'updateresponsablerh'");
	}
	
	
	public void deleletresponsablerh(Long id) {
	    // TODO Auto-generated method stub
	    throw new UnsupportedOperationException("Unimplemented method 'deleletresponsablerh'");
	}
	}
