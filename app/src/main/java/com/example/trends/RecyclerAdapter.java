package com.example.trends;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private List<Data> dataList;
    private Context context;
    private int layout;
    private Data data;


    public RecyclerAdapter(@NonNull Context context, int resource, @NonNull List<Data> objects) {
        this.dataList = objects;
        this.context = context;
        this.layout = resource;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(layout, null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        data = dataList.get(position);


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, data.getContent(), Toast.LENGTH_SHORT).show();
            }
        });
        holder.tiTextView.setText(data.getTitle());
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        TextView tiTextView;
        ViewHolder(View itemView){
            super(itemView);
            tiTextView = itemView.findViewById(R.id.titleText);
        }
    }
}

