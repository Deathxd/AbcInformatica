package br.com.abcdainformatica.AbcDaInformatica.service;

import br.com.abcdainformatica.AbcDaInformatica.model.RespostaForum;
import br.com.abcdainformatica.AbcDaInformatica.repository.PessoaForumRepository;
import br.com.abcdainformatica.AbcDaInformatica.repository.RespostaForumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RespostaForumService {
    @Autowired
    private RespostaForumRepository respostaForumRepository;

    public void SalvarResposta(RespostaForum respostaForum){
        respostaForumRepository.save(respostaForum);
    }
}
