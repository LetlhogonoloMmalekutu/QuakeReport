package com.example.ekasilabalexcdtb.quakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by eKasiLab Alex CDTB on 2017/11/28.
 */

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    /**
     *
     * @param context of the app
     * @param earthquakes is the list of earthquakes, which is the data source of the adapter
     */

    public EarthquakeAdapter(Context context, List<Earthquake> earthquakes){
        super(context,0, earthquakes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View listItemView= convertView;
        if (listItemView==null){
            listItemView= LayoutInflater.from(getContext()).inflate(
            R.layout.earthquake_list_item,parent,false);
        }
    //find the earthquake at the given position in thr list of earthquakes
    Earthquake currentEarthquake= getItem(position);

        //Find the TextView with the id magnitude
        TextView magnitudeView= (TextView) listItemView.findViewById(R.id.magnitude);
        //Display the magnitude of the current earthquake in that TextView
        magnitudeView.setText(currentEarthquake.getMagnitude());

        //Find the TextView with the id magnitude
        TextView locationView = (TextView) listItemView.findViewById(R.id.location);
        //Display the location of the current earthquake in the TextView
        locationView.setText(currentEarthquake.getLocation());

        //Find the TextView with the id date
        TextView timeView = (TextView) listItemView.findViewById(R.id.time);
        //Display the date of the current earthquake int that TextView
        timeView.setText(currentEarthquake.getmTime());

        //Return the list item that is now showing the appropriate date
        return listItemView;

    }
}
