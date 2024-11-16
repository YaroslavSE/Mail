package org.example;

import java.util.ArrayList;
import java.util.List;

public class PostOffice {
    private int officeId;
    private String location;
    private List<Mail> mailQueue;  // Список отправлений

    public PostOffice(int officeId, String location) {
        this.officeId = officeId;
        this.location = location;
        this.mailQueue = new ArrayList<>();
    }

    // Отправка предмета (письмо или посылка)
    public void sendItem(Mail item) {
        mailQueue.add(item);
        System.out.println("Item " + item.getItemId() + " is sent from " + location);
    }

    // Доставка предмета (письмо или посылка)
    public void deliverItem(Mail item) {
        item.setDeliveredDate("2024-11-16");
        System.out.println("Item " + item.getItemId() + " delivered to " + item.getReceiver().getName());
    }
}
