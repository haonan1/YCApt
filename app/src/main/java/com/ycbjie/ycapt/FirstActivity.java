package com.ycbjie.ycapt;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.ycbjie.annotation.contentView.ContentView;
import com.ycbjie.api.click.OnceInit;
import com.ycbjie.annotation.click.OnceClick;
import com.ycbjie.api.contentView.ContentActivity;


@ContentView(R.layout.activity_first)
public class FirstActivity extends ContentActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_first);
        TextView tv_1 = findViewById(R.id.tv_1);
        tv_1.setText("使用注解[编译期]，添加点击事件，间隔2秒钟");
        OnceInit.once(this,2000);
    }

    int a = 1;
    @OnceClick(R.id.tv_1)
    public void Click1(){
        Log.d("tag--------------------","tv_1");
        Toast.makeText(this, "点击事件，间隔两秒"+ a++, Toast.LENGTH_SHORT).show();
    }


}
