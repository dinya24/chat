package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.awt.*;
import java.util.ArrayList;

public class Controller {


    public TextField textField;
    public ArrayList<String> pool = new ArrayList<>();
    public TextArea TeArea;




    public void Send(ActionEvent actionEvent) {
        if (textField.getText().length() != 0){
            Button button = (Button) actionEvent.getSource();
            String o = textField.getText();
            pool.add(o);
            StringBuilder s1 = new StringBuilder();
            for (int i = 0; i < pool.size(); i++) {
                s1.append(pool.get(i)).append(System.lineSeparator());
            }
            TeArea.setText(s1.toString());

        }
    }


    
}
