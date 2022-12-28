import java.util.List;
import java.util.Optional;

public interface IMetier<T> {

    public void add(T o);

    public List<T> getAll();

    public Optional<T> findById(long id);

    public void delete(long id);
}
