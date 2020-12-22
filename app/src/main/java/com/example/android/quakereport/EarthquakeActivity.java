/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.quakereport;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class EarthquakeActivity extends AppCompatActivity {

    public static final String LOG_TAG = EarthquakeActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earthquake_activity);

        // Create a fake list of earthquake locations.
        ArrayList<Earthquake> earthquakes = new ArrayList<>();
        earthquakes.add(new Earthquake("8.2", "San Francisco, CA",
                                    "December 21, 2020"));
        earthquakes.add(new Earthquake("2.3", "London",
                                    "March 19, 2020"));
        earthquakes.add(new Earthquake("4.2", "Tokyo",
                                    "March 22, 2020"));
        earthquakes.add(new Earthquake("7.3", "Mexico City",
                                    "April 2, 2020"));
        earthquakes.add(new Earthquake("2.3", "Moscow",
                                    "September 19, 2020"));
        earthquakes.add(new Earthquake("5.6", "Rio de Janeiro",
                                    "September 22, 2020"));
        earthquakes.add(new Earthquake("7.8", "Paris",
                                    "February 14, 2020"));

        // Find a reference to the {@link ListView} in the layout
        ListView earthquakeListView = (ListView) findViewById(R.id.list);
        EarthquakeAdapter adapter = new EarthquakeAdapter(this, earthquakes);
        earthquakeListView.setAdapter(adapter);
    }
}