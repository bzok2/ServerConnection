package com.example.boris.serverconnection.service;

import com.example.boris.serverconnection.model.Commerce;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by boris on 12/12/2015.
 */
public interface CommerceService {

    @GET("/commerces")
    public void getCommerce(Callback<List<Commerce>> commerces);
}
