package com.informatika.databarang.newtwork;

import java.util.List;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;

public interface ApiService {
    @GET(value: "users")
    fun getUser() : Call<List<ResponseUsersItem?>>
}
