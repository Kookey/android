package com.flux.asynctask;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URLConnection;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class ImageActivity extends Activity {

	private ImageView imgView;
	private ProgressBar bar;
	final String URL = "http://www.apkbus.com/data/attachment/forum/201505/22/170048dko4r8znewnceexq.png";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.image);
		imgView = (ImageView) findViewById(R.id.imgView);
		bar = (ProgressBar) findViewById(R.id.progressBar1);
		new ImgAsyncTask().execute(URL);
	}
	
	
	class ImgAsyncTask extends AsyncTask<String, Void, Bitmap>{

		@Override
		protected void onPreExecute() {
			bar.setVisibility(View.VISIBLE);
			super.onPreExecute();
		}
		@Override
		protected Bitmap doInBackground(String... urls) {
			Bitmap map = null;
			String url = urls[0];
			URLConnection conn = null;
			InputStream is = null;
			try {
				conn = new java.net.URL(url).openConnection();
				is = conn.getInputStream();
				BufferedInputStream stream = new BufferedInputStream(is);
				map = BitmapFactory.decodeStream(stream);
				is.close();
				stream.close();
			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			return map;
		}
		
		@Override
		protected void onPostExecute(Bitmap result) {
			super.onPostExecute(result);
			imgView.setImageBitmap(result);
			bar.setVisibility(View.GONE);
		}
		
	}
}
