package br.com.domingos.restSpringBoot.controller;

import br.com.domingos.restSpringBoot.exception.UnsupoortedMathOperationException;
import br.com.domingos.restSpringBoot.service.MathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

    @Autowired
    private MathService mathService;

    @RequestMapping(value="/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numbertwo) throws Exception {

       return mathService.sum(numberOne, numbertwo);
    }

    @RequestMapping(value="/subtraction/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double subtraction(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numbertwo) {

        return mathService.subtraction(numberOne,numbertwo);
    }

    @RequestMapping(value="/division/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double division(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numbertwo) throws Exception {

        return mathService.division(numberOne, numbertwo);
    }

    @RequestMapping(value="/multiplication/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double multiplication(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numbertwo) throws Exception {

        return mathService.multiplication(numberOne, numbertwo);
    }

    @RequestMapping(value="/average/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double average(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numbertwo) throws Exception {

        return mathService.average(numberOne, numbertwo);
    }

    @RequestMapping(value="/squareroot/{number}", method = RequestMethod.GET)
    public Double squareRoot(@PathVariable("number") String number) throws Exception {

        return mathService.squareroot(number);
    }
}
