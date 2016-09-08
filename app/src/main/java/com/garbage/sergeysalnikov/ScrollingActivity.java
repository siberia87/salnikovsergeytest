package com.garbage.sergeysalnikov;

import android.graphics.Paint;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class ScrollingActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    @Override
    public void onCheckedChanged(final CompoundButton compoundButton, final boolean b) {
        switch (compoundButton.getId()) {
            case R.id.checkBox1:
                if (b) {
                    mTextView1.setTextColor(ContextCompat.getColor(this, R.color.pas_text_color));
                    mTextView1.setPaintFlags(mTextView1.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                } else {
                    mTextView1.setPaintFlags(mTextView1.getPaintFlags() & (~Paint.STRIKE_THRU_TEXT_FLAG));
                    mTextView1.setTextColor(ContextCompat.getColor(this, R.color.main_text_color));
                    
                }

                break;
            case R.id.checkBox2:
                if (b) {
                    mTextView2.setTextColor(ContextCompat.getColor(this, R.color.pas_text_color));
                    mTextView2.setPaintFlags(mTextView2.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                } else {
                    mTextView2.setTextColor(ContextCompat.getColor(this, R.color.main_text_color));
                    mTextView2.setPaintFlags(mTextView2.getPaintFlags() & (~Paint.STRIKE_THRU_TEXT_FLAG));
                }

                break;
            case R.id.checkBox3:
                if (b) {
                    mTextView3.setTextColor(ContextCompat.getColor(this, R.color.pas_text_color));
                    mTextView3.setPaintFlags(mTextView3.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                } else {
                    mTextView3.setTextColor(ContextCompat.getColor(this, R.color.main_text_color));
                    mTextView3.setPaintFlags(mTextView2.getPaintFlags() & (~Paint.STRIKE_THRU_TEXT_FLAG));
                }

                break;
        }
    }

    private TextView mTextView1;
    private TextView mTextView2;
    private TextView mTextView3;

    private CheckBox mCheckBox1;
    private CheckBox mCheckBox2;
    private CheckBox mCheckBox3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);

        mTextView1 = (TextView) findViewById(R.id.tv_1);
        mTextView2 = (TextView) findViewById(R.id.tv_2);
        mTextView3 = (TextView) findViewById(R.id.tv_3);

        mCheckBox1 = (CheckBox) findViewById(R.id.checkBox1);
        mCheckBox2 = (CheckBox) findViewById(R.id.checkBox2);
        mCheckBox3 = (CheckBox) findViewById(R.id.checkBox3);

        mCheckBox1.setOnCheckedChangeListener(this);
        mCheckBox2.setOnCheckedChangeListener(this);
        mCheckBox3.setOnCheckedChangeListener(this);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scrolling, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
