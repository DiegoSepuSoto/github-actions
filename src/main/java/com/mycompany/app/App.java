package com.mycompany.app;

public class App {
  public static String triangulo(int a, int b, int c) {
    if (!esTriangulo(a, b, c)) {
      return "no es triangulo";
    }

    if (a == b && a == c) {
      return "equilatero";
    }

    if (a != b && b != c && a != c) {
      return "escaleno";
    }

    return "isoseles";
  }

  private static boolean esTriangulo(int a, int b, int c) {
    if (a < 1 || b < 1 || c < 1) {
      return false;
    }

    return (a + b > c && a + c > b && b + c > a);
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
