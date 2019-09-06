//If you meet any problems,
//please contact
//Leying Hu
//hu.leying@columbia.edu
package leying.nudgetviconreader;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnScanIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        btnScanIcon = findViewById(R.id.btnScanIcon);
        btnScanIcon.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.btnScanIcon:
                startActivity(new Intent(MainActivity.this, ScannedCodeActivity.class));
                break;
        }

    }
}
