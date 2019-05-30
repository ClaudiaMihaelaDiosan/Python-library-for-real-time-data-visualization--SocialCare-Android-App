package gsoc.mihaela.claudia.diosan.gsoc_2019_python_library_for_real_time_data_visualization;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegisterAsDonorActivity extends AppCompatActivity {

    Button btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_as_donor);

        btnCancel = (Button) findViewById(R.id.cancel_button);

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterAsDonorActivity.this, CreateAccountActivity.class);
                startActivity(intent);
            }
        });
    }
}
