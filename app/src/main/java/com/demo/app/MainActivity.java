package com.demo.app;

        import android.content.Context;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Context ctx = MainActivity.this;
        class Calc{
            int num, res;
            String op;
            public void execute(){
                switch (op){
                    case "+":

                        break;
                    case "-":

                        break;
                    case "*":

                        break;
                    case "/":

                        break;
                }
            }
            int getNum(){return num;}
            void setNum(){this.num = num;}
        }
        final EditText num1 = findViewById(R.id.num);

        findViewById(R.id.plus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int int1 = Integer.parseInt(num1.getText().toString());
               // sum = int1 + int2;
                Calc calc = new Calc();
              //  Log.d("입력값은::?" );
                calc.execute();

            }
        });
        findViewById(R.id.minus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int int1 = Integer.parseInt(num1.getText().toString());
                // sum = int1 + int2;

            }
        });
        findViewById(R.id.multi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int int1 = Integer.parseInt(num1.getText().toString());
                // sum = int1 + int2;

            }
        });
        findViewById(R.id.divid).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int int1 = Integer.parseInt(num1.getText().toString());
                // sum = int1 + int2;

            }
        });
        findViewById(R.id.reset).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int int1 = Integer.parseInt(num1.getText().toString());
                // sum = int1 + int2;

            }
        });
        findViewById(R.id.epual).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int int1 = Integer.parseInt(num1.getText().toString());
                // sum = int1 + int2;

            }
        });



    }
}
