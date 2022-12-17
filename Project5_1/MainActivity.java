package com.example.project5_1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);  // activity_main.xml을 삭제해서 주석처리
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams( // 리니어레이아웃 파라미터 설정
                LinearLayout.LayoutParams.MATCH_PARENT, // android:layout_width="match_parent"
                LinearLayout.LayoutParams.MATCH_PARENT); // android:layout_height="match_parent"
                // 하나 더 추가해 android:layout_height="1" 지정 가능

        LinearLayout baseLayout = new LinearLayout(this); // 리니어레이웃 생성
        baseLayout.setOrientation(LinearLayout.VERTICAL); // android:orientation="vertical"
        baseLayout.setBackgroundColor(Color.rgb(0,255,0)); // android:background="#00FF00"
        setContentView(baseLayout,params); // 준비된 리니어레이아웃 변수를 화면에 출력

        Button btn = new Button(this); // 버튼 생성
        btn.setText("버튼입니다"); // android:text="버튼입니다"
        btn.setBackgroundColor(Color.MAGENTA); // android:background="#magenta"
        baseLayout.addView(btn); // 레이아웃에 출력(android:layout_width="match_parent", android:layout_height="wrap_content")

        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0){
                Toast.makeText(getApplicationContext(),"코드로 생성한 버튼입니다.",Toast.LENGTH_SHORT).show();
            }
        });
    }
}