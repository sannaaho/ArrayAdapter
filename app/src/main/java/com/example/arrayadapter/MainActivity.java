package com.example.arrayadapter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    private Button buttonDelete;
    private Button buttonTime;
    private TextView textViev_content;
    private ArrayList<Times> timeList;

    private ArrayList<Times> times = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.textViev_content=findViewById(R.id.textViewTime);
        this.buttonTime=findViewById(R.id.buttonTime);



        /**
         * set item into adapter
         */


        /**
         * get on item click listener
         */
        buttonTime.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view){
                Calendar calendar = Calendar.getInstance();
                SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
                String time ="Time: " +format.format(calendar.getTime());

                TextView textViewDate=findViewById(R.id.textViewDate);
                textViewDate.setText(time);
            }
        });

    }

}