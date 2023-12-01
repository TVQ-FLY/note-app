package com.example.noteapproom;

import androidx.cardview.widget.CardView;

import com.example.noteapproom.Models.Notes;

public interface NotesClickListener {
    void onClick(Notes notes);
    void onLongClick(Notes notes, CardView cardView);

}
