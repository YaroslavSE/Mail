package org.example;

import java.util.UUID;

public class Mail {
    private int itemId;            // Уникальный идентификатор (для письма или посылки)
    private User sender;           // Отправитель
    private User receiver;         // Получатель
    private String content;        // Содержимое (например, текст письма или описание содержимого посылки)
    private double weight;         // Вес
    private String sentDate;       // Дата отправки
    private String deliveredDate;  // Дата доставки (если доставлено)
    private String status;         // Статус (Sent, Delivered, Returned)

    public Mail(int itemId, User sender, User receiver, String content, double weight, String sentDate) {
        this.itemId = itemId;
        this.sender = sender;
        this.receiver = receiver;
        this.content = content;
        this.weight = weight;
        this.sentDate = sentDate;
        this.status = "Sent";  // Изначально статус - отправлено
    }

    // Геттеры и сеттеры
    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSentDate() {
        return sentDate;
    }

    public void setSentDate(String sentDate) {
        this.sentDate = sentDate;
    }

    public String getDeliveredDate() {
        return deliveredDate;
    }

    public void setDeliveredDate(String deliveredDate) {
        this.deliveredDate = deliveredDate;
        this.status = "Delivered";  // После установки даты доставки меняем статус
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

