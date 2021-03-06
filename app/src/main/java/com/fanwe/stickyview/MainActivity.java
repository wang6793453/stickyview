package com.fanwe.stickyview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_main);
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.btn_scrollview:
                startActivity(new Intent(this, ScrollViewActivity.class));
                break;
            case R.id.btn_recyclerview:
                startActivity(new Intent(this, RecyclerViewActivity.class));
                break;
        }
    }
}
