package example.codeclan.com.favouritethings;

import android.content.Intent;
import android.graphics.Movie;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    private TextView thingName;
    private TextView thingReason;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        Things things = new Things();
        ArrayList<Thing> thingList = things.getList();

        ThingAdapter thingAdapter = new ThingAdapter(this, thingList);
        ListView listView = (ListView)findViewById(R.id.thing_list);
        listView.setAdapter(thingAdapter);
    }

    public void getThing(View listItem){
        Thing thing = (Thing) listItem.getTag();
        Intent i = new Intent(this, ThingActivity.class);
        i.putExtra("name", thing.getName());
        i.putExtra("reason", thing.getReason());
        startActivity(i);
    }


}
