package com.Eisen.daily.testCoding.validation;

import org.junit.jupiter.api.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.constraints.NotNull;
import java.util.Set;

public class CustomValidation {
    private static final Validator validator = Validation.buildDefaultValidatorFactory().getValidator();

    static class CustomTestClass{
        @NotNull
        int a;
        int b;
        CustomTestClass(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    @Test
    void validationTest(){
        CustomTestClass test = new CustomTestClass(1,2);
        validate(test);
    }

    private static <T> void validate(T input){
        Set<ConstraintViolation<T>> violations =  validator.validate(input);
//        Eisen.collectViolationMessages(violations);

        if(violations.size() > 0){
            String errMsg = violations.stream()
                .map(e -> String.format("%s, %s",e.getPropertyPath(), e.getMessage()))
                .reduce((msg1, msg2) -> msg1 + "\n" + msg2 )
                .orElse("");
            throw new IllegalArgumentException(errMsg);
        }
    }
}
