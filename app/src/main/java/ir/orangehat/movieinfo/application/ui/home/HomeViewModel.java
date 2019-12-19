package ir.orangehat.movieinfo.application.ui.home;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;
import android.support.annotation.NonNull;

import java.util.List;

import javax.inject.Inject;

import ir.orangehat.movieinfo.bussines.model.Movie;
import ir.orangehat.movieinfo.bussines.networking.api.MovieApi;
import ir.orangehat.movieinfo.bussines.repository.MovieRepository;

/**
 * HomeViewModel
 */

public class HomeViewModel extends ViewModel {

    private MovieRepository movieRepository;


    @Inject
    HomeViewModel(@NonNull Application application,MovieApi movieApi) {
        //super(application);
        movieRepository = new MovieRepository(application.getApplicationContext(),movieApi);
    }

    LiveData<List<Movie>> getMovies() {
        return movieRepository.getMovies();
    }
}
