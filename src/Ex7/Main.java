package Ex7;

// Наследие

public class Main {
    public static void main(String[] args) {
        Image image = new Instagram();
        image.sentImage();
        News comment = new Vkontakte();
        comment.readNews();
        Image image1 = new Telegram();
        image1.sentImage();
        News comment1 = new Telegram();
        comment1.readNews();
    }
}