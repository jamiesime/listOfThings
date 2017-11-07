package example.codeclan.com.favouritethings;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
}
