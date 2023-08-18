package ___jasonFile;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JSONFileReader{
    public static void main(String[] args) throws IOException, ParseException {
           JSONParser jsonParser = new JSONParser();
           FileReader fileReader = new FileReader("Test.json");
           Object obj = jsonParser.parse(fileReader);

           JSONObject jsonObject = (JSONObject) obj;

           String fname = (String) jsonObject.get("firstname");
           String lname = (String) jsonObject.get("lastname");
           String address = (String) jsonObject.get("address");

           System.out.println("Firstname: " + fname);
           System.out.println("Lastname: " + lname);
           System.out.println("Address: " + address);

    }
}
