package view;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author DELL
 */
public class MenuAdmin extends javax.swing.JFrame {

    /**
     * Creates new form MenuAdmin
     */
    public MenuAdmin() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtTenNguoiDung = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        tabKeDon = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tabLichSu = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tabTaiKhoan = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnDangXuat = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 28)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("MENU");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 16, 93, -1));

        txtTenNguoiDung.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtTenNguoiDung.setForeground(new java.awt.Color(153, 255, 51));
        txtTenNguoiDung.setText("admin123");
        jPanel1.add(txtTenNguoiDung, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 60, 115, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 87, 122, 12));

        tabKeDon.setBackground(new java.awt.Color(204, 204, 255));
        tabKeDon.setPreferredSize(new java.awt.Dimension(166, 47));
        tabKeDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabKeDonMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel2.setText("Kê đơn");

        javax.swing.GroupLayout tabKeDonLayout = new javax.swing.GroupLayout(tabKeDon);
        tabKeDon.setLayout(tabKeDonLayout);
        tabKeDonLayout.setHorizontalGroup(
            tabKeDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabKeDonLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tabKeDonLayout.setVerticalGroup(
            tabKeDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabKeDonLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(tabKeDon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 222, -1));

        tabLichSu.setBackground(new java.awt.Color(204, 204, 255));
        tabLichSu.setPreferredSize(new java.awt.Dimension(166, 47));
        tabLichSu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabLichSuMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel3.setText("Lịch sử");

        javax.swing.GroupLayout tabLichSuLayout = new javax.swing.GroupLayout(tabLichSu);
        tabLichSu.setLayout(tabLichSuLayout);
        tabLichSuLayout.setHorizontalGroup(
            tabLichSuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabLichSuLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );
        tabLichSuLayout.setVerticalGroup(
            tabLichSuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabLichSuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel1.add(tabLichSu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 222, -1));

        tabTaiKhoan.setBackground(new java.awt.Color(204, 204, 255));
        tabTaiKhoan.setPreferredSize(new java.awt.Dimension(168, 47));
        tabTaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabTaiKhoanMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel6.setText("Tài khoản");

        javax.swing.GroupLayout tabTaiKhoanLayout = new javax.swing.GroupLayout(tabTaiKhoan);
        tabTaiKhoan.setLayout(tabTaiKhoanLayout);
        tabTaiKhoanLayout.setHorizontalGroup(
            tabTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabTaiKhoanLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tabTaiKhoanLayout.setVerticalGroup(
            tabTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabTaiKhoanLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(tabTaiKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 222, -1));

        btnDangXuat.setBackground(new java.awt.Color(255, 51, 51));
        btnDangXuat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDangXuat.setForeground(new java.awt.Color(255, 255, 255));
        btnDangXuat.setText("Đăng xuất");
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });
        jPanel1.add(btnDangXuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 580, 131, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 713, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabKeDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabKeDonMouseClicked

        
    }//GEN-LAST:event_tabKeDonMouseClicked

    private void tabLichSuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabLichSuMouseClicked

        
    }//GEN-LAST:event_tabLichSuMouseClicked

    private void tabTaiKhoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabTaiKhoanMouseClicked
        AccountForm sf = new AccountForm();
        
        jPanel2.removeAll();
        jPanel2.add(sf).setVisible(true);

        tabTaiKhoan.setBackground(Color.WHITE);
        
    
        tabKeDon.setBackground(new Color(204, 204, 255));
        tabLichSu.setBackground(new Color(204, 204, 255));
        
        
    }//GEN-LAST:event_tabTaiKhoanMouseClicked

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        // TODO add your handling code here:
        int cf = JOptionPane.showConfirmDialog(
            null,
            "Bạn muốn đăng xuất?",
            "Xác nhận",
            JOptionPane.YES_NO_OPTION);
        if (cf == JOptionPane.YES_OPTION) {
            this.dispose();
            formLogin a = new formLogin();
            a.setVisible(true);
        }

    }//GEN-LAST:event_btnDangXuatActionPerformed

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
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel tabKeDon;
    private javax.swing.JPanel tabLichSu;
    private javax.swing.JPanel tabTaiKhoan;
    private javax.swing.JLabel txtTenNguoiDung;
    // End of variables declaration//GEN-END:variables
}
