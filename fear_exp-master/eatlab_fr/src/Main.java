import java.io.File;
import java.io.IOException;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.net.URL;
import java.util.Random;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class Main extends Application {
    private String[] pictureFiles = new String[]{"img/circle.png", "img/triangle.png", "img/square.png", "img/circle.png", "img/triangle.png", "img/square.png", "img/circle.png", "img/triangle.png", "img/square.png", "img/circle.png", "img/triangle.png", "img/square.png", "img/circle.png", "img/triangle.png", "img/square.png", "img/circle.png", "img/triangle.png", "img/square.png", "img/circle.png", "img/triangle.png"};
    private String[] pictureFilesC = new String[]{"/square.png", "/triangle.png", "/square.png", "/triangle.png", "/square.png", "/triangle.png", "/square.png", "/square.png", "/triangle.png", "/square.png"};

    //fattyfoods
    //veggies
    //trialone

    //officesupplies
    //nonoffice supplies
    //trialsix

    //trialarray = new Array[tr1, tr2, tr3, ...., tr6]





    private MediaPlayer mediaPlayer;
    private String[][] outputString = new String[3][70];
    private int counterOutputStringTime = 0;
    private int timerCounter = 0;
    private double timeStart;
    private boolean scream = false;
    private int finishCounter = 0;
    private int m = 0;
    private int n = 0;
    private boolean canScream;
    private String inputNextString;
    private boolean canChange = true;
    public Main() {
    }

    public void start(final Stage primaryStage) throws Exception {

        //for loop here too for trials (if wanted)

        //if(newTrial){
        //if(len(trialArr) == 0)
        //  break
        //
        //get rand numb from 1 to len(trialarray) call it randNum
        //currTrial = trialArr[randNum]
        //remove from trialArray
        //newTrial = false
        //
        //
        //}
        //

        //for loop start to loop through trialarr five times

        this.timeStart = (double)System.currentTimeMillis();
        Random rand = new Random();
        File directory = new File("./");
        System.out.println("p");
        this.n = rand.nextInt(9);
        primaryStage.setTitle("EATLAB Fear Experiment");
        String saveLocation = directory.getAbsolutePath().toString() + "src/img/fear_exp_instructions.png";
        System.out.println(Main.class.getResource("/img/fear_exp_instructions.png").getFile().trim());
        System.out.println(saveLocation);
        URL url = Main.class.getResource("/img/fear_exp_instructions.png");
        new File("/img/fear_exp_instructions.png");
        Image image = new Image(this.getClass().getClassLoader().getResourceAsStream("img/fear_exp_instructions.png"));
        final ImageView imageView = new ImageView(image);
        imageView.setFitHeight(455.0D);
        imageView.setFitWidth(500.0D);
        HBox hbox = new HBox(new Node[]{imageView});
        Scene scene = new Scene(hbox, 500.0D, 500.0D);
        primaryStage.setScene(scene);
        this.m = rand.nextInt(3);
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            public void handle(KeyEvent ke) {
                if (ke.getCode() == KeyCode.UP) {

                    imageView.setFitHeight(imageView.getFitHeight() + 10.0D);

                    if(imageView.getFitHeight() >= 865.0) {
                        canChange = true;
                    }

                } else if(ke.getCode() == KeyCode.DOWN) {
                    imageView.setFitHeight(imageView.getFitHeight() - 10.0D);

                    if(imageView.getFitHeight() <= 140.0) {
                        canChange = true;
                    }

                } else if(ke.getCode() == KeyCode.LEFT) {
                    imageView.setFitWidth(imageView.getFitWidth() - 10.0D);
                    System.out.println(imageView.getFitWidth());
                    if(imageView.getFitWidth() <= 110.0) {
                        canChange = true;
                    }


                } else if(ke.getCode() == KeyCode.RIGHT) {
                    imageView.setFitWidth(imageView.getFitWidth() + 10.0D);
                    System.out.println(imageView.getFitWidth());
                    if(imageView.getFitWidth() >= 1150.0) {
                        canChange = true;
                    }


                }


                /*

                if(canChange) {
                currArr = trialArr
                randNum = rand(1, len(currArr))
                currArr[randNum]
                remove(currArr, randNum) - i.e. remove element from array

                if(loop is iteration is done) {

                currArr = trialArr

                }

                }

                 */


                if(canChange) {
                    Main.this.finishCounter++;
                    if (Main.this.m == 1) {
                        Main.this.mediaPlayer.stop();
                        Main.this.m = 0;
                    }

                    double reactionTime = ((double)System.currentTimeMillis() - Main.this.timeStart) / 1000.0D;
                    Main.this.outputString[1][Main.this.counterOutputStringTime] = Double.toString(reactionTime);
                    Main.this.counterOutputStringTime++;
                    Main.this.timeStart = (double)System.currentTimeMillis();
                    Main.this.timerCounter++;
                    if (Main.this.n < 19) {
                        Main.this.n = Main.this.n + 1;
                    } else {
                        Main.this.n = 0;
                    }

                    Object var4 = null;

                    try {
                        new FileInputStream(Main.this.pictureFiles[Main.this.n]);
                        Main.this.inputNextString = Main.this.pictureFiles[Main.this.n];
                    } catch (FileNotFoundException var12) {
                        var12.printStackTrace();
                    }

                    Image image = new Image(this.getClass().getClassLoader().getResourceAsStream(Main.this.pictureFiles[Main.this.n]));
                    imageView.setImage(image);
                    imageView.setFitHeight(455.0D);
                    imageView.setFitWidth(500.0D);
                    if (Main.this.finishCounter < 10) {
                        Main.this.canScream = false;
                    } else if (Main.this.finishCounter < 20) {
                        Main.this.canScream = true;
                    } else if (Main.this.finishCounter < 30) {
                        Main.this.canScream = false;
                    } else if (Main.this.finishCounter < 40) {
                        Main.this.canScream = true;
                    } else if (Main.this.finishCounter < 50) {
                        Main.this.canScream = false;
                    } else if (Main.this.finishCounter < 60) {
                        Main.this.canScream = true;
                    } else if (Main.this.finishCounter < 70) {
                        Main.this.canScream = false;
                    }

                    if (Main.this.canScream) {
                        if (Main.this.inputNextString.equals("/circle.png")) {
                            Main.this.m = 1;
                            Media sound = new Media((new File("img/female_scream.wav")).toURI().toString());
                            Main.this.mediaPlayer = new MediaPlayer(sound);
                            Main.this.mediaPlayer.play();
                            Main.this.scream = true;
                            Main.this.outputString[0][Main.this.counterOutputStringTime] = "True";
                        } else {
                            Main.this.outputString[0][Main.this.counterOutputStringTime] = "False";
                        }
                    } else {
                        Main.this.outputString[0][Main.this.counterOutputStringTime] = "False";
                    }

                    if (Main.this.finishCounter == 70) {
                        BufferedWriter writer = null;

                        try {
                            writer = new BufferedWriter(new FileWriter(" out.txt"));
                        } catch (IOException var11) {
                        }

                        for(int i = 0; i < 70; ++i) {
                            try {
                                writer.write(Main.this.outputString[0][i] + " " + Main.this.outputString[1][i] + "\n");
                            } catch (IOException var10) {
                            }
                        }

                        try {
                            writer.close();
                        } catch (IOException var9) {
                        }

                        primaryStage.close();
                    }

                    canChange  = false;
                }

            }
        });
        primaryStage.show();
    }

    public void goToNextImage(String path, Stage primaryStage) {

    }

    public static void main(String[] args) {
        launch(args);
    }
}

