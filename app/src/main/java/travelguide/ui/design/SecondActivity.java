package travelguide.ui.design;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    TextView about;
    ImageView map;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        about = findViewById(R.id.about);
        map = findViewById(R.id.type_of_view_text);

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://mumbaicity.gov.in/tourist-place/gateway-of-india/");
            }
        });

        map.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://goo.gl/maps/yUgDPEijxsjQUvcMA");
            }
        }));
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

}
