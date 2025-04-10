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
//    část2
    zofka.penUp();
    zofka.turnRight(180);
    zofka.move(200);
    zofka.turnLeft(90);
    zofka.move(250);
    zofka.turnLeft(90);
    zofka.penDown();
    nakresliPrasatko();
    zofka.move(320);

//    zofka.penDown();
//    nakreslitOsmiuhelnik();
//    zofka.turnLeft(90);
//    zofka.move(100);
//    zofka.turnRight(90);
//    zofka.penDown();
//    nakreslitKrouzek();

    zofka.turnLeft(90);
    zofka.move(600);
    zofka.turnRight(90);
    zofka.penDown();
    nakreslitSlunce();
    zofka.turnLeft(180);
    zofka.move(350);
    zofka.turnLeft(90);
    nakreslitDomek();
    zofka.turnLeft(270);
    zofka.move(100);
    for (int i = 0; i < 2; i++) {
            zofka.turnLeft(90);
            zofka.move(53);
            zofka.turnRight(90);
            zofka.move(50);
        }
    zofka.turnRight(90);
    for (int i = 0; i < 4; i++) {
         nakreslitDomek();
         zofka.turnLeft(180);
         zofka.move(150);
        }
    nakreslitDomek();
    zofka.turnLeft(90);
    zofka.move(200);
    zofka.turnRight(90);
    zofka.move(100);
    zofka.turnLeft(180);
    nakreslitDomek();
    zofka.turnLeft(90);
    zofka.move(150);
    zofka.turnRight(90);
    zofka.move(900);

    zofka.turnLeft(90);
    zofka.move(150);
    zofka.turnLeft(180);

    nakresliK();
    nakresliA();
    nakresliT();
    nakresliE();
    nakresliR();
    nakresliI();
    nakresliN();
    nakresliA();

    }

    public void nakresliPrasatko() {
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

    public void nohaPrasatko() {
        zofka.move(30);
        zofka.penUp();
        zofka.turnRight(120);
        zofka.move(30);
        zofka.penDown();
        zofka.turnRight(120);
        zofka.move(30);
    }

    public void nakreslitOsmiuhelnik() {
        for (int i = 0; i < 8; i++) {
            zofka.turnRight(45);
            zofka.move(50);
        }
        zofka.penUp();
    }

    public void nakreslitKrouzek() {
        for (int i = 0; i < 12; i++) {
            zofka.turnLeft(30);
            zofka.move(35);
        }
        zofka.penUp();
    }

    public void nakreslitSlunce () {
        zofka.penDown();
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 2; j++) {
                zofka.turnLeft(15);
                zofka.move(15);
            }
            zofka.turnRight(90);
            zofka.move(40);
            zofka.turnLeft(180);
            zofka.move(40);
            zofka.turnRight(90);
        }
        zofka.penUp();
    }
    public void nakreslitDomek () {
        zofka.penDown();
        zofka.move(100);
        zofka.turnLeft(135);
        zofka.move(75);
        zofka.turnLeft(90);
        zofka.move(75);
        zofka.turnLeft(45);
        for (int i = 0; i < 3; i++) {
            zofka.move(106);
            zofka.turnLeft(90);
        }
        zofka.penUp();
    }

    public void nakresliK () {
        zofka.penDown();
        zofka.move(140);
        zofka.turnRight(180);
        zofka.move(70);
        zofka.turnLeft(135);
        zofka.move(98);
        zofka.turnRight(180);
        zofka.move(98);
        zofka.turnLeft(90);
        zofka.move(98);
        zofka.turnLeft(45);
        dejKoncovku();
    }
    public void nakresliA () {
        zofka.penDown();
        zofka.turnRight(15);
        zofka.move(144);
        zofka.turnRight(150);
        zofka.move(72);
        zofka.turnRight(105);
        zofka.move(55);
        zofka.turnRight(180);
        zofka.move(55);
        zofka.turnRight(75);
        zofka.move(72);
        zofka.turnLeft(75);
        dejKoncovku();
    }
    public void nakresliT () {
        zofka.turnRight(90);
        zofka.move(30);
        zofka.turnLeft(90);
        zofka.penDown();
        zofka.move(140);
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(45);
        zofka.penDown();
        zofka.turnRight(180);
        zofka.move(90);
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(140);
        zofka.turnLeft(90);
        dejKoncovku();
    }
    public void nakresliE () {
        zofka.penDown();
        zofka.move(140);
        zofka.turnRight(90);
        zofka.move(57);
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(70);
        zofka.turnRight(90);
        zofka.move(22);
        zofka.penDown();
        zofka.move(35);
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(70);
        zofka.penDown();
        zofka.turnLeft(90);
        zofka.move(57);
        dejKoncovku();
    }
    public void nakresliR () {
        zofka.penDown();
        zofka.move(140);

        zofka.penUp();
        zofka.move(30);
        zofka.turnRight(90);
        zofka.move(38);
        zofka.turnRight(120);

        zofka.penDown();
        zofka.move(15);
        zofka.turnRight(60);
        zofka.move(8);
        zofka.turnRight(60);
        zofka.move(15);
        zofka.penUp();
        zofka.turnLeft(60);
        zofka.move(15);
        zofka.turnLeft(90);
        zofka.move(30);

        zofka.penDown();
        zofka.turnLeft(90);
        zofka.move(35);

        for (int i = 0; i < 24; i++) {
            zofka.turnRight(7);
            zofka.move(4);
        }
        zofka.move(30);
        zofka.turnLeft(120);
        zofka.move(93);
        zofka.turnLeft(48);
        dejKoncovku();
    }
    public void nakresliI () {
        zofka.turnRight(90);
        zofka.move(14);
        zofka.turnLeft(90);
        zofka.penDown();
        zofka.move(140);
        zofka.turnRight(90);
        zofka.penUp();
        zofka.move(14);
        zofka.turnRight(180);
        zofka.penDown();
        zofka.move(28);
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(140);
        zofka.turnLeft(90);
        zofka.penDown();
        zofka.move(28);
        dejKoncovku();
    }
    public void nakresliN () {
        zofka.penDown();
        zofka.move(140);
        zofka.turnRight(150);
        zofka.move(162);
        zofka.turnLeft(150);
        zofka.move(140);
        zofka.penDown();
        zofka.turnRight(180);
        zofka.move(140);
        zofka.turnLeft(90);
        dejKoncovku();
    }
    public void dejKoncovku() {
        zofka.penUp();
        zofka.move(25);
        zofka.turnLeft(90);
    }

}

