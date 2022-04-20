package rodrigo.fer.presentarundii;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListAdapterTurismCusco extends RecyclerView.Adapter<ListAdapterTurismCusco.MiHolder>{
    Context m2Context;
    List<ListElementTurismCusco> list;
    //    atributo para conseguir la posicion de cada elemento
    private ItemclickListener clickListener;
    public ListAdapterTurismCusco(Context m2Context, List<ListElementTurismCusco> list, ItemclickListener clickListener) {
        this.m2Context = m2Context;
        this.list = list;
        this.clickListener = clickListener;
    }



    @NonNull
    @Override
    public ListAdapterTurismCusco.MiHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v= LayoutInflater.from(m2Context).inflate(R.layout.list_cusco,parent,false);
        ListAdapterTurismCusco.MiHolder vHolder=new ListAdapterTurismCusco.MiHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ListAdapterTurismCusco.MiHolder holder, int position) {
        final ListElementTurismCusco posicionItem = list.get(position);
        holder.photo.setImageResource(list.get(position).getPhoto());
        holder.namet.setText(list.get(position).getNameturism());
        holder.descrip.setText(list.get(position).getDescrip());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MiHolder extends RecyclerView.ViewHolder {
        private TextView namet, descrip;
        private ImageView photo;
        public MiHolder(@NonNull View itemView) {
            super(itemView);
            photo=(ImageView) itemView.findViewById(R.id.img_turismCusco);
            namet=(TextView) itemView.findViewById(R.id.txt_nameturismCusco);
            descrip=(TextView) itemView.findViewById(R.id.txt_descriptionturismCusco);
        }
    }

    public interface ItemclickListener{
        public void onItemClick(ListElementTurismCusco listElementTurismCusco);
    }
}
