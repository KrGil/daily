package com.Eisen.daily.testCoding.jsonTest;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class EditJson {
    String str= "{\"payload\": {\"test\":\"123\"}}";
    public String editJson(){
        JSONObject object = new JSONObject();
        try {
            JSONParser parser = new JSONParser();
            object = (JSONObject) parser.parse(str);

            object.put("table", "123");
            System.out.println("object = " + object.get("table"));
            object.toJSONString();
            System.out.println("object = " + object);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return object.toJSONString();
    }



    public String editString(){
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValueAsString(str);

        } catch (Exception e) {
        }
        StringBuffer temp = new StringBuffer(str);
        String tableName = "{\"table\": \"name\"}";
        temp.insert(0, tableName);
        return temp.toString();
    }
}
