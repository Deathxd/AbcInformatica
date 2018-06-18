package br.com.abcdainformatica.AbcDaInformatica.controller;

import br.com.abcdainformatica.AbcDaInformatica.model.RespostaForum;
import br.com.abcdainformatica.AbcDaInformatica.service.RespostaForumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(value = "/resposta", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class respostaController {
    @Autowired
    private RespostaForumService respostaForumService;
    @RequestMapping(value = "/salvar", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity CadastrarResposta(@RequestBody RespostaForum respostaForum){
        respostaForumService.SalvarResposta(respostaForum);
        return  new ResponseEntity<>(respostaForum,HttpStatus.OK);
    }

}
