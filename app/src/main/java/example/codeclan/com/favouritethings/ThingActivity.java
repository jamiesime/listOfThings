package example.codeclan.com.favouritethings;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import static android.R.attr.name;

/**
 * Created by user on 07/11/2017.
 */

public class ThingActivity extends AppCompatActivity {

    private TextView name;
    private TextView reason;

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thing_details);

        name = (TextView) findViewById(R.id.name);
        reason = (TextView) findViewById(R.id.reason);

        Intent i = getIntent();
        Bundle extras = i.getExtras();
        String nameText = extras.getString("name");
        String reasonText = extras.getString("reason");

        name.setText(nameText);
        reason.setText(reasonText);


    }

}
