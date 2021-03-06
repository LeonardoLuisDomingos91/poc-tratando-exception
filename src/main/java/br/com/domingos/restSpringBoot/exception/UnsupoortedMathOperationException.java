package br.com.domingos.restSpringBoot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsupoortedMathOperationException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public UnsupoortedMathOperationException(String mensagem){
        super(mensagem);
    }

}
