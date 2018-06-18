package br.com.abcdainformatica.AbcDaInformatica.service;

import br.com.abcdainformatica.AbcDaInformatica.model.PessoaForum;
import br.com.abcdainformatica.AbcDaInformatica.repository.PessoaForumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PessoaForumService {
    @Autowired
    private PessoaForumRepository pessoaForumRepository;

    public void salvarPessoa(PessoaForum pessoa){
        pessoaForumRepository.save(pessoa);
    }
    public PessoaForum login(PessoaForum pessoaForum){
       return pessoaForumRepository.findByLoginAndSenha(pessoaForum.getLogin(),pessoaForum.getSenha());

    }




}
