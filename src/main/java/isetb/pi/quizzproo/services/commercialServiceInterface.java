package isetb.pi.quizzproo.services;

import java.util.List;

import isetb.pi.quizzproo.entities.commercial;

public interface commercialServiceInterface {

	public List<commercial> getAllcommercial();

	public commercial addcommercial(commercial commercial);

	public commercial findcommercialById(Long id);

	public commercial updatecommercial(long id, commercial commercial);

	public void deleletcommercial(Long id);
	
	


}
