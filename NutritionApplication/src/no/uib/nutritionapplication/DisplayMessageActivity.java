package no.uib.nutritionapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class DisplayMessageActivity extends Activity {
	
	private String name;
	private int age;
	private int height;
	private int weight;
	private String gender;
	
	private TextView nameTextView; 
    private TextView ageTextView;
    private TextView heightTextView;
    private TextView weightTextView;
    private TextView genderTextView;

	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    
	    /** Retrieve the data from the intent and add them to textview's  **/
	    
	    setContentView(R.layout.activity_display_message);
	    Bundle userData = getIntent().getExtras(); 
	    
	    if(userData != null) {
	    	this.name = userData.getString("name");
	    	this.age = userData.getInt("age");
//	    	height = userData.getInt("height");
//	    	weight = userData.getInt("weight");
//	    	gender = userData.getString("gender");
	    	
	    	this.nameTextView = (TextView) findViewById(R.id.nameText);
	        this.ageTextView = (TextView) findViewById(R.id.ageText);
	        this.heightTextView = (TextView) findViewById(R.id.heightText);
	        this.weightTextView = (TextView) findViewById(R.id.weightText);
	        this.genderTextView = (TextView) findViewById(R.id.genderText);
	    
		    this.nameTextView.setText(this.name);
		    this.ageTextView.setText(this.age);
		    
	    }
	}

//    // Get the message from the intent
//    Intent intent = getIntent();
//    
//    //Used to get data from the value-pair.
//    Bundle bundle = intent.getExtras();
//    String name = (String) bundle.get("name");
    
//    // Create the text view
//    TextView textView = new TextView(this);
//    textView.setTextSize(40);
//    textView.setText(name);

    // Set the text view as the activity layout
//    setContentView(nameTextView);
	   
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_display_message, menu);
        return true;
    }

    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
