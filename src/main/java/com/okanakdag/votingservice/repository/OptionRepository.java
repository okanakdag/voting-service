package com.okanakdag.votingservice.repository;

import com.okanakdag.votingservice.entity.Option;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OptionRepository extends JpaRepository<Option, Long> {

}
