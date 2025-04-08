package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.Turtle;

public class HlavniProgram {
  private Turtle zofka;

  public static void main(String[] args) {
    new HlavniProgram().start();
  }

  public void start() {
    zofka = new Turtle();

    //TODO implementace domácího úkolu
//    část1
    nakresliPrasatko();
  }
    public void nakresliPrasatko () {
    zofka.turnRight(150);

    nohaPrasatko();

    zofka.turnRight(60);
    zofka.move(70);
    zofka.turnRight(60);

    nohaPrasatko();

    zofka.turnLeft(30);
    zofka.move(50);
    zofka.turnLeft(90);
    zofka.move(70);
    zofka.turnLeft(90);
    zofka.move(50);
    zofka.turnRight(135);
    zofka.move(35);
    zofka.turnRight(90);
    zofka.move(30);
    zofka.turnRight(45);
    zofka.penUp();
    zofka.move(70);
    zofka.turnRight(32);
    zofka.penDown();
    zofka.move(28);
    for (int i = 0; i < 12; i++) {
      zofka.turnLeft(35);
      zofka.move(5);
    }
    zofka.move(10);
    zofka.turnLeft(25);
    zofka.move(10);
    for (int i = 0; i < 4; i++) {
      zofka.turnLeft(25);
      zofka.move(4);
    }
    zofka.penUp();
    zofka.turnRight(63);

  }

  public void nohaPrasatko () {
    zofka.move(30);
    zofka.penUp();
    zofka.turnRight(120);
    zofka.move(30);
    zofka.penDown();
    zofka.turnRight(120);
    zofka.move(30);
  }
}

