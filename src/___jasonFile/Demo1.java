package ___jasonFile;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.*;


public class Demo1 {
    public static void main(String[] args) throws IOException {
        JSONObject member1=new JSONObject();
        member1.put("firstname","Anil");
        member1.put("lastname","Chaudhari");
        member1.put("address","Jalgaon");

        JSONObject member2=new JSONObject();
        member2.put("firstname","Bharati");
        member2.put("lastname","Chaudhari");
        member2.put("address","Jalgaon");

        JSONObject member3 = new JSONObject();
        member3.put("firstname", "Navin");
        member3.put("lastname", "Chaudhuri");
        member3.put("address", "Jalgaon");

        JSONObject member4 = new JSONObject();
        member4.put("firstname", "Vinit");
        member4.put("lastname", "Chaudhari");
        member4.put("address", "Jalgaon");




        JSONArray array = new JSONArray();
        array.add(member1);
        array.add(member2);
        array.add(member3);
        array.add(member4);

        FileWriter file = new FileWriter("Test.json", false);
        file.write(array.toJSONString());
        file.close();
        System.out.println("file created successfully");
    }
}
