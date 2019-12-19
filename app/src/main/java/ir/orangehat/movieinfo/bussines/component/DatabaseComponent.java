package ir.orangehat.movieinfo.bussines.component;

import javax.inject.Singleton;

import ir.orangehat.movieinfo.bussines.persistance.database.BaseDatabaseHelper;

@Singleton
public interface DatabaseComponent {

    BaseDatabaseHelper provideDataBaseHelper();
}
