package org.example;
import java.util.ArrayList;
import java.util.List;

public class PostalService {
    private List<PostOffice> offices;

    public PostalService() {
        this.offices = new ArrayList<>();
    }

    public void addOffice(PostOffice office) {
        offices.add(office);
    }

    // Отслеживание отправления
    public void trackItem(Mail item) {
        System.out.println("Item " + item.getItemId() + " status: " + item.getStatus());
    }
}
