package org.androidtown.myapplication_03;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        /**
         * 레이아웃 파일에서 각각의 뷰에 이름을 추가한다(아이디)
         * 이미지 초기 visible 세팅을 한다 ->
         * 각 뷰를 자바코드에서 접근가능하도록 세팅한다 -> id 선언
         * '왼쪽 버튼'이 눌렸을때에 대한 동작코드를 구현한다.-> 오른쪽 이미지 가려짐 왼쪽표시
         * '오른쪽 버튼'이 눌렸을때에 대한 동작코드를 구현한다.-> 왼쪽 이미지 가려짐 오른쪽표시
         * 빌드 > 앱실행
         *
         */

        final ImageView imageleft = (ImageView) findViewById(R.id.imgeleft);
        final ImageView imageright = (ImageView) findViewById(R.id.imgeright);

        Button button_top = (Button) findViewById(R.id.button_top);
        Button button_down = (Button) findViewById(R.id.button_down);

        final Context context = this;

        button_top.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,"왼쪽사진입니다",Toast.LENGTH_SHORT).show();
                imageleft.setVisibility(View.VISIBLE);
                imageright.setVisibility(View.INVISIBLE);
            }
        });

        button_down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,"오른쪽사진입니다",Toast.LENGTH_SHORT).show();
                imageright.setVisibility(View.VISIBLE);
                imageleft.setVisibility(View.INVISIBLE);
            }
        });




















    }
}
