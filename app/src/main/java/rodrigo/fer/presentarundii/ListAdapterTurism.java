package rodrigo.fer.presentarundii;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListAdapterTurism extends RecyclerView.Adapter<ListAdapterTurism.MiHolder2> {
    Context m2Context;
    List<ListElementTurism> list;
//    private ItemclickListener itemclickListener;

//    atributo para conseguir la posicion de cada elemento
    private  ItemclickListener clickListener;


    public ListAdapterTurism(Context m2Context, List<ListElementTurism> list, ItemclickListener clickListener) {
        this.m2Context = m2Context;
        this.list = list;
        this.clickListener = clickListener;
    }


    @NonNull
    @Override
    public ListAdapterTurism.MiHolder2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v= LayoutInflater.from(m2Context).inflate(R.layout.list_turism,parent,false);
        ListAdapterTurism.MiHolder2 vHolder=new MiHolder2(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ListAdapterTurism.MiHolder2 holder, int position) {
        //final ListElementTurism posicionItem = list.get(position);


        holder.photo.setImageResource(list.get(position).getPhoto());
        holder.namet.setText(list.get(position).getNameturism());
        holder.pais.setText(list.get(position).getPais());
        holder.descrip.setText(list.get(position).getDescrip());

       /* holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickListener.onItemClick(posicionItem);
            }
        });*/

//        hacer que el cada ViewHolder se pueda hacer click e interactuar
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (holder.getAdapterPosition()==0){
                    Intent intent = new Intent(holder.itemView.getContext(), maravillasDelMundo.class);
//                    intent.putExtra("itemDetail",posicionItem);
                    holder.itemView.getContext().startActivity(intent);
                }else if (holder.getAdapterPosition()==1){
                    Intent intent = new Intent(holder.itemView.getContext(), maravillaDelMundo2.class);
                    holder.itemView.getContext().startActivity(intent);
                }else if (holder.getAdapterPosition()==2){
                    Intent intent = new Intent(holder.itemView.getContext(), maravillaDelMundo3.class);
                    holder.itemView.getContext().startActivity(intent);
                }else if (holder.getAdapterPosition()==3){
                    Intent intent = new Intent(holder.itemView.getContext(), maravillaDelMundo4.class);
                    holder.itemView.getContext().startActivity(intent);
                }else if (holder.getAdapterPosition()==4){
                    Intent intent = new Intent(holder.itemView.getContext(), maravillaDelMundo5.class);
                    holder.itemView.getContext().startActivity(intent);
                }else if (holder.getAdapterPosition()==5){
                    Intent intent = new Intent(holder.itemView.getContext(), maravillaDelMundo6.class);
                    holder.itemView.getContext().startActivity(intent);
                }else if (holder.getAdapterPosition()==6){
                    Intent intent = new Intent(holder.itemView.getContext(), maravillaDelMundo7.class);
                    holder.itemView.getContext().startActivity(intent);
                }
//                Intent intent = new Intent(holder.itemView.getContext(), splash.class);
//                intent.putExtra("itemDetail",posicionItem);
//                holder.itemView.getContext().startActivity(intent);
            }
        });

    }


    public void setOnclickListener(AdapterView.OnItemClickListener listener){}

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MiHolder2 extends RecyclerView.ViewHolder {
        private Button pais;
        private TextView namet, descrip;
        private ImageView photo;
        public MiHolder2(@NonNull View itemView) {
            super(itemView);
            photo=(ImageView) itemView.findViewById(R.id.img_turism);
            namet=(TextView) itemView.findViewById(R.id.txt_nameturism);
            descrip=(TextView) itemView.findViewById(R.id.txt_descriptionturism);
            pais= (Button) itemView.findViewById(R.id.btn_paisturism);
        }
    }
    public interface ItemclickListener{
        public void onItemClick(ListElementTurism listElementTurism);
    }

//    public interface RecyclerItemClick{
//        public void itemClick(ListElementTurism listElementTurism);
//    }
}
