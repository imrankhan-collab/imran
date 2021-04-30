package com.example.assingnment4443;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private Context context;
    private List<Input> input;
    private LayoutInflater layoutInflater;

    public MyAdapter(Context context, List<Input> input) {
        this.context = context;
        this.input = input;
        layoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.list_items, parent, false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {


        Input iinput = input.get(position);
        holder.Applayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.onLayoutContactClick(context, iinput.getName(), iinput.getApp_description());
                holder.txtName.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent= new Intent(context,second_activity.class);
                        intent.putExtra("image",iinput.getImgApp());
                        intent.putExtra("APk Name",iinput.getName());
                        intent.putExtra("desription",iinput.getApp_description());
                        intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(intent);

                    }
                });
            }
        });


        holder.setTxtName(iinput.getName());
        holder.setTxtPhone(iinput.getApp_description());
        holder.setImgContact(iinput.getImgApp());

    }

    @Override
    public int getItemCount() {
        return input == null ? 0 : input.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final LinearLayout Applayout;
        private ImageView imgapp;
        private TextView txtName;
        private TextView txtdescription;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            Applayout = itemView.findViewById(R.id.layoutContact);
            imgapp = itemView.findViewById(R.id.imgapp);
            txtName = itemView.findViewById(R.id.txtName);
            txtdescription = itemView.findViewById(R.id.txtdescription);

        }



        private void onLayoutContactClick(Context context, String appname, String appdescription) {
            Toast.makeText(context, "App Name : " + appname + " Description : " + appdescription, Toast.LENGTH_SHORT).show();

        }

        private void setImgContact(int imgContact) {
            this.imgapp.setImageResource(imgContact);
        }

        private void setTxtName(String txtName) {
            this.txtName.setText(txtName);
        }

        private void setTxtPhone(String txtPhone) {
            this.txtdescription.setText(txtPhone);

            }



    }


}