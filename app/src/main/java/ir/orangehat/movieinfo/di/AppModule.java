package ir.orangehat.movieinfo.di;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import ir.orangehat.movieinfo.BuildConfig;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class AppModule {

    @Singleton
    @Provides
    static Retrofit provideRetrofitInstance(){
       /* return new Retrofit.Builder()
                .baseUrl(BuildConfig.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();*/


        return new Retrofit.Builder()
                .baseUrl(BuildConfig.BASE_URL)
                .client(new OkHttpClient().newBuilder().
                        addNetworkInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)).build())
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create()).build();
    }


}
