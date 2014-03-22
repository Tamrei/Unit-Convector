package myPackege;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.mynewandroiproject.R;

public class SecondActivity extends Activity implements OnClickListener {

	Button button1;
	EditText editText1, editText2;
	RadioButton radioButton1, radioButton2;
	Spinner spinner, spinner2;
	String[] data = { "one", "two", "three", "four", "five" };
	String[] data2 = { " 1 ", " 2 ", "  3  ", " 4  ", " 5  " };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second_activity);

		button1 = (Button) findViewById(R.id.button1);
		button1.setOnClickListener(this);

		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item, data2);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

		spinner = (Spinner) findViewById(R.id.spinner1);
		spinner.setAdapter(adapter);

		ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item, data);
		adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

		spinner2 = (Spinner) findViewById(R.id.spinner2);
		spinner2.setAdapter(adapter2);

		editText1 = (EditText) findViewById(R.id.editText1);
		editText1.setOnClickListener(this);
		
		editText2 = (EditText) findViewById(R.id.editText2);
		editText2.setOnClickListener(this);	
		
	}

	@Override
	public void onClick(View v) {
		if (v.getId() == R.id.button1) {
			Toast t = Toast.makeText(getApplicationContext(),
					spinner2.getSelectedItem().toString(), Toast.LENGTH_LONG);
			t.show();
			editText1.setText(spinner2.getSelectedItem().toString());
		}

	}

}