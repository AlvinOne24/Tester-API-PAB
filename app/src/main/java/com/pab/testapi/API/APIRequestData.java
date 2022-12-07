package com.pab.testapi.API;

import com.pab.testapi.Model.KarakterModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIRequestData {
    @GET("karakter")
    Call<List<KarakterModel>> ardGet();
}
