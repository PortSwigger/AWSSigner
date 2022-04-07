/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netspi.awssigner.view;

import com.netspi.awssigner.model.AssumeRoleProfile;
import com.netspi.awssigner.model.CommandProfile;
import com.netspi.awssigner.model.Profile;
import com.netspi.awssigner.model.StaticCredentialsProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author jkarnes
 */
public class AddProfileDialog extends javax.swing.JDialog {

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        profileTypeButtonGroup = new javax.swing.ButtonGroup();
        AddProfileTitleLabel = new javax.swing.JLabel();
        profileNameLabel = new javax.swing.JLabel();
        profileNameTextField = new FormattedHintTextField(true);
        profileNameDescriptionLabel = new javax.swing.JLabel();
        profileTypeLabel = new javax.swing.JLabel();
        staticCredentialsRadioButton = new javax.swing.JRadioButton();
        assumeRoleRadioButton = new javax.swing.JRadioButton();
        commandRadioButton = new javax.swing.JRadioButton();
        okButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        errorTextLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Signing Profile");

        AddProfileTitleLabel.setFont(AddProfileTitleLabel.getFont().deriveFont(AddProfileTitleLabel.getFont().getStyle() | java.awt.Font.BOLD, 15));
        AddProfileTitleLabel.setForeground(new java.awt.Color(255, 102, 51));
        AddProfileTitleLabel.setText("Add Profile");

        profileNameLabel.setFont(profileNameLabel.getFont().deriveFont(profileNameLabel.getFont().getStyle() | java.awt.Font.BOLD, profileNameLabel.getFont().getSize()+1));
        profileNameLabel.setLabelFor(profileNameTextField);
        profileNameLabel.setText("Profile Name:");
        profileNameLabel.setToolTipText("The name of the new profile.");

        profileNameTextField.setToolTipText("The name of the new profile.");

        profileNameDescriptionLabel.setText("The profile name must be unique.");

        profileTypeLabel.setFont(profileTypeLabel.getFont().deriveFont(profileTypeLabel.getFont().getStyle() | java.awt.Font.BOLD, profileTypeLabel.getFont().getSize()+1));
        profileTypeLabel.setText("Profile Type:");
        profileTypeLabel.setToolTipText("The command to be executed to fetch credentials.");

        profileTypeButtonGroup.add(staticCredentialsRadioButton);
        staticCredentialsRadioButton.setFont(staticCredentialsRadioButton.getFont());
        staticCredentialsRadioButton.setText("Static Credentials");

        profileTypeButtonGroup.add(assumeRoleRadioButton);
        assumeRoleRadioButton.setFont(assumeRoleRadioButton.getFont());
        assumeRoleRadioButton.setText("AssumeRole");

        profileTypeButtonGroup.add(commandRadioButton);
        commandRadioButton.setFont(commandRadioButton.getFont());
        commandRadioButton.setText("Command");

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        errorTextLabel.setFont(errorTextLabel.getFont().deriveFont(errorTextLabel.getFont().getStyle() | java.awt.Font.BOLD));
        errorTextLabel.setForeground(new java.awt.Color(255, 0, 0));
        errorTextLabel.setText("The profile name already exists");
        errorTextLabel.setVisible(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AddProfileTitleLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(profileNameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(profileNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(profileTypeLabel)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(assumeRoleRadioButton)
                                            .addComponent(staticCredentialsRadioButton)
                                            .addComponent(commandRadioButton)
                                            .addComponent(profileNameDescriptionLabel)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(okButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cancelButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(errorTextLabel)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AddProfileTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(profileNameLabel)
                    .addComponent(profileNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(profileNameDescriptionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(profileTypeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(staticCredentialsRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(assumeRoleRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(commandRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okButton)
                    .addComponent(cancelButton)
                    .addComponent(errorTextLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        //Get the user's choice of name
        String profileName = profileNameTextField.getText();

        //Check if profile name was provided
        if (profileName == null || profileName.isEmpty()) {
            errorTextLabel.setText("The profile name is required");
            errorTextLabel.setVisible(true);
            return;
        }

        //Check if we already have a profile with this name. If so, bail out.
        if (existingProfileNames.contains(profileName)) {
            errorTextLabel.setText("The profile name already exists");
            errorTextLabel.setVisible(true);
            return;
        }

        //Get the type and create response object
        if (staticCredentialsRadioButton.isSelected()) {
            this.result = new StaticCredentialsProfile(profileName);
        } else if (assumeRoleRadioButton.isSelected()) {
            this.result = new AssumeRoleProfile(profileName);
        } else if (commandRadioButton.isSelected()) {
            this.result = new CommandProfile(profileName);
        } else {
            //No button selected
            errorTextLabel.setText("The profile type is required");
            errorTextLabel.setVisible(true);
            return;
        }

        //Close the dialog
        setVisible(false);
        dispose();

    }//GEN-LAST:event_okButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        //Close the dialog
        setVisible(false);
        dispose();       
    }//GEN-LAST:event_cancelButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            AddProfileDialog dialog = new AddProfileDialog(new javax.swing.JFrame(), true, new ArrayList<>());
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddProfileTitleLabel;
    private javax.swing.JRadioButton assumeRoleRadioButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JRadioButton commandRadioButton;
    private javax.swing.JLabel errorTextLabel;
    private javax.swing.JButton okButton;
    private javax.swing.JLabel profileNameDescriptionLabel;
    private javax.swing.JLabel profileNameLabel;
    public javax.swing.JTextField profileNameTextField;
    private javax.swing.ButtonGroup profileTypeButtonGroup;
    private javax.swing.JLabel profileTypeLabel;
    private javax.swing.JRadioButton staticCredentialsRadioButton;
    // End of variables declaration//GEN-END:variables
    //START CUSTOM (NON-GENERATED) CODE

    private Profile result = null;
    private final List<String> existingProfileNames;

    /**
     * Creates new form AddProfileDialog
     */
    public AddProfileDialog(java.awt.Frame parent, boolean modal, List<String> existingProfileNames) {
        super(parent, modal);
        this.existingProfileNames = existingProfileNames;
        initComponents();
        BurpUIComponentCustomizer.applyBurpStyling(this);
    }

    /**
     * Shows the dialog and gets the user's choice
     *
     * @return The result object or null if the dialog was closed/cancelled
     */
    public Optional<Profile> showDialog() {
        setVisible(true);
        return Optional.ofNullable(result);
    }
}


