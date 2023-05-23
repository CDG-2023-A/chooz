package com.cdg.chooz.db.vote;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteJpaRepository extends JpaRepository<VoteEntity, Long> {
}
