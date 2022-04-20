package rodrigo.fer.presentarundii;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link apkFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class apkFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public apkFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment apkFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static apkFragment newInstance(String param1, String param2) {
        apkFragment fragment = new apkFragment();
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

    private View view;
    private ImageButton btn_steam,btn_google,btn_instagram,btn_ytb;
    private Button btn_ytbDelete;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_apk, container, false);
//        Intent intent = getPackageManager().getLaunchIntentForPackage("com.facebook.lite");

        Animation animacion1 = AnimationUtils.loadAnimation(getActivity(), R.anim.desplazamiento_top);
        Animation animacion2 = AnimationUtils.loadAnimation(getActivity(), R.anim.desplazamiento_bot);
        Animation animacion3 = AnimationUtils.loadAnimation(getActivity(), R.anim.desplazamiento_start);

        btn_steam=view.findViewById(R.id.btn_steam);
        btn_google=view.findViewById(R.id.btn_google);
        btn_instagram=view.findViewById(R.id.btn_instagram);
        btn_ytb=view.findViewById(R.id.btn_ytb);

        btn_steam.setAnimation(animacion1);
        btn_instagram.setAnimation(animacion1);
        btn_google.setAnimation(animacion2);
        btn_ytb.setAnimation(animacion2);

//        btn_ytbDelete=view.findViewById(R.id.btn_ytbDelete);

//        btn_ytbDelete.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
////                PackageManager pm = getActivity().getPackageManager();
////                Intent intent = pm.getLaunchIntentForPackage("com.google.android.youtube");
////                startActivity(intent);
//                Intent intent = new  Intent(Intent.ACTION_VIEW);
//                intent.setPackage("com.google.android.youtube");
//                intent.setData(Uri.parse("https://www.youtube.com"));
//                startActivity(intent);
//            }
//        });



//        btn_ytb.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent =  getActivity().getPackageManager().getLaunchIntentForPackage("com.google.android.apps.maps");
//                intent.addCategory(Intent.CATEGORY_LAUNCHER);
//                startActivity(intent);
//            }
//        });

        btn_ytb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new  Intent(Intent.ACTION_VIEW);
                intent.setPackage("com.google.android.youtube");
                intent.setData(Uri.parse("https://www.youtube.com"));
                startActivity(intent);
            }
        });
        btn_instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new  Intent(Intent.ACTION_VIEW);
                intent.setPackage("com.android.instagram");
                intent.setData(Uri.parse("https://www.instagram.com"));
                startActivity(intent);
            }
        });
        btn_google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new  Intent(Intent.ACTION_VIEW);
                intent.setPackage("com.android.chrome");
                intent.setData(Uri.parse("https://www.google.com"));
                startActivity(intent);
            }
        });

        btn_steam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new  Intent(Intent.ACTION_VIEW);
                intent.setPackage("com.android.steam");
                intent.setData(Uri.parse("https://www.steampowered.com"));
                startActivity(intent);
            }
        });
        return view;
    }


}



//    public void openApp(View view){
//        PackageManager pm = getActivity().getPackageManager();
//        Intent intent = pm.getLaunchIntentForPackage("com.exo.drive");
//        getActivity().startActivityFromFragment(this, intent, getTargetRequestCode());
//    }
