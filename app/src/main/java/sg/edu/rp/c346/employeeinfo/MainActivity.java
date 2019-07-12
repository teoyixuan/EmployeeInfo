package sg.edu.rp.c346.employeeinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<AndroidVersion> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.listView);
        arrayList = new ArrayList<>();
        arrayList.add(new AndroidVersion("John", "Software Technical Leader", 3400.0));
        arrayList.add(new AndroidVersion("May", "Programmer", 2200.0));
        CustomAdapter adapter = new CustomAdapter(this, R.layout.row, arrayList);
        lv.setAdapter(adapter);
    }
}
