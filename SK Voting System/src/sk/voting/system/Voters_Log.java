/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.voting.system;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Voters_Log extends javax.swing.JFrame {
    public static String user;
    public static String pass;
    Connection conn;
    PreparedStatement pstmt;
    Statement stmt;
    ResultSet rs;
    int xmouse;
    int ymouse;
    int attempt = 1;
    String url = ("jdbc:ucanaccess://D:\\SK Voting System\\Voting Database.accdb");
    
    public Voters_Log() {
        initComponents();
        terms_cond.setVisible(false);
        done.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_login = new javax.swing.JPanel();
        back = new javax.swing.JButton();
        exit = new javax.swing.JLabel();
        mini = new javax.swing.JLabel();
        drag = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        btn_agree = new javax.swing.JRadioButton();
        btn_read = new javax.swing.JButton();
        btn_login = new javax.swing.JButton();
        errorbox = new javax.swing.JTextField();
        terms_cond = new javax.swing.JLabel();
        done = new javax.swing.JButton();
        login_back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back.setFont(new java.awt.Font("Arial Rounded MT Bold", 2, 13)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("Back to Start Page");
        back.setBorder(null);
        back.setBorderPainted(false);
        back.setContentAreaFilled(false);
        back.setFocusable(false);
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backMouseExited(evt);
            }
        });
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        pnl_login.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 130, -1));

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
        pnl_login.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, 30, 30));

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
        pnl_login.add(mini, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 0, 30, 30));

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
        pnl_login.add(drag, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 30));

        username.setBackground(new java.awt.Color(225, 223, 217));
        username.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        username.setBorder(null);
        username.setOpaque(false);
        pnl_login.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 320, 160, 30));

        password.setBackground(new java.awt.Color(225, 223, 217));
        password.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        password.setBorder(null);
        password.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pnl_login.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 410, 160, 20));

        btn_agree.setBackground(new java.awt.Color(255, 255, 255));
        btn_agree.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        btn_agree.setText("Agree to Terms and Condition");
        btn_agree.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_agreeKeyPressed(evt);
            }
        });
        pnl_login.add(btn_agree, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 450, -1, -1));

        btn_read.setBackground(new java.awt.Color(28, 139, 139));
        btn_read.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        btn_read.setText("Read Terms and Condition");
        btn_read.setBorder(null);
        btn_read.setBorderPainted(false);
        btn_read.setContentAreaFilled(false);
        btn_read.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_readMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_readMouseExited(evt);
            }
        });
        btn_read.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_readActionPerformed(evt);
            }
        });
        pnl_login.add(btn_read, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 480, -1, -1));

        btn_login.setBackground(new java.awt.Color(255, 255, 102));
        btn_login.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btn_login.setText("Login");
        btn_login.setBorder(null);
        btn_login.setBorderPainted(false);
        btn_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_loginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_loginMouseExited(evt);
            }
        });
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        pnl_login.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 530, 240, 40));

        errorbox.setEditable(false);
        errorbox.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        errorbox.setForeground(new java.awt.Color(255, 0, 0));
        errorbox.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        errorbox.setBorder(null);
        errorbox.setOpaque(false);
        errorbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                errorboxActionPerformed(evt);
            }
        });
        pnl_login.add(errorbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 500, 300, 30));

        terms_cond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sk/voting/system/conditions.jpg"))); // NOI18N
        pnl_login.add(terms_cond, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        done.setBackground(new java.awt.Color(43, 87, 154));
        done.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        done.setForeground(new java.awt.Color(255, 255, 255));
        done.setText("CLOSE");
        done.setBorder(null);
        done.setBorderPainted(false);
        done.setContentAreaFilled(false);
        done.setOpaque(true);
        done.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                doneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                doneMouseExited(evt);
            }
        });
        done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneActionPerformed(evt);
            }
        });
        pnl_login.add(done, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 400, 30));

        login_back.setForeground(new java.awt.Color(0, 0, 255));
        login_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sk/voting/system/userIMG.jpg"))); // NOI18N
        login_back.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(142, 182, 189)));
        pnl_login.add(login_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

        getContentPane().add(pnl_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        login();
    }
    
    public void login(){    
        user = username.getText();
        pass = password.getText();
        boolean ag = btn_agree.isSelected();
            
        if(user.isEmpty() && pass.isEmpty() || user.isEmpty() || pass.isEmpty()){
            errorbox.setText("Please fill all the fields!");
        } 
        
        else if(ag == false){
            errorbox.setText("Please agree!");
        } 
        
        else{
            try{
                conn = DriverManager.getConnection(url);
                String query = ("SELECT * FROM `Voters Information` WHERE `Username` = ? AND `Password` = ?");
                pstmt = conn.prepareStatement(query);
                pstmt.setString(1,user);
                pstmt.setString(2,pass);
                rs = pstmt.executeQuery();
                if(rs.next()){
                    this.dispose();
                    Voters_Menu um = new Voters_Menu(user, pass);
                    um.setVisible(true);
                } 
                else{
                    errorbox.setText("Invalid Username or Password");
                     username.setText(null);
                     password.setText(null);
                     
                }
                 if(attempt == 3){
                        JOptionPane.showMessageDialog(null, "To many attempts. System will shutdown!");
                        System.exit(0);
                    }else{
                    attempt ++;
                    }
            }
            
            catch(HeadlessException | SQLException e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_btn_loginActionPerformed

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

    private void dragMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xmouse ,y - ymouse);
    }//GEN-LAST:event_dragMouseDragged

    private void dragMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragMousePressed
        xmouse = evt.getX();
        ymouse = evt.getY();
    }//GEN-LAST:event_dragMousePressed

    private void btn_loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_loginMouseEntered
        btn_login.setBackground(new Color(255,203,49));
    }//GEN-LAST:event_btn_loginMouseEntered

    private void btn_loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_loginMouseExited
        btn_login.setBackground(new Color(255,255,102));
    }//GEN-LAST:event_btn_loginMouseExited

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        new Start_Page().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseEntered
        back.setOpaque(true);
        back.setBackground(new Color(255,243,49));
        back.setForeground(Color.black);
    }//GEN-LAST:event_backMouseEntered

    private void backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseExited
        back.setOpaque(false);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
    }//GEN-LAST:event_backMouseExited

    private void doneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doneMouseEntered
        done.setOpaque(true);
        done.setBackground(new Color(255,203,49));
        done.setForeground(Color.black);
    }//GEN-LAST:event_doneMouseEntered

    private void doneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doneMouseExited
        done.setOpaque(true);
        done.setBackground(new Color (43,87,154));
        done.setForeground(Color.white);
    }//GEN-LAST:event_doneMouseExited

    private void doneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneActionPerformed
        terms_cond.setVisible(false);
        done.setVisible(false);
    }//GEN-LAST:event_doneActionPerformed

    private void btn_readActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_readActionPerformed
        terms_cond.setVisible(true);
        done.setVisible(true);
    }//GEN-LAST:event_btn_readActionPerformed

    private void btn_readMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_readMouseEntered
        btn_read.setOpaque(true);
        btn_read.setBackground(new Color(255,203,49));
    }//GEN-LAST:event_btn_readMouseEntered

    private void btn_readMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_readMouseExited
        btn_read.setOpaque(false);
        btn_read.setBackground(Color.white);
    }//GEN-LAST:event_btn_readMouseExited

    private void btn_agreeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_agreeKeyPressed
           if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            login();
        }
    }//GEN-LAST:event_btn_agreeKeyPressed

    private void errorboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_errorboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_errorboxActionPerformed

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
            java.util.logging.Logger.getLogger(Voters_Log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
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
            new Voters_Log().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JRadioButton btn_agree;
    private javax.swing.JButton btn_login;
    private javax.swing.JButton btn_read;
    private javax.swing.JButton done;
    private javax.swing.JLabel drag;
    private javax.swing.JTextField errorbox;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel login_back;
    private javax.swing.JLabel mini;
    private javax.swing.JPasswordField password;
    private javax.swing.JPanel pnl_login;
    private javax.swing.JLabel terms_cond;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
