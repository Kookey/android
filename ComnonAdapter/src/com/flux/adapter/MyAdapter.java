package com.flux.adapter;

import java.util.List;

import android.content.Context;

import com.flux.bean.CommonAdapter;
import com.flux.bean.LostInfo;
import com.flux.bean.ViewHolder;
import com.flux.comnonadapter.R;

public class MyAdapter extends CommonAdapter<LostInfo> {

	public MyAdapter(List<LostInfo> beans, Context context, int itemLayoutResId) {
		super(beans, context, itemLayoutResId);
	}

	@Override
	protected void convert(ViewHolder viewHolder, LostInfo item) {
		viewHolder.setText(R.id.tv_title, item.getTitle())
		.setText(R.id.tv_desc, item.getDesc())
		.setText(R.id.tv_time, item.getTime())
		.setText(R.id.tv_phone, item.getPhone());
		
	}
}
