package br.com.abcdainformatica.AbcDaInformatica.repository;

import br.com.abcdainformatica.AbcDaInformatica.model.PessoaForum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaForumRepository extends JpaRepository<PessoaForum,Long> {

     PessoaForum findByLoginAndSenha(String login, String senha);


}
