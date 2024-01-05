package com.afterlife.aplikasikatar.repositories;

import com.afterlife.aplikasikatar.models.hakakses.TMUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TMUserRepo extends JpaRepository<TMUser, Long> {
}
