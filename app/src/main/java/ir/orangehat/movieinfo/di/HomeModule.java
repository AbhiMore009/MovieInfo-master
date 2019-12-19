package ir.orangehat.movieinfo.di;


import dagger.Module;
import dagger.Provides;
import ir.orangehat.movieinfo.bussines.networking.api.MovieApi;
import retrofit2.Retrofit;

@Module
public abstract class HomeModule {

    @Provides
    static MovieApi provideSessionApi(Retrofit retrofit){
        return retrofit.create(MovieApi.class);
    }

}

