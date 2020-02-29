package sample;

import classes.Randomizer;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Label;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        Label ulbl = new Label("Тут будет число");
        Label llbl = new Label("Тут будет число");

        Text text = new Text("Введите число");
        text.setLayoutY(40);    // установка положения надписи по оси Y
        text.setLayoutX(100);   // установка положения надписи по оси X

        TextField textField = new TextField("Введите число");
        textField.setPrefWidth(200);
        textField.setMaxWidth(200);

        Button lbtn = new Button();
        lbtn.setPrefWidth(200);
        lbtn.setText("Генерировать меньше");
        lbtn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                int temp=Randomizer.randomize_low(Integer.parseInt(textField.getText()));
                String msg=Integer.toString(temp);
                llbl.setText(msg);
            }
        });

        Button ubtn = new Button();
        ubtn.setPrefWidth(200);
        ubtn.setText("Генерировать больше");
        ubtn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                int temp=Randomizer.randomize_up(Integer.parseInt(textField.getText()));
                String msg=Integer.toString(temp);
                ulbl.setText(msg);
            }
        });

        Group grtitle = new Group(text);
        Group grlbtn = new Group(lbtn);
        Group grhbtn = new Group(ubtn);

        FlowPane uroot = new FlowPane(grhbtn,ulbl);
        FlowPane lroot = new FlowPane(grlbtn,llbl);
        VBox rootUI = new VBox(10,textField,uroot,lroot);
        Scene scene = new Scene(rootUI);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Лаба1");
        primaryStage.setWidth(320);
        primaryStage.setHeight(150);
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
