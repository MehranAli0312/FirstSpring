package com.example.sample.service;

import com.example.sample.dao.DataBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class RPSgameServiceLayer {

    @Autowired
    DataBase dataBase;
    public HashMap<String,String> information(){
       return dataBase.getDataitem();
    }
    String result="Khan";
    public String match(String compTeam,String userTeam)
    {

        // Select 1 for Rock, 2 for Paper or 3 for Scissor
//result="kkk";
//result=compTeam+userTeam;
        if(compTeam.equals("ROCK")){                    // ROCK
//            result= "\tComputer Team : "+compTeam+"\n\tUser Team : "+
//                    "\n\t Computer and User Have Tied ";
            if(userTeam.equals("ROCK")){
                result= "\tComputer Team : "+compTeam+"\n\tUser Team : "+userTeam+
                        "\n\t Computer and User Have Tied ";
            }
            else if(userTeam.equals("PAPER")){
                result= "\tComputer Team : "+compTeam+"\n\tUser Team : "+userTeam+
                        "\n\t User Win The Game";
            }
            else if(userTeam.equals("SCISSOR")){
                result= "\tComputer Team : "+compTeam+"\n\tUser Team : "+userTeam+
                        "\n\t Computer Win The Game";
            }
        }
        else if (compTeam.equals("PAPER")){            // PAPER

            if(userTeam.equals("ROCK")){
                result= "\tComputer Team : "+compTeam+"\n\tUser Team : "+userTeam+
                        "\n\tComputer Win  the game";
            }
            else if(userTeam.equals("PAPER")){
                result= "\tComputer Team : "+compTeam+"\n\tUser Team : "+userTeam+
                        "\n\tComputer and User Have Tied";
            }
            else if(userTeam.equals("SCISSOR")){
                result= "\tComputer Team : "+compTeam+"\n\tUser Team : "+userTeam+
                        "\n\t User Win The Game";
            }
        }
        else if(compTeam.equals("SCISSOR")){           // SCISSOR

            if(userTeam.equals("ROCK")){
                result= "\tComputer Team : "+compTeam+"\n\tUser Team : "+userTeam+
                        "\n\tUser Win  the game";
            }
            else if(userTeam.equals("PAPER")){
                result= "\tComputer Team : "+compTeam+"\n\tUser Team : "+userTeam+
                        "\n\tComputer Win the Game";
            }
            else if(userTeam.equals("SCISSOR")){
                result= "\tComputer Team : "+compTeam+"\n\tUser Team : "+userTeam+
                        "\n\t Computer and User Have Tied";
            }
        }
        return "\n\n\t ************          *************\n"+result;
    }
}
