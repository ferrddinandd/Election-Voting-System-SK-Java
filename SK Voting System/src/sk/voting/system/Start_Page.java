/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.voting.system;

import java.awt.Color;

/**
 *
 * @author Zulu
 */
public class Start_Page extends javax.swing.JFrame {
    int xmouse;
    int ymouse;
    
    public Start_Page() {
        initComponents();    
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Start_Panel = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        mini = new javax.swing.JLabel();
        drag = new javax.swing.JLabel();
        admin = new javax.swing.JButton();
        user = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Start_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exit.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("   X");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
        });
        Start_Panel.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 30, 30));

        mini.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        mini.setForeground(new java.awt.Color(255, 255, 255));
        mini.setText("  __");
        mini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miniMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                miniMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                miniMouseExited(evt);
            }
        });
        Start_Panel.add(mini, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 30, 30));

        drag.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                dragMouseDragged(evt);
            }
        });
        drag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dragMousePressed(evt);
            }
        });
        Start_Panel.add(drag, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 30));

        admin.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 48)); // NOI18N
        admin.setForeground(new java.awt.Color(255, 255, 255));
        admin.setText("ADMIN");
        admin.setBorder(null);
        admin.setBorderPainted(false);
        admin.setContentAreaFilled(false);
        admin.setFocusable(false);
        admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                adminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                adminMouseExited(evt);
            }
        });
        admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminActionPerformed(evt);
            }
        });
        Start_Panel.add(admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 290, 90));

        user.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 48)); // NOI18N
        user.setForeground(new java.awt.Color(255, 255, 255));
        user.setText("USER");
        user.setBorder(null);
        user.setBorderPainted(false);
        user.setContentAreaFilled(false);
        user.setFocusable(false);
        user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                userMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                userMouseExited(evt);
            }
        });
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        Start_Panel.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 290, 90));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sk/voting/system/startpageIMG.jpg"))); // NOI18N
        background.setToolTipText("");
        Start_Panel.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 590));

        getContentPane().add(Start_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 590));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        exit.setOpaque(true);
        exit.setBackground(Color.red);
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        exit.setOpaque(false);
        exit.setBackground(Color.black);
    }//GEN-LAST:event_exitMouseExited

    private void miniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniMouseClicked
        this.setState(Start_Page.ICONIFIED);
    }//GEN-LAST:event_miniMouseClicked

    private void miniMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniMouseEntered
        mini.setOpaque(true);
        mini.setBackground(Color.gray);
    }//GEN-LAST:event_miniMouseEntered

    private void miniMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniMouseExited
        mini.setOpaque(false);
        mini.setBackground(Color.black);
    }//GEN-LAST:event_miniMouseExited

    private void dragMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragMousePressed
        xmouse = evt.getX();
        ymouse = evt.getY();
    }//GEN-LAST:event_dragMousePressed

    private void dragMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xmouse ,y - ymouse);
    }//GEN-LAST:event_dragMouseDragged

    private void adminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminMouseEntered
        admin.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 70));
        admin.setForeground(new Color (255,203,49));
    }//GEN-LAST:event_adminMouseEntered

    private void adminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminMouseExited
        admin.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 48));
        admin.setForeground(new Color (255,255,255));
    }//GEN-LAST:event_adminMouseExited

    private void adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminActionPerformed
        new Admin_Log().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_adminActionPerformed

    private void userMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseEntered
        user.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 70));
        user.setForeground(new Color (255,203,49));
    }//GEN-LAST:event_userMouseEntered

    private void userMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseExited
        user.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 48));
        user.setForeground(new Color (255,255,255));
    }//GEN-LAST:event_userMouseExited

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        new Voters_Log().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_userActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Start_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Start_Page().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Start_Panel;
    private javax.swing.JButton admin;
    private javax.swing.JLabel background;
    private javax.swing.JLabel drag;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel mini;
    private javax.swing.JButton user;
    // End of variables declaration//GEN-END:variables

  
}
