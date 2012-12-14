package com.example.gridviewpager2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class GridImageAdapter extends BaseAdapter {

	public static final int DEFAULT_CELL_SIZE = 220;
	
	private Context mContext;
	private int mImageOffset = 0;		// the index offset into the list of images
	private int mImageCount = -1;		// -1 means display all images
	private int mNumTopics = 0;			// total number of topics in topics collection
	private int mCellWidth = DEFAULT_CELL_SIZE;
	private int mCellHeight = DEFAULT_CELL_SIZE;
	Globals g;
	
	
	public GridImageAdapter(Context c, Globals g, int imageOffset, int imageCount) {
		mContext = c;
		mImageOffset = imageOffset;
		mImageCount = imageCount;
		mNumTopics = g.getNumTitles();
	}
	
	public GridImageAdapter(Context c, Globals g, int imageOffset, int imageCount, int cellWidth, int cellHeight) {
		this(c, g, imageOffset, imageCount);
		mCellWidth = cellWidth;
		mCellHeight = cellHeight;
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
