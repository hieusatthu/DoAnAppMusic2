package t3h.com.musicbolero.fragment.fragmentchudemoi;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import t3h.com.musicbolero.R;

/**
 * Created by songsong on 6/20/2018.
 */

public class FragmentChuDeMoiNgocSon extends Fragment {
    private ImageView imgNgocSon;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_chudemoi_ngocson,container,false);
        anhXa(view);
        return view;
    }
    private void anhXa(View view) {
        imgNgocSon=view.findViewById(R.id.img_chudemoi_ngocson);
        Picasso.with(getContext()).load
                ("http://192.168.78.101:8080/appmusic/hinhchudemoi/chude_ngocson_tinhme.jpg").into(imgNgocSon);

    }
}
