package com.pnt.restapi;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class ReadJsonFiles {
    public static JSONArray getJsonArray(String filepath) throws IOException, ParseException {
        JSONParser jsonParser = new JSONParser();
        JSONArray jsonArray = (JSONArray) jsonParser.parse(new FileReader(filepath));

        return jsonArray;
    }

    public static void main(String[] args) throws IOException, ParseException {
        JSONArray jsonArray = getJsonArray("src/api/test/java/com/pnt/restapi/SingleArray_SingleJson.json");
        System.out.println(jsonArray);

        JSONObject jsonData = (JSONObject) jsonArray.get(0);
        System.out.println(jsonData);

        System.out.println(jsonData.get("id"));
        System.out.println(jsonData.get("timestamp"));
        System.out.println(jsonData.get("feature"));


        JSONArray jsonArray2 = getJsonArray("src/api/test/java/com/pnt/restapi/SingleArray_DoubleJson.json");
        JSONObject jsonData2 = (JSONObject) jsonArray2.get(1);
        System.out.println(jsonData2.get("id"));
        System.out.println(jsonData2.get("timestamp"));
        System.out.println(jsonData2.get("feature"));


        JSONArray jsonArray3 = getJsonArray("src/api/test/java/com/pnt/restapi/SingleArray_MultipleArrayOfJson.json");
        JSONObject jsonData3 = (JSONObject) jsonArray3.get(1);
        System.out.println(jsonData3);
        System.out.println(jsonData3.get("data"));


        JSONArray jsonArrayOfData = (JSONArray) jsonData3.get("data");
        System.out.println(jsonArrayOfData.get(0));

        JSONObject jsonObjectRohan = (JSONObject) jsonArrayOfData.get(0);
        System.out.println(jsonObjectRohan);
        System.out.println(jsonObjectRohan.get("id"));

    }

}
