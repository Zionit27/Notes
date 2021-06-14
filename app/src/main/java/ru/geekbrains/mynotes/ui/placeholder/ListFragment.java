package ru.geekbrains.mynotes.ui.placeholder;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.List;

import ru.geekbrains.mynotes.R;
import ru.geekbrains.mynotes.domain.Structure;
import ru.geekbrains.mynotes.domain.StructureRepository;
import ru.geekbrains.mynotes.domain.StructureRepositoryImpl;

public class ListFragment extends Fragment {

    public interface OnNoteClicked {
        void onNoteClicked(Structure structure);
    }

    private StructureRepository structureRepository;

    public OnNoteClicked onNoteClicked;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);

        if (context instanceof OnNoteClicked) {
            onNoteClicked = (OnNoteClicked) context;
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();

        onNoteClicked = null;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        structureRepository = new StructureRepositoryImpl();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_list, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        LinearLayout list = view.findViewById(R.id.list_container);

        List<Structure> structures = structureRepository.getStructures();

        for (Structure structure: structures) {

            View itemView = LayoutInflater.from(requireContext()).inflate(R.layout.item, list, false);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (onNoteClicked != null) {
                        onNoteClicked.onNoteClicked(structure);
                    }
                }
            });

            TextView name = itemView.findViewById(R.id.name);
            name.setText(structure.getName());

            list.addView(itemView);
        }

    }

}
