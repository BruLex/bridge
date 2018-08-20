package io.github.brulex.bridge.Fragment;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.View;

public abstract class AbstractFragment extends Fragment {
    private String title;
    protected Context context;
    protected View Fview;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
