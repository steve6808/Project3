/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3;

/**
 *
 * @author Joy P.
 * @author Steven B.
 */
 //Project 3 Search Engine UI


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
public class Project3 {
   private JFrame mainFrame;
   private JLabel headerLabel;
   private JLabel statusLabel;
   private JPanel controlPanel;

   public Project3(){
      prepareGUI();
   }

   public static void main(String[] args){
      Project3  Project3 = new Project3();      
      Project3.showTextFieldDemo();
   }

   private void prepareGUI(){
      mainFrame = new JFrame("Project 3 Sarch Engine UI");
      mainFrame.setSize(200,200);
      mainFrame.setLayout(new GridLayout(3, 1));
      mainFrame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      });    
      headerLabel = new JLabel("Search Test", JLabel.CENTER);        
      statusLabel = new JLabel("Search Results",JLabel.CENTER);    

      statusLabel.setSize(120,75);

      controlPanel = new JPanel();
      controlPanel.setLayout(new FlowLayout());

      mainFrame.add(headerLabel);
      mainFrame.add(controlPanel);
      mainFrame.add(statusLabel);
      mainFrame.setVisible(true);  
   }

   private void showTextFieldDemo(){
      headerLabel.setText("Search Engine"); 

      JLabel  searchLabel = new JLabel("search: ", JLabel.CENTER);
      final JTextField userText = new JTextField(10);
      final JTextField searchText = new JTextField(10);      

      JButton searchButton = new JButton("Look up");
      searchButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) { 
            String data = "Your Answser: " + userText.getText();
         }
      }); 
      controlPanel.add(searchLabel);       
      controlPanel.add(searchText);
      controlPanel.add(searchButton);
      mainFrame.setVisible(true);  
   }
}