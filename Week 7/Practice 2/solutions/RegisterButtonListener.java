import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterButtonListener implements ActionListener {

  private StudentWindow gui;

  public RegisterButtonListener(StudentWindow sw) {
    gui = sw;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    // TODO Auto-generated method stub
    String fName = this.gui.getFirstName();
    String lName = this.gui.getLastName();
    String prog = this.gui.getProgramme();
    String status = this.gui.getStatus();

    this.gui.setOutputText(
        "Name: " +
        fName +
        " " +
        lName +
        " Programme: " +
        prog +
        " Status: " +
        status
      );
  }
}
