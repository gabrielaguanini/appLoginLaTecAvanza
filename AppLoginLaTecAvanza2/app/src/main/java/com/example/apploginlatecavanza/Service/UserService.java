package com.example.apploginlatecavanza.Service;

import com.example.apploginlatecavanza.Models.LoginRequest;
import com.example.apploginlatecavanza.Models.LoginResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface UserService {

    @POST("generate-token")
    Call<LoginResponse> userLogin(@Body LoginRequest loginRequest);

}
