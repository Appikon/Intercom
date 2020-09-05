package com.appikon.intercom;


import com.fasterxml.jackson.databind.ObjectMapper;
import kong.unirest.JacksonObjectMapper;
import kong.unirest.Unirest;
import org.json.JSONObject;

public class IntercomUtil {
    public static GetContactResponse findUser(String shop, String token) {
        JSONObject params = new JSONObject();
        JSONObject query = new JSONObject();
        query.put("field", "external_id");
        query.put("operator", "=");
        query.put("value", shop);
        params.put("query", query);
        try {

            String response = Unirest.post("https://api.intercom.io/contacts/search")
                    .header("Authorization", "Bearer " + token)
                    .header("Content-Type", "application/json")
                    .header("Accept", "application/json")
                    .body(params)
                    .asString()
                    .getBody();

            GetContactResponse intercomResponse = new ObjectMapper().readValue(response, GetContactResponse.class);
            return intercomResponse;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static CreateContactResponse createUser(String shop, String token) {
        JSONObject params = new JSONObject();
        params.put("role", "user");
        params.put("external_id", shop);
        try {

            String response = Unirest.post("https://api.intercom.io/contacts")
                    .header("Authorization", "Bearer " + token)
                    .header("Content-Type", "application/json")
                    .header("Accept", "application/json")
                    .body(params)
                    .asString()
                    .getBody();

            CreateContactResponse intercomResponse = new ObjectMapper().readValue(response, CreateContactResponse.class);
            return intercomResponse;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static CreateContactResponse updateContact(Datum body, String token) {
        try {
            Unirest.config().setObjectMapper(new JacksonObjectMapper());
            String response = Unirest.put("https://api.intercom.io/contacts/" + body.getId())
                    .header("Authorization", "Bearer " + token)
                    .header("Content-Type", "application/json")
                    .header("Accept", "application/json")
                    .body(body)
                    .asString()
                    .getBody();

            CreateContactResponse intercomResponse = new ObjectMapper().readValue(response, CreateContactResponse.class);
            return intercomResponse;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
