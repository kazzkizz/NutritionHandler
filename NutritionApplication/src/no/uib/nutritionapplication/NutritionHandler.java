package no.uib.nutritionapplication;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

public class NutritionHandler extends Activity {
	
	public final static String EXTRA_MESSAGE = "no.uib.nutritionapplication.MESSAGE";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
         EditText editName = (EditText) findViewById(R.id.enter_name);
         String message = editName.getText().toString();
         intent.putExtra(EXTRA_MESSAGE, message);

         EditText editAge = (EditText) findViewById(R.id.enter_age);
         String message1 = editAge.getText().toString();
         intent.putExtra(EXTRA_MESSAGE, message1);

         EditText editHeight = (EditText) findViewById(R.id.enter_height);
         String message2 = editHeight.getText().toString();
         intent.putExtra(EXTRA_MESSAGE, message2);

         EditText editWeight = (EditText) findViewById(R.id.enter_weight);
         String message3 = editWeight.getText().toString();
         intent.putExtra(EXTRA_MESSAGE, message3);

         EditText editGender = (EditText) findViewById(R.id.enter_gender);
         String message4 = editGender.getText().toString();
         intent.putExtra(EXTRA_MESSAGE, message4);

         startActivity(intent);
     }
    
    public void searchFood(View view) {
        Intent intent = new Intent(this, SearchActivity.class);
         startActivity(intent);
     }
}
