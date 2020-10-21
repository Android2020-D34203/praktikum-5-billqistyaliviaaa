package id.ac.id.telkomuniversity.tass.praktik5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public EditText user , pass;
    public Button login , forget;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = findViewById(R.id.editUsername);
        pass = findViewById(R.id.editPassword);
        login = findViewById(R.id.buttonLogin);
        forget = findViewById(R.id.buttonForget);

    }
    public void loginAksi (View view){
        Intent intent = new Intent(MainActivity.this, ActivityKedua.class);
        intent.putExtra("user", user.getText().toString());
        intent.putExtra("pass",pass.getText().toString());
        startActivity(intent);
    }

    public void forgetPasswordAksi (View view){
        Intent intent = new Intent(MainActivity.this, ActivityKetiga.class);
        intent.putExtra("pass", pass.getText().toString());
        startActivity(intent);
    }
}