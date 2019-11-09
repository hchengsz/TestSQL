package com.example.testsql;

import androidx.appcompat.app.AppCompatActivity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.TextView;
import com.example.testsql.DataBaseHelper.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String str1 = "gre";
        DataBaseHelper myDatabaseHelper = new DataBaseHelper(this);
        myDatabaseHelper.openDataBase();
        String[][] str = myDatabaseHelper.getAppCategoryDetail();
        str1 = Integer.toString(str.length);

        TextView text1 = (TextView)findViewById(R.id.txt);
        TextView text2 = (TextView)findViewById(R.id.txt1);
        TextView text3 = (TextView)findViewById(R.id.txt2);
        TextView text4 = (TextView)findViewById(R.id.txt3);

        text1.setText(str[0][0]);
        text2.setText(str[1][0]);
        text3.setText(str[2][0]);
        text4.setText(str[3][0]);
    }

}
