/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.onlinereservationsystem.guiPages;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mycompany.onlinereservationsystem.service.ReservationService;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.util.List;
import javax.swing.JOptionPane;
import lombok.Data;

public class ReservationPage extends javax.swing.JFrame {

    private TrainList trainList;
    private ReservationService reservationService;
    private String userEmail;
    /**
     * Creates new form ReservationPage
     */
    public ReservationPage(String userEmail) {
        initComponents();
        populateComboBox();
        this.reservationService = new ReservationService();
        this.userEmail = userEmail;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        fromTextField = new javax.swing.JTextField();
        toLabel = new javax.swing.JLabel();
        toTextField = new javax.swing.JTextField();
        fromLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        dateTextField = new javax.swing.JTextField();
        trainNameLabel = new javax.swing.JLabel();
        trainListComboBox = new javax.swing.JComboBox<>();
        trainNumberLabel = new javax.swing.JLabel();
        trainNumberTextField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(978, 517));
        setMinimumSize(new java.awt.Dimension(978, 517));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Journey Details");

        toLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        toLabel.setText("To");

        fromLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        fromLabel.setText("From");

        dateLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        dateLabel.setText("Date");

        trainNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        trainNameLabel.setText("Train Name");

        trainListComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                trainListComboBoxItemStateChanged(evt);
            }
        });

        trainNumberLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        trainNumberLabel.setText("Train Number");

        trainNumberTextField.setEnabled(false);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setText("Book");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(265, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(259, 259, 259))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fromLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fromTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(trainNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(toLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(toTextField)
                            .addComponent(trainListComboBox, 0, 232, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(301, 301, 301)
                        .addComponent(trainNumberLabel)
                        .addGap(18, 18, 18)
                        .addComponent(trainNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fromLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fromTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(toLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(toTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addComponent(trainNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(trainNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(trainListComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addComponent(trainNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void trainListComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_trainListComboBoxItemStateChanged

        String trainName = trainListComboBox.getSelectedItem().toString();
        String trainNumber = "";
        for (Train train : trainList.getTrains()) {

            if (train.getName().equals(trainName)) {
                trainNumber = train.getNumber();
                break;
            }
        }
        
        if(!trainNumber.equals(""))
        trainNumberTextField.setText(trainNumber);
        
    }//GEN-LAST:event_trainListComboBoxItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        if(fromTextField.getText().equals("") || toTextField.getText().equals("") || dateTextField.getText().equals("") || trainListComboBox.getSelectedIndex() < 0){
            JOptionPane.showMessageDialog(null, "Please fill all the details", "INCOMPLETE DETAILS", JOptionPane.ERROR_MESSAGE);
        }
        else{
            
            String from = fromTextField.getText();
            String to = toTextField.getText();
            String date = dateTextField.getText();
            String trainName = trainListComboBox.getSelectedItem().toString();
            String trainNumber = trainNumberTextField.getText();
            
            String pnr = this.reservationService.bookTicket(from, to, date, trainName, trainNumber, userEmail);
            if(!pnr.equals("")){
                JOptionPane.showMessageDialog(null, "PNR No. : "+pnr, "TICKET BOOKED", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null, "Some error has occurred", "ERROR 404", JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ReservationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReservationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReservationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReservationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReservationPage("").setVisible(true);
            }
        });
    }

    private void populateComboBox() {

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            trainList = objectMapper.readValue(new File("C:\\Users\\ankit\\OneDrive\\Documents\\NetBeansProjects\\OnlineReservationSystem\\src\\main\\java\\com\\mycompany\\onlinereservationsystem\\trainsList.json"), TrainList.class);

            for (Train train : trainList.getTrains()) {
                this.trainListComboBox.addItem(train.getName());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dateLabel;
    private javax.swing.JTextField dateTextField;
    private javax.swing.JLabel fromLabel;
    private javax.swing.JTextField fromTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel toLabel;
    private javax.swing.JTextField toTextField;
    private javax.swing.JComboBox<String> trainListComboBox;
    private javax.swing.JLabel trainNameLabel;
    private javax.swing.JLabel trainNumberLabel;
    private javax.swing.JTextField trainNumberTextField;
    // End of variables declaration//GEN-END:variables

}

@Data
class TrainList {

    Train[] trains;
}

@Data
class Train {

    private String name;
    private String number;
}
