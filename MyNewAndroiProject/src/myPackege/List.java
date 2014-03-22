package myPackege;

import com.example.mynewandroiproject.R;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class List extends ListActivity {

	String[] type = { "Длина", "Время", "Вес/Масса", "Скорость" };

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// setContentView(R.layout.list_activity);

		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, type);

		setListAdapter(adapter);

	}

	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);

		if (position == 1) {
			Intent intent = new Intent(this, SecondActivity.class);
			startActivity(intent);
		}
		if (position == 0) {
			Intent intent = new Intent(this, MainActivity.class);
			startActivity(intent);
		}

	}

}
