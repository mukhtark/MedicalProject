package com.example.medicalform;

import android.app.Activity;
import android.os.Bundle;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends Activity {
CharSequence[] items = { "Google", "Apple", "Microsoft" };
boolean[] itemsChecked = new boolean [items.length];
/** Called when the activity is first created. */
@Override
public void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
Button btn = (Button) findViewById(R.id.button1);

btn.setOnClickListener(new View.OnClickListener() {
public void onClick(View v) {
	EditText txt1 = (EditText) findViewById(R.id.editText1);
	EditText txt2 = (EditText) findViewById(R.id.editText2);
	EditText txt3 = (EditText) findViewById(R.id.editText3);
	Toast.makeText(getBaseContext(),
			"Data saved and sent", Toast.LENGTH_SHORT).show();
	txt1.setText("");
	txt2.setText("");
	txt3.setText("");
	
	
}
});
}
@Override
protected Dialog onCreateDialog(int id) {
switch (id) {
case 0:
return new AlertDialog.Builder(this)
.setIcon(R.drawable.ic_launcher)
.setTitle("This is a dialog with some simple text...")
.setPositiveButton("OK", new
DialogInterface.OnClickListener() {
public void onClick(DialogInterface dialog,
int whichButton)
{
Toast.makeText(getBaseContext(),
"OK clicked!", Toast.LENGTH_SHORT).show();
}
})
.setNegativeButton("Cancel", new
DialogInterface.OnClickListener() {
public void onClick(DialogInterface dialog,
int whichButton)
{
Toast.makeText(getBaseContext(),
"Cancel clicked!", Toast.LENGTH_SHORT).show();
}
})
.setMultiChoiceItems(items, itemsChecked, new
DialogInterface.OnMultiChoiceClickListener() {
@Override
public void onClick(DialogInterface dialog, int which,
boolean isChecked) {
Toast.makeText(getBaseContext(),
items[which] + (isChecked ? " checked!":
" unchecked!"),
Toast.LENGTH_SHORT).show();
}
}
)
.create();
}
return null;
}
}