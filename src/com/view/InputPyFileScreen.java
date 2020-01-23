package com.view;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class InputPyFileScreen extends JFrame implements ActionListener {

    private JLabel inputLabel;
    private JPanel mainPanel;
    private JFileChooser chooser;
    private JButton btnChooser;
    private JTextArea textArea;


    private Dimension screenSize = new Dimension(600, 800);
    private String userDirLocation = System.getProperty("user.dir");

    public InputPyFileScreen() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Input File Screen");
        this.setSize(screenSize);

        this.setLocationRelativeTo(null);
        this.setResizable(false);

        this.initComp();
    }


    private void initComp() {
        mainPanel = new JPanel();
        mainPanel.setLayout(null);

        inputLabel = new JLabel();
        inputLabel.setText("Input your Python file");
        inputLabel.setBounds(25, 25, 150, 30);
        inputLabel.setVisible(true);

        btnChooser = new JButton();
        btnChooser.setText("Open a File");
        btnChooser.setBounds(175, 25, 150, 30);
        btnChooser.addActionListener(this::actionPerformed);

        textArea = new JTextArea(5, 20);
        JScrollPane scrollPane = new JScrollPane(textArea);
        textArea.setWrapStyleWord(true);
        textArea.setLineWrap(true);
        textArea.setEditable(false);
        scrollPane.setBounds(5, 80, 580, 580);

        chooser = new JFileChooser(userDirLocation);
        chooser.setFileFilter(new FileNameExtensionFilter("Python files", "py"));
        chooser.setBounds(200, 25, 400, 400);

        mainPanel.add(inputLabel);
//        mainPanel.add(chooser);
        mainPanel.add(btnChooser);
        mainPanel.add(scrollPane);


        this.setContentPane(mainPanel);

    }

    public static void main(String[] args) {
        InputPyFileScreen opfs = new InputPyFileScreen();
        opfs.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnChooser) {
            int returnVal = chooser.showOpenDialog(InputPyFileScreen.this);

            if (returnVal == JFileChooser.APPROVE_OPTION) {

                File file = chooser.getSelectedFile();
                System.out.println("Command accepted: " + file);
                try {
                    textArea.read(new BufferedReader(new FileReader(file.getAbsolutePath())), null);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            } else {
                System.out.println("Command cancelled.");
            }

        }
    }
}
