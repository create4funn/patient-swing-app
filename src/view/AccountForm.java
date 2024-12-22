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
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author Robot
 */
public class AccountForm extends javax.swing.JInternalFrame {

    private boolean isConnect = false;
    private SmartCard card = new SmartCard();
    private DefaultTableModel tblModel;
    public AccountForm() {
        initComponents();
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        initTable();
        loadDataToTable();
    }

    public final void initTable() {
        tblModel = (DefaultTableModel) tblAccount.getModel();
        String[] headerTbl = new String[]{"STT","Tên","Mã bệnh nhân", "SÐT", "Giới tính", "Ngày Sinh","Balance"};
        tblModel.setColumnIdentifiers(headerTbl);

    }

    public void loadDataToTable() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try{
            Query<User> userQuery =  session.createQuery("FROM User",User.class);
            List<User> userList = userQuery.getResultList();
            int  i = 0;
            tblModel.setRowCount(0);
            for (User user : userList) {
                tblModel.addRow(new Object[]{
                        i+1, user.getHoten(), user.getMabn(), user.getSdt(),user.getGioitinh(), user.getNgaysinh(),user.getBalance()
                });
            }
            transaction.commit();
        }catch (Exception e){
            transaction.rollback();
        }
        session.close();
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
        // TODO add your handling code here:
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
                isConnect = true;
                btnConnect.setText("Ngắt kết nối");
            } else {
                JOptionPane.showMessageDialog(this, "Chưa connect được đến applet");
                isConnect = false;
                btnConnect.setText("Kết nối");
            }
        } else {
            if (card.disconnect()) {
                isConnect = false;
                btnConnect.setText("Kết nối");
            }
        }
    }//GEN-LAST:event_btnConnectActionPerformed

    private void jKhoaTheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jKhoaTheActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jKhoaTheActionPerformed

    private void jMoKhoaTheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMoKhoaTheActionPerformed
        card.UnLockCard();
        SmartCard.counter = 0;
    }//GEN-LAST:event_jMoKhoaTheActionPerformed

    private void btnChangeCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeCardActionPerformed
        // TODO add your handling code here:
        ChangeInfoAdmin a = new ChangeInfoAdmin(this, (JFrame) javax.swing.SwingUtilities.getWindowAncestor(this), rootPaneCheckingEnabled);
        a.setVisible(true);
    }//GEN-LAST:event_btnChangeCardActionPerformed

    private void btnEditCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditCardActionPerformed
        // TODO add your handling code here:
        formLoginAdmin a = new formLoginAdmin();
        a.setVisible(true);
    }//GEN-LAST:event_btnEditCardActionPerformed

    public void deleteAccount(){
        //do something
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
