package operation;
import types.Tovar;
import java.util.List;
import types.Tovar;

public interface TovarOperation {
    List<Tovar> getListOfTovar();
    List<Tovar> addNewTovar(Tovar item);
    int getSumofTovar();
    
}
