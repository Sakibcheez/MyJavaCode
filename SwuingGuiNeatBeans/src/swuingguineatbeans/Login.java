
package swuingguineatbeans;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import javax.swing.JOptionPane;

/**
 *
 * @author SAKIB AHMED
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        UsernameField = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BtnCancel = new javax.swing.JButton();
        BtnLogin = new javax.swing.JButton();

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swuingguineatbeans/kashundi12.jpg"))); // NOI18N
        jLabel6.setMaximumSize(new java.awt.Dimension(700, 400));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 204, 204));
        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Kashundi Caffee");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 560, 50));

        UsernameField.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        UsernameField.setCaretColor(new java.awt.Color(255, 204, 255));
        UsernameField.setDisabledTextColor(new java.awt.Color(255, 204, 255));
        jPanel1.add(UsernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 240, 40));
        jPanel1.add(PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 240, 40));

        jLabel2.setBackground(new java.awt.Color(153, 153, 0));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("  Username ");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 190, 40));

        jLabel3.setBackground(new java.awt.Color(135, 181, 212));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 102));
        jLabel3.setText("  Password");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 190, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\SAKIB AHMED\\Desktop\\images.jpeg")); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, 50, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\SAKIB AHMED\\Desktop\\kashundi.png")); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, 50, 40));

        BtnCancel.setText("Cancel ");
        BtnCancel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 102)));
        BtnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelActionPerformed(evt);
            }
        });
        jPanel1.add(BtnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 110, 40));

        BtnLogin.setText("Login");
        BtnLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        BtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(BtnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 110, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 892, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelActionPerformed
       System.exit(0);
    }//GEN-LAST:event_BtnCancelActionPerformed
    
    int xx,xy; 
    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getXOnScreen();
        this.setLocation(x-xy, y-xy);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed
/*
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        for(double i =0.0; i<=1.0; i += 0.1){
        String s = i+"";
        float f = Float.valueOf(s);
        this.setOpacity(f);
        try{
         Thread.sleep(40);
        } catch(InterruptedException ex){
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex); 
        }
        }
    }//GEN-LAST:event_formWindowOpened
*/
    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
       PasswordField.setEchoChar((char)0);
       jLabel4.setVisible(false); 
       jLabel5.setVisible(true); 
    }//GEN-LAST:event_jLabel4MouseClicked

    private void BtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLoginActionPerformed
        
        if(isEmpty()){
        String uname = UsernameField.getText();
        String upass = String.valueOf(PasswordField.getPassword());
                if(uname.equals("admin") && upass.equals("admin")){
                Dashboard dashboard = new Dashboard();
                dashboard.setVisible(true);
                this.dispose();
                }
                else {
                    
                    JOptionPane.showMessageDialog(null, "Invalid user name or password","Warning",2);
                
                }
        }
    }//GEN-LAST:event_BtnLoginActionPerformed
    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt){
        
        PasswordField.setEchoChar('*');
       jLabel4.setVisible(true); 
       jLabel5.setVisible(false); 
 
 }
    public boolean isEmpty(){
        
        if(UsernameField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "User name is missing","Warning",2);
            return false; }
        if(String.valueOf(PasswordField.getPassword()).isEmpty())
        {
            JOptionPane.showMessageDialog(null, "PassWord is Missing","Warning",2);
            return false; }
        return true;
    }
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancel;
    private javax.swing.JButton BtnLogin;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JTextField UsernameField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
