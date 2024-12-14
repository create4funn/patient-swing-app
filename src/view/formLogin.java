package view;

import Card.Patient;
import Card.SmartCard;
import com.formdev.flatlaf.FlatLightLaf;
import entities.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author DELL
 */
public class formLogin extends javax.swing.JFrame {

    /**
     * Creates new form formLogin
     */
    private SmartCard card = new SmartCard();

    public formLogin() {
        initComponents();
        setLocationRelativeTo(null);
        connectCard();
    }

    private void connectCard() {
        if (card.connectCard()) {
            System.out.println("Kết nối thành công");
            //JOptionPane.showMessageDialog(this, "Connect thành công");
        } else {
            JOptionPane.showMessageDialog(this, "Chưa kết nối được đến applet");
            this.dispose(); // Close the frame if the connection fails
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(13, 36, 51));
        jPanel1.setAlignmentX(0.0F);
        jPanel1.setAlignmentY(0.0F);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LOGIN");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Vui Lòng nhập mã Pin");

        txtPassword.setBackground(new java.awt.Color(13, 36, 51));
        txtPassword.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setBorder(null);
        txtPassword.setCaretColor(new java.awt.Color(255, 255, 255));
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(255, 153, 153));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.setAlignmentX(0.5F);
        btnLogin.setBorder(null);
        btnLogin.setBorderPainted(false);
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnLogin.setMargin(new java.awt.Insets(0, 14, 10, 14));
        btnLogin.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(62, 76, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(153, 153, 153)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // Get the user-entered PIN
        String userPin = txtPassword.getText();

        try {
            // Initialize the SmartCard instance and attempt to connect to the card
            if (!card.connectCard()) {
                JOptionPane.showMessageDialog(this, "Chưa kết nối được đến thẻ.");
                return;
            }

            // Check the PIN using the SmartCard class
            boolean isPinValid = card.CheckPin(userPin);

            if (isPinValid) {
                // Login successful
                JOptionPane.showMessageDialog(this, "Kết nối thành công");

                // Initialize the Patient instance
                Patient patient = Patient.getInstance();

                // Retrieve patient information from the Java card
                String[] patientInfo = card.getPatientInfo();
                if (patientInfo != null && patientInfo.length >= 6) { // Assuming there are at least 6 fields
                    patient.setHoten(patientInfo[0]);   // Patient name
                    patient.setNgaysinh(patientInfo[1]); // Date of birth
                    patient.setQuequan(patientInfo[2]); // Hometown
                    patient.setGioitinh(patientInfo[3]);    // Gender
                    patient.setSdt(patientInfo[4]); // Phone Number
                    patient.setMabn(patientInfo[5]); // Patient ID
                } else {
                    JOptionPane.showMessageDialog(this, "Không thể lấy thông tin bệnh nhân từ thẻ.");
                    return; // Exit if patient info retrieval failed
                }

                // Retrieve and set the patient picture
                BufferedImage picture = card.GetPatientPicture();
                if (picture != null) {
                    patient.setPicture(picture); // Set the retrieved picture
                } else {
                    JOptionPane.showMessageDialog(this, "Không thể lấy ảnh của bệnh nhân từ thẻ.");
                }

                // Create a new instance of PatientForm
                PatientForm patientForm = new PatientForm();
                patientForm.setVisible(true); // Show the new form

                // Dispose of the current JFrame (login form)
                this.dispose();
            } else {
                // Check if the card is blocked
                if (card.isCardBlocked) {
                    // Display a specific message for card blockage
                    JOptionPane.showMessageDialog(this, "Wrong input more than 3 times. Card is blocked.");
                } else {
                    // General login failure message
                    JOptionPane.showMessageDialog(this, "Login failed. Incorrect PIN.");
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "An error occurred: " + e.getMessage());
        }

    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            // Enter was pressed. Your code goes here.

        }
    }//GEN-LAST:event_txtPasswordKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
            User user = new User();
            user.setHoten("hoang");
            session.save(user);
            transaction.commit();
            session.close();
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
