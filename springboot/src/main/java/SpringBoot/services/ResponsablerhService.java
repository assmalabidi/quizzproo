package SpringBoot.services;

import java.util.List;

import SpringBoot.entities.Responsablerh;

public interface ResponsablerhService {
	public List<Responsablerh>getAllResponsable();
	public Responsablerh findResponsableById(Long id);
	public Responsablerh addResponsable(Responsablerh responsable);
    public Responsablerh updateResponsable(Long id,Responsablerh responsable );
    public void  deleteResponsable(Long id);
}
