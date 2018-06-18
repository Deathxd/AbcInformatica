package br.com.abcdainformatica.AbcDaInformatica.controller;

import br.com.abcdainformatica.AbcDaInformatica.model.PessoaForum;
import br.com.abcdainformatica.AbcDaInformatica.service.PessoaForumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@CrossOrigin
@RestController
@RequestMapping(value = "/login", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class loginController {
    @Autowired
    private PessoaForumService pessoaForumService;
    @RequestMapping(value = "/cadastrar", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity Cadastrar(@RequestBody PessoaForum pessoaForum) {
        pessoaForumService.salvarPessoa(pessoaForum);
        return new ResponseEntity<>(pessoaForum,HttpStatus.OK);
    }
    @RequestMapping(value = "/logar", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity enviarLogin(PessoaForum pessoaForum) {

        PessoaForum usuario = pessoaForumService.login(pessoaForum);
        return new ResponseEntity<>(usuario,HttpStatus.OK);

    }
    @RequestMapping(value = "/validar", method = RequestMethod.GET)
    public ResponseEntity validarLogin(HttpServletRequest httpServletRequest){
        HttpStatus httpStatus = httpServletRequest.getCookies() != null ? HttpStatus.OK : HttpStatus.FORBIDDEN;
        return new ResponseEntity(httpStatus);
    }
    @RequestMapping(value = "/testar", method = RequestMethod.GET)
    public String validarLogin(){
        return "deu certo";
    }
}

