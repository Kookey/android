package com.flux.bean;

import java.util.List;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public abstract class CommonAdapter<T> extends BaseAdapter {

	/**
	 * ����Դ
	 */
	protected List<T> beans;
	
	/**
	 * �����Ķ���
	 */
	protected Context context;
	
	/**
	 * item�����ļ���ԴId
	 */
	protected int itemLayoutResId;
	
	/**
	 * 
	 * @param beans
	 * @param context
	 */
	public CommonAdapter(List<T> beans, Context context,int itemLayoutResId) {
		super();
		this.beans = beans;
		this.context = context;
		this.itemLayoutResId = itemLayoutResId;
	}

	@Override
	public int getCount() {
		return beans.size();
	}

	@Override
	public Object getItem(int position) {
		return beans.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View converView, ViewGroup parent) {
		ViewHolder viewHolder = ViewHolder.getViewHolder(context, itemLayoutResId, position, converView, parent);
		convert(viewHolder,getItem(position));
		return viewHolder.getConverView();
	}

	protected abstract void convert(ViewHolder viewHolder, Object item);
}
