package com.Eisen.daily.testCoding;

import java.util.Optional;

public class PrivateMethodClass {

    ServiceObj serviceObj;

    public PrivateMethodClass(ServiceObj serviceObj){
        this.serviceObj = serviceObj;
    }

    private EntityObj convertToEntity(DTOObj dto){
        Optional.ofNullable(serviceObj.someObject(3)).orElseThrow(() -> new IllegalArgumentException());
        System.out.println("entity = " + serviceObj.someObject(3));
        return new EntityObj();
    }

    public class ServiceObj{
        public String someObject(Integer num){
            System.out.println("num = " + num);
            return "hello World!";
        }
    }
    public class EntityObj{

    }
    public class DTOObj {

    }
}
