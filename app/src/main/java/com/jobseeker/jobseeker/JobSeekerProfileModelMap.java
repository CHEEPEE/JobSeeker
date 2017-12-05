package com.jobseeker.jobseeker;

import com.google.firebase.database.Exclude;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Keji's Lab on 06/12/2017.
 */

public class JobSeekerProfileModelMap {
    public String userEmail;
    public String UserName;
    public String Address;
    public String city;
    public String state;

    public JobSeekerProfileModelMap(String email,String name,String Add,String mcity,String mstate){
        this.userEmail = email;
        this.UserName = name;
        this.Address = Add;
        this.city = mcity;
        this.state = mstate;
    }
    public JobSeekerProfileModelMap(){

    }
    @Exclude
    public Map<Object,String> toMap(){
        HashMap<Object,String> result = new HashMap<>();
        result.put("userEmail",userEmail);
        result.put("UserName",UserName);
        result.put("Address",Address);
        result.put("city",city);
        result.put("state",state);
        return result;
    }
}
