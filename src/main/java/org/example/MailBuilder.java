package org.example;

public class MailBuilder {
    private Mail mail = new Mail();

    public MailBuilder(){
        mail.setItemId(-1);
    }

    public static MailBuilder create() {
        return new MailBuilder();
    }
    public MailBuilder itemId(int id){
        mail.setItemId(id);
        return this;
    }
    public MailBuilder sender(User sender){
        mail.setSender(sender);
        return this;
    }
    public MailBuilder reciever(User reciever){
        mail.setReceiver(reciever);
        return this;
    }
    public MailBuilder content(String content){
        mail.setContent(content);
        return this;
    }
    public MailBuilder weight(double weight){
        mail.setWeight(weight);
        return this;
    }
    public MailBuilder sentDate(String sentDate){
        mail.setSentDate(sentDate);
        return this;
    }
    public MailBuilder deliveredDate(String deliveredDate){
        mail.setDeliveredDate(deliveredDate);
        return this;
    }
    public MailBuilder status(String status){
        mail.setStatus(status);
        return this;
    }
    public Mail build(){
        if(mail.getItemId() == -1){
            throw new RuntimeException("id is negative");
        }
        if(mail.getReceiver() == null){
            throw new RuntimeException("receiver not specified");
        }
        return mail;
    }
}
