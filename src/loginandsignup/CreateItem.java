
package loginandsignup;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;


public class CreateItem extends javax.swing.JFrame {

   
    public CreateItem() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ItemName = new javax.swing.JTextField();
        ItemPrice = new javax.swing.JTextField();
        ItemDescription = new javax.swing.JTextField();
        UpdateBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ItemId = new javax.swing.JTextField();
        DeleteBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Item");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 0));
        jLabel2.setText("Create Item");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Item Name              :");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Item Price               :");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Item Description    :");

        ItemName.setBackground(new java.awt.Color(204, 204, 204));
        ItemName.setForeground(new java.awt.Color(0, 0, 0));

        ItemPrice.setBackground(new java.awt.Color(204, 204, 204));
        ItemPrice.setForeground(new java.awt.Color(0, 0, 0));
        ItemPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemPriceActionPerformed(evt);
            }
        });

        ItemDescription.setBackground(new java.awt.Color(204, 204, 204));
        ItemDescription.setForeground(new java.awt.Color(0, 0, 0));

        UpdateBtn.setBackground(new java.awt.Color(255, 255, 255));
        UpdateBtn.setForeground(new java.awt.Color(0, 0, 0));
        UpdateBtn.setText("Update");
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });

        saveBtn.setBackground(new java.awt.Color(255, 255, 255));
        saveBtn.setForeground(new java.awt.Color(0, 0, 0));
        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Item Id                     :");

        ItemId.setBackground(new java.awt.Color(204, 204, 204));
        ItemId.setForeground(new java.awt.Color(0, 0, 0));
        ItemId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemIdActionPerformed(evt);
            }
        });

        DeleteBtn.setBackground(new java.awt.Color(255, 255, 255));
        DeleteBtn.setForeground(new java.awt.Color(0, 0, 0));
        DeleteBtn.setText("Delete");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(176, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(106, 106, 106))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(UpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ItemPrice)
                            .addComponent(ItemDescription)
                            .addComponent(ItemName)
                            .addComponent(ItemId, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE))))
                .addGap(57, 57, 57))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ItemId, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(ItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ItemPrice))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ItemDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveBtn)
                    .addComponent(DeleteBtn))
                .addContainerGap(114, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ItemPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ItemPriceActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        System.out.println("Save btn clicked");
        String Item_Name, Item_Price, Item_Description,query;
        String SUrl,SUser,SPass;
        SUrl ="jdbc:mysql://localhost:3306/javaitemsdatabase";
        SUser = "root";
        SPass = "";
         try{
             Class.forName("com.mysql.cj.jdbc.Driver");
             Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
             Statement st =con.createStatement();
             if("".equals(ItemName.getText())){
                 JOptionPane.showMessageDialog(new JFrame(),    "Item Name is required", "Error",
                         JOptionPane.ERROR_MESSAGE);
             }else if("".equals(ItemPrice.getText())){
                 JOptionPane.showMessageDialog(new JFrame(),    "Item Price is required", "Error",
                         JOptionPane.ERROR_MESSAGE);
             }else if("".equals(ItemDescription.getText())){
                 JOptionPane.showMessageDialog(new JFrame(),    "Item Description  is required", "Error",
                         JOptionPane.ERROR_MESSAGE);
             }else{
             Item_Name = ItemName.getText();
             Item_Price = ItemPrice.getText();
             Item_Description = ItemDescription.getText(); 
             //System.out.println(Password);
             
             query = "INSERT INTO items(Item_Name,Item_Price,Item_Description)"+
                    "VALUES('"+Item_Name+"','"+Item_Price+"','"+Item_Description+"')";
            
            st.execute(query);
            ItemName.setText("");
            ItemPrice.setText("");
            ItemDescription.setText("");
            showMessageDialog(null, "New Item has been added successfully!");
            }
         }catch(Exception e){
             System.out.println("Error!=" + e.getMessage());
         
         }
             
    }//GEN-LAST:event_saveBtnActionPerformed

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
        System.out.println("Update btn clicked");
        String Id,Item_Name, Item_Price, Item_Description,query;
        String SUrl,SUser,SPass;
        SUrl ="jdbc:mysql://localhost:3306/javaitemsdatabase";
        SUser = "root";
        SPass = "";
         try{
             Class.forName("com.mysql.cj.jdbc.Driver");
             Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
             Statement st =con.createStatement();
             if("".equals(ItemName.getText())){
                 JOptionPane.showMessageDialog(new JFrame(),    "Item Name is required", "Error",
                         JOptionPane.ERROR_MESSAGE);
             }else if("".equals(ItemPrice.getText())){
                 JOptionPane.showMessageDialog(new JFrame(),    "Item Price is required", "Error",
                         JOptionPane.ERROR_MESSAGE);
             }else if("".equals(ItemDescription.getText())){
                 JOptionPane.showMessageDialog(new JFrame(),    "Item Description  is required", "Error",
                         JOptionPane.ERROR_MESSAGE);
             }else{
             Id = ItemId.getText();
             Item_Name = ItemName.getText();
             Item_Price = ItemPrice.getText();
             Item_Description = ItemDescription.getText(); 
             //System.out.println(Password);
             
           query = "UPDATE items SET Item_Name = '" + Item_Name + "', Item_Price = '" + Item_Price + "', Item_Description = '" + Item_Description + "' WHERE Id = '" + Id + "'";

            st.executeUpdate(query);
            ItemName.setText("");
            ItemPrice.setText("");
            ItemDescription.setText("");
            showMessageDialog(null, "Item has been Updated successfully!");
            }
         }catch(Exception e){
             System.out.println("Error!=" + e.getMessage());
         
         }
    }//GEN-LAST:event_UpdateBtnActionPerformed

    private boolean fieldsAreEmpty() {
    return ItemName.getText().isEmpty() || ItemPrice.getText().isEmpty() || ItemDescription.getText().isEmpty();
}

    private void ItemIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ItemIdActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
    System.out.println("Delete btn clicked");
    String Id = ItemId.getText();
    String SUrl = "jdbc:mysql://localhost:3306/javaitemsdatabase";
    String SUser = "root";
    String SPass = "";
         try{
             Class.forName("com.mysql.cj.jdbc.Driver");
             Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
             Statement st =con.createStatement();
             
             if (Id.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Item Id is required", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
             
            String query = "DELETE FROM items WHERE id = ?";

            try (PreparedStatement pstmt = con.prepareStatement(query)) {
                int itemId = Integer.parseInt(Id);
                pstmt.setInt(1, itemId);
                pstmt.executeUpdate();
                showMessageDialog(this, "Item has been Deleted successfully!");
                ItemName.setText("");
                ItemPrice.setText("");
                ItemDescription.setText("");
            }
        }
         }catch(Exception e){
             System.out.println("Error!=" + e.getMessage());
         
         }
    }//GEN-LAST:event_DeleteBtnActionPerformed

    
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
            java.util.logging.Logger.getLogger(CreateItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateItem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JTextField ItemDescription;
    private javax.swing.JTextField ItemId;
    private javax.swing.JTextField ItemName;
    private javax.swing.JTextField ItemPrice;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton saveBtn;
    // End of variables declaration//GEN-END:variables
}
