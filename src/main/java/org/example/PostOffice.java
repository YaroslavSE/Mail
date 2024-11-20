package org.example;

import java.util.ArrayList;
import java.util.List;

public class PostOffice {
    private int officeId;
    private String location;
    private List<Mail> mailQueue;

    public PostOffice(int officeId, String location) {
        this.officeId = officeId;
        this.location = location;
        this.mailQueue = new ArrayList<>();
    }
    public void sendItem(Mail item) {
        mailQueue.add(item);
        System.out.println("Item " + item.getItemId() + " is sent from " + location);
    }
    public void deliverItem(Mail item) {
        item.setDeliveredDate("2024-11-16");
        System.out.println("Item " + item.getItemId() + " delivered to " + item.getReceiver().getName());
    }

    public int getOfficeId(){
        return officeId;
    }
    public String getLocation(){
        return location;
    }
}
