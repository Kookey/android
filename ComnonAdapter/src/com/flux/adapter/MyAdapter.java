package com.flux.adapter;

import java.util.List;

import android.content.Context;

import com.flux.bean.CommonAdapter;
import com.flux.bean.LostInfo;
import com.flux.bean.ViewHolder;

public class MyAdapter extends CommonAdapter<LostInfo> {

	public MyAdapter(List<LostInfo> beans, Context context, int itemLayoutResId) {
		super(beans, context, itemLayoutResId);
	}

	@Override
	protected void convert(ViewHolder viewHolder, Object item) {
//		viewHolder.setText(viewResId, text);
	}
}
