public class TesteFormas {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5.0f);
        Quadrado quadrado = new Quadrado(4);

        System.out.println("Área do círculo: " + circulo.calcularArea());
        System.out.println("Perímetro do círculo: " + circulo.calcularPerimetro());

        System.out.println("Área do quadrado: " + quadrado.calcularArea());
        System.out.println("Perímetro do quadrado: " + quadrado.calcularPerimetro());
    }
}

interface FormaGeometrica {
    float calcularArea();
    float calcularPerimetro();
}

class Circulo implements FormaGeometrica {
    private float raio;

    public Circulo(float raio) {
        this.raio = raio;
    }

    @Override
    public float calcularArea() {
        return 3.14f * raio * raio;
    }

    @Override
    public float calcularPerimetro() {
        return 2 * 3.14f * raio;
    }
}

class Quadrado implements FormaGeometrica {
   private int lado;

   public Quadrado(int lado) {
       this.lado = lado;
   }

   @Override
   public float calcularArea() {
       return lado * lado;
   }

   @Override
   public float calcularPerimetro() {
       return 4 * lado;
   }
}
