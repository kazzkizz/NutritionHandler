package no.uib.nutritionapplication;

/*
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class AddMealActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_meal);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_add_meal, menu);
        return true;
    }
}
*/



import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
 
public class AddMealActivity extends Activity{
	
    public ArrayList<String> MealItems = new ArrayList<String>();
    public FoodItem foodItem1 = new FoodItem("Bread", 17, 35, 170, 99, "One slice of morning bread");
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_add_meal);
            
        Intent intent = getIntent();
        String message = intent.getStringExtra(SearchActivity.EXTRA_MESSAGE);
        
        // Create the text view
        TextView textView = new TextView(this);
        textView.setTextSize(20);
        textView.setText(foodItem1.toString());

        // Set the text view as the activity layout
        setContentView(textView);
        
        

 
    }
}