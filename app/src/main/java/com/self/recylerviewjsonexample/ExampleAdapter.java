package com.self.recylerviewjsonexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class ExampleAdapter extends RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder>
{
    private Context context;
    private ArrayList<ExampleItem> exampleItemArrayList;

    public ExampleAdapter(Context context, ArrayList<ExampleItem> exampleItemArrayList)
    {
        this.context = context;
        this.exampleItemArrayList = exampleItemArrayList;
    }

    @NonNull
    @Override
    public ExampleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //return null;
        View v = LayoutInflater.from(context).inflate(R.layout.example_item,parent,false);
        return  new ExampleViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ExampleViewHolder holder, int position) {
        ExampleItem currentExampleItem = exampleItemArrayList.get(position);
        String imageUrl = currentExampleItem.getImagUrl();
        String creatorName = currentExampleItem.getmCreator();
        int likeCount = currentExampleItem.getmLikes();

        holder.textViewCreator.setText(creatorName);
        holder.textViewLikes.setText( "Likes" + likeCount);
        Picasso.get().load(imageUrl).fit().centerInside().into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        return exampleItemArrayList.size();
    }

    public class ExampleViewHolder extends RecyclerView.ViewHolder
    {
        public ImageView imageView;
        public TextView textViewCreator;
        public TextView textViewLikes;
        public ExampleViewHolder(@NonNull View itemView)
        {
            super(itemView);
            imageView =(ImageView) itemView.findViewById(R.id.image_view);
            textViewCreator =(TextView) itemView.findViewById(R.id.tv_view_creator);
            textViewLikes =(TextView) itemView.findViewById(R.id.tv_view_likes);

        }
    }
}
