package ie.ul.matthewdaniels.recordnumbers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //create some variables...
    int distanceOne;
    EditText dist1, dist2;
    TextView Result;
    Button UpdateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    dist1=(EditText)findViewById(R.id.distandOne);
    dist2=(EditText)findViewById(R.id.distandTwo);
    Result=(TextView)findViewById(R.id.message_output);
    UpdateButton= (Button)findViewById(R.id.UpdateButton);

    UpdateButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int num1=Integer.parseInt(dist1.getText().toString());
            int num2=Integer.parseInt(dist2.getText().toString());

            int result=num1+num2;
            Result.setText("Sum is"+result);

        }
    });

    }
}
