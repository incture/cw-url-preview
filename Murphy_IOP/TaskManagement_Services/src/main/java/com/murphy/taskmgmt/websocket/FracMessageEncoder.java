package com.murphy.taskmgmt.websocket;

import javax.websocket.EncodeException;
import javax.websocket.Encoder;
import javax.websocket.EndpointConfig;

import com.google.gson.Gson;

public class FracMessageEncoder implements Encoder.Text<FracMessage> {
 
    private static Gson gson = new Gson();
 
    @Override
    public String encode(FracMessage message) throws EncodeException {
        return gson.toJson(message);
    }
 
    @Override
    public void init(EndpointConfig endpointConfig) {
        // Custom initialization logic
    }
 
    @Override
    public void destroy() {
        // Close resources
    }
}
