package com.safetynet.safetynetalerts.configuration;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Value;
import net.minidev.json.JSONArray;
import net.minidev.json.parser.JSONParser;
import net.minidev.json.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

@JsonIgnoreProperties(ignoreUnknown = true)
public class JsonInput {

//    public static void main(String[] args) {
//
//        JSONParser jsonParser = new JSONParser();
//
//        try (FileReader reader = new FileReader("data.json")){
//
//            //Lecture du fichier Json
//            Object obj = jsonParser.parse(reader);
//
//            JSONArray emptyList = (JSONArray) obj;
//
//            System.out.println(emptyList);
//
//        }
//        catch (FileNotFoundException e){
//            e.printStackTrace();
//        }catch (IOException e){
//            e.printStackTrace();
//        }catch (ParseException e){
//            e.printStackTrace();
//        }
//    }
}
