//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Author mikhailBulgakov = new Author("Mikhail", "Bulgakov");
        System.out.println(mikhailBulgakov);
        System.out.println();

        Author antoineDeSaintExupery = new Author("Antoine", "de Saint Exupery");
        System.out.println(antoineDeSaintExupery);
        System.out.println();

        Book theMasterAndMargarita = new Book("The Master and Margarita", mikhailBulgakov.toString(), 1967);
        System.out.println("Книга " + theMasterAndMargarita.getTitle());
        System.out.println("Автор " + theMasterAndMargarita.getAuthor());
        System.out.println("Год публикации " + theMasterAndMargarita.getPublishingYear());
        System.out.println();

        Book theLittlePrince = new Book("The Little Prince", antoineDeSaintExupery.toString(), 1943);
        System.out.println("Книга " + theLittlePrince.getTitle());
        System.out.println("Автор " + theLittlePrince.getAuthor());
        System.out.println("Год публикации " + theLittlePrince.getPublishingYear());


    }
}