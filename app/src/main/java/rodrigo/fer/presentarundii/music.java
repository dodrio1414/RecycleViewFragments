package rodrigo.fer.presentarundii;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class music extends Fragment implements ListAdapterMusic4.ItemclickListener{
    private List<ListElementMusic> listamusica;
    ListAdapterMusic4 adapterMusic4;
    RecyclerView recyclerView;

    public music(){
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_music, container, false);

        recyclerView= (RecyclerView) view.findViewById(R.id.rcView_music);
        ListAdapterMusic4 listAdapterMusic4 = new ListAdapterMusic4(getContext(),listamusica,this);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(listAdapterMusic4);
        return view;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        listamusica=new ArrayList<>();
        listamusica.add(new ListElementMusic("Billie Jean","Michael Jackson","ON"));
        listamusica.add(new ListElementMusic("Without ","Eminem","ON"));
        listamusica.add(new ListElementMusic("The real slim shady","Eminem","ON"));
        listamusica.add(new ListElementMusic("Warzone","NFX","ON"));
        listamusica.add(new ListElementMusic("California Love","2pac feat Dr.Dre","ON"));
        listamusica.add(new ListElementMusic("Daemon Lover","Shocking Blue","ON"));
    }


    @Override
    public void onItemClick(ListElementTurism listElementTurism) {

    }
}