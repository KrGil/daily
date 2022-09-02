package com.Eisen.daily.testCoding;

public class JunitTest {

    ServiceObj serviceObj;

    public JunitTest(ServiceObj serviceObj){
        this.serviceObj = serviceObj;
    }

    private EntityObj convertToEntity(DTOObj dto){
        System.out.println("entity = " + serviceObj.generateString(3));
        return new EntityObj();
    }

    public class ServiceObj{
        public String generateString(Integer num){
            System.out.println("num = " + num);
            return "hello World!";
        }
    }
    public class EntityObj{

    }
    public  class DTOObj{

    }
}
