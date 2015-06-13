package com.flux.asynctask;

import android.os.AsyncTask;
import android.util.Log;

public class MyAsyncTask extends AsyncTask<Void, Void, Void> {

	private final String TAG = "MyAsyncTask";
	@Override
	protected Void doInBackground(Void... params) {
		Log.e(TAG, "doInBackground");
		return null;
	}

	@Override
	protected void onPostExecute(Void result) {
		super.onPostExecute(result);
		Log.e(TAG, "onPostExecute");
	}

	@Override
	protected void onPreExecute() {
		super.onPreExecute();
		Log.e(TAG, "onPreExecute");
	}

	@Override
	protected void onProgressUpdate(Void... values) {
		super.onProgressUpdate(values);
		Log.e(TAG, "onProgressUpdate");
	}
}
