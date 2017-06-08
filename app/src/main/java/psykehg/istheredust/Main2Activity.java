package psykehg.istheredust;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Main2Activity extends AppCompatActivity {

    TextView txtTime;
    TextView txtDate;

    // 현재시간을 msec 으로 구한다.
    long now = System.currentTimeMillis();

    // 현재시간을 date 변수에 저장한다.
    Date date = new Date(now);

    // 시간을 나타냇 포맷을 정한다 ( yyyy/MM/dd 같은 형태로 변형 가능 )
    SimpleDateFormat NowTime = new SimpleDateFormat("HH:mm");
    SimpleDateFormat NowDate = new SimpleDateFormat("MM월:dd일:EE요일", Locale.KOREAN);

    // nowDate 변수에 값을 저장한다.
    String formatTime = NowTime.format(date);
    String formatDate = NowDate.format(date);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //툴바 생성
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //툴바를 화면에 출력
        setSupportActionBar(toolbar);

        //xml에 지정해둔 화면을 코드와 연결
        txtTime = (TextView)findViewById(R.id.txtTime);
        txtDate = (TextView)findViewById(R.id.txtDate);

        //출력
        txtTime.setText(formatTime);
        txtDate.setText(formatDate);

    }

    //메뉴를 툴바에 추가
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
