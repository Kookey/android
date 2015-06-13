package com.flux.asynctask;

import android.os.AsyncTask;
import android.util.Log;

/**
 * 构建AsyncTask子类的回调函数
 * doInBackground 必须重写，异步操作后台线程将要完成的任务
 * 
 * onPreExecute  执行后台耗时操作前被调用,通常用户完成一些初始化工作
 * 
 * onPostExecute  当doInBackground完成后，系统会自动调用并把doInBackground方法的返回值传递给改该方法
 * 
 * onProgressUpdate 在doInBackground方法中调用publishProgress更新任务的执行进度后，就会触发该方法
 * 
 * @author wangxl
 *
 */

public class MyAsyncTask extends AsyncTask<Void, Void, Void> {

	private final String TAG = "MyAsyncTask";
	@Override
	protected Void doInBackground(Void... params) {
		Log.e(TAG, "doInBackground");
		publishProgress();
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
