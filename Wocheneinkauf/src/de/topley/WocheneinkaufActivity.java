package de.topley;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;

public class WocheneinkaufActivity extends TabActivity {
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.main);

	    Resources res = getResources(); // Resource object to get Drawables
	    TabHost tabHost = getTabHost();  // The activity TabHost
	    TabHost.TabSpec spec;  // Resusable TabSpec for each tab
	    Intent intent;  // Reusable Intent for each tab

	    // Create an Intent to launch an Activity for the tab (to be reused)
	    intent = new Intent().setClass(this, SpeiseplanActivity.class);

	    // Initialize a TabSpec for each tab and add it to the TabHost
	    spec = tabHost.newTabSpec("speiseplan").setIndicator("Speiseplan",
	                      res.getDrawable(R.drawable.ic_tab_speiseplan))
	                  .setContent(intent);
	    tabHost.addTab(spec);

	    intent = new Intent().setClass(this, RezepteActivity.class);
	    spec = tabHost.newTabSpec("rezepte").setIndicator("Rezepte",
	                      res.getDrawable(R.drawable.ic_tab_rezepte))
	                  .setContent(intent);
	    tabHost.addTab(spec);

	    intent = new Intent().setClass(this, EinkaufszettelActivity.class);
	    spec = tabHost.newTabSpec("einkaufszettel").setIndicator("Einkaufszettel",
	                      res.getDrawable(R.drawable.ic_tab_einkaufszettel))
	                  .setContent(intent);
	    tabHost.addTab(spec);

	    tabHost.setCurrentTab(2);
	}
}