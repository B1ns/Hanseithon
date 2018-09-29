package com.example.trends;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

public interface RetrofitService {
    @GET("https://bus.wpws.kr/api/hanseithon/naver.php/")
    Call<RetrofitRepo> getIndex(
            @Query("name") String name
    );

    @GET("https://bus.wpws.kr/api/hanseithon/naver.php/")
    Call<RetrofitRepo> getItem(
            @QueryMap Map<String, String> option
    );

     @FormUrlEncoded
    @POST("https://bus.wpws.kr/api/hanseithon/naver.php/")
    Call<RetrofitRepo> getPost(
            @Field("name") String name
    );
}
