package mtbs.app;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomePage extends Fragment implements View.OnClickListener {
    private MainActivity activity;

    private Button btn_mulai ;
    private Button btn_petunjuk ;


    public HomePage() {
        // Required empty public constructor
    }

    public static HomePage newInstance(MainActivity activity){
        HomePage res = new HomePage();
        res.activity = activity;
        return res;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_home_page, container, false);
        this.btn_mulai = (Button) v.findViewById(R.id.btn_mulai);
        this.btn_petunjuk = (Button) v.findViewById(R.id.btn_petunjuk);

        this.btn_mulai.setOnClickListener(this);
        this.btn_petunjuk.setOnClickListener(this);
        return v;
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == this.btn_mulai.getId() ){

        }else if(v.getId()== this.btn_petunjuk.getId()){
            this.activity.changeToPetunjuk_1();
        }
    }
}
