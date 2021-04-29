import java.io.File;
import java.io.IOException;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.net.URL;
import java.util.Arrays;
import java.util.Random;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
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
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main extends Application {
    private String[] pictureFiles = new String[]{"img/circle.png", "img/triangle.png", "img/square.png", "img/circle.png", "img/triangle.png", "img/square.png", "img/circle.png", "img/triangle.png", "img/square.png", "img/circle.png", "img/triangle.png", "img/square.png", "img/circle.png", "img/triangle.png", "img/square.png", "img/circle.png", "img/triangle.png", "img/square.png", "img/circle.png", "img/triangle.png"};
    private String[] fattyPictures = new String[]{"img/fatty_1.png", "img/fatty_2.png", "img/fatty_3.png", "img/fatty_4.png", "img/fatty_5.png", "img/fatty_6.png", "img/fatty_7.png", "img/fatty_8.png"};
    private String[] vegetablePictures = new String[]{"img/vegetable_1.png", "img/vegetable_2.png", "img/vegetable_3.png", "img/vegetable_4.png", "img/vegetable_5.png", "img/vegetable_6.png", "img/vegetable_6.png", "img/vegetable_7.png", "img/vegetable_8.png"};
    private String[] trial1 = new String[]{"img/fatty_1.png", "img/fatty_2.png", "img/fatty_3.png", "img/fatty_4.png", "img/fatty_5.png", "img/fatty_6.png", "img/fatty_7.png", "img/fatty_8.png","img/vegetable_1.png", "img/vegetable_2.png", "img/vegetable_3.png", "img/vegetable_4.png", "img/vegetable_5.png", "img/vegetable_6.png", "img/vegetable_6.png", "img/vegetable_7.png", "img/vegetable_8.png"};
    private String[] trial2 = new String[]{"img/fatty_1.png", "img/fatty_2.png", "img/fatty_3.png", "img/fatty_4.png", "img/fatty_5.png", "img/fatty_6.png", "img/fatty_7.png", "img/fatty_8.png","img/vegetable_1.png", "img/vegetable_2.png", "img/vegetable_3.png", "img/vegetable_4.png", "img/vegetable_5.png", "img/vegetable_6.png", "img/vegetable_6.png", "img/vegetable_7.png", "img/vegetable_8.png"};
    private String[] officePictures = new String[]{"img/office_1.png", "img/office_2.png", "img/office_3.png", "img/office_4.png", "img/office_5.png", "img/office_6.png", "img/office_7.png", "img/office_8.png"};
    private String[] toolPictures = new String[]{"img/tool_1.png", "img/tool_2.png", "img/tool_3.png", "img/tool_4.png", "img/tool_5.png", "img/tool_6.png", "img/tool_7.png", "img/tool_8.png"};
    private String[] trial3 = new String[]{"img/office_1.png", "img/office_2.png", "img/office_3.png", "img/office_4.png", "img/office_5.png", "img/office_6.png", "img/office_7.png", "img/office_8.png","img/tool_1.png", "img/tool_2.png", "img/tool_3.png", "img/tool_4.png", "img/tool_5.png", "img/tool_6.png", "img/tool_7.png", "img/tool_8.png"};
    private String[] trial4 = new String[]{"img/office_1.png", "img/office_2.png", "img/office_3.png", "img/office_4.png", "img/office_5.png", "img/office_6.png", "img/office_7.png", "img/office_8.png","img/tool_1.png", "img/tool_2.png", "img/tool_3.png", "img/tool_4.png", "img/tool_5.png", "img/tool_6.png", "img/tool_7.png", "img/tool_8.png"};
    private String[] plusPictures = new String[]{"img/plus_1.png", "img/plus_2.png", "img/plus_3.png", "img/plus_4.png", "img/plus_5.png", "img/plus_6.png", "img/plus_7.png", "img/plus_8.png"};
    private String[] thinPictures = new String[]{"img/thin_1.png", "img/thin_2.png", "img/thin_3.png", "img/thin_4.png", "img/thin_5.png", "img/thin_6.png", "img/thin_7.png", "img/thin_8.png"};
    private String[] trial5 = new String[]{"img/plus_1.png", "img/plus_2.png", "img/plus_3.png", "img/plus_4.png", "img/plus_5.png", "img/plus_6.png", "img/plus_7.png", "img/plus_8.png","img/thin_1.png", "img/thin_2.png", "img/thin_3.png", "img/thin_4.png", "img/thin_5.png", "img/thin_6.png", "img/thin_7.png", "img/thin_8.png"};
    private String[] trial6 = new String[]{"img/plus_1.png", "img/plus_2.png", "img/plus_3.png", "img/plus_4.png", "img/plus_5.png", "img/plus_6.png", "img/plus_7.png", "img/plus_8.png","img/thin_1.png", "img/thin_2.png", "img/thin_3.png", "img/thin_4.png", "img/thin_5.png", "img/thin_6.png", "img/thin_7.png", "img/thin_8.png"};
    private String[][] trialarray = new String[][]{trial1,trial2,trial3,trial4,trial5,trial6};


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
    private String picture;
    public Main() {
    }

    public void start(final Stage primaryStage) throws Exception {
        randomizeArrays(trialarray);

        for (int l=0; l<trialarray.length; l++) {
            String[] currentTrial = trialarray[l];

            for (int j = 0; j < 5; j++) {
                randomize(currentTrial);
                this.timeStart = (double)System.currentTimeMillis();
                Random rand = new Random();
                File directory = new File("./");
                System.out.println("p");
                this.n = rand.nextInt(9);
                primaryStage.setTitle("EATLAB Fear Experiment");
                //insert if statement to show instructions for each trial
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
                hbox.setAlignment(Pos.CENTER);
                Scene scene = new Scene(hbox, 500.0D, 500.0D);
                primaryStage.setScene(scene);
                this.m = rand.nextInt(3);

                for (int k = 0; k < currentTrial.length; k++) {
                    Main.this.picture = currentTrial[k];
                    scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
                        public void handle(KeyEvent ke) {
                            if (ke.getCode() == KeyCode.UP) {

                                imageView.setFitHeight(imageView.getFitHeight() - 10.0D);
                                imageView.setFitWidth(imageView.getFitWidth() - 10.0D);

                                if (imageView.getFitHeight() <= 140.0) {
                                    canChange = true;
                                }

                            } else if (ke.getCode() == KeyCode.DOWN) {
                                imageView.setFitHeight(imageView.getFitHeight() + 10.0D);
                                imageView.setFitWidth(imageView.getFitWidth() + 10.0D);

                                if (imageView.getFitHeight() >= 865.0) {
                                    canChange = true;
                                }

                            }

                            /*if (ke.getCode() == KeyCode.UP) {

                                imageView.setFitHeight(imageView.getFitHeight() + 10.0D);

                                if (imageView.getFitHeight() >= 865.0) {
                                    canChange = true;
                                }

                            } else if (ke.getCode() == KeyCode.DOWN) {
                                imageView.setFitHeight(imageView.getFitHeight() - 10.0D);

                                if (imageView.getFitHeight() <= 140.0) {
                                    canChange = true;
                                }

                            } else if (ke.getCode() == KeyCode.LEFT) {
                                imageView.setFitWidth(imageView.getFitWidth() - 10.0D);
                                System.out.println(imageView.getFitWidth());
                                if (imageView.getFitWidth() <= 110.0) {
                                    canChange = true;
                                }


                            } else if (ke.getCode() == KeyCode.RIGHT) {
                                imageView.setFitWidth(imageView.getFitWidth() + 10.0D);
                                System.out.println(imageView.getFitWidth());
                                if (imageView.getFitWidth() >= 1150.0) {
                                    canChange = true;
                                }
                            }*/

                            if (canChange) {
                                Main.this.finishCounter++;
                                if (Main.this.m == 1) {
                                    Main.this.mediaPlayer.stop();
                                    Main.this.m = 0;
                                }

                                double reactionTime = ((double) System.currentTimeMillis() - Main.this.timeStart) / 1000.0D;
                                Main.this.outputString[1][Main.this.counterOutputStringTime] = Double.toString(reactionTime);
                                Main.this.counterOutputStringTime++;
                                Main.this.timeStart = (double) System.currentTimeMillis();
                                Main.this.timerCounter++;
                                if (Main.this.n < 19) {
                                    Main.this.n = Main.this.n + 1;
                                } else {
                                    Main.this.n = 0;
                                }

                                Object var4 = null;

                                try {
                                    new FileInputStream(picture);
                                    Main.this.inputNextString = picture;
                                } catch (FileNotFoundException var12) {
                                    var12.printStackTrace();
                                }

                                Image image = new Image(this.getClass().getClassLoader().getResourceAsStream(picture));
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

                                    for (int i = 0; i < 70; ++i) {
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

                                canChange = false;
                            }
                        }
                    });
                }
                primaryStage.show();
            }
        }
    }


    public void goToNextImage(String path, Stage primaryStage) {

    }

    public static void main(String[] args) {
        launch(args);
    }

    public static void randomize(String[] files) {
        List<String> filesList = Arrays.asList(files);
        Collections.shuffle(filesList);
        filesList.toArray(files);
    }

    public static void randomizeArrays(String[][] files) {
        List<String[]> filesList = Arrays.asList(files);
        Collections.shuffle(filesList);
        filesList.toArray(files);
    }
}

