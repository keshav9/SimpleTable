package com.ehc.Table;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button b=(Button)findViewById(R.id.sub);
        final EditText et=(EditText)findViewById(R.id.editText);
        final TextView tv=(TextView)findViewById(R.id.displayTable);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //To change body of implemented methods use File | Settings | File Templates.

                if(et.getText().length()==0)
                    tv.setText("Please Enter Table Number");
                else
                {
                    int table= Integer.parseInt(et.getText().toString());
                    StringBuffer sb=new StringBuffer();
                    for(int i=1; i<=10;i++)
                        sb.append(table + " * " + i + "=" + table * i + "\n");
                    tv.setText(sb);
                }

            }
        });
    }
}
