import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductManager implements Ordinabile {
    private List<Prodotto> prodotti;

    public ProductManager() {
        this.prodotti = new ArrayList<>();
    }

    public void addProdotto(Prodotto prodotto) {
    	prodotto.calculateDiscount();
    	
        prodotti.add(prodotto);
    }


    @Override
    public String toString() {
        String result = "Prodotti:\n";
        for (Prodotto prodotto : prodotti) {
            result += prodotto +"\n";
        }
        return result;
    }


    @Override
    public List<Prodotto> sortByPrice(List<Prodotto> products) {
        Collections.sort(products, new Comparator<Prodotto>() {
            public int compare(Prodotto p1, Prodotto p2) {
                return Double.compare(p1.getPrice(), p2.getPrice());
            }
        });
        return products;
    }

    public void sortProductsByPrice() {
        Collections.sort(prodotti, new Comparator<Prodotto>() {
            @Override
            public int compare(Prodotto p1, Prodotto p2) {
                return Double.compare(p1.getPrice(), p2.getPrice());
            }
        });
    }
}
