package id.putraprima.skorbola;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ScorerActivity extends AppCompatActivity {

    private static String RESULT_AWAY;
    private static String NAME_SCORER;
    private static String RESULT_HOME;
    private EditText etNameCetak;
    public static final String SENDER_KEY = "sender";
    public static final String HOME_SENDER = "homesend";
    public static final String AWAY_SENDER = "awaysend";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scorer);
        etNameCetak = findViewById(R.id.editText);
    }

    public void scoreButton(View view) {
        // Get the text from the EditText
        Intent intent = new Intent();
        intent.putExtra(NAME_SCORER, etNameCetak.getText().toString());
        if (getIntent().getStringExtra(SENDER_KEY).equals(HOME_SENDER)) {
            setResult(Integer.parseInt(RESULT_HOME), intent);
        } else if (getIntent().getStringExtra(SENDER_KEY).equals(AWAY_SENDER)) {
            setResult(Integer.parseInt(RESULT_AWAY), intent);
        }
        finish();
    }
}
