package example.codeclan.com.favouritethings;

import android.content.Context;
import android.graphics.Movie;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user on 07/11/2017.
 */

public class ThingAdapter extends ArrayAdapter<Thing> {

    public ThingAdapter(Context context, ArrayList<Thing> things) {
        super(context, 0, things);
    }

    public View getView(int position, View listItemView, ViewGroup parent){
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.activity_thing_list, parent, false);
        }
        Thing currentThing = getItem(position);
        TextView thingName = (TextView) listItemView.findViewById(R.id.thingName);
        TextView thingReason = (TextView) listItemView.findViewById(R.id.thingReason);
        thingName.setText(currentThing.getName().toString());
        thingReason.setText(currentThing.getReason().toString());


        listItemView.setTag(currentThing);
        return listItemView;
    }



}
