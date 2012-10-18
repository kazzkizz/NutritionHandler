package no.uib.nutritionapplication;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class NutritionHandler extends Activity {

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
    	 
    	 /** EditText-field for personal information **/
    	 
         EditText editName = (EditText) findViewById(R.id.enter_name);
         String nameString = editName.getText().toString();
         intent.putExtra("name", nameString);
        
         EditText editAge = (EditText) findViewById(R.id.enter_age);
         String ageNumber= editAge.getText().toString();
         intent.putExtra("age", ageNumber);

         EditText editHeight = (EditText) findViewById(R.id.enter_height);
         String heightNumber=editHeight.getText().toString();
         intent.putExtra("height", heightNumber);

         EditText editWeight = (EditText) findViewById(R.id.enter_weight);
         String weightNumber= editWeight.getText().toString();
         intent.putExtra("weight", weightNumber);

         EditText editGender = (EditText) findViewById(R.id.enter_gender);
         String genderString= editGender.getText().toString();
         intent.putExtra("gender", genderString);

         startActivity(intent);
     }
    
    
    public void searchFood(View view) {
        Intent intent = new Intent(this, SearchActivity.class);
         startActivity(intent);
     }
    
    public void openActivityLevel(View view) {
    	Intent intent = new Intent(this, ActivityLevel.class);
    	startActivity(intent);
    }

    
}
