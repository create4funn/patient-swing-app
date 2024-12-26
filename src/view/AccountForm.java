/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

import Card.SmartCard;
import entities.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import util.HibernateUtil;

import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author Robot
 */
public class AccountForm extends javax.swing.JInternalFrame {

    private boolean isConnect = false;
    private final SmartCard card = new SmartCard();
    private DefaultTableModel tblModel;
    private List<User> userList = new ArrayList<>();
    public AccountForm() {
        initComponents();
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        initTable();
        loadDataToTable();
    }

    public final void initTable() {
        tblModel = (DefaultTableModel) tblAccount.getModel();
        String[] headerTbl = new String[]{"STT","Tên","BHYT", "SÐT", "Giới tính", "Ngày Sinh","Balance"};
        tblModel.setColumnIdentifiers(headerTbl);

    }

    public void loadDataToTable() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try{
            Query<User> userQuery =  session.createQuery("FROM User",User.class);
             userList = userQuery.getResultList();
            transaction.commit();
        }catch (Exception e){
            transaction.rollback();
        }
        session.close();
        if(!this.userList.isEmpty()){
            int  i = 1;
            tblModel.setRowCount(0);
            for (User user : userList) {
                tblModel.addRow(new Object[]{
                        i++, user.getHoten(), user.getMabn(), user.getSdt(),user.getGioitinh(), user.getNgaysinh(),user.getBalance()
                });
            }
        }
    }

//    public TaiKhoan getSelected() {
//        int i_row = tblTaiKhoan.getSelectedRow();
//        String userName = tblTaiKhoan.getValueAt(i_row, 2).toString();
//        TaiKhoan tk = TaiKhoanDAO.getInstance().selectById(userName);
//        return tk;
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAccount = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        btnConnect = new javax.swing.JButton();
        btnAddCard = new javax.swing.JButton();
        btnChangeCard = new javax.swing.JButton();
        btnEditCard = new javax.swing.JButton();
        jKhoaThe = new javax.swing.JButton();
        jMoKhoaThe = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(1180, 750));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(240, 250, 250));
        jPanel1.setPreferredSize(new java.awt.Dimension(713, 0));

        tblAccount.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblAccount);

        jToolBar1.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar1.setBorder(javax.swing.BorderFactory.createTitledBorder("Chức năng"));
        jToolBar1.setRollover(true);

        btnConnect.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnConnect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/connect_icon.png"))); // NOI18N
        btnConnect.setText("Kết nối");
        btnConnect.setFocusable(false);
        btnConnect.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConnect.setMargin(new java.awt.Insets(2, 20, 2, 20));
        btnConnect.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnConnect.addActionListener(new java.awt.event.ActionListener() { 
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConnectActionPerformed(evt);
            }
        });
        jToolBar1.add(btnConnect);

        btnAddCard.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAddCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_add_40px.png"))); // NOI18N
        btnAddCard.setText("Thêm");
        btnAddCard.setFocusable(false);
        btnAddCard.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAddCard.setMargin(new java.awt.Insets(2, 20, 2, 20));
        btnAddCard.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAddCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCardActionPerformed(evt);
            }
        });
        jToolBar1.add(btnAddCard);

        btnChangeCard.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnChangeCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_edit_40px.png"))); // NOI18N
        btnChangeCard.setText("Sửa");
        btnChangeCard.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnChangeCard.setMargin(new java.awt.Insets(2, 20, 2, 20));
        btnChangeCard.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnChangeCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeCardActionPerformed(evt);
            }
        });
        jToolBar1.add(btnChangeCard);

        btnEditCard.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEditCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_delete_40px.png"))); // NOI18N
        btnEditCard.setText("Xóa");
        btnEditCard.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditCard.setMargin(new java.awt.Insets(2, 20, 2, 20));
        btnEditCard.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEditCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditCardActionPerformed(evt);
            }
        });
        jToolBar1.add(btnEditCard);

        jKhoaThe.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jKhoaThe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Lock_icon (1).png"))); // NOI18N
        jKhoaThe.setText("Khóa");
        jKhoaThe.setFocusable(false);
        jKhoaThe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jKhoaThe.setMargin(new java.awt.Insets(2, 20, 2, 20));
        jKhoaThe.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jKhoaThe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jKhoaTheActionPerformed(evt);
            }
        });
        jToolBar1.add(jKhoaThe);

        jMoKhoaThe.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMoKhoaThe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Unlock icon.png"))); // NOI18N
        jMoKhoaThe.setText("Mở khóa");
        jMoKhoaThe.setFocusable(false);
        jMoKhoaThe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMoKhoaThe.setMargin(new java.awt.Insets(2, 20, 2, 20));
        jMoKhoaThe.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jMoKhoaThe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMoKhoaTheActionPerformed(evt);
            }
        });
        jToolBar1.add(jMoKhoaThe);

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tìm kiếm"));
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane1)))
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(69, 69, 69)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 726));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCardActionPerformed
        if (isConnect) {
            AddInfomationForm a = new AddInfomationForm(this, (JFrame) javax.swing.SwingUtilities.getWindowAncestor(this), rootPaneCheckingEnabled);
            a.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(this, "Chưa connect đến applet");
        }

    }//GEN-LAST:event_btnAddCardActionPerformed

    private void btnConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConnectActionPerformed
        if (!isConnect) {
            if (card.connectCard()) {
                SmartCard.publicKey = card.getPatientPublicKey();
                if (SmartCard.publicKey != null) {
                    boolean isVerify = card.VerifyCard(SmartCard.publicKey);
                    if (isVerify) {
                        isConnect = true;
                        btnConnect.setText("Ngắt kết nối");
                        JOptionPane.showMessageDialog(this, "Kết nối và xác thực thành công");
                    } else {
                        System.err.println("Xác thực thất bại");
                        JOptionPane.showMessageDialog(this, "Xác thực thất bại", "Lỗi", JOptionPane.ERROR_MESSAGE);
                        isConnect = false;
                        btnConnect.setText("Kết nối");
                    }
                } else {
                    System.err.println("Không thể lấy khóa công khai");
                    JOptionPane.showMessageDialog(this, "Không thể lấy khóa công khai từ thẻ", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    isConnect = false;
                    btnConnect.setText("Kết nối");
                }
            } else {
                System.err.println("Kết nối thất bại: Không thể kết nối đến applet");
                JOptionPane.showMessageDialog(this, "Chưa connect được đến applet", "Lỗi", JOptionPane.ERROR_MESSAGE);
                isConnect = false;
                btnConnect.setText("Kết nối");
            }
        } else {
            if (card.disconnect()) {
                isConnect = false;
                btnConnect.setText("Kết nối");
                JOptionPane.showMessageDialog(this, "Đã ngắt kết nối thành công");
            } else {
                System.err.println("Ngắt kết nối thất bại: Không thể ngắt kết nối thẻ");
                JOptionPane.showMessageDialog(this, "Ngắt kết nối thất bại", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnConnectActionPerformed

    private void jKhoaTheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jKhoaTheActionPerformed
        if(card.LockCard()) {
            SmartCard.counter = 4;
            SmartCard.isCardBlocked = true;
            JOptionPane.showMessageDialog(this, "Thẻ đã được khóa thành công."); // Display success message for locking the card
        }
    }//GEN-LAST:event_jKhoaTheActionPerformed

    private void jMoKhoaTheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMoKhoaTheActionPerformed
        if(card.UnLockCard()) {
            SmartCard.counter = 0;
            SmartCard.isCardBlocked = false;
            JOptionPane.showMessageDialog(this, "Thẻ đã được mở khóa thành công."); // Display success message for unlocking the card
        }
    }//GEN-LAST:event_jMoKhoaTheActionPerformed

    private void btnChangeCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeCardActionPerformed
        ChangeInfoAdmin a = new ChangeInfoAdmin(this, (JFrame) javax.swing.SwingUtilities.getWindowAncestor(this), rootPaneCheckingEnabled);
        a.setVisible(true);
    }//GEN-LAST:event_btnChangeCardActionPerformed

    private void btnEditCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditCardActionPerformed
        // Prompt the user to enter the admin username and password
        JTextField usernameField = new JTextField();
        JPasswordField passwordField = new JPasswordField();
        Object[] message = {
                "Username:", usernameField,
                "Password:", passwordField
        };

        int option = JOptionPane.showConfirmDialog(
                null,
                message,
                "Xác thực tài khoản admin",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE
        );

        if (option == JOptionPane.OK_OPTION) {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

            // Check if both fields are filled
            if (username.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(
                        null,
                        "tên đăng nhập hoặc mật khẩu không được để trống.",
                        "Xác thực thất bại",
                        JOptionPane.ERROR_MESSAGE
                );
                return;
            }

            // Verify the username and password
            if (verifyAdminCredentials(username, password)) {
                JOptionPane.showMessageDialog(
                        null,
                        "Xác thực thành công. Tiến hành xóa tài khoản.",
                        "Xác thực thành công",
                        JOptionPane.INFORMATION_MESSAGE
                );

                // Check if the card information is successfully cleared
                if (card.ClearCard()) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Xóa thông tin thẻ thành công.",
                            "Thành công",
                            JOptionPane.INFORMATION_MESSAGE
                    );
                } else {
                    JOptionPane.showMessageDialog(
                            null,
                            "Xóa thông tin thẻ thất bại.",
                            "Thất bại",
                            JOptionPane.ERROR_MESSAGE
                    );
                }
            } else {
                JOptionPane.showMessageDialog(
                        null,
                        "Sai tên đăng nhập hoặc mật khẩu, vui lòng thử lại.",
                        "Xác thực thất bại",
                        JOptionPane.ERROR_MESSAGE
                );
            }
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "Hủy xóa tài khoản.",
                    "Hủy tiến trình",
                    JOptionPane.WARNING_MESSAGE
            );
        }
    }//GEN-LAST:event_btnEditCardActionPerformed

    private boolean verifyAdminCredentials(String username, String password) {
        // Replace this logic with your actual admin username/password verification
        return "admin".equals(username) && "abc".equals(password);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCard;
    private javax.swing.JButton btnChangeCard;
    private javax.swing.JButton btnConnect;
    private javax.swing.JButton btnEditCard;
    private javax.swing.JButton jKhoaThe;
    private javax.swing.JButton jMoKhoaThe;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable tblAccount;
    // End of variables declaration//GEN-END:variables


}
