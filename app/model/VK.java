package model;

import com.fasterxml.jackson.databind.JsonNode;
import play.libs.F;
import play.libs.ws.WS;
import play.libs.ws.WSRequest;
import play.mvc.Result;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Admin on 14.11.2015.
 */
public class VK {
    public Integer getLikes(String targetType, Date dateFrom, Date dateTo) {
        return null;
    }
    public Integer getLikes(String targetType) {
        return null;
    }
    public Integer getReposts(String targetType, Date dateFrom, Date dateTo){
        return null;
    }
    public Integer getReposts(String targetType){
        return null;
    }
    public Map<String,Integer> getPeopleLikes(String targetType, Date dateFrom, Date dateTo){
        return null;
    }
    public Map<String,Integer> getPeopleReposts(String targetType, Date dateFrom, Date dateTo){
        return null;
    }

    /**
     *
     * @param userId
     * @return HashMap [fullname -> userName, imgSrc -> imgSrc]
     */
    public static F.Promise<Map<String, String>> getUserInfo(String userId) {
        WSRequest holder = WS.url("https://api.vk.com/method/users.get")
                .setRequestTimeout(3000)
                .setQueryParameter("user_ids",userId)
                .setQueryParameter("fields","photo_max_orig")
                .setQueryParameter("name_case","Nom")
                .setContentType("application/json;charset=UTF-8");

        F.Promise<Map<String, String>> responsePromise = holder.get().map(res -> {

            Map<String, String> userInfo = new HashMap<>();

            JsonNode resJSON = res.asJson();

            System.out.println(resJSON.toString());

            String imgSrc = resJSON.findPath("photo_max_orig").asText();
            String fullName = resJSON.findPath("first_name").asText() + " " + resJSON.findPath("last_name").asText();

            userInfo.put("fullname",fullName);
            userInfo.put("imgSrc",imgSrc);

            return userInfo;
        });

        return responsePromise;
    }
}
