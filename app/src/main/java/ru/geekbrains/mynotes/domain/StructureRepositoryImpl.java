package ru.geekbrains.mynotes.domain;

import java.util.ArrayList;
import java.util.List;

import ru.geekbrains.mynotes.R;

public class StructureRepositoryImpl implements StructureRepository {

    @Override
    public List<Structure> getStructures() {
        ArrayList<Structure> result = new ArrayList<>();

        result.add(new Structure(R.string.note_one, R.string.description_1));
        result.add(new Structure(R.string.note_two, R.string.description_2));
        result.add(new Structure(R.string.note_three, R.string.description_3));
        result.add(new Structure(R.string.note_four, R.string.description_4));
        result.add(new Structure(R.string.note_five, R.string.description_5));
        return result;
    }
}
