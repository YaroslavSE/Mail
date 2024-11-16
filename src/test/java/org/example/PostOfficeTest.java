package org.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class PostOfficeTest {
    @Test
    public void testSendItem() {
        Mail mockMail = Mockito.mock(Mail.class);
        when(mockMail.getItemId()).thenReturn(456);
        PostOffice postOffice = new PostOffice(1, "Kyiv");
        postOffice.sendItem(mockMail);
        verify(mockMail).getItemId();
    }

    @Test
    public void testDeliverItem() {
        Mail mockMail = Mockito.mock(Mail.class);
        User mockUser = Mockito.mock(User.class);
        when(mockMail.getItemId()).thenReturn(789);
        when(mockMail.getReceiver()).thenReturn(mockUser);
        when(mockUser.getName()).thenReturn("John Doe");
        PostOffice postOffice = new PostOffice(2, "Lviv");
        postOffice.deliverItem(mockMail);
        verify(mockMail).setDeliveredDate(anyString());
        verify(mockMail).getReceiver();
        verify(mockUser).getName();
    }
}
