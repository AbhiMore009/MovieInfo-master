package ir.orangehat.movieinfo.application;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;
import ir.orangehat.movieinfo.R;
import ir.orangehat.movieinfo.di.DaggerAppComponent;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * BaseApplication
 */

public class BaseApplication extends DaggerApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/Dosis_Regular.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
    }

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerAppComponent.builder().application(this).build();
    }
}
