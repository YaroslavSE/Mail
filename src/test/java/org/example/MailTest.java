package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

public class MailTest {
    private static final Logger logger = LogManager.getLogger(MailTest.class);

    @Mock
    private User sender;

    @Mock
    private User receiver;

    @InjectMocks
    private Mail mail;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        when(sender.getName()).thenReturn("Alice");
        when(receiver.getName()).thenReturn("Bob");
    }

    @Test
    void testMailCreation() {
        mail = new Mail(1, sender, receiver, "Hello, Bob!", 0.5, "2024-11-16");
        assert mail.getItemId() == 1;
        assert "Alice".equals(mail.getSender().getName());
        assert "Bob".equals(mail.getReceiver().getName());
        assert "Sent".equals(mail.getStatus());
        verify(sender, times(1)).getName();
        verify(receiver, times(1)).getName();
    }

    @Test
    void testDeliveredMailStatus() {
        mail = new Mail(2, sender, receiver, "Package delivery", 1.0, "2024-11-16");
        mail.setDeliveredDate("2024-11-17");
        assert "Delivered".equals(mail.getStatus());
        assert "2024-11-17".equals(mail.getDeliveredDate());
        // Убрать проверку логгера или заменить на LogCaptor
    }
}
