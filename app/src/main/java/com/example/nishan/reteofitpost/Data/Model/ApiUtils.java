package com.example.nishan.reteofitpost.Data.Model;

import com.example.nishan.reteofitpost.Data.Model.Remote.APIService;
import com.example.nishan.reteofitpost.Data.Model.Remote.RetrofitClient;

public class ApiUtils {

    private ApiUtils() {}

    public static final String BASE_URL = "http://jsonplaceholder.typicode.com/";

    public static APIService getAPIService() {

        return RetrofitClient.getClient(BASE_URL).create(APIService.class);
    }
}
