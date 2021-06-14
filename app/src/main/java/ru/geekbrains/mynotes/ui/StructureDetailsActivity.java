package ru.geekbrains.mynotes.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import ru.geekbrains.mynotes.R;
import ru.geekbrains.mynotes.domain.Structure;

public class StructureDetailsActivity extends AppCompatActivity {

    public static final String ARG_STRUCTURE = "ARG_STRUCTURE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_structure_details);

        if (savedInstanceState == null) {

            Structure structure = getIntent().getParcelableExtra(ARG_STRUCTURE);

            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.container, StructureDetailsFragment.newInstance(structure))
                    .commit();
        }
    }
}