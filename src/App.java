import com.ElencoInteri;

public class App {
    public static void main(String[] args) throws Exception {
        int[] numeri={1,2,3,4,5};

        ElencoInteri elencoInteri =new ElencoInteri();
        elencoInteri.addInt(7);
        while (elencoInteri.hasAncoraElementi()) {
            System.out.println(elencoInteri.getElementoSuccessivo());
        }

        // System.out.println(elencoInteri.getElementoSuccessivo());
        // System.out.println( elencoInteri.nextIndex);

        // System.out.println(elencoInteri.getElementoSuccessivo());
        // System.out.println( elencoInteri.nextIndex);

        // System.out.println(elencoInteri.getElementoSuccessivo());
        // System.out.println( elencoInteri.nextIndex);

        // System.out.println(elencoInteri.getElementoSuccessivo());
        // System.out.println(elencoInteri.nextIndex);

        // System.out.println(elencoInteri.hasAncoraElementi());

        // System.out.println(elencoInteri.getElementoSuccessivo());

        // System.out.println(elencoInteri.hasAncoraElementi());
    }
}
