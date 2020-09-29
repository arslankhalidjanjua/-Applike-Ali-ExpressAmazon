package com.example.makeanandroidapplikealiexpressamazon_.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.makeanandroidapplikealiexpressamazon_.R;

public class ProductViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    public TextView text_product_name, text_product_Description, txtproductprice_new;
    public  ImageView imageView;
    public ItemClickListner listner;

    public ProductViewHolder(@NonNull View itemView) {
        super(itemView);

        imageView = itemView.findViewById(R.id.product_image);
        text_product_name = itemView.findViewById(R.id.product_name);
        text_product_Description = itemView.findViewById(R.id.product_describtion);
        txtproductprice_new = itemView.findViewById(R.id.product_price);
    }

    public void setItemClickListner(ItemClickListner listner) {
        this.listner = listner;

    }

    @Override
    public void onClick(View view) {
        listner.onClick(view, getAdapterPosition(), false);

    }
}
