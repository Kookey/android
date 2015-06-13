package com.flux.bean;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ViewHolder {

	/**
	 * �洢item�����ÿؼ����õ�����
	 * 
	 * key ��ԴID
	 * value �ؼ�������
	 */
	private SparseArray<View> views;
	private View converView;
	private int positon;
	
	/**
	 * ˽�л��Ĺ������������ڲ��������ʵ��
	 * @param context  ������
	 * @param itemLayoutResId  item�����ļ�����ԴID
 	 * @param position         BaseAdpater.getView�Ĵ������
	 * @param parent           BaseAdpater.getView�Ĵ������
	 */
	private ViewHolder(Context context,int itemLayoutResId,int position,ViewGroup parent){
		this.views = new SparseArray<View>();
		this.positon = position;
		this.converView = LayoutInflater.from(context).inflate(itemLayoutResId, parent, false);
		converView.setTag(this);
	}
	
	/**
	 * �õ�һ��ViewHolder����
	 * 
	 * @param context              �����Ķ���
	 * @param itemLayoutResId      item�����ļ�����ԴId
	 * @param position             BaseAdpater.getView�Ĵ������          
	 * @param converView           BaseAdpater.getView�Ĵ������
	 * @param parent               BaseAdpater.getView�Ĵ������
	 * @return                     һ��ViewHolder����
	 */
	public static ViewHolder getViewHolder(Context context,int itemLayoutResId,int position,View converView,ViewGroup parent){
		
		if(converView==null){
			return new ViewHolder(context, itemLayoutResId, position, parent);
		}else{
			ViewHolder viewHolder = (ViewHolder) converView.getTag();
			viewHolder.positon = position;
			return viewHolder;
		}
	}
	
	public View getConverView(){
		return this.converView;
	}
	/**
	 * [���Ĳ���]
	 * ���ݿؼ�����Դid����ȡ�ؼ�
	 * @param viewResId   �ؼ�����ԴId
	 * @return            �ؼ�������
	 */
	@SuppressWarnings("unchecked")
	public <T extends View> T getView(int viewResId){
		View view = views.get(viewResId);
		if(view==null){
			view = converView.findViewById(viewResId);
			views.put(viewResId, view);
		}
		return (T)view;
	}
	
	public ViewHolder setText(int viewResId,String text){
		TextView view = getView(viewResId);
		view.setText(text);
		return this;
	}
}
