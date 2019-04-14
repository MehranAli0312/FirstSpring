package com.example.sample.controller;


import com.example.sample.model.GameDto;
import com.example.sample.service.RPSgameServiceLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Path;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

@RestController
@RequestMapping("/getUsers")
public class Controler<UserRest> {

    @Autowired
RPSgameServiceLayer rpSgameServiceLayer;
    @GetMapping(path = "/file")
    public HashMap<String,String> file(){
        return rpSgameServiceLayer.information();
    }
    RPSgameServiceLayer obj=new RPSgameServiceLayer();
    //getUser jsonObj=new getUser();

//    @RequestMapping(method = RequestMethod.POST
////            produces ={
////                    MediaType.APPLICATION_JSON_VALUE,
////                    MediaType.APPLICATION_ATOM_XML_VALUE,
////
////                    }
//                   )
////    public String getUsers(@RequestParam ("compTeam") String team1,@RequestParam ("userTeam") String team2 ) {
//       String resulT=obj.match(team1.toUpperCase(),team2.toUpperCase());
//        return "  "+resulT;
//    }

//    @PostMapping(path="/{userId}")
//    public int name(@PathVariable int userId)
//    {
//        return userId;
//    }

//@PostMapping(path = "game")
//    public GameDto playGame(@RequestBody GameDto dto){
//// @RequestBody enables matching json body of the incoming request to dto
//
//    String resulT=obj.match(dto.getCompTeam().toUpperCase(),dto.getUserTeam().toUpperCase());
//
//    dto.setResult(resulT);
//    return dto;
//}

            // New Project...............

    public  void  getDataitem(){
        ArrayList<String > studentTokens = new ArrayList<String>();
        String strLine = null;

        try{
            // Open the file that is the first
            // command line parameter
            FileInputStream fstream = new  FileInputStream("D:/javaRead.txt");

            // Get the object of DataInputStream
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            //String strLine;

            //Read File Line By Line
            while ((strLine = br.readLine()) != null)   {
                // Print the content on the console
                HashMap<String,String> map=new HashMap<String, String>();
                map.put("Item ",strLine);
                System.out.println (strLine);

            }

            //Close the input stream
            in.close();
        }catch (Exception e){//Catch exception if any
            System.err.println("Error: " + e.getMessage());
        }

    }

}

