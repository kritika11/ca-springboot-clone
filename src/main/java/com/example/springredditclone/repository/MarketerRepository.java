package com.example.springredditclone.repository;

import com.example.springredditclone.model.Marketer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarketerRepository extends JpaRepository<Marketer, Long> {
}
