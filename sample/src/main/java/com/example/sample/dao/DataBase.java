package com.example.sample.dao;

import com.example.sample.model.Item;
import lombok.Data;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

@Repository
public class DataBase {
    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
//
//public Item getItem(String id){
//    HashMap<String,String> map = getDataitem();
//    //return map.get(id);
//}
    public  HashMap<String,String>  getDataitem(){
        ArrayList<String > studentTokens = new ArrayList<String>();
        String strLine = null;
        HashMap<String,String> map=new HashMap<String, String>();

        try{
            // Open the file that is the first
            // command line parameter
            FileInputStream fstream = new  FileInputStream("D:/javaRead.txt");

            // Get the object of DataInputStream
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            int counter =0;
            while ((strLine = br.readLine()) != null)   {
                /*

                */
                map.put(String.valueOf(counter),strLine);
                counter++;
            }
            in.close();
        }catch (Exception e){//Catch exception if any
            System.err.println("Error: " + e.getMessage());
        }
return map;

    }
}
