package com.example.sdcard;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     Button b1=(Button)findViewById(R.id.button1);
     b1.setOnClickListener(new View.OnClickListener(){

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			
			
		}
    	 
     });
  
     Button b2=(Button)findViewById(R.id.button2);
     b2.setOnClickListener(new View.OnClickListener(){

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			
		}
    	 
     });
    }
  
}
