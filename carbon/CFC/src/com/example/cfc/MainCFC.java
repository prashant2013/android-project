package com.example.cfc;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainCFC extends Activity {
	
	EditText electricity, petrol, diesel, lpg;
	TextView res;
	
	
	public void compute(View v)
	{
		String a, b, c,d;
		Double vis;
		a=electricity.getText().toString();
		b=petrol.getText().toString();
		c=diesel.getText().toString();
		d=lpg.getText().toString();
		
		vis=(((Integer.parseInt(a)*0.85)+(Integer.parseInt(b)*2.296)+(Integer.parseInt(c)*2.653)+(Integer.parseInt(d)*2.983))/1000);
		res.setText(vis.toString());
		
	}
	
	

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_cfc);

	
		electricity = (EditText) findViewById(R.id.elc);
		petrol = (EditText) findViewById(R.id.p);
		diesel = (EditText) findViewById(R.id.d);
		lpg = (EditText) findViewById(R.id.l);
		
		res = (TextView) findViewById(R.id.result);
		
		
				
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_cfc, menu);
		return true;
	}

}
