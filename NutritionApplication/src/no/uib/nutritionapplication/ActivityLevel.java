package no.uib.nutritionapplication;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class ActivityLevel extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_level);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_activity_level, menu);
        return true;
    }
}
