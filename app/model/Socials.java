package model;

import com.fasterxml.jackson.databind.JsonNode;
import java.util.Date;
import java.util.Map;

/**
 * Created by Admin on 14.11.2015.
 */
public interface Socials {
    //dirty hack for implementing
    public static Integer getLikes(String userId, String targetType, Date dateFrom, Date dateTo) {
        return null;
    }

    public static Integer getLikes(String userId, String targetType) {
        return null;
    }

    public static Integer getReposts(String userId, String targetType, Date dateFrom, Date dateTo) {
        return null;
    }

    public static Integer getReposts(String userId, String targetType){
        return null;
    }


    public static Map<String, Integer> getPeopleLikes(String userId, String targetType, Date dateFrom, Date dateTo) {
        return null;
    }


    public static Map<String, Integer> getPeopleReposts(String userId, String targetType, Date dateFrom, Date dateTo) {
        return null;
    }


    public static Map<String, String> getUserInfo(String userId) {
        return null;
    }
}