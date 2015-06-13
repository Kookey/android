package com.flux.asynctask;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	private Button bt;
	private Button urlLink,progressBtn;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		bt = (Button) findViewById(R.id.button1);
		bt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				new MyAsyncTask().execute();
			}
		});
		
		urlLink = (Button) findViewById(R.id.urlLink);
		urlLink.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View view) {
				Intent intent = new Intent(MainActivity.this, ImageActivity.class);
				startActivity(intent);
			}
		});
		progressBtn = (Button) findViewById(R.id.progressBtn);
		progressBtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View view) {
				Intent intent = new Intent(MainActivity.this, LoadingActivity.class);
				startActivity(intent);
			}
		});
	}
}
