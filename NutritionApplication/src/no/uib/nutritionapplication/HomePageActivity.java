package no.uib.nutritionapplication;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class HomePageActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_home_page, menu);
        return true;
    }
    
    public void searchFood(View view) {
        Intent intent = new Intent(this, SearchActivity.class);
         startActivity(intent);
     }
    
    public void onClickOpenPreferences(View view) {
    	Intent intent = new Intent(this, AppPreferenceActivity.class);
    	startActivity(intent);
    }   
}
