package rodrigo.fer.presentarundii;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link cuscoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class cuscoFragment extends Fragment implements ListAdapterTurismCusco.ItemclickListener{
    //public class turismFragment extends Fragment{
    private List<ListElementTurismCusco> listaturismoCusco;
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

    public cuscoFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment cuscoFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static cuscoFragment newInstance(String param1, String param2) {
        cuscoFragment fragment = new cuscoFragment();
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
        View view = inflater.inflate(R.layout.fragment_cusco, container, false);
        // Inflate the layout for this fragment

        initRecycleView2(view);
        return view;
    }
    private void initRecycleView2(View view){
        recyclerView= (RecyclerView) view.findViewById(R.id.rcView_turismCusco);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());

        recyclerView.setLayoutManager(layoutManager);
        ListAdapterTurismCusco adapter = new ListAdapterTurismCusco(getActivity(),listaturismoCusco,this);
        recyclerView.setAdapter(adapter);

//        ListAdapterTurism listAdapterTurism = new ListAdapterTurism(getContext(),listaturismo);
//        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
//        recyclerView.setAdapter(listAdapterTurism);
    }

    public void init(){
        listaturismoCusco=new ArrayList<>();
        listaturismoCusco.add(new ListElementTurismCusco(R.drawable.machupicchu,"Machu Picchu","La ciudadela de Machu Picchu en Cusco, Perú"));
        listaturismoCusco.add(new ListElementTurismCusco(R.drawable.sacsayhuaman,"Sacsayhuaman","Sacsayhuamán es una de las edificaciones más asombrosas de todo el mundo"));

    }

    @Override
    public void onItemClick(ListElementTurismCusco listElementTurismCusco) {

    }
}