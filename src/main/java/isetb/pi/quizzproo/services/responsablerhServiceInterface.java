package isetb.pi.quizzproo.services;

import java.util.List;

import isetb.pi.quizzproo.entities.responsablerh;

public interface responsablerhServiceInterface {

	List<responsablerh> getAllresponsablerh();

	responsablerh addresponsablerh(responsablerh responsablerh);

	responsablerh updateresponsablerh(long id, responsablerh responsablerh);

	void deleletresponsablerh(Long id);
	
	

}
