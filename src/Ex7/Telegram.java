package Ex7;

public class Telegram extends Messenger implements Image, News {
    public void readNews() {
        System.out.println("Читаю новости в Телеграм");
    }

    public void sentImage() {
        System.out.println("Отправляю изображение в Телеграм");
    }
}
