package com.mycompany.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {
  @Test
  public void shouldGetTrianguloEquilatero() {
    assertEquals("equilatero", App.triangulo(2, 2, 2));
  }

  @Test
  public void shouldGetTrianguloIsoseles() {
    assertEquals("isoseles", App.triangulo(1, 2, 2));
  }

  @Test
  public void shouldGetTrianguloEscaleno() {
    assertEquals("escaleno", App.triangulo(3, 4, 5));
  }

  @Test
  public void shouldNotGetTrianguloEquilatero() {
    assertEquals("no es triangulo", App.triangulo(0, 1, 2));
  }
}
