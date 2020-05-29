package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;


public class JacksonManager {

    public static String serialize(GameConfiguration gameConfiguration) {
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonData = "";
        try {
            return jsonData = objectMapper.writeValueAsString(gameConfiguration);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return jsonData;
        }
    }

    public static GameConfiguration deserialize(String filepath) {
        ObjectMapper objectMapper = new ObjectMapper();
        GameConfiguration gameConfiguration = new GameConfiguration();
        try {
            return gameConfiguration = objectMapper.readValue(GameReader.readFile(filepath), GameConfiguration.class);
        } catch (IOException e) {
            e.printStackTrace();
            return gameConfiguration;
        }
    }

}
