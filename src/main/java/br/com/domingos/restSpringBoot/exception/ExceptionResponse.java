package br.com.domingos.restSpringBoot.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;
import java.util.Date;

@AllArgsConstructor
public class ExceptionResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    @Getter
    private final Date timestamp;

    @Getter
    private final String message;

    @Getter
    private final String details;
}
