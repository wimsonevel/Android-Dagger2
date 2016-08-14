package example.wim.androiddagger2;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Wim on 8/12/16.
 */
@Module
public class UserModule {

    @Provides
    @Singleton
    public UserService provideUserService() {
        return new UserService(new User());
    }

}