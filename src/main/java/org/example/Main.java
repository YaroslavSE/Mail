package org.example;


public class Main {
    public static void main(String[] args) {
        User reciever = new User(1,"Abla", "Blabla");
        Mail mail = MailBuilder.create().itemId(10).reciever(reciever).build();
        System.out.println(mail.getItemId());
    }
}