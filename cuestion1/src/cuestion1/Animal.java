package cuestion1;

// Clase base o superclase
class Animal {
    void hacerSonido() {
        System.out.println("Haciendo sonido genérico...");
    }
}

// Subclase que hereda de Animal
class Perro extends Animal {
    void hacerSonido() {
        System.out.println("El perro ladra.");
    }
}

// Subclase que hereda de Animal
class Gato extends Animal {
    void hacerSonido() {
        System.out.println("El gato maulla.");
    }
}
