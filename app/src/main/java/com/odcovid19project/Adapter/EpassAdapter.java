package com.odcovid19project.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.odcovid19project.Models.Epass;
import com.odcovid19project.Models.FAQ;
import com.odcovid19project.R;

import java.util.List;

public class EpassAdapter extends RecyclerView.Adapter<EpassAdapter.ImageViewHolder> {

    private Context mContext;
    private List<Epass> mEpass;

    public EpassAdapter(Context context, List<Epass> list) {
        mContext = context;
        mEpass = list;
    }


    @NonNull
    @Override
    public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.single_epass, parent, false);
        return new ImageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ImageViewHolder holder, final int position) {

        final Epass epass = mEpass.get(position);

        holder.Name.setText(epass.getName());
        holder.Link.setText(epass.getLink());
    }

    @Override
    public int getItemCount() {
        return mEpass.size();
    }


    public class ImageViewHolder extends RecyclerView.ViewHolder {

        public TextView Name, Link;
        public ImageViewHolder(View itemView) {
            super(itemView);

            Name = itemView.findViewById(R.id.name);
            Link = itemView.findViewById(R.id.link);
        }
    }

}