package ch.cern.maps.adapters;

import ch.cern.www.R;
import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ShuttleAdapter extends BaseAdapter {

	private Typeface mTypeface;
	private String[] mShuttle;
	private TextView tv;

	public ShuttleAdapter(Context c, String[] t) {
		this.mShuttle = t;
		this.mTypeface = Typeface.createFromAsset(c.getAssets(),
				"DroidSans.ttf");
	}

	@Override
	public int getCount() {
		return mShuttle.length;
	}

	@Override
	public Object getItem(int i) {
		return mShuttle[i];
	}

	@Override
	public long getItemId(int i) {
		return i;
	}

	@Override
	public View getView(final int index, View view, final ViewGroup parent) {

		if (view == null) {
			LayoutInflater inflater = LayoutInflater.from(parent.getContext());
			view = inflater.inflate(R.layout.shuttle_item, parent, false);
		}
		tv = (TextView) view.findViewById(R.id.textViewNext);
		tv.setTypeface(mTypeface);

		tv = (TextView) view.findViewById(R.id.textViewMinutes);
		tv.setTypeface(mTypeface);
		tv.setText(mShuttle[index]);
		return view;
	}
}
