package com.example.sdcard;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView tv=(TextView)findViewById(R.id.textView1);
        final EditText eText = (EditText) findViewById(R.id.editText1);
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
        		String str = eText.getText().toString();
        		try {
                    FileInputStream fin = openFileInput("SDCard.txt");
                    int c;
                    String temp="";
                    while( (c = fin.read()) != -1){
                       temp = temp + Character.toString((char)c);
                    }
                    tv.setText(temp);
                    Toast.makeText(getBaseContext(),"file read",Toast.LENGTH_SHORT).show();
                 }
                 catch(Exception e){
                 }
        	}
    	 
        });
    	}
}
	
