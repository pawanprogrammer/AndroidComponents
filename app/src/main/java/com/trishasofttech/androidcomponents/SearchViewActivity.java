package com.trishasofttech.androidcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

public class SearchViewActivity extends AppCompatActivity implements SearchView.OnQueryTextListener {
SearchView searchView;
ListView listView;
ListViewAdapter listViewAdapter;
ArrayList<CountryName> arrayList = new ArrayList<CountryName>();
String [] countryname = {"India", "Pakistan", "Nepal", "Sri Lanka", "China", "Bhutan", "Australia",
        "Bangladesh", "Sweden", "USA", "Japan", "Germany", "Britain", "New Zealand", "Turkey"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_view);
        searchView = findViewById(R.id.searchview);
        listView = findViewById(R.id.listview);
        /*Add country name into the arraylist*/
        for (int i=0; i < countryname.length; i++)
        {
            /*Call constructor to add the data into arraylist*/
            CountryName countryName = new CountryName(countryname[i]);
            arrayList.add(countryName);
        }

        listViewAdapter = new ListViewAdapter(getApplicationContext(), arrayList);

        /*attach adapter to the listview*/
        listView.setAdapter(listViewAdapter);
        /*to search the item from listview using search query*/
        searchView.setOnQueryTextListener(this);
    }

    @Override
    public boolean onQueryTextSubmit(String s) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String s) {
        String text = s;
        listViewAdapter.filter(text);
        return false;
    }
}