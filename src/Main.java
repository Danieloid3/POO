import Entidad.Libro;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Libro libro1 = new Libro();
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el título del libro: ");
        String titulo = scan.nextLine();

        System.out.println("Ingrese el autor del libro: ");
        String autor = scan.nextLine();

        System.out.println("Ingrese el ISBN del libro: ");
        String ISBN = scan.nextLine();

        System.out.println("Ingrese el numero de paginas del libro: ");
        int numPaginas = scan.nextInt();

        libro1.setTitulo(titulo);
        libro1.setAutor(autor);
        libro1.setISBN(ISBN);
        libro1.setNumPaginas(numPaginas);

        System.out.println("Título: " + libro1.getTitulo() + "\nAutor: " + libro1.getAutor() + "\nISBN: " + libro1.getISBN() + "\nNúmero de páginas: " + libro1.getNumPaginas());








    }
}