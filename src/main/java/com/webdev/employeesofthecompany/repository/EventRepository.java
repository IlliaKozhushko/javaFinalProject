package com.webdev.employeesofthecompany.repository;

import com.webdev.employeesofthecompany.domain.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
}
