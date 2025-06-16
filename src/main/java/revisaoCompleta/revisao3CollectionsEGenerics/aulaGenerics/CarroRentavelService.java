package revisaoCompleta.revisao3CollectionsEGenerics.aulaGenerics;

import java.util.ArrayList;
import java.util.List;

public class CarroRentavelService {
    private List<Carro> carrosDisponivel = new ArrayList<>(
            List.of(new Carro("BMW"),
                    new Carro("Fusca")));
}
