package rodrigo.fer.presentarundii;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link operacionesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class operacionesFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public operacionesFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment operacionesFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static operacionesFragment newInstance(String param1, String param2) {
        operacionesFragment fragment = new operacionesFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    //
    //DECLARAR VARIABLES
    //
    private TextView txt_resultado;
    private View view;
    private EditText txtnum1,txtnum2;
    private Button btnsuma,btnResta,btnMultiplicacion,btnDivision,btnRaiz,btnExponente;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_operaciones, container, false);

        btnsuma = view.findViewById(R.id.SUMA);
        btnResta=view.findViewById(R.id.RESTA);
        btnMultiplicacion=view.findViewById(R.id.MULTIPLICACION);
        btnDivision=view.findViewById(R.id.DIVISION);
        btnRaiz=view.findViewById(R.id.RAIZ);
        btnExponente=view.findViewById(R.id.EXPONENCIAL);

        txt_resultado=view.findViewById(R.id.txt_resultado);
        txtnum1 = view.findViewById(R.id.nro1);
        txtnum2 = view.findViewById(R.id.nro2);


        btnsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double numero1 = Double.parseDouble(txtnum1.getText().toString());
                double numero2 = Double.parseDouble(txtnum2.getText().toString());

                double suma = numero1+numero2;
                Toast.makeText(getActivity(), "La Suma es:"+suma, Toast.LENGTH_SHORT).show();
                txt_resultado.setText(String.valueOf(suma));
            }
        });
        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double numero1 = Double.parseDouble(txtnum1.getText().toString());
                double numero2 = Double.parseDouble(txtnum2.getText().toString());

                double suma = numero1-numero2;
                Toast.makeText(getActivity(), "La Suma es:"+suma, Toast.LENGTH_SHORT).show();
                txt_resultado.setText(String.valueOf(suma));
            }
        });
        btnMultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double numero1 = Double.parseDouble(txtnum1.getText().toString());
                double numero2 = Double.parseDouble(txtnum2.getText().toString());

                double suma = numero1*numero2;
                Toast.makeText(getActivity(), "La Suma es:"+suma, Toast.LENGTH_SHORT).show();
                txt_resultado.setText(String.valueOf(suma));
            }
        });
        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double numero1 = Double.parseDouble(txtnum1.getText().toString());
                double numero2 = Double.parseDouble(txtnum2.getText().toString());

                double suma = numero1/numero2;
                Toast.makeText(getActivity(), "La Suma es:"+suma, Toast.LENGTH_SHORT).show();
                txt_resultado.setText(String.valueOf(suma));
            }
        });
        btnRaiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double numero1 = Double.parseDouble(txtnum1.getText().toString());
                double numero2 = Double.parseDouble(txtnum2.getText().toString());
                double raiz = 1/numero2;
                double suma = Math.pow(numero1,raiz);
                Toast.makeText(getActivity(), "La Suma es:"+suma, Toast.LENGTH_SHORT).show();
                txt_resultado.setText(String.valueOf(suma));
            }
        });
        btnExponente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double numero1 = Double.parseDouble(txtnum1.getText().toString());
                double numero2 = Double.parseDouble(txtnum2.getText().toString());

                double suma = Math.pow(numero1,numero2);
                Toast.makeText(getActivity(), "La Suma es:"+suma, Toast.LENGTH_SHORT).show();
                txt_resultado.setText(String.valueOf(suma));
            }
        });

            return  view;

    }
}