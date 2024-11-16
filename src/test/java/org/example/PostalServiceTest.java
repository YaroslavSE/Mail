package org.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class PostalServiceTest {
    @Test
    public void testAddOffice() {
        PostOffice mockOffice = Mockito.mock(PostOffice.class);
        PostalService postalService = new PostalService();
        postalService.addOffice(mockOffice);
        System.out.println("Office added successfully");
    }

    @Test
    public void testTrackItem() {
        Mail mockMail = Mockito.mock(Mail.class);
        when(mockMail.getItemId()).thenReturn(123);
        when(mockMail.getStatus()).thenReturn("Delivered");
        PostalService postalService = new PostalService();
        postalService.trackItem(mockMail);
        verify(mockMail).getStatus();
    }
}
