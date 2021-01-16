package com.example.musical_player_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;


public class musicAdapter extends ArrayAdapter<music> implements View.OnClickListener {

	Context mContext;
	private ArrayList<music> dataSet;
	private int lastPosition = -1;

	public musicAdapter(ArrayList<music> data, Context context) {
		super(context, R.layout.row_item, data);
		this.dataSet = data;
		this.mContext = context;

	}

	@Override
	public void onClick(View v) {

		int position = (Integer) v.getTag();
		Object object = getItem(position);
		music dataModel = (music) object;

		switch (v.getId()) {
			case R.id.item_info:
				Snackbar.make(v, "Song Name : " + dataModel.getSong(), Snackbar.LENGTH_LONG)
						.setAction("No action", null).show();
				break;
		}
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// Get the data item for this position
		music dataModel = getItem(position);
		// Check if an existing view is being reused, otherwise inflate the view
		ViewHolder viewHolder; // view lookup cache stored in tag

		final View result;

		if (convertView == null) {

			viewHolder = new ViewHolder();
			LayoutInflater inflater = LayoutInflater.from(getContext());
			convertView = inflater.inflate(R.layout.row_item, parent, false);
			viewHolder.txtArtist = (TextView) convertView.findViewById(R.id.name);
			viewHolder.txtSong = (TextView) convertView.findViewById(R.id.type);


			result = convertView;

			convertView.setTag(viewHolder);
		} else {
			viewHolder = (ViewHolder) convertView.getTag();
			result = convertView;
		}

		Animation animation = AnimationUtils.loadAnimation(mContext, (position > lastPosition) ? R.anim.up_from_bottom : R.anim.down_from_top);
		result.startAnimation(animation);
		lastPosition = position;

		viewHolder.txtSong.setText(dataModel.getSong());
		viewHolder.txtArtist.setText(dataModel.getArtist());
		// Return the completed view to render on screen
		return convertView;
	}

	// View lookup cache
	private static class ViewHolder {
		TextView txtSong;
		TextView txtArtist;
		ImageView info;


	}
}
