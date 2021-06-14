package ru.geekbrains.mynotes.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import ru.geekbrains.mynotes.R;
import ru.geekbrains.mynotes.domain.Structure;
import ru.geekbrains.mynotes.ui.placeholder.ListFragment;

public class MainActivity extends AppCompatActivity implements ListFragment.OnNoteClicked {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onNoteClicked(Structure structure) {

        boolean isLandscape = getResources().getBoolean(R.bool.isLandscape);

        if (isLandscape) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.structure_details_fragment, StructureDetailsFragment.newInstance(structure))
                    .commit();

        } else {

            Intent intent = new Intent(this, StructureDetailsActivity.class);
            intent.putExtra(StructureDetailsActivity.ARG_STRUCTURE, structure);
            startActivity(intent);
        }
    }
}