package isetb.pi.quizzproo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import isetb.pi.quizzproo.entities.commercial;
import isetb.pi.quizzproo.entities.responsablerh;

import isetb.pi.quizzproo.repositry.responsablerhRepository;


@Service
public class responsablerhService implements responsablerhServiceInterface {
	
	@Autowired
	private responsablerhRepository  responsablerhRepo;
	
	
	
	@Override
	public List<responsablerh> getAllresponsablerh() {
	return responsablerhRepo.findAll();
	}
	
	
	@Override
	public responsablerh addresponsablerh(responsablerh responsablerh) {
		return responsablerhRepo.save(responsablerh);
		}

	
	//update
	@Override
	public responsablerh updateresponsablerh(long id, responsablerh responsablerh) {
		Optional<responsablerh> optionalresponsablerh = responsablerhRepo.findById(id);
		
		if(optionalresponsablerh.isPresent()){
			responsablerh existingresponsablerh=optionalresponsablerh.get();
			existingresponsablerh.setNom(responsablerh.getNom());
			
			existingresponsablerh.setPrenom(responsablerh.getPrenom());
			existingresponsablerh.setAdresse(responsablerh.getAdresse());
			
			return responsablerhRepo.save(existingresponsablerh);
		}else
			{
				
				return null;
		}
	}

		//delete
		@Override
		public void deleletresponsablerh(Long id) {
			
			responsablerhRepo.deleteById(id);
		}
		}