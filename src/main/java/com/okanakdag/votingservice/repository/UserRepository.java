package com.okanakdag.votingservice.repository;

import com.okanakdag.votingservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
