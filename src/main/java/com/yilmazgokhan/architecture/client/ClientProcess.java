package com.yilmazgokhan.architecture.client;

import okhttp3.OkHttpClient;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.yilmazgokhan.architecture.util.Constants.Client.BASE_URL;

@Service
public class ClientProcess {

    //region
    private Retrofit retrofitClient;
    //endregion

    public ClientProcess() {
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        retrofitClient = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpClient.build())
                .build();
    }

    public void sendRequest(Object obj) {
        ClientService service = retrofitClient.create(ClientService.class);
        Call<Object> call = service.sendRequest();
        call.enqueue(new Callback<Object>() {
            @Override
            public void onResponse(Call<Object> call, Response<Object> response) {
                // TODO: Handle response here.
            }

            @Override
            public void onFailure(Call<Object> call, Throwable throwable) {
                System.out.println(throwable.getCause().toString());
            }
        });
    }
}