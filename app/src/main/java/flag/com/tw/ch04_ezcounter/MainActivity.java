package flag.com.tw.ch04_ezcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, View.OnLongClickListener {
    TextView txv;
    Button addBtn;
    int counter = 1, i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txv = (TextView) findViewById(R.id.txv);
        addBtn = (Button) findViewById(R.id.addBtn);

        addBtn.setOnClickListener(this);
        addBtn.setOnLongClickListener(this);
        txv.setOnLongClickListener(this);
    }

    @Override
    public void onClick(View v) {
        counter++;

        txv.setText(String.valueOf(counter));
    }

    @Override
    public boolean onLongClick(View v) {
        if(v.getId() == R.id.txv){
            counter = 0;
            txv.setText("0");
        }else{
            counter += 2;
            txv.setText(String.valueOf(counter));
        }

        return true;
    }
}
