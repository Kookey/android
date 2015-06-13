package com.flux.comnonadapter;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.flux.adapter.MyAdapter;
import com.flux.bean.LostInfo;

public class MainActivity extends Activity {

	private List<LostInfo> datas;
	private ListView listView;
	private MyAdapter adapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		/**
		 * ׼��Ĭ�����ݼ�
		 */
		populateData();
		
		/**
		 * ��ʾlistView
		 */
		initView();
	}
	private void initView() {
		
		listView = (ListView) findViewById(R.id.listView);
		adapter = new MyAdapter(datas,MainActivity.this, R.layout.listview_item);
		listView.setAdapter(adapter);
	}
	private void populateData() {
datas = new ArrayList<LostInfo>();
		
		datas.add(new LostInfo("��Ůһֻ", "�ڲٳ��񵽵�һֻ����������", "2015��5��28�� 14:10:53", "1"));
		datas.add(new LostInfo("˭�ĺ�ɫǮ��", "һ�ͼ����ģ�����λ��", "2015��5��28�� 14:11:01", "2"));
		datas.add(new LostInfo("����A��", "����A�Ρ�����ͬ��", "2015��5��28�� 14:11:06", "3"));
		datas.add(new LostInfo("�������ϲᡷ", "˭�ĸ����鰡��", "2015��5��28�� 14:11:10", "4"));
	}

}
