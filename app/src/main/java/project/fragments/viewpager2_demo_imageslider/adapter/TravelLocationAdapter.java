package project.fragments.viewpager2_demo_imageslider.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import project.fragments.viewpager2_demo_imageslider.databinding.LocationItemContainerBinding;
import project.fragments.viewpager2_demo_imageslider.model.TravelLocation;

public class TravelLocationAdapter extends RecyclerView.Adapter<TravelLocationAdapter.TravelLocationViewHolder> {

    private List<TravelLocation> locations;

    public TravelLocationAdapter(List<TravelLocation> locations) {
        this.locations = locations;
    }

    @NonNull
    @Override
    public TravelLocationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LocationItemContainerBinding itemBinding = LocationItemContainerBinding.inflate(
                LayoutInflater.from(parent.getContext()),
                parent,
                false
        );
        return new TravelLocationViewHolder(itemBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull TravelLocationViewHolder holder, int position) {
        holder.binding.setLocation(locations.get(position));
    }

    @Override
    public int getItemCount() {
        return locations.size();
    }

    static class TravelLocationViewHolder extends RecyclerView.ViewHolder {

        private LocationItemContainerBinding binding;

        public TravelLocationViewHolder(@NonNull LocationItemContainerBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }

}
