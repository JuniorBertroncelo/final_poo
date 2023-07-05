package br.edu.atitus.pooavancado.CadUsuario.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import br.edu.atitus.pooavancado.CadUsuario.Entities.GenericEntity;

@NoRepositoryBean
public interface GenericRepository<TEntidade extends GenericEntity> 
	extends JpaRepository<TEntidade, Long> {

	
}
