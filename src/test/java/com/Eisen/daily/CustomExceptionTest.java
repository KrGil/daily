package com.Eisen.daily;

import com.Eisen.daily.testCoding.exception_orElseThrow.CustomException;
import org.junit.jupiter.api.Test;

import java.util.Optional;


public class CustomExceptionTest {

    @Test
    public void orElseThrow제네릭예외확인(){
        CustomException customException = new CustomException();

        try{
            Optional객체반환("testText")
                .orElseThrow(() -> new CustomException());
        }catch(Exception e){
            System.out.println("Error 발생! ");
        }


    }

    private Optional<String> Optional객체반환(String a){
        return Optional.ofNullable(a)
            .map(e -> {return e;});
    }
}
