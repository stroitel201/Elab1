package bsuir.lab2_3.sample;

import bsuir.lab2_3.classes.human.Human;
import bsuir.lab2_3.classes.human.Chef;
import bsuir.lab2_3.classes.human.Farmer;
import bsuir.lab2_3.classes.human.Proger;
import bsuir.lab2_3.classes.obj.Food;
import bsuir.lab2_3.classes.obj.Vegetable;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {


    static void myhandle(Human man, Food food, TextArea txt, TextArea foodtxt)
    {
        if (food.getCount()==0)
        {
            txt.setText("Кушать нечего");
            return;
        }

        man.eat(food,txt);
        foodtxt.setText(Integer.toString(food.getCount()));
    }


    Vegetable vegs= new Vegetable("","","",0);
    Food foods=new Food("","",10);
    Proger proger=new Proger("Oleg");
    Farmer farmer =new Farmer("Vasya");
    Chef chef = new Chef("Dima");
    @Override
    public void start(Stage primaryStage) throws Exception{


        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        Label foodlbl = new Label("Ведро еды");
        Label veglbl = new Label("Ведро овощей");
        TextArea foodtxt = new TextArea(Integer.toString(foods.getCount()));
        TextArea vegtxt = new TextArea(Integer.toString(vegs.getCount()));
        foodtxt.setEditable(false); foodtxt.setMaxSize(50,50);
        vegtxt.setEditable(false); vegtxt.setMaxSize(50,50);
        VBox fdvglbl = new VBox(10,foodlbl,foodtxt); fdvglbl.setAlignment(Pos.TOP_CENTER);
        VBox fdvgtxt = new VBox(10,veglbl,vegtxt);fdvgtxt.setAlignment(Pos.TOP_CENTER);
        HBox eatingArea = new HBox(10,fdvglbl,fdvgtxt);

        Label proglbl = new Label("Пограммист "+proger.getName());
        Label farmlbl = new Label("Фермер "+farmer.getName());
        Label cheflbl = new Label("Повар "+chef.getName());
        TextArea output = new TextArea();
        output.setMaxSize(200,100);
        output.setEditable(false);

        Button eatbtn = new Button();
        eatbtn.setPrefWidth(100);
        eatbtn.setText("Кушать");
        eatbtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                myhandle(proger,foods,output,foodtxt);
            }
        });
        Button eatbtn2 = new Button();
        eatbtn2.setPrefWidth(100);
        eatbtn2.setText("Кушать");
        eatbtn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               myhandle(farmer,foods,output,foodtxt);
            }
        });
        Button eatbtn3 = new Button();
        eatbtn3.setPrefWidth(100);
        eatbtn3.setText("Кушать");
        eatbtn3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                myhandle(chef,foods,output,foodtxt);
            }
        });

        Button fgrowbtn=new Button();
        fgrowbtn.setPrefWidth(100);
        fgrowbtn.setPrefHeight(50);
        fgrowbtn.setText("Вырастить");
        fgrowbtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                vegs = farmer.toGrow("Овощ","Картошка","",10, output);
                veglbl.setText(vegs.getType());
                vegtxt.setText(Integer.toString(vegs.getCount()));
            }
        });

        Button pcodebtn=new Button();
        pcodebtn.setPrefWidth(100);
        pcodebtn.setPrefHeight(50);
        pcodebtn.setText("Кодить");
        pcodebtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                proger.toCode(output);
            }
        });

        Button cookbtn=new Button();
        cookbtn.setPrefWidth(100);
        cookbtn.setPrefHeight(50);
        cookbtn.setText("Готовить");
        cookbtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(vegs.getCount()==0)
                    output.setText("Нету овощей");
                else {
                    foods = chef.cook("салат", "вкусно", 15, vegs);
                    foodlbl.setText(foods.getName());
                    foodtxt.setText(Integer.toString(foods.getCount()));
                    vegtxt.setText(Integer.toString(vegs.getCount()));
                }
            }
        });


        VBox progArea = new VBox(10,proglbl,eatbtn,pcodebtn); progArea.setAlignment(Pos.TOP_CENTER);
        VBox farmArea = new VBox(10,farmlbl,eatbtn2,fgrowbtn); farmArea.setAlignment(Pos.TOP_CENTER);
        VBox chefArea = new VBox(10,cheflbl,eatbtn3,cookbtn); chefArea.setAlignment(Pos.TOP_CENTER);
        HBox humanArea= new HBox(30,progArea,farmArea,chefArea);
        humanArea.setHgrow(progArea, Priority.ALWAYS);
        humanArea.setHgrow(farmArea, Priority.ALWAYS);
        humanArea.setHgrow(chefArea, Priority.ALWAYS);
        HBox inputArea=new HBox(20,humanArea,eatingArea);
        inputArea.setAlignment(Pos.TOP_CENTER);
        VBox Area=new VBox(50,inputArea,output);
        Area.setAlignment(Pos.TOP_CENTER);
        Scene UI = new Scene(Area);
        primaryStage.setScene(UI);
        primaryStage.setTitle("Lab2_3");
        primaryStage.setWidth(1000);
        primaryStage.setHeight(500);
        primaryStage.show();
    }


    public static void main(String[] args) {launch(args);}
}
