package ir.orangehat.movieinfo.di;


import android.arch.lifecycle.ViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;
import ir.orangehat.movieinfo.application.ui.home.HomeViewModel;

@Module
public abstract class MainViewModelsModule {

    @Binds
    @IntoMap
    @ViewModelKey(HomeViewModel.class)
    public abstract ViewModel bindHomeViewModel(HomeViewModel viewModel);

}
