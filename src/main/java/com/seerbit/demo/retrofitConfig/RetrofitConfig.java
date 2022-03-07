package com.seerbit.demo.retrofitConfig;

import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import com.seerbit.demo.payoutAPIService.PayoutAPICallService;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitConfig {
	 @Value("${base.seerbit.url}")
	    private String seerbiturl;

	    private static Retrofit buildRetrofit(String baseUrl, OkHttpClient client) {
	        return new Retrofit.Builder()
	                .addConverterFactory(defaultConverter())
	                .addCallAdapterFactory(defaultCallAdapter())
	                .client(client)
	                .baseUrl(baseUrl)
	                .build();
	    }

	    private static retrofit2.Converter.Factory defaultConverter() {
	        return GsonConverterFactory.create();
	    }

	    private static retrofit2.CallAdapter.Factory defaultCallAdapter() {
	        return RxJava2CallAdapterFactory.create();
	    }

	    @Bean
	    public PayoutAPICallService gitHubService() {
	        final Logger logger = LoggerFactory.getLogger(PayoutAPICallService.class);
	        final OkHttpClient okHttpClient = new OkHttpClient.Builder()
	                .connectTimeout(10, TimeUnit.SECONDS)
	                .addInterceptor(chain -> {
	                    Request request = chain.request();
	                    logger.info("Sending request to url: {}", request.url());
	                    Response response = chain.proceed(request);
	                    logger.info("Received response for call: {}", request.url());
	                    return response;
	                })
	                .build();
	        final Retrofit retrofit = buildRetrofit(seerbiturl, okHttpClient);

	        return retrofit.create(PayoutAPICallService.class);
	    }
}
