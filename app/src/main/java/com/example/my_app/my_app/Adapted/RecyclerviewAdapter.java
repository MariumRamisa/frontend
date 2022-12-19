/*
package com.example.my_app.my_app.Adapted;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.TextView;
import com.example.my_app.R;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.my_app.my_app.Model.FoodData;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class RecyclerviewAdapter extends RecyclerView.Adapter<RecyclerviewAdapter.RecyclerviewHolder> {

    Context context;
    List<FoodData> foodDataList;
    List<FoodData> filteredfoodDataList;

    public RecyclerviewAdapter(Context context, List<FoodData> foodDataList) {
        this.context = context;
        this.foodDataList = foodDataList;
        this.filteredfoodDataList = foodDataList;

    }

    @NonNull
    @Override
    public RecyclerviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

         View view= LayoutInflater.from(context).inflate(R.layout.recyclerview,parent,false);

        return new RecyclerviewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerviewHolder holder, int position) {
        holder.food_name.setText(foodDataList.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return filteredfoodDataList.size();
    }

    public static final class RecyclerviewHolder extends RecyclerView.ViewHolder{
        TextView food_name;

       public RecyclerviewHolder(@NonNull View itemView) {
           super(itemView);

           food_name=itemView.findViewById(R.id.food_name);

       }
   }
   public Filter getFilter(){
        return new Filter(){
            @Override
            protected FilterResults performFiltering(CharSequence charSequence) {
                String Key =charSequence.toString();
                if(Key.isEmpty()){
                    filteredfoodDataList=foodDataList;
                }
                else{
                    List<FoodData> lstfilter=new ArrayList<>();
                    for (FoodData row:foodDataList){
                        if(row.getName().toLowerCase().contains(Key.toLowerCase())){
                            lstfilter.add(row);

                        }
                    }
                    filteredfoodDataList=lstfilter;
                }
                FilterResults filterResults=new FilterResults();
                filterResults.values=filteredfoodDataList;

                return filterResults;
            }

            @Override
            protected void publishResults(CharSequence constraint, FilterResults filterResults) {
                filteredfoodDataList=(List<FoodData>)filterResults.values;
                notifyDataSetChanged();
            }
        };

   }
}
*/
