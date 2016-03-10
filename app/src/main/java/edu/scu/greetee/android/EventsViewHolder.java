package edu.scu.greetee.android;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by srbkr on 3/10/2016.
 */
public class EventsViewHolder extends RecyclerView.ViewHolder{
    protected ImageView icon;
    protected TextView eventStart,eventWeather,eventDistance,eventETA;

    public EventsViewHolder(View itemView) {
        super(itemView);
         icon= (ImageView) itemView.findViewById(R.id.list_item_icon_event_weather);
         eventStart=(TextView)itemView.findViewById(R.id.list_item_event_start_textview);
         eventWeather=(TextView)itemView.findViewById(R.id.list_item_weather_textview);
         eventDistance=(TextView)itemView.findViewById(R.id.list_item_distance_text_view);
         eventETA=(TextView)itemView.findViewById(R.id.list_item_eta);
    }
}
