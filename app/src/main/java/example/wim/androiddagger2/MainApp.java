package example.wim.androiddagger2;

import android.app.Application;

/**
 * Created by Wim on 8/7/16.
 */
public class MainApp extends Application {

    DiComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerDiComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    public DiComponent getComponent() {
        return component;
    }

}