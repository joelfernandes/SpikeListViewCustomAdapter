package com.test.sample;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomRowAdapter extends BaseAdapter {
	private Context mContext;
	private List<SomeObject> someObjects;
	
	public CustomRowAdapter(Context context, List<SomeObject> someObjects) {
		mContext = context;
		this.someObjects = someObjects;
	}
	
	public int getCount() {
		return someObjects.size();
	}
	
	public Object getItem(int position) {
		return someObjects.get(position);
	}
	
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public View getView(int position, View convertView, ViewGroup parent) {
		SomeObject obj = (SomeObject) getItem(position);
		
		View ret = null;
		try {
			ret = LayoutInflater.from(mContext).inflate(R.layout.list_item, parent, false);
			((TextView)ret.findViewById(R.id.list_item_title)).setText(obj.getName());
		} catch (Throwable ignore) {}
		return ret;
	}
	
	
}
