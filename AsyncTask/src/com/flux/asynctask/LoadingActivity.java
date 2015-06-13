package com.flux.asynctask;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ProgressBar;

public class LoadingActivity extends Activity {

	private ProgressBar bar;
	LoadingAsyncTask task;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.loading);
		
		bar = (ProgressBar) findViewById(R.id.seekBar1);
		task= new LoadingAsyncTask();
		task.execute();
	}
	
	@Override
	protected void onPause() {
		super.onPause();
		if(task!=null&&task.getStatus()==AsyncTask.Status.RUNNING){
			//cancle 只是将对应的AsyncTask标志为cancle状态，并不是真正取消线程
			task.cancel(true);
		}
	}
	
	class LoadingAsyncTask extends AsyncTask<Void, Integer, Void>{

		@Override
		protected Void doInBackground(Void... params) {
			for (int i = 1; i < 100; i++) {
				if(isCancelled()){
					break;
				}
				publishProgress(i);
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			return null;
		}

		@Override
		protected void onPostExecute(Void result) {
			super.onPostExecute(result);
		}

		@Override
		protected void onPreExecute() {
			super.onPreExecute();
		}

		@Override
		protected void onProgressUpdate(Integer... values) {
			super.onProgressUpdate(values);
			if(isCancelled()){
				return;
			}
			bar.setProgress(values[0]);
		}
		
	}
}
