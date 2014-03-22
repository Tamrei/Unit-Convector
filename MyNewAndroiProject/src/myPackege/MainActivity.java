package myPackege;

import android.app.Activity;
import android.content.Intent;
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

public class MainActivity extends Activity implements OnClickListener {

	Button button1, button2;
	EditText editText1, editText2;
	RadioButton radioButton1, radioButton2;
	Spinner spinner, spinner2;

	String miles = "Миля";
	String kilometer = "Километр";
	String meter = "Метр";
	String centimeter = "Сантиметр";
	String decimeter = "Дециметр";
	String milemeter = "Милиметр";

	String[] data = { miles, kilometer, meter, centimeter, decimeter, milemeter };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_activity);

		button1 = (Button) findViewById(R.id.button1);
		button1.setOnClickListener(this);

		button2 = (Button) findViewById(R.id.button2);
		button2.setOnClickListener(this);

		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item, data);
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

		String ofUnit = spinner.getSelectedItem().toString();
		String inUnit = spinner2.getSelectedItem().toString();

		if (v.getId() == R.id.button2) {
			Intent intent = new Intent(this, List.class);
			startActivity(intent);
		}

		// ---------------------------------------------------------------------------------------------
		// meter

		if (v.getId() == R.id.button1) {
			if (ofUnit.equals(meter) && inUnit.equals(centimeter)) {

				editText2.setText(Long.toString(Long.parseLong(editText1
						.getText().toString()) * 100));
			}
			if (ofUnit.equals(meter) && inUnit.equals(decimeter)) {

				editText2.setText(Long.toString(Long.parseLong(editText1
						.getText().toString()) * 10));
			}
			if (ofUnit.equals(meter) && inUnit.equals(milemeter)) {

				editText2.setText(Long.toString(Long.parseLong(editText1
						.getText().toString()) * 1000));
			}

			if (ofUnit.equals(meter) && inUnit.equals(kilometer)) {

				editText2.setText(Long.toString(Long.parseLong(editText1
						.getText().toString()) / 100));
			}
			if (ofUnit.equals(meter) && inUnit.equals(miles)) {

				editText2.setText(Double.toString(Double.parseDouble(editText1
						.getText().toString()) / 100 / 1.6));
			}

			// --------------------------------------------------------------------------------------------
			// miles

			if (ofUnit.equals(miles) && inUnit.equals(milemeter)) {

				editText2.setText(Double.toString(Double.parseDouble(editText1
						.getText().toString()) * 100000 * 1.6));
			}

			if (ofUnit.equals(miles) && inUnit.equals(centimeter)) {

				editText2.setText(Double.toString(Double.parseDouble(editText1
						.getText().toString()) * 10000 * 1.6));
			}

			if (ofUnit.equals(miles) && inUnit.equals(decimeter)) {

				editText2.setText(Double.toString(Double.parseDouble(editText1
						.getText().toString()) * 1000 * 1.6));
			}

			if (ofUnit.equals(miles) && inUnit.equals(meter)) {

				editText2.setText(Double.toString(Double.parseDouble(editText1
						.getText().toString()) * 100 * 1.6));
			}

			if (ofUnit.equals(miles) && inUnit.equals(kilometer)) {

				editText2.setText(Double.toString(Double.parseDouble(editText1
						.getText().toString()) * 1.6));
			}

			// ------------------------------------------------------------------------------------------------
			// kilometer

			if (ofUnit.equals(kilometer) && inUnit.equals(milemeter)) {

				editText2.setText(Double.toString(Double.parseDouble(editText1
						.getText().toString()) * 1000000));
			}

			if (ofUnit.equals(kilometer) && inUnit.equals(centimeter)) {

				editText2.setText(Double.toString(Double.parseDouble(editText1
						.getText().toString()) * 100000));
			}

			if (ofUnit.equals(kilometer) && inUnit.equals(decimeter)) {

				editText2.setText(Double.toString(Double.parseDouble(editText1
						.getText().toString()) * 1000));
			}
			if (ofUnit.equals(kilometer) && inUnit.equals(meter)) {

				editText2.setText(Double.toString(Double.parseDouble(editText1
						.getText().toString()) * 1000));
			}
			if (ofUnit.equals(kilometer) && inUnit.equals(miles)) {

				editText2.setText(Double.toString(Double.parseDouble(editText1
						.getText().toString()) / 1.6));
			}

			// -------------------------------------------------------------------------------------------------------
			// centimeter

			if (ofUnit.equals(centimeter) && inUnit.equals(milemeter)) {

				editText2.setText(Double.toString(Double.parseDouble(editText1
						.getText().toString()) * 10));
			}
			if (ofUnit.equals(centimeter) && inUnit.equals(decimeter)) {

				editText2.setText(Double.toString(Double.parseDouble(editText1
						.getText().toString()) / 10));
			}
			if (ofUnit.equals(centimeter) && inUnit.equals(meter)) {

				editText2.setText(Double.toString(Double.parseDouble(editText1
						.getText().toString()) / 100));
			}
			if (ofUnit.equals(centimeter) && inUnit.equals(kilometer)) {

				editText2.setText(Double.toString(Double.parseDouble(editText1
						.getText().toString()) / 1000));
			}

			if (ofUnit.equals(centimeter) && inUnit.equals(miles)) {

				editText2.setText(Double.toString(Double.parseDouble(editText1
						.getText().toString()) / 1000 / 1.6));
			}

			// -------------------------------------------------------------------------------------------------------
			// decimetr

			if (ofUnit.equals(decimeter) && inUnit.equals(milemeter)) {

				editText2.setText(Double.toString(Double.parseDouble(editText1
						.getText().toString()) * 100));
			}
			if (ofUnit.equals(decimeter) && inUnit.equals(centimeter)) {

				editText2.setText(Double.toString(Double.parseDouble(editText1
						.getText().toString()) * 10));
			}
			if (ofUnit.equals(decimeter) && inUnit.equals(meter)) {

				editText2.setText(Double.toString(Double.parseDouble(editText1
						.getText().toString()) / 10));
			}
			if (ofUnit.equals(decimeter) && inUnit.equals(kilometer)) {

				editText2.setText(Double.toString(Double.parseDouble(editText1
						.getText().toString()) / 100));
			}
			if (ofUnit.equals(decimeter) && inUnit.equals(miles)) {

				editText2.setText(Double.toString(Double.parseDouble(editText1
						.getText().toString()) / 1000 / 1.6));
			}

			// -----------------------------------------------------------------------------------------------------------
			// milimeter

			if (ofUnit.equals(milemeter) && inUnit.equals(centimeter)) {

				editText2.setText(Double.toString(Double.parseDouble(editText1
						.getText().toString()) / 10));
			}
			if (ofUnit.equals(milemeter) && inUnit.equals(decimeter)) {

				editText2.setText(Double.toString(Double.parseDouble(editText1
						.getText().toString()) / 100));

			}
			if (ofUnit.equals(milemeter) && inUnit.equals(meter)) {

				editText2.setText(Double.toString(Double.parseDouble(editText1
						.getText().toString()) / 1000));
			}
			if (ofUnit.equals(milemeter) && inUnit.equals(kilometer)) {

				editText2.setText(Double.toString(Double.parseDouble(editText1
						.getText().toString()) / 10000));
			}
			if (ofUnit.equals(milemeter) && inUnit.equals(miles)) {

				editText2.setText(Double.toString(Double.parseDouble(editText1
						.getText().toString()) / 10000 / 1.6));
			}

		} else
			Toast.makeText(getApplicationContext(), "!", Toast.LENGTH_SHORT)
					.show();

	}

	private void setResult(int a, int b) {
		editText2.setText(Double.toString(Double.parseDouble(editText1
				.getText().toString()) / 10000 / 1.6));
	}

	String str = "";

	private void insert(int j) {
		if (!(str.length() > 8)) {
			str = str + Integer.toString(j);
			editText1.setText(str);
		}
	}

	public void clear() {
		if (str.length() >= 1) {
			str = str.substring(0, (str.length() - 1));
			editText1.setText(str);
		}
	}

}