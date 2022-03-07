import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClearButtonListener implements ActionListener {

  private StudentWindow gui;

  public ClearButtonListener(StudentWindow sw) {
    gui = sw;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    this.gui.clearData();
  }
}
