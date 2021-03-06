package com.example.aplicacaodelivros;

import android.content.Intent;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.TextView;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SearchActivity extends AsyncTask<String, Void, String> {
    private Context context;

    public SearchActivity(Context context) {
        this.context = context;
    }

    protected void onCreate() {}

    protected void onpreExecute() {} //parent class

    @Override //do not want to call parent method. use super if you want both
    protected String doInBackground(String... arg0) {
        try {
            //search for phrase
            String title = (String) arg0[0];
            //php script to call
            String link = "http://people.aero.und.edu/~lwingate/457/2/search.php";

            //get method to pass variables
            link += "?title=" + URLEncoder.encode(title, "UTF-8");

            //Connect to server
            URL url = new URL(link);
            URLConnection conn = url.openConnection();
            conn.setDoOutput(true);

            //Read server response
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()));
            StringBuilder sb = new StringBuilder();
            String line = null;
            while ((line = reader.readLine()) != null) {
                sb.append(line);
                break;
            }
            return sb.toString();
        }
        catch(Exception e) {
            return new String("Exception: " + e.getMessage());
        }
    }

    @Override
    protected void onPostExecute(String result) { //result of background computation passed here after done
        if (result!=null) { //if returns with data, entry exists. login successful
            super.onPostExecute(result);
            context.startActivity(new Intent(context, SearchResultsActivity.class));
        }
    }
}
