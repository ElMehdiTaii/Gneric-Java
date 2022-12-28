import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MetierProduitImpl implements  IMetier<Produit>{

    private List<Produit> produits = new ArrayList<Produit>();

    @Override
    public void add(Produit o) {
        this.produits.add(o);
    }

    @Override
    public List<Produit> getAll() {
        return this.produits;
    }

    @Override
    public Optional<Produit> findById(long id) {
        return this.produits.stream().filter(elm -> elm.getId()==id).findFirst();
    }

    @Override
    public void delete(long id) {
        this.produits.remove(this.findById(id).get());
    }

}