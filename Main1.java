
import java.util.ArrayList;

public class Main1 {


ArrayList<FigurasGeometricas> figuras = new ArrayList<>();

FigurasGeometricas figura1 = new FigurasGeometricas(base_p:2,altura_p:4);
FigurasGeometricas figura2 = new FigurasGeometricas(base_p:3,altura_p:6);
FigurasGeometricas figura3 = new FigurasGeometricas(base_p:1,altura_p:2);

figuras.add(figura1);
figuras.add(figura2);
figuras.add(figura3);

for(FigurasGeometricas figurita : figuras) {
    System.out.println(figurita.calcularArea());

}

}

