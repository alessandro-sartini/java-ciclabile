import com.ElencoInteri;

public class App {
    public static void main(String[] args) throws Exception {
        int[] numeri = { 1, 2, 3, 4, 5 };

        ElencoInteri elencoInteri = new ElencoInteri(numeri);
        elencoInteri.addInt(7);
        System.out.println(elencoInteri.getNextIndex());
        while (elencoInteri.hasAncoraElementi()) {
            System.out.println(elencoInteri.getElementoSuccessivo());
        }

        System.out.println("--------- costruttore vuoto!! ---------");
        
        ElencoInteri elenco = new ElencoInteri();
        System.out.println(elenco.getNextIndex());
        while (elenco.hasAncoraElementi()) {
            System.out.println(elenco.getElementoSuccessivo());
        }
        elenco.addInt(1);
        while (elenco.hasAncoraElementi()) {
            System.out.println(elenco.getElementoSuccessivo());
        }

    }
}
