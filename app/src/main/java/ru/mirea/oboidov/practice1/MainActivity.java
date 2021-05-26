package ru.mirea.oboidov.practice1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Button Ok;
    private Button Cancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.text);
        Ok = (Button) findViewById(R.id.button);
        Cancel = (Button) findViewById(R.id.button2);
        View.OnClickListener oclBtnOk = new View.OnClickListener() {

            public void onClick(View v) {
                textView.setText("Нажата кнопка ОК");
            }
        };
        View.OnClickListener oclBtnCancel = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Нажата кнопка Cancel");
            }
        };
        Ok.setOnClickListener(oclBtnOk);
        Cancel.setOnClickListener(oclBtnCancel);
    }
}
