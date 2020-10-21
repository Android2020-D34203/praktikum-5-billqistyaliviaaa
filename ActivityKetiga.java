package id.ac.id.telkomuniversity.tass.praktik5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class ActivityKetiga extends AppCompatActivity {

        public EditText lupaPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ketiga);

        lupaPassword = findViewById(R.id.lupaPassword);

        if (getIntent().getExtras()!=null){
            Bundle bundle = getIntent().getExtras();
            lupaPassword.setText(getIntent().getStringExtra("pass"));
        }else{
            lupaPassword.setText(getIntent().getStringExtra("pass"));
        }
    }
}