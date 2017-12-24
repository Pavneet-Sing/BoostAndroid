package com.pavneet.android.boost.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.pavneet.android.boost.R;
import com.pavneet.android.boost.bean.TextAndImageBean;

import java.util.List;

/**
 * Created by Pavneet_Singh on 12/20/17.
 */

public class CircleImageAndCardViewAdapter extends RecyclerView.Adapter<CircleImageAndCardViewAdapter.BeanHolder> {

    private List<TextAndImageBean> list;
    private int rowLayout;
    private Context context;
    private LayoutInflater layoutInflater;
    private BitmapFactory.Options options;

    public CircleImageAndCardViewAdapter(List<TextAndImageBean> list, int rowLayout, Context context) {
        layoutInflater = LayoutInflater.from(context);
        this.list = list;
        this.context = context;
        // to reduce image size
        options = new BitmapFactory.Options();
        options.inSampleSize=8;
    }


        @Override
    public BeanHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.circular_list_item,parent,false);
        return new BeanHolder(view);
    }

    @Override
    public void onBindViewHolder(BeanHolder holder, int position) {

        Bitmap b = BitmapFactory.decodeResource(context.getResources(),list.get(position).getImageId(),options);
        RoundedBitmapDrawable drawable = RoundedBitmapDrawableFactory.create(context.getResources(),b);
        drawable.setCircular(true);
        holder.imageView.setImageDrawable(drawable);
        holder.textView.setText(list.get(position).getText());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class BeanHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView textView;
        ImageView imageView;
        public BeanHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            textView = itemView.findViewById(R.id.item_text);
            imageView = itemView.findViewById(R.id.img);
        }

        @Override
        public void onClick(View view) {
            Toast.makeText(context, "item clicked "+ getAdapterPosition(), Toast.LENGTH_SHORT).show();
        }
    }

}