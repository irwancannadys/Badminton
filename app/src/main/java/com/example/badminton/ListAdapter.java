package com.example.badminton;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.HolderList> {

    ArrayList<DataListCustomer> dataListCustomers;
    HandleClick handleClick;

    public ListAdapter(ArrayList<DataListCustomer> dataListCustomers, HandleClick handleClick) {
        this.dataListCustomers = dataListCustomers;
        this.handleClick = handleClick;
    }

    @NonNull
    @Override
    public ListAdapter.HolderList onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new HolderList(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_schedule_badminton, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ListAdapter.HolderList holder, final int position) {
        final DataListCustomer dataListCustomer = dataListCustomers.get(position);
        holder.textUsername.setText(dataListCustomer.name);
        holder.textDate.setText(dataListCustomer.date);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handleClick.setClick(dataListCustomer);
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataListCustomers.size();
    }

    static class HolderList extends RecyclerView.ViewHolder {

        TextView textUsername, textDate;

        public HolderList(@NonNull View itemView) {
            super(itemView);
            textDate = itemView.findViewById(R.id.tv_date);
            textUsername = itemView.findViewById(R.id.tv_booking_name);
        }
    }

    //untuk handle click kita buat interface class yang akan di panggil di dalam setiap holder
    interface HandleClick {
        void setClick(DataListCustomer dataListCustomer);
    }

}

//
//class A -> akan jalan pertama
//    sedangkan class A ini membutuhkan bantuan handclick yang ada di class B
//
//jadi kita butuh class interface untuk memaduhkan class dengan class B, tapi hanya berjalan sebagai interface