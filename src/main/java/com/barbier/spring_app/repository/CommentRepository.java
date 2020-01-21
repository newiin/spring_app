package com.barbier.spring_app.repository;

import com.barbier.spring_app.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Long> {
}
