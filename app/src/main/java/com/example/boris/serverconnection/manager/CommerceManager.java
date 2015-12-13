package com.example.boris.serverconnection.manager;

import android.content.Context;
import android.widget.Toast;

import com.example.boris.serverconnection.BuildConfig;
import com.example.boris.serverconnection.model.Commerce;
import com.example.boris.serverconnection.service.CommerceService;

import java.util.List;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;
import timber.log.Timber;
import de.greenrobot.event.EventBus;


/**
 * Created by boris on 12/12/2015.
 */
public class CommerceManager {

    CommerceService commerceService;
    Context context;
    EventBus bus;

    public CommerceManager (Context context) {
        this.context = context;
        this.commerceService = new RestAdapter.Builder().setEndpoint(BuildConfig.rootUrl).build().create(CommerceService.class);
    }

    public void getCommerce () {
        commerceService.getCommerce(new Callback<List<Commerce>>() {
            @Override
            public void success (List<Commerce> commerces, Response response) {
                /*Timber.d("getting games : %s ", commerces);
                bus.post(commerces);*/
                Toast.makeText(context, commerces.toString(), Toast.LENGTH_LONG).show();
            }

            @Override
            public void failure(RetrofitError error) {
                Toast.makeText(context, "impossible de charger les commerces", Toast.LENGTH_LONG).show();
            }
        });
    }
}
