package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {

    Turtle zofka;

    public void main(String[] args) {

        Color cervena = new Color(255, 0, 0);
        Color modra = new Color(0, 0, 255);
        Color zelena = new Color(38, 255, 0);
        Color zluta = new Color(255, 191, 0);

        zofka = new Turtle();

        zofka.setLocation(400, 5);
        nakresliKruh(1, modra);
        zofka.setLocation(400, 125);
        nakresliKruh(1.5, modra);
        zofka.setLocation(400, 305);
        nakresliKruh(2, modra);
        zofka.setLocation(520, 185);
        nakresliKruh(0.5, modra);
        zofka.setLocation(280, 185);
        nakresliKruh(0.5, modra);

        zofka.setLocation(100, 230);
        nakresliKruh(1.3, cervena);
        zofka.penUp();
        zofka.turnRight(90);
        for (int i = 0; i < 110; i++) {
            zofka.move(1.3);
            zofka.turnRight(1);
        }
        zofka.penDown();
        nakresliRavTrojuhelnik(210, 40, zluta);

        zofka.setLocation(700, 370);
        zofka.turnLeft(90);
        nakresliObdelnik(200, 100, zelena);

        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(200);
        zofka.turnRight(90);
        zofka.move(100);
        zofka.turnRight(90);
        zofka.penDown();
        nakresliObdelnik(180, 120, modra);
        nakresliKruh(1.05, zluta);

        zofka.penUp();
        zofka.move(70);
        zofka.turnRight(90);
        zofka.penDown();
        nakresliKruh(0.5, zluta);

        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(80);
        zofka.turnRight(90);
        zofka.penDown();
        nakresliKruh(0.5, zluta);

        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(50);
        zofka.turnRight(90);
        zofka.move(75);
        zofka.turnRight(180);
        zofka.penDown();
        nakresliRavTrojuhelnik(100, 90, cervena);


    }

    public void nakresliKruh(double posunO, Color barva) {
        zofka.setPenColor(barva);
        zofka.turnRight(90);
        for (int i = 0; i < 360; i++) {
            zofka.move(posunO);
            zofka.turnRight(1);
        }
        zofka.turnLeft(90);
    }

    public void nakresliObdelnik(double delkaStranyA, double delkaStranyB, Color barva) {
        zofka.setPenColor(barva);
        zofka.turnRight(90);
        for (int i = 0; i < 2; i++) {
            zofka.move(delkaStranyA);
            zofka.turnRight(90);
            zofka.move(delkaStranyB);
            zofka.turnRight(90);
        }
        zofka.turnLeft(90);
    }

    public double vypocitejDelkuTretiStrany(double stranaAB, double uhelC) {
        double tretiStrana;
        tretiStrana = Math.abs((stranaAB
                * Math.sin((uhelC * Math.PI / 180.0) / 2.0))
                * 2.0);
        return tretiStrana;
    }

    public void nakresliRavTrojuhelnik(double stranaAB, double uhelC, Color barva) {
        zofka.setPenColor(barva);
        double tretiStrana = vypocitejDelkuTretiStrany(stranaAB, uhelC);
        double uhelAB = (180-uhelC)/2;
        zofka.move(stranaAB);
        zofka.turnRight(180-uhelC);
        zofka.move(stranaAB);
        zofka.turnRight(180-uhelAB);
        zofka.move(tretiStrana);
    }


}
