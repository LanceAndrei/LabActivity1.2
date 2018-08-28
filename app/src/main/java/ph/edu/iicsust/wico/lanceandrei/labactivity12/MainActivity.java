package ph.edu.iicsust.wico.lanceandrei.labactivity12;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button displayButton = (Button) findViewById(R.id.Button);

        displayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText inputNumber1 = (EditText) findViewById(R.id.inputNumber1);
                EditText inputNumber2 = (EditText) findViewById(R.id.inputNumber2);

                TextView result = (TextView) findViewById(R.id.result);

                int a = Integer.parseInt(inputNumber1.getText().toString());
                int b = Integer.parseInt(inputNumber2.getText().toString());
                String DISPLAY = "";

                if (a > b){

                    result.setText(DISPLAY = a + " is greater than " + b);

                }else{

                    result.setText(DISPLAY = a + " is less than " + b);

                }//END_OF_IF

            }//END_OF_ONCLICK
        });

    }
}
