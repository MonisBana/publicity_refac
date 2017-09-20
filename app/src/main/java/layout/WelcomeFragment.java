package layout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import vinay.com.publicity.R;
public class WelcomeFragment extends Fragment {

    public WelcomeFragment() {

    }

    RelativeLayout add,search;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_welcome, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ((Toolbar) getActivity().findViewById(R.id.toolbar)).setTitle("Publicity");
        add= (RelativeLayout) getActivity().findViewById(R.id.addLayout);
        search= (RelativeLayout) getActivity().findViewById(R.id.searchLayout);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                android.support.v4.app.FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                AddFragment addFragment = new AddFragment();
                transaction.replace(R.id.fragment_container, addFragment);
                transaction.addToBackStack("");
                transaction.commit();
            }
        });
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                android.support.v4.app.FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                FragmentSearch fragmentSearch = new FragmentSearch();
                transaction.replace(R.id.fragment_container, fragmentSearch);
                transaction.addToBackStack("");
                transaction.commit();
            }
        });
    }

}


