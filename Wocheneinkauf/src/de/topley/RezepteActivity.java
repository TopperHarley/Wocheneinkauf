package de.topley;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import de.topley.data.Rezept;

public class RezepteActivity extends Activity {
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		final ListView listView = new ListView(this);
		listView.setAdapter(new ArrayAdapter<Rezept>(this,
				android.R.layout.simple_list_item_1, Rezept.getRezepte()));
		listView.setOnItemClickListener(new RezeptClickListener());

		setContentView(listView);
	}

	public class RezeptClickListener implements OnItemClickListener {

		@Override
		public void onItemClick(AdapterView<?> adapterView, View view, int position,
				long id) {
			Rezept selectedRezept = (Rezept) adapterView.getItemAtPosition(position);

			AlertDialog alertDialog = new AlertDialog.Builder(adapterView.getContext()).setTitle("Rezept")
				.setMessage(selectedRezept.getName()).create();
			alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
				public void onClick(DialogInterface dialog, int which) {
					return;
				}
			});
			alertDialog.show();
		}
	}
}