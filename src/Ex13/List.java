package Ex13;
//односвязный список

public class List {
    Element head = null;

    public int getSize() {
        int size =0;
        Element t = head;
        while (t != null) {
            t = t.element;
            size ++;
        }
        System.out.print("Количество элементов: ");
        return size;
    }

    public void addElement(Element e) {
        e.element = head;
        head = e;
    }

    public void showList () {
        Element t = head;
        while (t != null) {
            System.out.println(t.value);
            t = t.element;
        }
    }

    public void remove() {
    Element firstElement = head;
    head=firstElement.element;
        System.out.println("Удалённый элемент: " + firstElement.value);
    }

    public static void main(String[] args) {
        List myList = new List ();
        myList.addElement(new Element(101));
        myList.addElement(new Element(202));
        myList.addElement(new Element(105));
        myList.showList();
        System.out.println(myList.getSize());
        myList.remove();
        myList.showList();

    }

}
