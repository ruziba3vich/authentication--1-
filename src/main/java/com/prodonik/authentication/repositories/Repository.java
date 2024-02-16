package com.prodonik.authentication.repositories;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.prodonik.authentication.models.User;

public interface Repository extends JpaRepository<User, UUID>{
    
}
