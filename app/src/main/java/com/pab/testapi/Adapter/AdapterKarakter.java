package com.pab.testapi.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.pab.testapi.Model.KarakterModel;
import com.pab.testapi.R;

import java.util.ArrayList;
import java.util.List;

public class AdapterKarakter extends RecyclerView.Adapter<AdapterKarakter.HolderData>{
    private List<KarakterModel> listKarakter = new ArrayList<>();
    public AdapterKarakter(List<KarakterModel> listKarakter){
        this.listKarakter = listKarakter;
    }

    @NonNull
    @Override
    public HolderData onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layout = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_karakter,parent, false);
        HolderData holder = new HolderData(layout);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull HolderData holder, int position) {
        KarakterModel KM = listKarakter.get(position);


        holder.tvName.setText(KM.getName());
        holder.tvSpecies.setText(KM.getSpecies());
        holder.tvStatus.setText(KM.getStatus());
        holder.tvGender.setText(KM.getGender());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(),"Nama : "+ KM.getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return listKarakter.size();
    }

    public class HolderData extends RecyclerView.ViewHolder{
        TextView tvName, tvSpecies, tvStatus, tvGender;
        ImageView ivImage;

        public HolderData(@NonNull View itemView){
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_name);
            tvSpecies = itemView.findViewById(R.id.tv_species);
            tvStatus = itemView.findViewById(R.id.tv_status);
            tvGender = itemView.findViewById(R.id.tv_gender);
            ivImage = itemView.findViewById(R.id.iv_image);
        }
    }













}
