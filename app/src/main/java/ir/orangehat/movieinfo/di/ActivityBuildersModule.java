package ir.orangehat.movieinfo.di;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import ir.orangehat.movieinfo.application.ui.home.HomeActivity;

@Module
public abstract class ActivityBuildersModule {

    @ContributesAndroidInjector(
            modules = {MainViewModelsModule.class,HomeModule.class}
    )


    abstract HomeActivity contributeAuthActivity();
}
