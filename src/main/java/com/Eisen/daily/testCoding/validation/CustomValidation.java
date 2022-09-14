package com.Eisen.daily.testCoding.validation;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

public class CustomValidation {
    private final Validator validator = Validation.buildDefaultValidatorFactory().getValidator();

    public static void main(String[] args) {

    }

    private <T> void validate(T input){
        Set<ConstraintViolation<T>> violations =  validator.validate(input);
        if(violations.size() > 0){
            String errMsg = violations.stream()
                .map(e -> String.format("%s, %s",e.getPropertyPath(), e.getMessage()))
                .reduce((msg1, msg2) -> msg1 + "\n" + msg2 )
                .orElse("");
            throw new IllegalArgumentException(errMsg);
        }
    }
}
