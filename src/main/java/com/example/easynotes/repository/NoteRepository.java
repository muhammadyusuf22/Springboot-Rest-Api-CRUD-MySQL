package com.example.easynotes.repository;

import com.example.easynotes.model.Note;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoteRepository extends PagingAndSortingRepository<Note, Long> {
    List<Note> findAll();
}
