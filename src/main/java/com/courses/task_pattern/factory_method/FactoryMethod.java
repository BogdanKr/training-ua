package com.courses.task_pattern.factory_method;

class FactoryMethod {
    public static void main(String[] args) {
        MessageMaker messageMaker = getMessageClassByName("video");
        Message message = messageMaker.createMessage();
        message.showMessage();
    }
    public static MessageMaker getMessageClassByName(String name){
        if (name.equalsIgnoreCase("Video")) return new CreateVideoMessage();
        else if (name.equalsIgnoreCase("Text")) return new CreateTextMessage();
        throw new RuntimeException("не поддерживаемый тим соощений - "+name);
    }
}
interface Message{
    void showMessage();
}
class TextMessage implements Message{
    public void showMessage() {
        System.out.println("this is text message!");
    }
}
class VideoMessage implements Message{
    public void showMessage() {
        System.out.println("this is video!!!");
    }
}
interface MessageMaker{
    Message createMessage();
}
class CreateTextMessage implements MessageMaker{
    public Message createMessage() {
        return new TextMessage();
    }
}
class CreateVideoMessage implements MessageMaker{
    public Message createMessage() {
        return new VideoMessage();
    }
}
