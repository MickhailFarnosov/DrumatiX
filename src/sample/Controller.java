package sample;
import javafx.collections.ObservableIntegerArray;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
import java.util.Arrays;
import java.util.Objects;

public class Controller {
    public static int[][] seq = {
            {1, 0, 0, 4},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 3, 0},
            {0, 2, 0, 0},
            {0, 0, 0, 0},
            {1, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 3, 0},
            {1, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 2, 0, 0},
            {1, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 3, 0}};
    public static boolean[] conv = {false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false};
    public TextField bpm,cycles;
    public Button edit;
    boolean bp1, bp2, bp3, bp4, bp5, bp6, bp7, bp8, bp9, bp10, bp11, bp12, bp13, bp14, bp15, bp16, play, et = false;
    public static int ts=0;
    @FXML
    private RadioButton l1 ,l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16;

    @FXML
    public static String bpmf,cyclesf;

    private int play() throws Exception {
        File file1 = new File("src//resources//bd.wav");
        Clip clip = AudioSystem.getClip();
        AudioInputStream ais = AudioSystem.
                getAudioInputStream(file1);
        clip.open(ais);

        File file2 = new File("src//resources//sn.wav");
        Clip clip2 = AudioSystem.getClip();
        AudioInputStream ais2 = AudioSystem.
                getAudioInputStream(file2);
        clip2.open(ais2);

        File file3 = new File("src//resources//hic.wav");
        Clip clip3 = AudioSystem.getClip();
        AudioInputStream ais3 = AudioSystem.
                getAudioInputStream(file3);
        clip3.open(ais3);

        File file4 = new File("src//resources//hio.wav");
        Clip clip4 = AudioSystem.getClip();
        AudioInputStream ais4 = AudioSystem.
                getAudioInputStream(file4);
        clip4.open(ais4);

        bpmf = bpm.getText();
        cyclesf = cycles.getText();
        int sleep = Integer.parseInt(bpmf);
        int cc = Integer.parseInt(cyclesf);
        sleep = ((60000 / sleep) / 4);
            for (int c = 0; c < cc; c++) {
                for (int i = 0; i < seq.length; i++) {
                    for (int j = 0; j < 4; j++) {
                        if (Objects.equals(seq[i][j], 1)) {
                            clip.stop();
                            clip.setFramePosition(0);
                            clip.start();
                        }
                        if (Objects.equals(seq[i][j], 2)) {
                            clip2.stop();
                            clip2.setFramePosition(0);
                            clip2.start();
                        }
                        if (Objects.equals(seq[i][j], 3)) {
                            clip3.stop();
                            clip3.setFramePosition(0);
                            clip3.start();
                        }
                        if (Objects.equals(seq[i][j], 4)) {
                            clip4.stop();
                            clip4.setFramePosition(0);
                            clip4.start();
                        }
                    }
                    Thread.sleep(sleep);
                }
            }
        return sleep;
    }

    private int imports(){
        int d = 0;
        l1.setSelected(conv[0]);
        l2.setSelected(conv[1]);
        l3.setSelected(conv[2]);
        l4.setSelected(conv[3]);
        l5.setSelected(conv[4]);
        l6.setSelected(conv[5]);
        l7.setSelected(conv[6]);
        l8.setSelected(conv[7]);
        l9.setSelected(conv[8]);
        l10.setSelected(conv[9]);
        l11.setSelected(conv[10]);
        l12.setSelected(conv[11]);
        l13.setSelected(conv[12]);
        l14.setSelected(conv[13]);
        l15.setSelected(conv[14]);
        l16.setSelected(conv[15]);
        return d;
    }
    private int deletes(){
        int d = 0;
        l1.setSelected(false);
        l2.setSelected(false);
        l3.setSelected(false);
        l4.setSelected(false);
        l5.setSelected(false);
        l6.setSelected(false);
        l7.setSelected(false);
        l8.setSelected(false);
        l9.setSelected(false);
        l10.setSelected(false);
        l11.setSelected(false);
        l12.setSelected(false);
        l13.setSelected(false);
        l14.setSelected(false);
        l15.setSelected(false);
        l16.setSelected(false);
        return d;
    }
    private int cleans(){
        int d = 0;
        for (int q = 0;q<seq.length;q++){
            conv[q] = false;
        }
        return d;
    }
    private int enables(){
        int d = 0;
        l1.setDisable(false);
        l2.setDisable(false);
        l3.setDisable(false);
        l4.setDisable(false);
        l5.setDisable(false);
        l6.setDisable(false);
        l7.setDisable(false);
        l8.setDisable(false);
        l9.setDisable(false);
        l10.setDisable(false);
        l11.setDisable(false);
        l12.setDisable(false);
        l13.setDisable(false);
        l14.setDisable(false);
        l15.setDisable(false);
        l16.setDisable(false);
        return d;
    }
    private int disables(){
        int d = 0;
        l1.setDisable(true);
        l2.setDisable(true);
        l3.setDisable(true);
        l4.setDisable(true);
        l5.setDisable(true);
        l6.setDisable(true);
        l7.setDisable(true);
        l8.setDisable(true);
        l9.setDisable(true);
        l10.setDisable(true);
        l11.setDisable(true);
        l12.setDisable(true);
        l13.setDisable(true);
        l14.setDisable(true);
        l15.setDisable(true);
        l16.setDisable(true);
        return d;
    }
    private int buffs(){
        int d = 0;
        if (l1.isSelected()) conv[0] = true;
        if (!l1.isSelected()) conv[0] = false;
        if (l2.isSelected()) conv[1] = true;
        if (!l2.isSelected()) conv[1] = false;
        if (l3.isSelected()) conv[2] = true;
        if (!l3.isSelected()) conv[2] = false;
        if (l4.isSelected()) conv[3] = true;
        if (!l4.isSelected()) conv[3] = false;
        if (l5.isSelected()) conv[4] = true;
        if (!l5.isSelected()) conv[4] = false;
        if (l6.isSelected()) conv[5] = true;
        if (!l6.isSelected()) conv[5] = false;
        if (l7.isSelected()) conv[6] = true;
        if (!l7.isSelected()) conv[6] = false;
        if (l8.isSelected()) conv[7] = true;
        if (!l8.isSelected()) conv[7] = false;
        if (l9.isSelected()) conv[8] = true;
        if (!l9.isSelected()) conv[8] = false;
        if (l10.isSelected()) conv[9] = true;
        if (!l10.isSelected()) conv[9] = false;
        if (l11.isSelected()) conv[10] = true;
        if (!l11.isSelected()) conv[10] = false;
        if (l12.isSelected()) conv[11] = true;
        if (!l12.isSelected()) conv[11] = false;
        if (l13.isSelected()) conv[12] = true;
        if (!l13.isSelected()) conv[12] = false;
        if (l14.isSelected()) conv[13] = true;
        if (!l14.isSelected()) conv[13] = false;
        if (l15.isSelected()) conv[14] = true;
        if (!l15.isSelected()) conv[14] = false;
        if (l16.isSelected()) conv[15] = true;
        if (!l16.isSelected()) conv[15] = false;
        return d;
    }
    private int converts(){
        int d = 0;
        if (ts==0){
            ts=17;
        }
            for (int r = 0;r<seq.length;r++){
                if (conv[r]) {
                    if (ts<17) seq[r][ts - 1] = ts;
                    if (ts==17) ts=0;
                }
                if (!conv[r]&ts<17) seq[r][ts-1] = 0;
        }
        return d;
    }

    @FXML
    private void click1(ActionEvent event) throws Exception {
        if (et) {
            cleans();
            int seqline[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
            for (int l = 0; l < seq.length;l++) {
                seqline[l] = seq[l][0];
            }
            for (int k = 0; k<seq.length; k++) {
                if (seqline[k]>0){
                    conv[k]=true;
                }
            }
            imports();
            enables();
            ts = 1;
        }
        if (!et) {
            File file1 = new File("src//resources//bd.wav");
            Clip clip = AudioSystem.getClip();
            AudioInputStream ais = AudioSystem.
                    getAudioInputStream(file1);
            clip.open(ais);
            clip.start();
        }
    }

    @FXML
    private void click2(ActionEvent event) throws Exception {

        if (et) {
            cleans();
            int seqline[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
            for (int l = 0; l < seq.length;l++) {
                seqline[l] = seq[l][1];
            }
            for (int k = 0; k<seq.length; k++) {
                if (seqline[k]>0){
                    conv[k]=true;
                }
            }
            imports();
            enables();
            ts=2;
        }
        if (!et) {
            File file2 = new File("src//resources//sn.wav");
            Clip clip2 = AudioSystem.getClip();
            AudioInputStream ais2 = AudioSystem.
                    getAudioInputStream(file2);
            clip2.open(ais2);
            clip2.start();
        }
    }

    @FXML
    private void click3(ActionEvent event) throws Exception {
            if (et) {
                cleans();
                int seqline[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
                for (int l = 0; l < seq.length; l++) {
                    seqline[l] = seq[l][2];
                }
                for (int k = 0; k < seq.length; k++) {
                    if (seqline[k] > 0) {
                        conv[k] = true;
                    }
                }
                imports();
                enables();
                ts=3;
            }
            if (!et) {
                File file3 = new File("src//resources//hic.wav");
                Clip clip3 = AudioSystem.getClip();
                AudioInputStream ais3 = AudioSystem.
                        getAudioInputStream(file3);
                clip3.open(ais3);
                clip3.start();
            }
        }

    @FXML
    private void click4(ActionEvent event) throws Exception {
        if (et) {
            cleans();
            int seqline[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
            for (int l = 0; l < seq.length;l++) {
                seqline[l] = seq[l][3];
            }
            for (int k = 0; k<seq.length; k++) {
                if (seqline[k]>0){
                    conv[k]=true;
                }
            }
            imports();
            enables();
            ts=4;
        };
        if (!et) {
            File file4 = new File("src//resources//hio.wav");
            Clip clip4 = AudioSystem.getClip();
            AudioInputStream ais4 = AudioSystem.
                    getAudioInputStream(file4);
            clip4.open(ais4);
            clip4.start();
        }
    }

    @FXML
    public void edit(ActionEvent actionEvent) {
        if (et) {
            buffs();
            converts();
            et = false;
            edit.setText("Edit Track");
            cleans();
            deletes();
            disables();
        }
        else {
            cleans();
            et = true;
            edit.setText("Save");
        }

    }

    @FXML
    private void playb(ActionEvent event) throws Exception {
        if (!play) {
            play = true;
            play();
        }
        else {
            play = false;
        }
    }
}