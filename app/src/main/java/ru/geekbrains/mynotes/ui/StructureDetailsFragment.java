package ru.geekbrains.mynotes.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import ru.geekbrains.mynotes.R;
import ru.geekbrains.mynotes.domain.Structure;


public class StructureDetailsFragment extends Fragment {

    private static final String ARG_STRUCTURE = "ARG_STRUCTURE";

    public static StructureDetailsFragment newInstance(Structure structure) {
        StructureDetailsFragment fragment = new StructureDetailsFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable(ARG_STRUCTURE, structure);
        fragment.setArguments(bundle);
        return fragment;
    }

    public StructureDetailsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_structure_details, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TextView name = view.findViewById(R.id.name);
        TextView noteDescription = view.findViewById(R.id.note_description);

        Structure structure = getArguments().getParcelable(ARG_STRUCTURE);

        name.setText(structure.getName());
//        noteDescription.setText(structure.getDescription());

    }
}
