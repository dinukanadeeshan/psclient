/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.redonz.pms.client.view.item;

import com.redonz.pms.client.connector.ServerConnector;
import com.redonz.pms.client.others.Validation;
import com.redonz.pms.client.view.category.AddCategoryForm;
import com.redonz.pms.client.view.customer.AddCustomerForm;
import com.redonz.pms.common.model.Category;
import com.redonz.pms.common.model.Item;
import com.redonz.pms.common.model.ObserverTO;
import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author Nadeeshan
 */
public class AddItemForm extends javax.swing.JDialog {

    private JDialog dialog;
    private ArrayList<String> addedBarcode = new ArrayList<>();

    /**
     * Creates new form AddItemForm
     */
    public AddItemForm(java.awt.Dialog parent, boolean modal, String barcode) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        dialog = (JDialog) parent;
        barcodeTextField.setText(barcode);
        categoryComboBox.requestFocus();

        try {
            fillCategoryComboBox();
        } catch (NotBoundException | MalformedURLException | RemoteException | SQLException | ClassNotFoundException ex) {
            Logger.getLogger(AddItemForm.class.getName()).log(Level.SEVERE, null, ex);
            if (ex.getMessage().contains("Connection refused to host")) {
                JOptionPane.showMessageDialog(this, "Connection has corrupt or no server started....", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AddCustomerForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AddCustomerForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * Creates new form AddItemForm
     */
    public AddItemForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        try {
            fillCategoryComboBox();
        } catch (NotBoundException | MalformedURLException | RemoteException | SQLException | ClassNotFoundException ex) {
            Logger.getLogger(AddItemForm.class.getName()).log(Level.SEVERE, null, ex);
            if (ex.getMessage().contains("Connection refused to host")) {
                JOptionPane.showMessageDialog(this, "Connection has corrupt or no server started....", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AddCustomerForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AddCustomerForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        barcodeLabel = new javax.swing.JLabel();
        barcodeTextField = new javax.swing.JTextField();
        categoryLabel = new javax.swing.JLabel();
        categoryComboBox = new javax.swing.JComboBox();
        newCategoryButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        descriptionTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        reOrderLevelTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(247, 247, 247));

        titleLabel.setBackground(new java.awt.Color(255, 255, 255));
        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(102, 102, 102));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("New Item");
        titleLabel.setOpaque(true);

        saveButton.setBackground(new java.awt.Color(102, 204, 255));
        saveButton.setText("Save");
        saveButton.setEnabled(false);
        saveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                saveButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                saveButtonMouseExited(evt);
            }
        });
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        cancelButton.setBackground(new java.awt.Color(255, 153, 153));
        cancelButton.setText("Cancel");
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelButtonMouseExited(evt);
            }
        });

        barcodeLabel.setText("Barcode :");

        categoryLabel.setText("Category :");

        categoryComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        newCategoryButton.setText("Add New");
        newCategoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newCategoryButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Description :");

        jLabel2.setText("Re-Order-Level :");

        reOrderLevelTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                reOrderLevelTextFieldKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(descriptionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reOrderLevelTextField)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(barcodeLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(categoryLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(barcodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(categoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(newCategoryButton)))))
                .addGap(0, 29, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(barcodeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(barcodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newCategoryButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descriptionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reOrderLevelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(cancelButton))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveButtonMouseEntered
        saveButton.setBackground(new Color(102, 204, 255));
    }//GEN-LAST:event_saveButtonMouseEntered

    private void saveButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveButtonMouseExited
        saveButton.setBackground(new Color(153, 204, 255));
    }//GEN-LAST:event_saveButtonMouseExited

    private void cancelButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseEntered
        cancelButton.setBackground(new Color(255, 102, 102));
    }//GEN-LAST:event_cancelButtonMouseEntered

    private void cancelButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseExited
        cancelButton.setBackground(new Color(255, 153, 153));
    }//GEN-LAST:event_cancelButtonMouseExited

    private void newCategoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newCategoryButtonActionPerformed
        new AddCategoryForm(this, true).setVisible(true);
    }//GEN-LAST:event_newCategoryButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        String barcode = barcodeTextField.getText();
        if (!addedBarcode.contains(barcode)) {
            String categoryId = ((Category) categoryComboBox.getSelectedItem()).getCategoryId();
            String desc = descriptionTextField.getText();
            String reOrderLevel = reOrderLevelTextField.getText();
            Item item = new Item(barcode, categoryId, desc, Double.parseDouble(reOrderLevel));
            try {
                boolean res = ServerConnector.getServerConnector().getItemController().saveItem(item);
                if (res) {
                    JOptionPane.showMessageDialog(this, "Saved...");
                    if (dialog instanceof UpdateStockForm) {
                        ((UpdateStockForm) dialog).setItemDetaills(barcode);
                        dispose();
                        return;
                    }
                    refresh();
                }

            } catch (NotBoundException | MalformedURLException | RemoteException | SQLException | ClassNotFoundException ex) {
                Logger.getLogger(AddItemForm.class.getName()).log(Level.SEVERE, null, ex);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(AddCustomerForm.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(AddCustomerForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "This item already added....");
        }

    }//GEN-LAST:event_saveButtonActionPerformed

    private void reOrderLevelTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_reOrderLevelTextFieldKeyReleased
        Validation.validatePriceText(reOrderLevelTextField);
        setSaveButtonEnable();
    }//GEN-LAST:event_reOrderLevelTextFieldKeyReleased

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
            java.util.logging.Logger.getLogger(AddItemForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddItemForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddItemForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddItemForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddItemForm dialog = new AddItemForm(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel barcodeLabel;
    private javax.swing.JTextField barcodeTextField;
    private javax.swing.JButton cancelButton;
    private javax.swing.JComboBox categoryComboBox;
    private javax.swing.JLabel categoryLabel;
    private javax.swing.JTextField descriptionTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton newCategoryButton;
    private javax.swing.JTextField reOrderLevelTextField;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables

    public void setCategory(String categoryId) {
        try {
            fillCategoryComboBox();
            for (int i = 0; i < categoryComboBox.getItemCount(); i++) {
                if (categoryComboBox.getSelectedItem().toString().startsWith(categoryId)) {
                    categoryComboBox.setSelectedIndex(i);
                    break;
                }
            }
        } catch (NotBoundException | MalformedURLException | RemoteException | SQLException | ClassNotFoundException ex) {
            Logger.getLogger(AddItemForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AddCustomerForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AddCustomerForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void fillCategoryComboBox() throws NotBoundException, MalformedURLException, RemoteException, SQLException, ClassNotFoundException, FileNotFoundException, IOException {
        ArrayList<Category> allCategories = ServerConnector.getServerConnector().getCategoryController().getAllCategories();
        categoryComboBox.removeAllItems();
        for (Category category : allCategories) {
            categoryComboBox.addItem(category);
        }
    }

    private void refresh() {
        barcodeTextField.setText("");
        descriptionTextField.setText("");
        reOrderLevelTextField.setText("");
        saveButton.setEnabled(false);
        barcodeTextField.requestFocus();
        try {
            fillCategoryComboBox();
        } catch (NotBoundException | MalformedURLException | RemoteException | SQLException | ClassNotFoundException ex) {
            Logger.getLogger(AddItemForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AddCustomerForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AddCustomerForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void setSaveButtonEnable() {
        boolean b = barcodeTextField.getText().isEmpty() || descriptionTextField.getText().isEmpty() || reOrderLevelTextField.getText().isEmpty();
        saveButton.setEnabled(!b);
    }

    public void notifyChange(ObserverTO observerTO) {
        Object obj = observerTO.getObj();
        if (obj instanceof Item) {
            Item item = (Item) obj;
            JOptionPane.showMessageDialog(this, item + "  " + observerTO.getAction() + " ...");
            addedBarcode.add(item.getBarcode());
        }
    }
}
