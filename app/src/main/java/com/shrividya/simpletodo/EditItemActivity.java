package com.shrividya.simpletodo;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Selection;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

import static android.R.attr.data;
import static android.app.Activity.RESULT_OK;


public class EditItemActivity extends AppCompatActivity {
    ArrayList<String> arrList;
    int pos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        Log.d("Test", "test");
        Intent intent = getIntent();
       // Log.d("Debug EditItem", intent.getStringExtra("mode"));
        EditText etName = (EditText) findViewById(R.id.editItemText);

        pos = intent.getIntExtra("mode", 1);
        arrList = intent.getStringArrayListExtra("items");

        etName.setText(arrList.get(pos));
        // etName.setSelection(etName.toString().length());
        intent.putExtra("EditedText", intent.getStringExtra("mode"));
        //intent.putExtra("returnMode", )
        Button saveButton = (Button) findViewById(R.id.btnSaveEditedItem);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText etName = (EditText) findViewById(R.id.editItemText);
                arrList.set(pos,etName.getText().toString());
                Intent intent = new Intent();
                //Log.d("Debug EditItem", intent.getStringExtra("mode"));
                intent.putExtra("EditedText", arrList.get(pos));
                intent.putExtra("EditedArrList", arrList);
                intent.putExtra("code", 200);
                setResult(RESULT_OK, intent); // set result code and bundle data for response
                finish(); // closes the activity, pass data to parent
            }
        });
    }

    public void onSubmit(View v) {
        EditText etName = (EditText) findViewById(R.id.editItemText);
        arrList.set(pos,etName.getText().toString());
        Intent intent = new Intent();
        //Log.d("Debug EditItem", intent.getStringExtra("mode"));
        intent.putExtra("EditedArrList", arrList);
        intent.putExtra("code", 200);
        setResult(RESULT_OK, intent); // set result code and bundle data for response
        finish(); // closes the activity, pass data to parent
    }
}
