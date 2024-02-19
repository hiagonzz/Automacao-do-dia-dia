package Automação.DiaDia;

import java.awt.*;
import java.awt.event.KeyEvent;//sas

public class DayStudent {

    private String frase;
    Robot robot = new Robot();

    public DayStudent() throws AWTException {

    }
    public void EnterIntellij() throws InterruptedException {
        robot.keyPress(KeyEvent.VK_WINDOWS);
        robot.keyPress(KeyEvent.VK_R);
        robot.keyRelease(KeyEvent.VK_R);
        robot.keyRelease(KeyEvent.VK_WINDOWS);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(3000);


        frase = "cd desktop";
        for (char caractere : frase.toCharArray()) {
            int keyCode = KeyEvent.getExtendedKeyCodeForChar(caractere);
            robot.keyPress(keyCode);
            robot.keyRelease(keyCode);
            Thread.sleep(50);
        }
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        frase = "intellij.lnk";
        for (char carctere : frase.toCharArray()) {
            int keyCode = KeyEvent.getExtendedKeyCodeForChar(carctere);
            robot.keyPress(keyCode);
            robot.keyRelease(keyCode);
            Thread.sleep(50);

        }
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(20000);
    }

    public void EnterWhats() throws InterruptedException {

        Thread.sleep(3000);
        robot.keyPress(KeyEvent.VK_ALT);
        robot.keyPress(KeyEvent.VK_TAB);


        robot.keyRelease(KeyEvent.VK_ALT);
        robot.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(3000);

        frase = "start msedge";
        for (char caractere : frase.toCharArray()) {
            int keyCode = KeyEvent.getExtendedKeyCodeForChar(caractere);
            robot.keyPress(keyCode);
            robot.keyRelease(keyCode);
            Thread.sleep(50);
        }
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(4000);

        frase = "web.whatsapp.com";
        for (char caractere : frase.toCharArray()) {
            int keyCode = KeyEvent.getExtendedKeyCodeForChar(caractere);
            robot.keyPress(keyCode);
            robot.keyRelease(keyCode);
            Thread.sleep(50);
        }

        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

    }

    public void enterRelogio() throws InterruptedException {
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_ALT);
        robot.keyPress(KeyEvent.VK_TAB);

        robot.keyRelease(KeyEvent.VK_ALT);
        robot.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(2000);

        frase = "relogio.lnk";
        for (char caractere : frase.toCharArray()) {
            int keyCode = KeyEvent.getExtendedKeyCodeForChar(caractere);
            robot.keyPress(keyCode);
            robot.keyRelease(keyCode);
            Thread.sleep(50);
        }
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

    public void enterNotion() throws InterruptedException {
        Thread.sleep(4000);
        robot.keyPress(KeyEvent.VK_ALT);
        robot.keyPress(KeyEvent.VK_TAB);

        robot.keyRelease(KeyEvent.VK_ALT);
        robot.keyRelease(KeyEvent.VK_TAB);

        Thread.sleep(2000);
        frase = "notion.lnk";
        for (char caracter : frase.toCharArray()) {
            int keyCode = KeyEvent.getExtendedKeyCodeForChar(caracter);
            robot.keyPress(keyCode);
            robot.keyRelease(keyCode);
            Thread.sleep(50);
        }
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

    public void finalizar() throws InterruptedException {
        Thread.sleep(10000);
        robot.keyPress(KeyEvent.VK_WINDOWS);
        robot.keyPress(KeyEvent.VK_M);

        robot.keyRelease(KeyEvent.VK_WINDOWS);
        robot.keyRelease(KeyEvent.VK_M);
    }
}