package com.example.nurnatashaezileen.tashalab3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button displayButton;
    private EditText etName;
    private TextView tvMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayButton = (Button) findViewById(R.id.button);
        displayButton = (Button) findViewById(R.id.button2);
        etName = (EditText) findViewById(R.id.editText);
        tvMessage = (TextView) findViewById(R.id.textView);

    }

    public void displayText(View view) {

        String text = etName.getText().toString();
        tvMessage.setText("welcome " + text);

        Toast toast = Toast.makeText(this, "Welcome " + text , Toast.LENGTH_SHORT);
        toast.show();
    }

    public void resetText (View view){
        String text = etName.getText().toString();
        etName.getText().clear();
        Toast toast = Toast.makeText(this,"NAME HAVE BEEN RESET", Toast.LENGTH_SHORT);
        toast.show();

    }
}
