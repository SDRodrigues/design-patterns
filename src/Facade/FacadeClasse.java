package Facade;

class FacadeClasse {
    private Retangulo retangulo;
    private Triangulo triangulo;
    private Quadrado quadrado;

     FacadeClasse(){
        retangulo = new Retangulo();
        triangulo = new Triangulo();
        quadrado = new Quadrado();
    }

     void DesenhaRetangulo() {
        retangulo.desenhar();
    }

     void DesenhaTrianulo() { triangulo.desenhar(); }

     void DesenhaQuadrado() {
        quadrado.desenhar();
    }
}
