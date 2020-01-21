package com.barbier.spring_app.repository;

import com.barbier.spring_app.domain.Link;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LinkRepository extends JpaRepository<Link,Long> {
}
