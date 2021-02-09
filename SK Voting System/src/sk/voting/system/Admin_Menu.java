/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.voting.system;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Zulu
 */
public class Admin_Menu extends javax.swing.JFrame {
    int xmouse;
    int ymouse;
    String url = ("jdbc:ucanaccess://D:\\SK Voting System\\Voting Database.accdb");
    Connection conn;
    Statement stmt;
    ResultSet rs;
    /**
     * Creates new form Admin_Menu
     */
   
    public Admin_Menu(){
        initComponents();
        search_info.setVisible(false);
        lbl_sch.setVisible(false);
        search_acc.setVisible(false);
        txt_2.setVisible(false);
        txt_3.setVisible(false);
        txt_4.setVisible(false);

        DefaultTableModel info_model = (DefaultTableModel) tb_info.getModel();
        ((DefaultTableModel)tb_info.getModel()).setRowCount(0);
        
        DefaultTableModel acc_model = (DefaultTableModel) tb_acc.getModel();
        ((DefaultTableModel)tb_acc.getModel()).setRowCount(0);
        
        DefaultTableModel cnclr_model = (DefaultTableModel) tb_councilor.getModel();
        ((DefaultTableModel)tb_councilor.getModel()).setRowCount(0);
        
        DefaultTableModel chrman_model = (DefaultTableModel) tb_chairman.getModel();
        ((DefaultTableModel)tb_chairman.getModel()).setRowCount(0);
        
        int rows = 0;
        try{
            conn = DriverManager.getConnection(url);
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM `Voters Information`");
            while(rs.next()){
                String A = rs.getString("Full Name");
                String B = rs.getString("Address");
                String C = rs.getString("Age");
                String D = rs.getString("Sex");
                String E = rs.getString("Voters No");
                String F = rs.getString("Username");
                String G = rs.getString("Password");
                String H = rs.getString("Status");
                String info_arr[] = {E, A, B, C, D};
                String acc_arr[] = {E, H, A, F, G};
                info_model.insertRow(rows, info_arr);
                acc_model.insertRow(rows, acc_arr);
                rows = rs.getRow();
            }
        }catch(SQLException e){
            System.out.println(e);
        }  
        
        int rows1 = 0;
        try{
            conn = DriverManager.getConnection(url);
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM `QRY_RankingCM`");
            while(rs.next()){
                String A = rs.getString("Full Name");
                String B = rs.getString("Position");
                String C = rs.getString("Age");
                String D = rs.getString("Sex");
                String E = rs.getString("Vote Count");
                String F = rs.getString("Rank");
                String chrman_arr[] = {A, B, C, D, E, F};
                chrman_model.insertRow(rows1, chrman_arr);
                rows1 = rs.getRow();
            }
        }catch(SQLException e){
            System.out.println(e);
        }  
        
        int rows2 = 0;
        try{
            conn = DriverManager.getConnection(url);
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM `QRY_RankingCC`");
            while(rs.next()){
                String A = rs.getString("Full Name");
                String B = rs.getString("Position");
                String C = rs.getString("Age");
                String D = rs.getString("Sex");
                String E = rs.getString("Vote Count");
                String F = rs.getString("Rank");
                String cnclr_arr[] = {A, B, C, D, E, F};
                cnclr_model.insertRow(rows2, cnclr_arr);
                rows2 = rs.getRow();
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        
        DefaultTableCellRenderer centerRender = new DefaultTableCellRenderer();
        centerRender.setHorizontalAlignment(SwingConstants.CENTER);
        tb_acc.setDefaultRenderer(String.class, centerRender);
        tb_info.setDefaultRenderer(String.class, centerRender);
        tb_chairman.setDefaultRenderer(String.class, centerRender);
        tb_councilor.setDefaultRenderer(String.class, centerRender);
        
        TableCellRenderer info_renderer = tb_info.getTableHeader().getDefaultRenderer();
        JLabel label_info = (JLabel) info_renderer;
        label_info.setHorizontalAlignment(JLabel.CENTER);
        tb_info.setRowHeight(tb_info.getRowHeight() + 13);
        
        TableCellRenderer acc_renderer = tb_acc.getTableHeader().getDefaultRenderer();
        JLabel label_acc = (JLabel) acc_renderer;
        label_acc.setHorizontalAlignment(JLabel.CENTER);
        tb_acc.setRowHeight(tb_acc.getRowHeight() + 13);
        
        TableCellRenderer chperson_renderer = tb_chairman.getTableHeader().getDefaultRenderer();
        JLabel label_chperson = (JLabel) chperson_renderer;
        label_chperson.setHorizontalAlignment(JLabel.CENTER);
        tb_chairman.setRowHeight(tb_chairman.getRowHeight() + 11);
        
        TableCellRenderer cnclr_renderer = tb_councilor.getTableHeader().getDefaultRenderer();
        JLabel label_cnclr = (JLabel) cnclr_renderer;
        label_cnclr.setHorizontalAlignment(JLabel.CENTER);
        tb_councilor.setRowHeight(tb_councilor.getRowHeight() + 11);
        tb_councilor.setDefaultRenderer(String.class, centerRender);
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_admenu = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        mini = new javax.swing.JLabel();
        pnl_top = new javax.swing.JPanel();
        pnl_bottom = new javax.swing.JPanel();
        pnl_right = new javax.swing.JPanel();
        pnl_left = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        txt_2 = new javax.swing.JTextField();
        txt_3 = new javax.swing.JTextField();
        txt_4 = new javax.swing.JTextField();
        txt_1 = new javax.swing.JTextField();
        btn_registration = new javax.swing.JButton();
        btn_candidates = new javax.swing.JButton();
        btn_voters = new javax.swing.JButton();
        btn_logout = new javax.swing.JButton();
        btn_account = new javax.swing.JButton();
        search_info = new javax.swing.JTextField();
        lbl_sch = new javax.swing.JLabel();
        search_acc = new javax.swing.JTextField();
        main_tabbed = new javax.swing.JTabbedPane();
        pnl1 = new javax.swing.JPanel();
        lbl10 = new javax.swing.JLabel();
        btn_agree = new javax.swing.JButton();
        lbl9 = new javax.swing.JLabel();
        pnl2 = new javax.swing.JPanel();
        chrman_sp = new javax.swing.JScrollPane();
        tb_chairman = new javax.swing.JTable();
        counclr_sp = new javax.swing.JScrollPane();
        tb_councilor = new javax.swing.JTable();
        lbl8 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        lbl5 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        pnl3 = new javax.swing.JPanel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        info_sp = new javax.swing.JScrollPane();
        tb_info = new javax.swing.JTable();
        pnl4 = new javax.swing.JPanel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        acc_sp = new javax.swing.JScrollPane();
        tb_acc = new javax.swing.JTable();
        lbl7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_admenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        pnl_admenu.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, 30, 30));

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
        pnl_admenu.add(mini, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, 30, 30));

        pnl_top.setBackground(new java.awt.Color(43, 87, 154));
        pnl_top.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnl_topMouseDragged(evt);
            }
        });
        pnl_top.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnl_topMousePressed(evt);
            }
        });
        pnl_admenu.add(pnl_top, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 30));

        pnl_bottom.setBackground(new java.awt.Color(43, 87, 154));
        pnl_admenu.add(pnl_bottom, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 699, 790, 1));

        pnl_right.setBackground(new java.awt.Color(43, 87, 154));
        pnl_admenu.add(pnl_right, new org.netbeans.lib.awtextra.AbsoluteConstraints(999, 20, 1, 682));

        pnl_left.setBackground(new java.awt.Color(43, 87, 154));
        pnl_left.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Leelawadee UI", 0, 26)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("ADMIN MENU");
        pnl_left.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 170, 60));

        txt_2.setEditable(false);
        txt_2.setBackground(new java.awt.Color(255, 203, 49));
        txt_2.setBorder(null);
        pnl_left.add(txt_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 10, 30));

        txt_3.setEditable(false);
        txt_3.setBackground(new java.awt.Color(255, 203, 49));
        txt_3.setBorder(null);
        pnl_left.add(txt_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 10, 30));

        txt_4.setEditable(false);
        txt_4.setBackground(new java.awt.Color(255, 203, 49));
        txt_4.setBorder(null);
        pnl_left.add(txt_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 10, 30));

        txt_1.setEditable(false);
        txt_1.setBackground(new java.awt.Color(255, 203, 49));
        txt_1.setBorder(null);
        pnl_left.add(txt_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 10, 30));

        btn_registration.setBackground(new java.awt.Color(25, 88, 194));
        btn_registration.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        btn_registration.setForeground(new java.awt.Color(255, 255, 255));
        btn_registration.setText("Registration");
        btn_registration.setBorder(null);
        btn_registration.setBorderPainted(false);
        btn_registration.setContentAreaFilled(false);
        btn_registration.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_registration.setDefaultCapable(false);
        btn_registration.setFocusable(false);
        btn_registration.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_registrationMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_registrationMouseExited(evt);
            }
        });
        btn_registration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrationActionPerformed(evt);
            }
        });
        pnl_left.add(btn_registration, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 210, 50));

        btn_candidates.setBackground(new java.awt.Color(25, 88, 194));
        btn_candidates.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        btn_candidates.setForeground(new java.awt.Color(255, 255, 255));
        btn_candidates.setText("Candidates / Ranking");
        btn_candidates.setBorder(null);
        btn_candidates.setBorderPainted(false);
        btn_candidates.setContentAreaFilled(false);
        btn_candidates.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_candidates.setDefaultCapable(false);
        btn_candidates.setFocusable(false);
        btn_candidates.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_candidatesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_candidatesMouseExited(evt);
            }
        });
        btn_candidates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_candidatesActionPerformed(evt);
            }
        });
        pnl_left.add(btn_candidates, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 210, 50));

        btn_voters.setBackground(new java.awt.Color(25, 88, 194));
        btn_voters.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        btn_voters.setForeground(new java.awt.Color(255, 255, 255));
        btn_voters.setText("Voters Information");
        btn_voters.setBorder(null);
        btn_voters.setBorderPainted(false);
        btn_voters.setContentAreaFilled(false);
        btn_voters.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_voters.setDefaultCapable(false);
        btn_voters.setFocusable(false);
        btn_voters.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_votersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_votersMouseExited(evt);
            }
        });
        btn_voters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_votersActionPerformed(evt);
            }
        });
        pnl_left.add(btn_voters, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 210, 50));

        btn_logout.setBackground(new java.awt.Color(0, 130, 130));
        btn_logout.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        btn_logout.setForeground(new java.awt.Color(255, 255, 255));
        btn_logout.setText("Log out");
        btn_logout.setBorder(null);
        btn_logout.setBorderPainted(false);
        btn_logout.setContentAreaFilled(false);
        btn_logout.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_logout.setDefaultCapable(false);
        btn_logout.setFocusable(false);
        btn_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_logoutMouseExited(evt);
            }
        });
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });
        pnl_left.add(btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 670, 210, 30));

        btn_account.setBackground(new java.awt.Color(25, 88, 194));
        btn_account.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        btn_account.setForeground(new java.awt.Color(255, 255, 255));
        btn_account.setText("Account and Status");
        btn_account.setBorder(null);
        btn_account.setBorderPainted(false);
        btn_account.setContentAreaFilled(false);
        btn_account.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_account.setDefaultCapable(false);
        btn_account.setFocusable(false);
        btn_account.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_accountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_accountMouseExited(evt);
            }
        });
        btn_account.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_accountActionPerformed(evt);
            }
        });
        pnl_left.add(btn_account, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 210, 50));

        search_info.setBackground(new java.awt.Color(245, 245, 245));
        search_info.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        search_info.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        search_info.setBorder(null);
        search_info.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search_infoKeyReleased(evt);
            }
        });
        pnl_left.add(search_info, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 190, 30));

        lbl_sch.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbl_sch.setForeground(new java.awt.Color(255, 255, 255));
        lbl_sch.setText("Search");
        pnl_left.add(lbl_sch, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 50, 20));

        search_acc.setBackground(new java.awt.Color(245, 245, 245));
        search_acc.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        search_acc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        search_acc.setBorder(null);
        search_acc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search_accKeyReleased(evt);
            }
        });
        pnl_left.add(search_acc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 190, 30));

        pnl_admenu.add(pnl_left, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 700));

        main_tabbed.setEnabled(false);

        pnl1.setBackground(new java.awt.Color(255, 255, 255));
        pnl1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sk/voting/system/terms.jpg"))); // NOI18N
        lbl10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnl1.add(lbl10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 740, 540));

        btn_agree.setBackground(new java.awt.Color(0, 0, 0));
        btn_agree.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        btn_agree.setText("Fill up Application Form");
        btn_agree.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_agree.setContentAreaFilled(false);
        btn_agree.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_agree.setDefaultCapable(false);
        btn_agree.setFocusable(false);
        btn_agree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_agreeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_agreeMouseExited(evt);
            }
        });
        btn_agree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agreeActionPerformed(evt);
            }
        });
        pnl1.add(btn_agree, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 630, 190, 30));

        lbl9.setFont(new java.awt.Font("Century Gothic", 0, 48)); // NOI18N
        lbl9.setForeground(new java.awt.Color(51, 51, 51));
        lbl9.setText("WELCOME");
        pnl1.add(lbl9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        main_tabbed.addTab("1", pnl1);

        pnl2.setBackground(new java.awt.Color(255, 255, 255));
        pnl2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tb_chairman.setAutoCreateRowSorter(true);
        tb_chairman.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        tb_chairman.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "FULL NAME", "POSITION", "AGE", "SEX", "VOTES", "RANK"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_chairman.setSelectionBackground(new java.awt.Color(255, 255, 102));
        tb_chairman.setSelectionForeground(new java.awt.Color(0, 0, 0));
        chrman_sp.setViewportView(tb_chairman);
        if (tb_chairman.getColumnModel().getColumnCount() > 0) {
            tb_chairman.getColumnModel().getColumn(0).setResizable(false);
            tb_chairman.getColumnModel().getColumn(0).setPreferredWidth(250);
            tb_chairman.getColumnModel().getColumn(1).setResizable(false);
            tb_chairman.getColumnModel().getColumn(1).setPreferredWidth(150);
            tb_chairman.getColumnModel().getColumn(2).setResizable(false);
            tb_chairman.getColumnModel().getColumn(2).setPreferredWidth(50);
            tb_chairman.getColumnModel().getColumn(3).setResizable(false);
            tb_chairman.getColumnModel().getColumn(3).setPreferredWidth(100);
            tb_chairman.getColumnModel().getColumn(4).setResizable(false);
            tb_chairman.getColumnModel().getColumn(4).setPreferredWidth(60);
            tb_chairman.getColumnModel().getColumn(5).setResizable(false);
            tb_chairman.getColumnModel().getColumn(5).setPreferredWidth(50);
        }

        pnl2.add(chrman_sp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 750, 110));

        tb_councilor.setAutoCreateRowSorter(true);
        tb_councilor.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        tb_councilor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "FULL NAME", "POSITION", "AGE", "SEX", "VOTES", "RANK"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_councilor.setSelectionBackground(new java.awt.Color(255, 255, 102));
        tb_councilor.setSelectionForeground(new java.awt.Color(0, 0, 0));
        counclr_sp.setViewportView(tb_councilor);
        if (tb_councilor.getColumnModel().getColumnCount() > 0) {
            tb_councilor.getColumnModel().getColumn(0).setResizable(false);
            tb_councilor.getColumnModel().getColumn(0).setPreferredWidth(250);
            tb_councilor.getColumnModel().getColumn(1).setResizable(false);
            tb_councilor.getColumnModel().getColumn(1).setPreferredWidth(150);
            tb_councilor.getColumnModel().getColumn(2).setResizable(false);
            tb_councilor.getColumnModel().getColumn(2).setPreferredWidth(50);
            tb_councilor.getColumnModel().getColumn(3).setResizable(false);
            tb_councilor.getColumnModel().getColumn(3).setPreferredWidth(100);
            tb_councilor.getColumnModel().getColumn(4).setResizable(false);
            tb_councilor.getColumnModel().getColumn(4).setPreferredWidth(60);
            tb_councilor.getColumnModel().getColumn(5).setResizable(false);
            tb_councilor.getColumnModel().getColumn(5).setPreferredWidth(50);
        }

        pnl2.add(counclr_sp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 750, 290));

        lbl8.setFont(new java.awt.Font("Leelawadee UI", 0, 36)); // NOI18N
        lbl8.setForeground(new java.awt.Color(51, 51, 51));
        lbl8.setText("SK CANDIDATES LIST");
        pnl2.add(lbl8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 340, 40));

        txt1.setEditable(false);
        txt1.setBackground(new java.awt.Color(102, 102, 102));
        txt1.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        txt1.setForeground(new java.awt.Color(255, 255, 255));
        txt1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt1.setText("SK Councilor");
        txt1.setBorder(null);
        pnl2.add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 760, 30));

        txt2.setEditable(false);
        txt2.setBackground(new java.awt.Color(102, 102, 102));
        txt2.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        txt2.setForeground(new java.awt.Color(255, 255, 255));
        txt2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt2.setText("SK Chairman");
        txt2.setBorder(null);
        pnl2.add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 760, 30));

        lbl5.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        lbl5.setForeground(new java.awt.Color(51, 51, 51));
        lbl5.setText("Click any of the table's title to refresh the list.");
        pnl2.add(lbl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 770, 20));

        lbl6.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        lbl6.setForeground(new java.awt.Color(51, 51, 51));
        lbl6.setText("The names below are the offcial list of registered candidates of Barangay Mabilog na Bundok , Purok Ilaya,Lobo Batangas for the 2020 SK Elections.");
        pnl2.add(lbl6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 770, 20));

        main_tabbed.addTab("2", pnl2);
        pnl2.getAccessibleContext().setAccessibleName("tab2");

        pnl3.setBackground(new java.awt.Color(255, 255, 255));
        pnl3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl1.setFont(new java.awt.Font("Leelawadee UI", 0, 36)); // NOI18N
        lbl1.setForeground(new java.awt.Color(51, 51, 51));
        lbl1.setText("VOTERS' PERSONAL INFORMATION");
        pnl3.add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 580, 40));

        lbl2.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        lbl2.setForeground(new java.awt.Color(51, 51, 51));
        lbl2.setText("The names below are the offcial list of registered voters of Barangay Mabilog na Bundok , Purok Ilaya,Lobo Batangas for the 2020 SK Elections.");
        pnl3.add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 760, 40));

        info_sp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        info_sp.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        info_sp.setOpaque(false);

        tb_info.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        tb_info.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NO.", "FULL NAME", "ADDRESS", "AGE", "GENDER"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_info.setSelectionBackground(new java.awt.Color(255, 255, 102));
        tb_info.setSelectionForeground(new java.awt.Color(51, 51, 51));
        tb_info.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tb_info.getTableHeader().setReorderingAllowed(false);
        info_sp.setViewportView(tb_info);
        if (tb_info.getColumnModel().getColumnCount() > 0) {
            tb_info.getColumnModel().getColumn(0).setResizable(false);
            tb_info.getColumnModel().getColumn(0).setPreferredWidth(20);
            tb_info.getColumnModel().getColumn(1).setResizable(false);
            tb_info.getColumnModel().getColumn(1).setPreferredWidth(200);
            tb_info.getColumnModel().getColumn(2).setResizable(false);
            tb_info.getColumnModel().getColumn(2).setPreferredWidth(250);
            tb_info.getColumnModel().getColumn(3).setResizable(false);
            tb_info.getColumnModel().getColumn(3).setPreferredWidth(10);
            tb_info.getColumnModel().getColumn(4).setResizable(false);
            tb_info.getColumnModel().getColumn(4).setPreferredWidth(30);
        }

        pnl3.add(info_sp, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 750, 540));

        main_tabbed.addTab("3", pnl3);
        pnl3.getAccessibleContext().setAccessibleName("tab3");

        pnl4.setBackground(new java.awt.Color(255, 255, 255));
        pnl4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl3.setFont(new java.awt.Font("Leelawadee UI", 0, 36)); // NOI18N
        lbl3.setForeground(new java.awt.Color(51, 51, 51));
        lbl3.setText("VOTERS' ACCOUNT AND STATUS");
        pnl4.add(lbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 540, 40));

        lbl4.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        lbl4.setForeground(new java.awt.Color(51, 51, 51));
        lbl4.setText("The names below are the offcial list of registered voters of Barangay Mabilog na Bundok , Purok Ilaya,Lobo Batangas for the 2020 SK Elections.");
        pnl4.add(lbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 760, 20));

        acc_sp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        acc_sp.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        acc_sp.setOpaque(false);

        tb_acc.setAutoCreateRowSorter(true);
        tb_acc.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        tb_acc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "VOTERS NO", "STATUS", "FULL NAME", "USERNAME", "PASSWORD"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_acc.setSelectionBackground(new java.awt.Color(255, 255, 102));
        tb_acc.setSelectionForeground(new java.awt.Color(51, 51, 51));
        tb_acc.getTableHeader().setReorderingAllowed(false);
        acc_sp.setViewportView(tb_acc);
        if (tb_acc.getColumnModel().getColumnCount() > 0) {
            tb_acc.getColumnModel().getColumn(0).setResizable(false);
            tb_acc.getColumnModel().getColumn(0).setPreferredWidth(10);
            tb_acc.getColumnModel().getColumn(1).setResizable(false);
            tb_acc.getColumnModel().getColumn(1).setPreferredWidth(10);
            tb_acc.getColumnModel().getColumn(2).setResizable(false);
            tb_acc.getColumnModel().getColumn(2).setPreferredWidth(200);
            tb_acc.getColumnModel().getColumn(3).setResizable(false);
            tb_acc.getColumnModel().getColumn(3).setPreferredWidth(50);
            tb_acc.getColumnModel().getColumn(4).setResizable(false);
            tb_acc.getColumnModel().getColumn(4).setPreferredWidth(50);
        }

        pnl4.add(acc_sp, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 750, 540));

        lbl7.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        lbl7.setForeground(new java.awt.Color(51, 51, 51));
        lbl7.setText("Click any of the table's title to refresh the list.");
        pnl4.add(lbl7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 770, 20));

        main_tabbed.addTab("4", pnl4);

        pnl_admenu.add(main_tabbed, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 790, 700));
        main_tabbed.getAccessibleContext().setAccessibleName("main_tab");

        getContentPane().add(pnl_admenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 700));

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

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        new Start_Page().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_candidatesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_candidatesActionPerformed
        main_tabbed.setSelectedIndex(1);
        search_info.setVisible(false);
        search_acc.setVisible(false);
        lbl_sch.setVisible(false);
        txt_2.setVisible(true);
        txt_1.setVisible(false);
        txt_3.setVisible(false);
        txt_4.setVisible(false);
    }//GEN-LAST:event_btn_candidatesActionPerformed

    private void btn_registrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrationActionPerformed
        main_tabbed.setSelectedIndex(0);
        search_info.setVisible(false);
        search_acc.setVisible(false);
        lbl_sch.setVisible(false);
        txt_1.setVisible(true);
        txt_2.setVisible(false);
        txt_3.setVisible(false);
        txt_4.setVisible(false);
    }//GEN-LAST:event_btn_registrationActionPerformed

    private void btn_votersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_votersActionPerformed
        main_tabbed.setSelectedIndex(2);
        search_info.setVisible(true);
        search_acc.setVisible(false);
        lbl_sch.setVisible(true);
        txt_3.setVisible(true);
        txt_1.setVisible(false);
        txt_2.setVisible(false);
        txt_4.setVisible(false);
    }//GEN-LAST:event_btn_votersActionPerformed

    private void btn_registrationMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_registrationMouseEntered
        btn_registration.setOpaque(true);
        btn_registration.setForeground(Color.black);
        btn_registration.setBackground(new Color(255,255,102));
    }//GEN-LAST:event_btn_registrationMouseEntered

    private void btn_registrationMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_registrationMouseExited
        btn_registration.setOpaque(false);
        btn_registration.setForeground(Color.white);
        btn_registration.setBackground(Color.black);
    }//GEN-LAST:event_btn_registrationMouseExited

    private void btn_candidatesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_candidatesMouseEntered
        btn_candidates.setOpaque(true);
        btn_candidates.setForeground(Color.black);
        btn_candidates.setBackground(new Color(255,255,102));
    }//GEN-LAST:event_btn_candidatesMouseEntered

    private void btn_candidatesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_candidatesMouseExited
        btn_candidates.setOpaque(false);
        btn_candidates.setForeground(Color.white);
        btn_candidates.setBackground(Color.black);
    }//GEN-LAST:event_btn_candidatesMouseExited

    private void btn_votersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_votersMouseEntered
        btn_voters.setOpaque(true);
        btn_voters.setForeground(Color.black);
        btn_voters.setBackground(new Color(255,255,102));
    }//GEN-LAST:event_btn_votersMouseEntered

    private void btn_votersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_votersMouseExited
        btn_voters.setOpaque(false);
        btn_voters.setForeground(Color.white);
        btn_voters.setBackground(Color.black);
    }//GEN-LAST:event_btn_votersMouseExited

    private void btn_logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseEntered
        btn_logout.setOpaque(true);
        btn_logout.setBackground(Color.red);
    }//GEN-LAST:event_btn_logoutMouseEntered

    private void btn_logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseExited
        btn_logout.setOpaque(false);
        btn_logout.setBackground(Color.black);
    }//GEN-LAST:event_btn_logoutMouseExited

    private void btn_accountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_accountMouseEntered
        btn_account.setOpaque(true);
        btn_account.setForeground(Color.black);
        btn_account.setBackground(new Color(255,255,102));
    }//GEN-LAST:event_btn_accountMouseEntered

    private void btn_accountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_accountMouseExited
        btn_account.setOpaque(false);
        btn_account.setForeground(Color.white);
        btn_account.setBackground(Color.black);
    }//GEN-LAST:event_btn_accountMouseExited

    private void btn_accountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_accountActionPerformed
        main_tabbed.setSelectedIndex(3);
        search_acc.setVisible(true);
        search_info.setVisible(false);
        lbl_sch.setVisible(true);
        txt_4.setVisible(true);
        txt_1.setVisible(false);
        txt_2.setVisible(false);
        txt_3.setVisible(false);
    }//GEN-LAST:event_btn_accountActionPerformed

    private void btn_agreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agreeActionPerformed
        new Registration().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_agreeActionPerformed

    private void btn_agreeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agreeMouseExited
        btn_agree.setOpaque(false);
        btn_agree.setBackground(Color.black);
    }//GEN-LAST:event_btn_agreeMouseExited

    private void btn_agreeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agreeMouseEntered
        btn_agree.setOpaque(true);
        btn_agree.setBackground(new Color(255,255,102));
    }//GEN-LAST:event_btn_agreeMouseEntered

    private void search_infoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_infoKeyReleased
        DefaultTableModel  models = (DefaultTableModel) tb_info.getModel();
        ((DefaultTableModel) tb_info.getModel()).setRowCount(0);
        
        String search = search_info.getText();
        
        try{
            conn = DriverManager.getConnection(url);
            stmt = conn.createStatement();
            String query = "SELECT * FROM `Voters Information` WHERE `Full Name` LIKE '%" +search+ "%'";
            rs = stmt.executeQuery(query);
            
            if(search_info.getText().isEmpty()){
                DefaultTableModel model = (DefaultTableModel) tb_info.getModel();
                
                int row = 0;
                
                try{
                    url = ("jdbc:ucanaccess://C:\\Users\\Zulu\\Documents\\SK VOTING SYSTEM\\Voting Database.accdb");
                    conn = DriverManager.getConnection(url);
                    stmt = conn.createStatement();
                    rs = stmt.executeQuery("SELECT * FROM `Voters Information`");
            
                    while(rs.next()){
                        String A = rs.getString("Voters No");
                        String B = rs.getString("Full Name");
                        String C = rs.getString("Address");
                        String D = rs.getString("Age");
                        String E = rs.getString("Sex");
                        String info_arr[] = {A, B, C, D, E};
                        model.insertRow(row, info_arr);
                        row = rs.getRow();
                    }
                }catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
            
            else{
                while(rs.next()){
                    String A = rs.getString("Voters No");
                    String B = rs.getString("Full Name");
                    String C = rs.getString("Address");
                    String D = rs.getString("Age");
                    String E = rs.getString("Sex");
                    String info_arr[] = {A, B, C, D, E};
                    models.insertRow(0, info_arr);
                }
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_search_infoKeyReleased

    private void search_accKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_accKeyReleased
        DefaultTableModel  models = (DefaultTableModel) tb_acc.getModel();
        ((DefaultTableModel) tb_acc.getModel()).setRowCount(0);
        
        String search = search_acc.getText();
        
        try{
            url = ("jdbc:ucanaccess://C:\\Users\\Zulu\\Documents\\SK VOTING SYSTEM\\Voting Database.accdb");
            conn = DriverManager.getConnection(url);
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM `Voters Information` WHERE `Full Name` LIKE '%"+search+"%' ");
            
            if(search_acc.getText().isEmpty()){
                DefaultTableModel model = (DefaultTableModel) tb_acc.getModel();
                
                int row = 0;
                
                try{
                    url = ("jdbc:ucanaccess://C:\\Users\\Zulu\\Documents\\SK VOTING SYSTEM\\Voting Database.accdb");
                    conn = DriverManager.getConnection(url);
                    stmt = conn.createStatement();
                    rs = stmt.executeQuery("SELECT * FROM `Voters Information`");
            
                    while(rs.next()){
                        String A = rs.getString("Voters No");
                        String B = rs.getString("Status");
                        String C = rs.getString("Full Name");
                        String D = rs.getString("Username");
                        String E = rs.getString("Password");
                        String acc_arr[] = {A, B, C, D, E};
                        model.insertRow(row, acc_arr);
                        row = rs.getRow();
                    }
                }catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
            
            else{
                while(rs.next()){
                    String A = rs.getString("Voters No");
                    String B = rs.getString("Status");
                    String C = rs.getString("Full Name");
                    String D = rs.getString("Username");
                    String E = rs.getString("Password");
                    String acc_arr[] = {A, B, C, D, E};
                    models.insertRow(0, acc_arr);
                }
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_search_accKeyReleased

    private void pnl_topMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_topMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xmouse ,y - ymouse);
    }//GEN-LAST:event_pnl_topMouseDragged

    private void pnl_topMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_topMousePressed
        xmouse = evt.getX();
        ymouse = evt.getY();
    }//GEN-LAST:event_pnl_topMousePressed
    
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
            java.util.logging.Logger.getLogger(Admin_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Admin_Menu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane acc_sp;
    private javax.swing.JButton btn_account;
    private javax.swing.JButton btn_agree;
    private javax.swing.JButton btn_candidates;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_registration;
    private javax.swing.JButton btn_voters;
    private javax.swing.JScrollPane chrman_sp;
    private javax.swing.JScrollPane counclr_sp;
    private javax.swing.JLabel exit;
    private javax.swing.JScrollPane info_sp;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl10;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl8;
    private javax.swing.JLabel lbl9;
    private javax.swing.JLabel lbl_sch;
    private javax.swing.JTabbedPane main_tabbed;
    private javax.swing.JLabel mini;
    private javax.swing.JPanel pnl1;
    private javax.swing.JPanel pnl2;
    private javax.swing.JPanel pnl3;
    private javax.swing.JPanel pnl4;
    private javax.swing.JPanel pnl_admenu;
    private javax.swing.JPanel pnl_bottom;
    private javax.swing.JPanel pnl_left;
    private javax.swing.JPanel pnl_right;
    private javax.swing.JPanel pnl_top;
    private javax.swing.JTextField search_acc;
    private javax.swing.JTextField search_info;
    private javax.swing.JTable tb_acc;
    private javax.swing.JTable tb_chairman;
    private javax.swing.JTable tb_councilor;
    private javax.swing.JTable tb_info;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt_1;
    private javax.swing.JTextField txt_2;
    private javax.swing.JTextField txt_3;
    private javax.swing.JTextField txt_4;
    // End of variables declaration//GEN-END:variables
}
