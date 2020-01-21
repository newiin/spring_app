package com.barbier.spring_app.repository;

import com.barbier.spring_app.domain.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteIRepository extends JpaRepository <Vote,Long>{
}
