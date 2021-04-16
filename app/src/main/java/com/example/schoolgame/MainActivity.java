package com.example.schoolgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

import static android.widget.Toast.LENGTH_SHORT;

public class MainActivity extends AppCompatActivity {
     TextView tv1,tv2,tv3,tv4,tv;
     EditText et1;
     Button bt;
    int c1=0,r,r1,cou=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1=findViewById(R.id.tv1);
        tv2=findViewById(R.id.tv2);
        tv3=findViewById(R.id.tv3);
        tv4=findViewById(R.id.tv4);
        et1=findViewById(R.id.et1);
        bt=findViewById(R.id.bt);
        tv=findViewById(R.id.tv);
        Random random=new Random();
         r = random.nextInt(10);
        tv1.setText(r+"");

        Random random1=new Random();
         r1=random1.nextInt(10);
        tv2.setText(r1+"");


        bt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                int sum=r+r1;
                int n3=Integer.parseInt(et1.getText().toString());
                c1=c1+1;

             if(n3==sum){
                  cou=cou+1;
                 Random random3=new Random();
                 int r2=random3.nextInt(4);
                  switch (r2){
                      case 0:
                          tv3.setText("very Good");
                          break;
                      case 1:
                          tv3.setText("Excellent");
                          break;
                      case 2:
                          tv3.setText("Nice work");
                          break;
                      case 3:
                          tv3.setText("keep up the good work");
                          break;
                  }
                  et1.setText("");
                 r = random.nextInt(10);
                 tv1.setText(r+"");

                  r1=random1.nextInt(10);
                 tv2.setText(r1+"");


             }
             else{

                 Random random4=new Random();
                 int r3=random4.nextInt(4);
                 switch (r3){
                     case 0:
                         tv3.setText("No.please try Again");
                         break;
                     case 1:
                         tv3.setText("Wrong.Try once Again");
                         break;
                     case 2:
                         tv3.setText("Don't give up");
                         break;
                     case 3:
                         tv3.setText("Np keep trying");
                         break;


                 }
                 et1.setText("");

             }



           if(c1==10) {
               int c ;
               c1=0;
               c = cou* 10;

               if (c <=75) {
                   tv4.setText(c + ":Please ask your instructor for extra help");
                   Toast.makeText(MainActivity.this, c+"%..please ask your instructor for extra help" , Toast.LENGTH_SHORT).show();
               }
               else
               {
                   tv4.setText("you got " + c+"%");
                   Toast.makeText(MainActivity.this, c+"%..Good Score" , Toast.LENGTH_SHORT).show();
           }

            cou=0;


           }

            }
        });
    }

    public void add(View view) {
    }
}