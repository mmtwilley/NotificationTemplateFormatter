package com.manning.application.notification.NotificationTemplateFormatter.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="Notification_Template")
@Getter
@Setter
public class NotificationTemplate {

    private String status;
    private String statusDescription;
    private String emailContent;
    private String smsContent;
    private String emailSubject;
}
