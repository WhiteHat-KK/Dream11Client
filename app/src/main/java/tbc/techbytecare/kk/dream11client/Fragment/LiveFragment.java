package tbc.techbytecare.kk.dream11client.Fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import tbc.techbytecare.kk.dream11client.R;

public class LiveFragment extends Fragment {

    public LiveFragment() {
    }

    public static LiveFragment newInstance()    {
        LiveFragment liveFragment = new LiveFragment();

        return liveFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_live,container,false);
    }
}
