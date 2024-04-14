package com.todo.datamachine;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface JsonPlaceholderAPI {
    @GET("posts")
    Call<List<Post>> getPosts(@Query("_page") int page, @Query("_limit") int limit);
}
