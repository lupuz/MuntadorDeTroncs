package cat.castellerssagradafamlia.muntadordetroncs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ExpandableListAdapter listAdapter;
    ExpandableListView listView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ExpandableListView) findViewById(R.id.lvEstructures);

        prepareListData();

        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);

        listView.setAdapter(listAdapter);
    }

    private void prepareListData() {

        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("Pilar");
        listDataHeader.add("Torre");
        listDataHeader.add("Tres");
        listDataHeader.add("Quarte");
        listDataHeader.add("Quatre amb agulla");
        listDataHeader.add("Cinc");
        listDataHeader.add("Set");
        listDataHeader.add("Nou");
        listDataHeader.add("Tres amb agulla");

        // Adding child data
        List<String> cat = new ArrayList<String>();
        cat.add("Pilar de 4");
        cat.add("Pilar de 5");
        cat.add("Pilar de 6");
        listDataChild.put(listDataHeader.get(0), cat);

        cat = new ArrayList<String>();
        cat.add("Torre de 6");
        cat.add("Torre de 7");
        cat.add("Torre de 8");
        listDataChild.put(listDataHeader.get(1), cat);

        cat = new ArrayList<String>();
        cat.add("Tres de 6");
        cat.add("Tres de 7");
        cat.add("Tres de 8");
        listDataChild.put(listDataHeader.get(2), cat);

        cat = new ArrayList<String>();
        cat.add("Quatre de 6");
        cat.add("Quatre de 7");
        cat.add("Quatre de 8");
        listDataChild.put(listDataHeader.get(3), cat);

        cat = new ArrayList<String>();
        cat.add("Quatre de 6 amb agulla");
        cat.add("Quatre de 7 amb agulla");
        cat.add("Quatre de 8 amb agulla");
        listDataChild.put(listDataHeader.get(4), cat);

        cat = new ArrayList<String>();
        cat.add("Cinc de 6");
        cat.add("Cinc de 7");
        cat.add("Cinc de 8");
        listDataChild.put(listDataHeader.get(5), cat);

        cat = new ArrayList<String>();
        cat.add("Set de 6");
        cat.add("Set de 7");
        cat.add("Set de 8");
        listDataChild.put(listDataHeader.get(6), cat);

        cat = new ArrayList<String>();
        cat.add("Nou de 6");
        cat.add("Nou de 7");
        cat.add("Nou de 8");
        listDataChild.put(listDataHeader.get(7), cat);

        cat = new ArrayList<String>();
        cat.add("Tres de 6 amb agulla");
        cat.add("Tres de 7 amb agulla");
        cat.add("Tres de 8 amb agulla");
        listDataChild.put(listDataHeader.get(8), cat);
    }
}
