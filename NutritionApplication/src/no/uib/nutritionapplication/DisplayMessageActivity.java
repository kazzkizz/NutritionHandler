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
	private String age;
	private String height;
	private String weight;
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
	    	this.age = userData.getString("age");
	    	this.height = userData.getString("height");
	    	this.weight = userData.getString("weight");
	    	this.gender = userData.getString("gender");
	    	
	    	this.nameTextView = (TextView) findViewById(R.id.nameText);
	        this.ageTextView = (TextView) findViewById(R.id.ageText);
	        this.heightTextView = (TextView) findViewById(R.id.heightText);
	        this.weightTextView = (TextView) findViewById(R.id.weightText);
	        this.genderTextView = (TextView) findViewById(R.id.genderText);
	    
		    this.nameTextView.setText(this.name);
		    this.ageTextView.setText(this.age);
		    this.heightTextView.setText(this.height);
		    this.weightTextView.setText(this.weight);
		    this.genderTextView.setText(this.gender);
		    
	    }
	}
 
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
