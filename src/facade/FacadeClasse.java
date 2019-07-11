package facade;
// Temos uma class facade, que é um ponto de acesso ao
// retangulo, triangulo e quadrado,
// um processo que para ser completado,
// é necessario o cliente invocar
// o metodo do retangulo, o metodo do triangulo, e o metodo do quadrado.
// Entao ao inves do cliente executar um a um esses metodos diretamente, o cliente simplmente invoca o
//  desenhar() do facade, que por sua vez, executa os metodos: desenhaRetangulo(), desenhaTrianulo() e desenhaQuadrado()
//  dos respectivos Subsistemas
class FacadeClasse {
    private Retangulo retangulo;
    private Triangulo triangulo;
    private Quadrado quadrado;

     FacadeClasse(){
        retangulo = new Retangulo();
        triangulo = new Triangulo();
        quadrado = new Quadrado();
    }

     void desenhaRetangulo() {
        retangulo.desenhar();
    }

     void desenhaTrianulo() { triangulo.desenhar(); }

     void desenhaQuadrado() {
        quadrado.desenhar();
    }
}
