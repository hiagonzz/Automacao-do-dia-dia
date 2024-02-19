import Automação.DiaDia.DayStudent;

import java.awt.*;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws AWTException, InterruptedException {

        DayStudent dayStudent = new DayStudent();
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja Começar a automação??", "confirmar",
                JOptionPane.YES_NO_CANCEL_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            dayStudent.EnterIntellij();
            dayStudent.EnterWhats();
            dayStudent.enterRelogio();
            dayStudent.enterNotion();
            dayStudent.finalizar();
        } else {
            JOptionPane.showMessageDialog(null, "Automação Cancelada", "Alerta", JOptionPane.INFORMATION_MESSAGE);
        }

    }
}