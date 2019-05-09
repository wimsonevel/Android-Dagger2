package example.wim.androiddagger2;

import android.content.SharedPreferences;

import android.os.Bundle;
import android.widget.TextView;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    UserService userService;

    @Inject
    SharedPreferences sharedPref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView message = (TextView) findViewById(R.id.message);

        ((MainApp) getApplication()).getComponent().inject(this);

        userService.addNewUser("1", "Wim", "Sonevel");

        sharedPref.edit()
                .putString(userService.getUser().getId(), userService.getUser().toString())
                .apply();

        message.setText("New User Inserted : " + sharedPref.getString(userService.getUser().getId(), ""));
    }
}
