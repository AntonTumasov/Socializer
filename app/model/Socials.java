package model;

import com.fasterxml.jackson.databind.JsonNode;
import java.util.Date;
import java.util.Map;

/**
 * Created by Admin on 14.11.2015.
 */
public interface Socials {
    public Integer getLikes(String targetType, Date dateFrom, Date dateTo);
    public Integer getReposts(String targetType, Date dateFrom, Date dateTo);
    public Map<String,Integer> getPeopleLikes(String targetType, Date dateFrom, Date dateTo);
    public Map<String,Integer> getPeopleReposts(String targetType, Date dateFrom, Date dateTo);
    public Map<String,String> getUserInfo(String userId);
}
