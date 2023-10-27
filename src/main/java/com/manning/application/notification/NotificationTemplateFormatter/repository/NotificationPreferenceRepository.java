package com.manning.application.notification.NotificationTemplateFormatter.repository;

import com.manning.application.notification.NotificationTemplateFormatter.entities.NotificationPreferences;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationPreferenceRepository extends JpaRepository<NotificationPreferences, Long> {
    NotificationPreferences findbyCustomerId(String customerid);
}