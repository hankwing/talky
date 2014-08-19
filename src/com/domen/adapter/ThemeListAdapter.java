package com.domen.adapter;

import java.util.List;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.domen.entity.ThemeEntity;
import com.wxl.lettalk.R;

/**
 * 定义了单个话题的界面适配器
 * @author hankwing
 *
 */
public class ThemeListAdapter extends BaseAdapter {

	private LayoutInflater theme_inflater;
	private List<ThemeEntity> themelist;
	private Context context;
	
	public ThemeListAdapter(Context context,List<ThemeEntity> themelist) {
		// TODO Auto-generated constructor stub
		this.context = context;
		this.themelist = themelist;
		theme_inflater = LayoutInflater.from(this.context);
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return themelist.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return themelist.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}
	
	static class ViewHolder{
		public TextView tvName;
		public TextView tvBack;
		public Button btLook;
		public Button btJoin;
	}

	@SuppressWarnings("deprecation")
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		ThemeEntity themeEnitiy = themelist.get(position);
		convertView = theme_inflater.inflate(R.layout.theme_list_view, null, false);
		ViewHolder viewHolder = new ViewHolder();
		viewHolder.tvName = (TextView) convertView.findViewById(R.id.theme_name);
		viewHolder.tvBack = (TextView) convertView.findViewById(R.id.theme_back);
		viewHolder.btJoin = (Button) convertView.findViewById(R.id.btn_join);
		viewHolder.btLook = (Button) convertView.findViewById(R.id.btn_look);
		viewHolder.tvName.setText(themeEnitiy.getName());
		viewHolder.tvName.setTextColor(Color.WHITE);
		viewHolder.tvBack.setBackgroundDrawable(themeEnitiy.getPicture());
	
		viewHolder.btJoin.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				v.requestFocus();
				//加入等待逻辑
				//Toast.makeText(context, "join", Toast.LENGTH_SHORT).show();
			}
		});
		
		viewHolder.btLook.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//观看逻辑
				v.requestFocus();
				//Toast.makeText(context, "look", Toast.LENGTH_SHORT).show();
			}
		});
		
		convertView.setTag(viewHolder);
		return convertView;
	}

	public void updateData( List<ThemeEntity> newData) {
		themelist = newData;
	}
}
