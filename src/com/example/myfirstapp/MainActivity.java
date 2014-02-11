package com.example.myfirstapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;

import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_main);
	}
	private EditText et;
	private TextView tv; 
	

	public void buttonOnClick(View v){
				
			et =(EditText) findViewById(R.id.input_text);
			tv = (TextView) findViewById(R.id.output_text);
			tv.setText(et.getText());
			
	}
		


}
