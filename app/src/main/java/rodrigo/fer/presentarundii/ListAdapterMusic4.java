package rodrigo.fer.presentarundii;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListAdapterMusic4 extends RecyclerView.Adapter<ListAdapterMusic4.MiHolder>{

    Context mContext;
    List<ListElementMusic> mData;
    //    atributo para conseguir la posicion de cada elemento
    private ItemclickListener clickListener;

    public ListAdapterMusic4(Context mContext, List<ListElementMusic> mData, ItemclickListener clickListener) {
        this.mContext = mContext;
        this.mData=mData;
        this.clickListener = clickListener;
    }



    @NonNull
    @Override
    public ListAdapterMusic4.MiHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v= LayoutInflater.from(mContext).inflate(R.layout.list_music,parent,false);
        MiHolder vHolder=new MiHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ListAdapterMusic4.MiHolder holder, int position) {
        final ListElementMusic posicionItem = mData.get(position);
        holder.name.setText(mData.get(position).getName());
        holder.artista.setText(mData.get(position).getArtista());
        holder. status.setText(mData.get(position).getStatus());


        //        hacer que el cada ViewHolder se pueda hacer click e interactuar

//        Log.d("Si EXISTE MANIFIESTATE EXODIA", "SE MANIFESTO EL CSM: "+position);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (holder.getAdapterPosition()==0){
                    MediaPlayer mp = MediaPlayer.create(mContext,R.raw.michael_jackson_billie_jean);
                    mp.start();
                }else if (holder.getAdapterPosition()==1){
                    MediaPlayer mp = MediaPlayer.create(mContext,R.raw.eminem_without_me);
                    mp.start();
                }else if (holder.getAdapterPosition()==2){
                    MediaPlayer mp = MediaPlayer.create(mContext,R.raw.eminem_the_real_slim_shady);
                    mp.start();
                }else if (holder.getAdapterPosition()==3){
                    MediaPlayer mp = MediaPlayer.create(mContext,R.raw.nfx_warzone);
                    mp.start();
                }else if (holder.getAdapterPosition()==4){
                    MediaPlayer mp = MediaPlayer.create(mContext,R.raw.dr_dre_2pac_california_love);
                    mp.start();
                }else if (holder.getAdapterPosition()==5){
                    MediaPlayer mp = MediaPlayer.create(mContext,R.raw.shocking_blue_demon_lover);
                    mp.start();
                }
            }
        });
    }

    @Override
    public int getItemCount() {

        return mData.size();
    }

    public class MiHolder extends RecyclerView.ViewHolder{

        TextView name,artista,status;
        public MiHolder(@NonNull View itemView) {
            super(itemView);
            name=(TextView) itemView.findViewById(R.id.txt_namemusic);
            artista=(TextView) itemView.findViewById(R.id.txt_nameArtist);
            status=(TextView) itemView.findViewById(R.id.txt_estatus);
        }
    }

    public interface ItemclickListener{
        public void onItemClick(ListElementTurism listElementTurism);
    }

}
