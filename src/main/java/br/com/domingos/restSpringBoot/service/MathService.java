package br.com.domingos.restSpringBoot.service;

import br.com.domingos.restSpringBoot.exception.UnsupoortedMathOperationException;
import org.springframework.stereotype.Service;

@Service
public class MathService {

    public Double sum(String numberOne, String numberTwo){

        if(!isNumeric(numberOne) || !isNumeric(numberTwo)){
            throw new UnsupoortedMathOperationException("Please set a numeric value!");
        }

        Double sum = convertToDouble(numberOne) + convertToDouble(numberTwo);
        return sum;
    }

    public Double subtraction(String numberOne, String numberTwo){

        if(!isNumeric(numberOne) || !isNumeric(numberTwo)){
            throw new UnsupoortedMathOperationException("Please set a numeric value!");
        }

        Double subtraction = convertToDouble(numberOne) - convertToDouble(numberTwo);
        return subtraction;
    }

    public Double division(String numberOne, String numberTwo){

        if(!isNumeric(numberOne) || !isNumeric(numberTwo)){
            throw new UnsupoortedMathOperationException("Please set a numeric value!");
        }

        Double division = convertToDouble(numberOne) / convertToDouble(numberTwo);
        return division;
    }

    public Double multiplication(String numberOne, String numberTwo){

        if(!isNumeric(numberOne) || !isNumeric(numberTwo)){
            throw new UnsupoortedMathOperationException("Please set a numeric value!");
        }

        Double multiplication = convertToDouble(numberOne) * convertToDouble(numberTwo);
        return multiplication;
    }

    public Double average(String numberOne, String numberTwo){
        if(!isNumeric(numberOne) || !isNumeric(numberTwo)){
            throw new UnsupoortedMathOperationException("Please set a numeric value!");
        }

        Double sumAverage = convertToDouble(numberOne) + convertToDouble(numberTwo);
        Double average = sumAverage / 2;
        return average;
    }

    public Double squareroot(String number){

        if(!isNumeric(number) || !isNumeric(number)){
            throw new UnsupoortedMathOperationException("Please set a numeric value!");
        }

        Double sum = (Double) Math.sqrt(convertToDouble(number));
        return sum;
    }

    private Double convertToDouble(String strNumber) {
        if(strNumber == null){
            return 0D;
        }
        String number = strNumber.replaceAll(",",".");

        if(isNumeric(number)){
            return Double.parseDouble(number);
        }

        return 0D;
    }

    private  boolean isNumeric(String strNumber) {
        if(strNumber == null){
            return false;
        }
        String number = strNumber.replaceAll(",",".");

        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }
}
