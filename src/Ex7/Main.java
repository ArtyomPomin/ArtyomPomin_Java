package Ex7;

// Наследие

public class Main {
    public static void main(String[] args) {
        Sentable image = new Instagram();
        image.sentImage();
        Readable comment = new Vkontakte();
        comment.readNews();
        Sentable image1 = new Telegram();
        image1.sentImage();
        Readable comment1 = new Telegram();
        comment1.readNews();
    }
}