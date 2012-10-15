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
         intent.putExtra("name", message);
         
//         Used to get data from the value-pair.
//         Bundle b =intent.getExtras();
//         String n = (String) b.get("name");
         
         
         EditText editAge = (EditText) findViewById(R.id.enter_age);
         String ageString= editAge.getText().toString();
         intent.putExtra("age", ageString);

         EditText editHeight = (EditText) findViewById(R.id.enter_height);
         String heightString = editHeight.getText().toString();
         intent.putExtra("height", heightString);

         EditText editWeight = (EditText) findViewById(R.id.enter_weight);
         String weightString = editWeight.getText().toString();
         intent.putExtra("weight", weightString);

         EditText editGender = (EditText) findViewById(R.id.enter_gender);
         String genderString= editGender.getText().toString();
         intent.putExtra("gender", genderString);

         startActivity(intent);
     }
    
    public void searchFood(View view) {
        Intent intent = new Intent(this, SearchActivity.class);
         startActivity(intent);
     }
}
