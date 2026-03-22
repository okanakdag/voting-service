package com.okanakdag.votingservice.repository;

import com.okanakdag.votingservice.entity.Poll;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PollRepository extends JpaRepository<Poll, Long> {

}
