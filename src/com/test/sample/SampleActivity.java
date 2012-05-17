package com.test.sample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SampleActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    public void onClick(View v) {
    	switch (v.getId()) {
			case R.id.button1:
				startActivity(new Intent(this, SampleListView.class));
				break;
			
			default:
				break;
		}
    }
}