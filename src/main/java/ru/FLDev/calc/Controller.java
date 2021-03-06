package ru.FLDev.calc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class Controller
{
    @FXML
    private Text output;
    private double num1 = 0;

    private boolean start = true;
    private String operator = "";
    private Model model = new Model();

    @FXML
    private void num(ActionEvent event)
    {
        if (start) {
            output.setText("");
            start = false;
        }
        String value = ((Button) event.getSource()).getText();
        output.setText(output.getText() + value);
    }

    @FXML
    private void operation(ActionEvent event)
    {
        String value = ((Button) event.getSource()).getText();
        if (!"=".equals(value)) {
            if (!(operator.equals(""))) return;
            operator = value;
            num1 = Double.parseDouble(output.getText());
            output.setText("");
        }
        else {
            if (operator.equals("")) return;
            output.setText(String.valueOf(model.calculation(num1, Double.parseDouble(output.getText()), operator)));
            operator = "";
            start = true;
        }
    }
}
