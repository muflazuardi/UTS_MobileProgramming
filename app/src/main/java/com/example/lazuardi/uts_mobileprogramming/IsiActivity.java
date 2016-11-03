package com.example.lazuardi.uts_mobileprogramming;

/**
 * Created by Lazuardi on 11/4/2016.
 */
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class IsiActivity extends AppCompatActivity {

    public static final String intent_nama = "nama";
    public static final Integer intent_image = 0;

    String[] namakue ={
            "Rainbow Cake",
            "Brownies",
            "Cupcake",
            "Kue Cubit",
            "Kue Ulang Tahun",
            "Kue Bolu"
    };

    Integer[] imgid={
            R.drawable.rainbowcake,
            R.drawable.brownies,
            R.drawable.cupcake,
            R.drawable.cubit,
            R.drawable.ultah,
            R.drawable.bolu
    };
    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi);

        list=(ListView)findViewById(R.id.listcake);
        AdapterKue adapter=new AdapterKue(this,namakue,imgid);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                Intent intent = new Intent(IsiActivity.this, SubmitActivity.class);
                intent.putExtra(intent_nama,namakue[position]);
                intent.putExtra(String.valueOf(intent_image), imgid[position]);

                startActivity(intent);

            }
        });
    }
}
