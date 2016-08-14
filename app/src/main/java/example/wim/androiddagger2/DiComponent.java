package example.wim.androiddagger2;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Wim on 8/7/16.
 */
@Singleton
@Component(modules = {AppModule.class, UserModule.class})
public interface DiComponent {

    void inject(MainActivity activity);

}