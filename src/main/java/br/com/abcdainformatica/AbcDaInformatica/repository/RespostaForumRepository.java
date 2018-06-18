package br.com.abcdainformatica.AbcDaInformatica.repository;

import br.com.abcdainformatica.AbcDaInformatica.model.RespostaForum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RespostaForumRepository extends JpaRepository<RespostaForum,Long> {

}
