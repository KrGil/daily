package com.Eisen.daily.testCoding.lombok;

import com.Eisen.daily.testCoding.lombok.lombok_toString.ChildDTO;
import com.Eisen.daily.testCoding.lombok.lombok_toString.LombokClientDTO;

public class LombokClient {
    LombokClientDTO dto = new LombokClientDTO();

    public void toStringTest(){
        ChildDTO child = new ChildDTO();
        dto.setHowdi("Hi!!");
        child.setI("i");
        child.setAm("am");
        child.setYour("your");
        child.setPapa("papa?");
        child.setScream("arrrrrrrrrrr~~");

        dto.setParent(child);
        System.out.println("dto = " + dto);
    }
}
