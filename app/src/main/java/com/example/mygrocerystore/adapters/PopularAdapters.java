package com.example.mygrocerystore.adapters;

import android.content.Context;
import android.content.Intent;
import android.icu.text.Transliterator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.mygrocerystore.R;
import com.example.mygrocerystore.activities.ViewAllActivity;
import com.example.mygrocerystore.models.PopularModel;
import com.example.mygrocerystore.models.ViewAllModel;

import java.lang.reflect.Type;
import java.security.Policy;
import java.util.List;

public class PopularAdapters extends RecyclerView.Adapter<PopularAdapters.ViewHolder> {
    private Context context;
    private List<PopularModel> popularModelList;

    public PopularAdapters(Context context, List<PopularModel> popularModelList) {
        this.context = context;
        this.popularModelList = popularModelList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.popular_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull   ViewHolder  holder,    int position) {
        // thuong nen tao nhu the nay
        PopularModel popularModel = popularModelList.get(position);

        Glide.with(context).load(popularModelList.get(position).getImg_url()).into(holder.popImg);
        holder.name.setText(popularModel.getName());
        holder.rating.setText(popularModel.getRating());
        holder.description.setText(popularModel.getDescription());
        holder.discount.setText(popularModel.getDiscount());

        // code vua gon vua de nhin, tranh bi loi
        // chay ok

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(context,ViewAllActivity.class);

               //intent.putExtra("type",popularModelList.get(position).getType());
                intent.putExtra("type",popularModel.getType());
                // ok nhe
                context.startActivity(intent);
            }
        });

    }


    @Override
    public int getItemCount() {
        return popularModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView popImg;
        TextView name,description,rating,discount;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            popImg=itemView.findViewById(R.id.pop_img);
            name=itemView.findViewById(R.id.pop_name);
            description=itemView.findViewById(R.id.pop_des);
            rating=itemView.findViewById(R.id.pop_rating);
            discount=itemView.findViewById(R.id.pop_discount);

        }
    }
}
