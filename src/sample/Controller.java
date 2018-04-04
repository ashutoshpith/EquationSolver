package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{

    @FXML
    private TextField t1;

    @FXML
    private TextField t2;

    @FXML
    private Button btn;



    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

   public void sov(ActionEvent event) {


        ABCequation solver=new ABCequation();
        String input=t1.getText();
        String output=solver.matchform(input)? solver.solve(input):"No solution found";
        t2.setText(output);

    }

    @FXML
    void close(ActionEvent event) {
       System.exit(0);
    }
}
