package com.example.recycleviewactivity;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MahasiswaAdapter extends RecyclerView.Adapter<MahasiswaAdapter.MahasiswaViewHolder> {

    private ArrayList<Mahasiswa> dataList;
    private Context context;

    public MahasiswaAdapter(ArrayList<Mahasiswa> dataList,  Context context) {
        this.dataList = dataList;
        this.context = context;
    }

    @Override
    public MahasiswaViewHolder
    onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater =
                LayoutInflater.from(parent.getContext());
        View view =
                layoutInflater.inflate(R.layout.row_mahasiswa, parent,
                        false);
        return new MahasiswaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MahasiswaViewHolder holder, int position) {
        Mahasiswa mahasiswa = dataList.get(position);
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtNpm.setText(dataList.get(position).getNim());
        holder.txtNoHp.setText(dataList.get(position).getNohp());

        // Menambahkan onClickListener di sini
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tambahkan Toast di sini
                Log.d("RecyclerView", "Item " + position + " di klik");
                Toast.makeText(context, "Mahasiswa dengan Nama: " + mahasiswa.getNama() +" di klik", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class MahasiswaViewHolder extends
            RecyclerView.ViewHolder{
        private TextView txtNama, txtNpm, txtNoHp;

        public MahasiswaViewHolder(View itemView) {
            super(itemView);
            txtNama = (TextView)
                    itemView.findViewById(R.id.txt_nama_mahasiswa);
            txtNpm = (TextView)
                    itemView.findViewById(R.id.txt_nim_mahasiswa);
            txtNoHp = (TextView)
                    itemView.findViewById(R.id.txt_nohp_mahasiswa);
        }
    }
}
