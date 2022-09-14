package com.Eisen.daily.testCoding;

public class PrivateMethodClass {

    ServiceObj serviceObj;

    public PrivateMethodClass(ServiceObj serviceObj){
        this.serviceObj = serviceObj;
    }

    private EntityObj convertToEntity(DTOObj dto){
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
    public  class DTOObj{

    }
}
