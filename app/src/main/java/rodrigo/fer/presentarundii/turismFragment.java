package rodrigo.fer.presentarundii;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.fragment.AbstractListDetailFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link turismFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class turismFragment extends Fragment implements ListAdapterTurism.ItemclickListener{
//public class turismFragment extends Fragment{
    private List<ListElementTurism> listaturismo;
    ListAdapterTurism adapterTurism;
    RecyclerView recyclerView;
    Button btn_pais;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public turismFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment turismFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static turismFragment newInstance(String param1, String param2) {
        turismFragment fragment = new turismFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        init();

        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_turism, container, false);
        // Inflate the layout for this fragment
        initRecycleView2(view);
        return view;
    }

//    private void initRecycleView(View view){
//        recyclerView= (RecyclerView) view.findViewById(R.id.rcView_music);
//        ListAdapterTurism listAdapterTurism = new ListAdapterTurism(getContext(),listaturismo);
//        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
//        recyclerView.setAdapter(listAdapterTurism);
//    }

    private void initRecycleView2(View view){
//        recyclerView= (RecyclerView) view.findViewById(R.id.rcView_turism);
        recyclerView = view.findViewById(R.id.rcView_turism);
        //instancia del Contex con el fragment
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        //Ingresar datos al recycler view con layoutmanayer
        recyclerView.setLayoutManager(layoutManager);
        //instancia de ListaAdapterTurism con los parametros necesarios
        ListAdapterTurism adapter = new ListAdapterTurism(getActivity(), listaturismo, this);
        recyclerView.setAdapter(adapter);
//        ListAdapterTurism listAdapterTurism = new ListAdapterTurism(getContext(),listaturismo);
//        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
//        recyclerView.setAdapter(listAdapterTurism);
    }

    public void init(){
        listaturismo=new ArrayList<>();
        listaturismo.add(new ListElementTurism(R.drawable.chichenitza,"Chichén Itzá","Chichén Itzá en la península de Yucatán, México","México"));
        listaturismo.add(new ListElementTurism(R.drawable.coliseo,"El Coliseo de Roma","El Coliseo de Roma, Italia","Italia"));
        listaturismo.add(new ListElementTurism(R.drawable.cristoredentor,"Cristo Redentor","Cristo Redentor de Río de Janeiro, Brasil","Brasil"));
        listaturismo.add(new ListElementTurism(R.drawable.machupicchu,"Machu Picchu","La ciudadela de Machu Picchu en Cusco, Perú","Perú"));
        listaturismo.add(new ListElementTurism(R.drawable.mahal,"Taj Mahal","Taj Mahal, India","India"));
        listaturismo.add(new ListElementTurism(R.drawable.petra,"la Ciudad de Piedra","Petra: la Ciudad de Piedra, Jordania","Jordania"));
        listaturismo.add(new ListElementTurism(R.drawable.muralla,"La Gran Muralla China","La Gran Muralla China, China","China"));
    }

    @Override
    public void onItemClick(ListElementTurism listElementTurism) {
//        Intent intent = new Intent(getActivity(), maravillasDelMundo.class);
//        intent.putExtra("itemDetail",listElementTurism);
//        startActivity(intent);
    }
}