package com.manning.application.notification.NotificationTemplateFormatter.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="Notification_Preferences")
@Getter
@Setter
public class NotificationPreferences {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long  id;
    private String customerId;
    private boolean smsPreferenceFlag;
    private boolean emailPreferenceFlag;
    private String emailaddress;
    private String phonenumber;

}

