package tugas.praktikum;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {

    private Scene homeScene;
    private Scene addProfilScene;
    private Scene profileScene;
    private Scene editProfilScene;

    private Label usernameLabel;
    private Label birthdayLabel;
    private Label addressLabel;
    private ImageView imageView;

    @Override
    public void start(Stage primaryStage) {
        // Home Scene
        Label homeLabel = new Label("Welcome!");
        homeLabel.setStyle("-fx-font-size: 30px; -fx-font-weight: bold; -fx-font-family: 'cooper black'; -fx-text-fill: #9D7F97;");

        Button addProfileButton = new Button("Add Profile");
        addProfileButton.setStyle("-fx-background-color: #9D7F97; -fx-background: transparent; -fx-border-color: transparent; -fx-text-fill: #F6DFF1; -fx-background-radius: 10;");
        addProfileButton.setPrefWidth(227);
        addProfileButton.setPrefHeight(29);
        addProfileButton.setOnAction(e -> primaryStage.setScene(addProfilScene));

        Button goToProfileButton = new Button("Go to Profile");
        goToProfileButton.setStyle("-fx-background-color: #9D7F97; -fx-background: transparent; -fx-border-color: transparent; -fx-text-fill: #F6DFF1; -fx-background-radius: 10;");
        goToProfileButton.setPrefWidth(227);
        goToProfileButton.setPrefHeight(29);
        goToProfileButton.setOnAction(e -> primaryStage.setScene(profileScene));

        VBox homeLayout = new VBox(30);
        homeLayout.getChildren().addAll(homeLabel, addProfileButton, goToProfileButton);
        homeLayout.setAlignment(Pos.CENTER);
        homeLayout.setStyle("-fx-background-color: #F6DFF1;");
        
        homeScene = new Scene(homeLayout, 600, 500);
        

        // Add Profile Scene
        Label userTitle = new Label("Profile");
        userTitle.setStyle("-fx-font-size: 25px; -fx-font-weight: bold; -fx-font-family: 'cooper black'; -fx-text-fill: #9D7F97;");
        
        // Username input
        Label userNameLabel = new Label("Username: ");
        userNameLabel.setStyle("-fx-font-size: 15px; -fx-font-weight: bold; -fx-font-family: 'mulish'; -fx-text-fill: #9D7F97;");
        TextField usernametextField = new TextField();
        usernametextField.setStyle("-fx-background-color: #D1BFCD; -fx-background-radius: 5; -fx-text-fill: #9D7F97; -fx-font-weight: bold;");
        usernametextField.setPrefWidth(200);

        HBox inputUser = new HBox(10, userNameLabel, usernametextField);
        inputUser.setAlignment(Pos.CENTER);

        // Birthday input
        Label birthdayInputLabel = new Label("Birthday: ");
        birthdayInputLabel.setStyle("-fx-font-size: 15px; -fx-font-weight: bold; -fx-font-family: 'mulish'; -fx-text-fill: #9D7F97;");
        TextField birthdaytextField = new TextField();
        birthdaytextField.setStyle("-fx-background-color: #D1BFCD; -fx-background-radius: 5;-fx-text-fill: #9D7F97; -fx-font-weight: bold;");
        birthdaytextField.setPrefWidth(200);

        HBox inputBirthday = new HBox(20, birthdayInputLabel, birthdaytextField);
        inputBirthday.setAlignment(Pos.CENTER);

        // Address Input
        Label addressInputLabel = new Label("Address: ");
        addressInputLabel.setStyle("-fx-font-size: 15px; -fx-font-weight: bold; -fx-font-family: 'mulish'; -fx-text-fill: #9D7F97;");
        TextField addresstextField = new TextField();
        addresstextField.setStyle("-fx-background-color: #D1BFCD; -fx-background-radius: 5; -fx-text-fill: #9D7F97; -fx-font-weight: bold;");
        addresstextField.setPrefWidth(200);

        HBox inputAddress = new HBox(22, addressInputLabel, addresstextField);
        inputAddress.setAlignment(Pos.CENTER);
        
        // Buttons
        Button backButton = new Button("Back to Home");
        backButton.setStyle("-fx-background-color: #9D7F97; -fx-background: transparent; -fx-border-color: transparent; -fx-text-fill: #F6DFF1; -fx-background-radius: 10;");
        backButton.setPrefWidth(110);
        backButton.setOnAction(e -> primaryStage.setScene(homeScene));

        Label warningLabel = new Label();
        warningLabel.setStyle("-fx-font-size: 14px; -fx-text-fill: red;");

        Button saveButton = new Button("Save");
        saveButton.setStyle("-fx-background-color: #9D7F97; -fx-background: transparent; -fx-border-color: transparent; -fx-text-fill: #F6DFF1; -fx-background-radius: 10;");
        saveButton.setPrefWidth(110);
        saveButton.setOnAction(e -> {
            String nama = usernametextField.getText();
            String birthday = birthdaytextField.getText();
            String address = addresstextField.getText();

            if (!nama.isEmpty() && !birthday.isEmpty() && !address.isEmpty()) {
                usernameLabel.setText("Username : " + nama);
                usernameLabel.setStyle("-fx-font-size: 15px; -fx-font-weight: bold; -fx-font-family: 'mulish'; -fx-text-fill: #9D7F97;");
                birthdayLabel.setText("Birthday : " + birthday);
                birthdayLabel.setStyle("-fx-font-size: 15px; -fx-font-weight: bold; -fx-font-family: 'mulish'; -fx-text-fill: #9D7F97;");
                addressLabel.setText("Address   : " + address);
                addressLabel.setStyle("-fx-font-size: 15px; -fx-font-weight: bold; -fx-font-family: 'mulish'; -fx-text-fill: #9D7F97;");

                // Switch to profile scene
                imageView.setVisible(true);
                primaryStage.setScene(profileScene);
                warningLabel.setText("");
            } else {
                // Tampilkan pesan peringatan
                warningLabel.setText("Please complete all fields");
            }
        });

        HBox button = new HBox(250, backButton, saveButton);
        button.setAlignment(Pos.CENTER);

        VBox addprofileLayout = new VBox(30, userTitle, inputUser, inputBirthday, inputAddress, warningLabel, button);
        addprofileLayout.setAlignment(Pos.CENTER);
        addprofileLayout.setStyle("-fx-background-color: #F6DFF1;");
        addProfilScene = new Scene(addprofileLayout, 600, 500);
        
        // Profile Scene
        Label profileLabel = new Label("Profile");
        profileLabel.setStyle("-fx-font-size: 25px; -fx-font-weight: bold; -fx-font-family: 'cooper black'; -fx-text-fill: #9D7F97;");
        usernameLabel = new Label();
        birthdayLabel = new Label();
        addressLabel = new Label();

        // image
        Image image = new Image("file:C:\\Users\\ASUS\\Downloads\\pict.jpeg");
        imageView = new ImageView(image);
        imageView.setVisible(false); 
        imageView.setFitWidth(91); 
        imageView.setFitHeight(80); 

        // back button2
        Button backButton2 = new Button("Back to Home");
        backButton2.setStyle("-fx-background-color: #9D7F97; -fx-background: transparent; -fx-border-color: transparent; -fx-text-fill: #F6DFF1; -fx-background-radius: 10;");
        backButton2.setOnAction(e -> primaryStage.setScene(homeScene));
        
        // Edit Profile Button
        Button editProfileButton = new Button("Edit Profile");
        editProfileButton.setStyle("-fx-background-color: #9D7F97; -fx-background: transparent; -fx-border-color: transparent; -fx-text-fill: #F6DFF1; -fx-background-radius: 10;");
        editProfileButton.setOnAction(e -> primaryStage.setScene(editProfilScene));

        VBox profileLayout = new VBox(20);
        profileLayout.getChildren().addAll(profileLabel, imageView, usernameLabel, birthdayLabel, addressLabel, editProfileButton, backButton2);
        profileLayout.setAlignment(Pos.CENTER);
        profileLayout.setStyle("-fx-background-color: #F6DFF1;");
        profileScene = new Scene(profileLayout, 600, 500);

        // Edit Profile Scene
        Label editUserTitle = new Label("Edit Profile");
        editUserTitle.setStyle("-fx-font-size: 25px; -fx-font-weight: bold; -fx-font-family: 'cooper black'; -fx-text-fill: #9D7F97;");
        
        // Edit Username input
        Label editUserNameLabel = new Label("Username: ");
        editUserNameLabel.setStyle("-fx-font-size: 15px; -fx-font-weight: bold; -fx-font-family: 'mulish'; -fx-text-fill: #9D7F97;");
        TextField editUsernametextField = new TextField();
        editUsernametextField.setStyle("-fx-background-color: #D1BFCD; -fx-background-radius: 5; -fx-text-fill: #9D7F97; -fx-font-weight: bold;");
        editUsernametextField.setPrefWidth(200);

        HBox editInputUser = new HBox(10, editUserNameLabel, editUsernametextField);
        editInputUser.setAlignment(Pos.CENTER);

        // Edit Birthday input
        Label editBirthdayInputLabel = new Label("Birthday: ");
        editBirthdayInputLabel.setStyle("-fx-font-size: 15px; -fx-font-weight: bold; -fx-font-family: 'mulish'; -fx-text-fill: #9D7F97;");
        TextField editBirthdaytextField = new TextField();
        editBirthdaytextField.setStyle("-fx-background-color: #D1BFCD; -fx-background-radius: 5;-fx-text-fill: #9D7F97; -fx-font-weight: bold;");
        editBirthdaytextField.setPrefWidth(200);

        HBox editInputBirthday = new HBox(20, editBirthdayInputLabel, editBirthdaytextField);
        editInputBirthday.setAlignment(Pos.CENTER);

        // Edit Address Input
        Label editAddressInputLabel = new Label("Address: ");
        editAddressInputLabel.setStyle("-fx-font-size: 15px; -fx-font-weight: bold; -fx-font-family: 'mulish'; -fx-text-fill: #9D7F97;");
        TextField editAddresstextField = new TextField();
        editAddresstextField.setStyle("-fx-background-color: #D1BFCD; -fx-background-radius: 5; -fx-text-fill: #9D7F97; -fx-font-weight: bold;");
        editAddresstextField.setPrefWidth(200);

        HBox editInputAddress = new HBox(22, editAddressInputLabel, editAddresstextField);
        editInputAddress.setAlignment(Pos.CENTER);
        
        // Buttons for Edit Profile Scene
        Button backButton3 = new Button("Back to Profile");
        backButton3.setStyle("-fx-background-color: #9D7F97; -fx-background: transparent; -fx-border-color: transparent; -fx-text-fill: #F6DFF1; -fx-background-radius: 10;");
        backButton3.setPrefWidth(110);
        backButton3.setOnAction(e -> primaryStage.setScene(profileScene));

        Label editWarningLabel = new Label();
        editWarningLabel.setStyle("-fx-font-size: 14px; -fx-text-fill: red;");

        Button saveEditButton = new Button("Save");
        saveEditButton.setStyle("-fx-background-color: #9D7F97; -fx-background: transparent; -fx-border-color: transparent; -fx-text-fill: #F6DFF1; -fx-background-radius: 10;");
        saveEditButton.setPrefWidth(110);
        saveEditButton.setOnAction(e -> {
            String editNama = editUsernametextField.getText();
            String editBirthday = editBirthdaytextField.getText();
            String editAddress = editAddresstextField.getText();

            if (!editNama.isEmpty() && !editBirthday.isEmpty() && !editAddress.isEmpty()) {
                usernameLabel.setText("Username : " + editNama);
                birthdayLabel.setText("Birthday : " + editBirthday);
                addressLabel.setText("Address   : " + editAddress);

                primaryStage.setScene(profileScene);
                editWarningLabel.setText("");
            } else {
                editWarningLabel.setText("Please complete all fields");
            }
        });

        HBox editButton = new HBox(250, backButton3, saveEditButton);
        editButton.setAlignment(Pos.CENTER);

        VBox editProfileLayout = new VBox(30, editUserTitle, editInputUser, editInputBirthday, editInputAddress, editWarningLabel, editButton);
        editProfileLayout.setAlignment(Pos.CENTER);
        editProfileLayout.setStyle("-fx-background-color: #F6DFF1;");
        editProfilScene = new Scene(editProfileLayout, 600, 500);

        primaryStage.setScene(homeScene);
        primaryStage.setTitle("TP9");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}