package com.example.calculater;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    String temp1,temp2,str1,str2;
    double n,n1,n2,cnt=0,Result ;
    Button Plus,Sub,Mul,Div,Ne,Per,Back,Clear,One,Two,Three,Four,Five,Six,Seven,Eight,Nine,Zero,Equal,Dot;
    TextView textView;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Plus = findViewById(R.id.plus);
        Sub = findViewById(R.id.sub);
        Mul = findViewById(R.id.mul);
        Div = findViewById(R.id.div);
        textView = findViewById(R.id.tv1);
        Ne = findViewById(R.id.ne);
        Per = findViewById(R.id.per);
        Back = findViewById(R.id.back);
        Clear = findViewById(R.id.clear);
        One = findViewById(R.id.one);
        Two = findViewById(R.id.two);
        Three = findViewById(R.id.three);
        Four = findViewById(R.id.four);
        Five = findViewById(R.id.five);
        Six = findViewById(R.id.six);
        Seven = findViewById(R.id.seven);
        Eight = findViewById(R.id.eight);
        Nine = findViewById(R.id.nine);
        Zero = findViewById(R.id.zero);
        Equal = findViewById(R.id.equal);
        Dot = findViewById(R.id.dot);

        Plus.setOnClickListener(this);

        Sub.setOnClickListener(this);
        Mul.setOnClickListener(this);
        Div.setOnClickListener(this);
        textView.setOnClickListener(this);
        Ne.setOnClickListener(this);
        Per.setOnClickListener(this);
        Back.setOnClickListener(this);
        Clear.setOnClickListener(this);
        One.setOnClickListener(this);
        Two.setOnClickListener(this);
        Three.setOnClickListener(this);
        Five.setOnClickListener(this);
        Four.setOnClickListener(this);
        Seven.setOnClickListener(this);
        Six.setOnClickListener(this);
        Eight.setOnClickListener(this);
        Nine.setOnClickListener(this);
        Zero.setOnClickListener(this);
        Equal.setOnClickListener(this);
        Dot.setOnClickListener(this);

    }

    @Override
    public void onClick(View view)
    {

            if (view.getId()==One.getId())
            {
                    temp1 = (String) textView.getText();
                    temp2 = temp1 + "1";
                    textView.setText(temp2);
            }
            if (view.getId()==Two.getId())
            {
                    temp1 = (String) textView.getText();
                    temp2 = temp1 + "2";
                    textView.setText(temp2);
            }
            if (view.getId()==Three.getId())
            {
                temp1 = (String) textView.getText();
                temp2 = temp1 + "3";
                textView.setText(temp2);
            }
            if (view.getId()==Four.getId())
            {
                temp1 = (String) textView.getText();
                temp2 = temp1 + "4";
                textView.setText(temp2);
            }
            if (view.getId()==Five.getId())
            {
                temp1 = (String) textView.getText();
                temp2 = temp1 + "5";
                textView.setText(temp2);
            }
            if (view.getId()==Six.getId())
            {
                temp1 = (String) textView.getText();
                temp2 = temp1 + "6";
                textView.setText(temp2);
            }
            if (view.getId()==Seven.getId())
            {
                temp1 = (String) textView.getText();
                temp2 = temp1 + "7";
                textView.setText(temp2);
            }
            if (view.getId()==Eight.getId())
            {
                temp1 = (String) textView.getText();
                temp2 = temp1 + "8";
                textView.setText(temp2);
            }
            if (view.getId()==Nine.getId())
            {
                temp1 = (String) textView.getText();
                temp2 = temp1 + "9";
                textView.setText(temp2);
            }
            if (view.getId()==Zero.getId())
            {
                temp1 = (String) textView.getText();
                temp2 = temp1 + "0";
                textView.setText(temp2);
            }
            if (view.getId()==Ne.getId())
            {
                temp1 = (String) textView.getText();
                temp2 = temp1 + "-";
                textView.setText(temp2);
            }
            if (view.getId()==Dot.getId())
            {
                temp1 = (String) textView.getText();
                temp2 = temp1 + ".";
                textView.setText(temp2);
            }
            if (view.getId()==Back.getId())
            {
                    str1 = (String) textView.getText();
                    str2 = str1.substring(0,str1.length()-1);
                    textView.setText(str2);
            }
            if (view.getId()==Plus.getId())
            {
                    str1 = (String) textView.getText();
                    n1 = Float.valueOf(str1);
                    textView.setText("");
                    cnt = 1;
            }
            if (view.getId()==Sub.getId())
            {
                    str1 = (String) textView.getText();
                    n1 = Float.valueOf(str1);
                    textView.setText("");
                    cnt = 2;
            }
            if (view.getId()==Mul.getId())
            {
                    str1 = (String) textView.getText();
                    n1 = Float.valueOf(str1);
                    textView.setText("");
                    cnt = 3;
            }
            if (view.getId()==Div.getId())
            {
                    str1 = (String) textView.getText();
                    n1 = Float.valueOf(str1);
                    textView.setText("");
                    cnt = 4;
            }
            if (view.getId()==Clear.getId())
            {
                    textView.setText("");
                    cnt = 5;
            }

            if (view.getId()==Equal.getId())
            {
                    str2 = (String) textView.getText();
                    n2 = Float.valueOf(str2);
                    textView.setText("");

                    if (cnt == 1)
                    {
                            Result = n1 + n2;
                    }
                    else if (cnt == 2)
                    {
                        Result = n1 - n2;
                    }
                    else if (cnt == 3)
                    {
                        Result = n1 * n2;
                    }
                    else if (cnt == 4)
                    {
                        Result = n1 / n2;
                    }
                    else if (cnt == 5)
                    {
                        textView.setText(null);
                    }
                    textView.setText(""+Result);
            }
    }
}
