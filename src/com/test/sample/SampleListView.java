package com.test.sample;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ListView;
import android.widget.TextView;

public class SampleListView extends Activity {
	 private ListView m_listview;
	 
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_layout);
        
        m_listview = (ListView) findViewById(R.id.id_list_view);
        
        /**
         * This code is used to set the empty view
         */
        TextView emptyView = new TextView(this);
        emptyView.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.FILL_PARENT));
        emptyView.setText("This appears when the list is empty");
        emptyView.setVisibility(View.GONE);
        ((ViewGroup)m_listview.getParent()).addView(emptyView);
        m_listview.setEmptyView(emptyView);
        
        /**
         * Some objects to populate - uncomment to test
         */
        ArrayList<SomeObject> someObjects = new ArrayList<SomeObject>();
        /*someObjects.add(new SomeObject(1, "Cenas", "mais cenas"));
        someObjects.add(new SomeObject(2, "Couves ao pequeno almoço", "e alface ao lanche"));
        someObjects.add(new SomeObject(3, " =) ", "(="));*/
        
        // set custom adapter to the list
        m_listview.setAdapter(new CustomRowAdapter(this, someObjects));

    }
}
