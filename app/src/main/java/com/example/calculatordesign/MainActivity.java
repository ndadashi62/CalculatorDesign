package com.example.calculatordesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    int i = 0;

    Button btn00;
    Button btn0;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btnMinus;
    Button btnAdd;
    Button btnMultiplication;
    Button btnDivision;
   Button btnDesimal;
    Button btnEqual;
    TextView textViewInfo;
    Button btnC;

    double firstNumber;
    double secondNumber;
    String operation = "";

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final View.OnClickListener clicked = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handleNumpadClicks(view);






            }
        };
        btnDesimal=findViewById(R.id.btnDesimal);
        btn00 = findViewById(R.id.btn00);
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);

        btnDesimal.setOnClickListener(clicked);
        btn00.setOnClickListener(clicked);
        btn0.setOnClickListener(clicked);
        btn1.setOnClickListener(clicked);
        btn2.setOnClickListener(clicked);
        btn3.setOnClickListener(clicked);
        btn4.setOnClickListener(clicked);
        btn5.setOnClickListener(clicked);
        btn6.setOnClickListener(clicked);
        btn7.setOnClickListener(clicked);
        btn8.setOnClickListener(clicked);
        btn9.setOnClickListener(clicked);


        btnC = findViewById(R.id.btnC);

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                operation = "";
                firstNumber = 0;
                secondNumber = 0;
                if (textViewInfo.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "box is empty", Toast.LENGTH_SHORT).show();


                } else {
                    textViewInfo.setText("");
                    firstNumber = 0;
                    secondNumber = 0;
                }


            }
        });
       // btnClear = findViewById(R.id.btnClear);

        //btnClear.setOnClickListener(new View.OnClickListener() {
          //  @Override
           // public void onClick(View v) {


              //  if (textViewInfo.getText().toString().equals("")) {
               //     Toast.makeText(MainActivity.this, "box is empty", Toast.LENGTH_SHORT).show();


               // } else {
                  //  String value = textViewInfo.getText().toString();
                 //   textViewInfo.setText(value.substring(0, value.length() - 1));
              //  }


           // }
      //  });

        btnAdd = findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                operation = "+";

                if (textViewInfo.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "box is empty", Toast.LENGTH_SHORT).show();
                } else {
                    String x = textViewInfo.getText().toString();
                    firstNumber = Double.parseDouble(textViewInfo.getText().toString());
                    textViewInfo.setText("");
                }

            }
        });
        btnDivision = findViewById(R.id.btnDivision);
        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                operation = "/";
                if (textViewInfo.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "box is empty", Toast.LENGTH_SHORT).show();
                } else {
                    String x = textViewInfo.getText().toString();
                    firstNumber = Double.parseDouble(textViewInfo.getText().toString());
                    textViewInfo.setText("");
                }

            }
        });
        btnMinus = findViewById(R.id.btnMinus);
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = "-";

                if (textViewInfo.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "box is empty", Toast.LENGTH_SHORT).show();
                } else {
                    String x = textViewInfo.getText().toString();
                    firstNumber = Double.parseDouble(textViewInfo.getText().toString());
                    textViewInfo.setText("");
                }
            }
        });

        btnMultiplication = findViewById(R.id.btnMultiplition);
        btnMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation = "*";
                if (textViewInfo.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "box is empty", Toast.LENGTH_SHORT).show();
                } else {
                    String x = textViewInfo.getText().toString();
                    firstNumber = Double.parseDouble(textViewInfo.getText().toString());
                    textViewInfo.setText("");
                }

            }
        });

        textViewInfo = findViewById(R.id.textViewInfo);
        btnEqual = findViewById(R.id.btnEqual);

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (textViewInfo.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "no second number", Toast.LENGTH_SHORT).show();

                    return;
                }




                if  (operation.equals("+")) {
                    secondNumber = Double.parseDouble(textViewInfo.getText().toString());
                    textViewInfo.setText((firstNumber + secondNumber) + "");
                }


                if (operation.equals("-")) {
                    secondNumber = Double.parseDouble(textViewInfo.getText().toString());
                    textViewInfo.setText((firstNumber - secondNumber) + "");
                }

                if (operation.equals("*")) {
                    secondNumber = Double.parseDouble(textViewInfo.getText().toString());
                    textViewInfo.setText((firstNumber * secondNumber) + "");
                }

                if (operation.equals("/")) {
                    secondNumber = Double.parseDouble(textViewInfo.getText().toString());
                    textViewInfo.setText((firstNumber / secondNumber) + "");
                }


                if (operation.equals("")) {
                    Toast.makeText(MainActivity.this, "there is no operation", Toast.LENGTH_SHORT).show();
                }




            }
        });


    }

    public void handleNumpadClicks(View view) {
        textViewInfo.setText(textViewInfo.getText().toString() + view.getTag().toString());


    }

}








