package com.example.lazuardi.uts_mobileprogramming;

/**
 * Created by Lazuardi on 11/4/2016.
 */
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AdapterKue extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] itemname;
    private final Integer[] imgid;

    public AdapterKue(Activity context, String[] itemname, Integer[] imgid) {
        super(context, R.layout.listkue, itemname);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.itemname=itemname;
        this.imgid=imgid;
    }

    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.listkue, null,true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.txt_namakue);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.img_cake);

        txtTitle.setText(itemname[position]);
        imageView.setImageResource(imgid[position]);
        return rowView;


    };
}