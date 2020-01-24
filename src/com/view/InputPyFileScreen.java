package com.view;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Hashtable;

import com.bin.PyTokens;
import com.bin.Token;
import com.rsc.*;

public class InputPyFileScreen extends JFrame {

    private JLabel inputLabel;
    private JLabel lexerLabel;
    private JPanel mainPanel;
    private JFileChooser chooser;
    private JButton btnChooser;
    private JButton btnAnalyzer;
    private JButton btnAnalyzer2;
    private JTextArea textArea;
    private JTextArea textArea2;
    private FileReader pythonFile;
    private LexerAnal lexerAnal;
    private JTable tokenTable;

    private Dimension screenSize = new Dimension(950, 500);
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

        btnChooser = new JButton();
        btnChooser.setText("Open a File");
        btnChooser.setBounds(175, 25, 150, 30);
        btnChooser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int returnVal = chooser.showOpenDialog(InputPyFileScreen.this);

                if (returnVal == JFileChooser.APPROVE_OPTION) {

                    File file = chooser.getSelectedFile();
                    System.out.println("Command accepted: " + file);
                    try {
                        pythonFile = new FileReader(file.getAbsolutePath());
                        textArea.read(new BufferedReader(pythonFile), null);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                } else {
                    System.out.println("Command cancelled.");
                }
            }
        });

        lexerLabel = new JLabel();
        lexerLabel.setText("Lexer functions");
        lexerLabel.setBounds(490, 25, 150, 30);

        btnAnalyzer = new JButton();
        btnAnalyzer.setText("Lexer Analyze");
        btnAnalyzer.setBounds(600, 25, 150, 30);
        btnAnalyzer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pythonFile == null) {
                    JOptionPane.showMessageDialog(null, "Choose file first", "Input Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                File file = chooser.getSelectedFile();
                try {
                    lexerAnal = new LexerAnal(new FileReader(file.getAbsoluteFile()), true);
                    PyTokens token;
                    while ((token = lexerAnal.yylex()) != null)
                        System.out.print(lexerAnal.yytext());
                    String result = lexerAnal.getReviewString();
                    textArea2.setText(result);
                    lexerAnal.printReview();
                    System.out.println(lexerAnal.getPyTokensTable());
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
        });

        btnAnalyzer2 = new JButton();
        btnAnalyzer2.setText("Show Tokens");
        btnAnalyzer2.setBounds(765, 25, 150, 30);
        btnAnalyzer2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (lexerAnal == null) {
                    JOptionPane.showMessageDialog(null, "Need Lexer analyze first", "Lexer Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                DefaultTableModel model = (DefaultTableModel) tokenTable.getModel();
                Object newRow[] = new Object[PyTokens.values().length];

                Hashtable pyTokenTable = lexerAnal.getPyTokensTable();

                for (int i = 0; i < PyTokens.values().length ; i++) {
                    newRow[i] = pyTokenTable.get(PyTokens.values()[i]);
                }

                model.addRow(newRow);


            }
        });

        textArea = new JTextArea(5, 20);
        JScrollPane scrollPane = new JScrollPane(textArea);
        textArea.setWrapStyleWord(true);
        textArea.setLineWrap(true);
        textArea.setEditable(false);
        scrollPane.setBounds(5, 80, 450, 200);

        textArea2 = new JTextArea(5, 20);
        JScrollPane scrollPane2 = new JScrollPane(textArea2);
        textArea2.setWrapStyleWord(true);
        textArea2.setLineWrap(true);
        textArea2.setEditable(false);
        scrollPane2.setBounds(490, 80, 450, 200);

        chooser = new JFileChooser(userDirLocation);
        chooser.setFileFilter(new FileNameExtensionFilter("Python files", "py"));
        chooser.setBounds(200, 25, 400, 400);


        PyTokens[] tokens = PyTokens.values();
        String columns[] = new String[PyTokens.values().length];
        String rows[][] = {{"0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0"}};
        for (int i = 0; i < tokens.length; i++) {
            columns[i] = tokens[i].toString();
        }
        TableModel dataModel2 = new DefaultTableModel(rows, columns);


        tokenTable = new JTable();
        tokenTable.setModel(dataModel2);
        JScrollPane scrollPane3 = new JScrollPane(tokenTable);
        scrollPane3.setBounds(5, 350, 935, 75);


        mainPanel.add(inputLabel);
        mainPanel.add(lexerLabel);
//        mainPanel.add(chooser);
        mainPanel.add(btnChooser);
        mainPanel.add(btnAnalyzer);
        mainPanel.add(btnAnalyzer2);
        mainPanel.add(scrollPane);
        mainPanel.add(scrollPane2);
        mainPanel.add(scrollPane3);

        this.setContentPane(mainPanel);

    }

    public static void main(String[] args) {
        InputPyFileScreen opfs = new InputPyFileScreen();
        opfs.setVisible(true);
    }


}
