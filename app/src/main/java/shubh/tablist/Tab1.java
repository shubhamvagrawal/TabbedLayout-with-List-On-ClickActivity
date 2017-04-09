package shubh.tablist;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Tab1 extends Fragment{
    public static int posList ;
    private ListView lv;
    // Listview Adapter
    ArrayAdapter<String> adapter;
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle drawerToggle;
    NavigationView navigation;
    View rootView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.tab, container, false);
        initInstances();
        String sanctuaries[] = getResources().getStringArray(R.array.list_name);
        lv = (ListView) rootView.findViewById(R.id.list);
        adapter = new ArrayAdapter<String>(rootView.getContext(), R.layout.list_item, R.id.sanc_name, sanctuaries);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), list.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 1) {
                    posList=position;
                    Intent myIntent = new Intent(view.getContext(), list.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 2) {
                    posList=position;
                    Intent myIntent = new Intent(view.getContext(), list.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 3) {
                    posList=position;
                    Intent myIntent = new Intent(view.getContext(), list.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 4) {
                    posList=position;
                    Intent myIntent = new Intent(view.getContext(), list.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 5) {
                    posList=position;
                    Intent myIntent = new Intent(view.getContext(), list.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 6) {
                    posList=position;
                    Intent myIntent = new Intent(view.getContext(), list.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 7) {
                    posList=position;
                    Intent myIntent = new Intent(view.getContext(), list.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 8) {
                    posList=position;
                    Intent myIntent = new Intent(view.getContext(), list.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 9) {
                    posList=position;
                    Intent myIntent = new Intent(view.getContext(), list.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 10) {
                    posList=position;
                    Intent myIntent = new Intent(view.getContext(), list.class);
                    startActivityForResult(myIntent, 0);
                }
            }
        });

        return rootView;
    }

    private void initInstances() {

        drawerLayout = (DrawerLayout) rootView.findViewById(R.id.drawerLayout);
        drawerToggle = new ActionBarDrawerToggle((Activity) rootView.getContext(), drawerLayout, R.string.navigation_view_item_1, R.string.navigation_view_item_1);
        drawerLayout.setDrawerListener(drawerToggle);

        navigation = (NavigationView) rootView.findViewById(R.id.navigation_view);
        navigation.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                int id = menuItem.getItemId();
                switch (id) {
                    case R.id.navigation_item_1:
                        startActivity(new Intent(rootView.getContext(), Tab1.class));
                        break;
                    case R.id.navigation_item_2:
                        startActivity(new Intent(rootView.getContext(),Tab2.class));
                        break;
                    case R.id.navigation_item_3:
                        startActivity(new Intent(rootView.getContext(),Tab3.class));
                        break;


                }
                return false;
            }
        });

    }

}

