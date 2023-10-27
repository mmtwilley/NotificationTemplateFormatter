package com.manning.application.notification.NotificationTemplateFormatter.model;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter

public class NotificationParameters {

    private String NotificationParameterName;
    private String NotificationParameterValue;

    @Override
    public String toString() {
        return "NotificationParameters{" +
                "NotificationParameterName:'" + NotificationParameterName + '\'' +
                ", NotificationParameterValue:'" + NotificationParameterValue + '\'' +
                '}';
    }
}
