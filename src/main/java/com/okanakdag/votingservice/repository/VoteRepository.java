package com.okanakdag.votingservice.repository;

import com.okanakdag.votingservice.entity.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteRepository extends JpaRepository<Vote, Long> {

}
