package zhengzhou.individual.catsDj.util;


import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.RecyclerView;

import zhengzhou.individual.catsDj.sqlite.Storage;

public class MyDialogFragment extends DialogFragment {
    RecyclerView.Adapter adapter;

    public MyDialogFragment(RecyclerView.Adapter... adapter) {
        this.adapter = adapter.length==0? null:adapter[0];
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Pick a style based on the num.
        int style = DialogFragment.STYLE_NORMAL, theme = 0;
        setStyle(style, theme);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getDialog().setTitle("Choose your music below");
        getDialog().setCancelable(true);
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(getActivity());
        alertDialogBuilder.setTitle("Configure your music below");
        alertDialogBuilder.setMessage("Do you want to read news while listening to music?");
        alertDialogBuilder.setPositiveButton("Yes",  new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Storage.musicConfig = 1;
                if (adapter != null) {
                    adapter.notifyDataSetChanged();
                }
                if (dialog != null) {
                    dialog.dismiss();
                }
            }
        });
        alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Storage.musicConfig = 0;
                if (adapter != null) {
                    adapter.notifyDataSetChanged();
                }
                if (dialog != null) {
                    dialog.dismiss();
                }
            }

        });

        return alertDialogBuilder.create();
    }
}
