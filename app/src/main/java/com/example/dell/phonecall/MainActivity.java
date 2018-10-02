package com.example.dell.phonecall;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText phoneNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //找到我们关心的控件
        phoneNumber=findViewById(R.id.phoneNumber);
        //找到按钮
        Button call=findViewById(R.id.call);
        //给按钮设置一个点击事件
        call.setOnClickListener();

    }

    private class MyClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view){
            phoneNumber.getText().toString().trim();
            if ("".equals(phoneNumber)){
                Toast.makeText(MainActivity.this,"PhoneNumber不能为空",Toast.LENGTH_LONG).show();
                return;
            }
            //拨打电话的Intent
            Intent intent=new Intent();
            intent.setAction(Intent.ACTION_CALL);
            intent.setData(Uri.parse("tel:"+phoneNumber));
            startActivity(intent);

        }
    }
}
