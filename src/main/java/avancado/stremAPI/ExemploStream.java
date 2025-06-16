package avancado.stremAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStream {
    public static void main(String[] args){
       List<String> nomes = Arrays.asList("Ana", "Bruno", "Carlos", "Bianca", "Amanda");

        List<String> nomesFiltrados = nomes.stream()
                .filter(n -> n.startsWith("A"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        nomesFiltrados.forEach(System.out::println);
        // Saída: ANA, AMANDA
    }
}
