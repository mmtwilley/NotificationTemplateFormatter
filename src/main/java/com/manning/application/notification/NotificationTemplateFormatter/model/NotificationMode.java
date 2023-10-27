package com.manning.application.notification.NotificationTemplateFormatter.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class NotificationMode {

    private Mode Mode;


     public enum Mode{
        EMAIL, SMS
    }
}
