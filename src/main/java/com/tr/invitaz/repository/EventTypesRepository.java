package com.tr.invitaz.repository;

import com.tr.invitaz.model.EventTypes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventTypesRepository extends JpaRepository<EventTypes,Long> {
}
