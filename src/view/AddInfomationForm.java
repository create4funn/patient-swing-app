package view;

import Card.HelpMethod;
import Card.Patient;
import Card.SmartCard;
import entities.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateService;
import util.HibernateUtil;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class AddInfomationForm extends javax.swing.JDialog {

    /**
     * Creates new form AddInfomationForm
     */
    SmartCard card = SmartCard.getInstance();
    private AccountForm owner;
    private Patient patient;
    private BufferedImage tempImage;

    public AddInfomationForm(javax.swing.JInternalFrame parent, javax.swing.JFrame frame, boolean modal) {
        super(frame, modal);
        this.owner = (AccountForm) parent;
        patient = Patient.getInstance();
        initComponents();
        init();
    }

    private AddInfomationForm(JFrame jFrame, boolean b) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void init() {
        card.connectCard();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnChooseImg = new java.awt.Button();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        label6 = new java.awt.Label();
        label8 = new java.awt.Label();
        label11 = new java.awt.Label();
        label12 = new java.awt.Label();
        jhoTen = new javax.swing.JTextField();
        jQueQuan = new javax.swing.JTextField();
        jSdt = new javax.swing.JTextField();
        jMaBenhNhan = new javax.swing.JTextField();
        jGioiTinh = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jMaPin = new javax.swing.JPasswordField();
        imgLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jNgaySinh = new com.toedter.calendar.JDateChooser();
        jPanel4 = new javax.swing.JPanel();
        label1 = new java.awt.Label();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnChooseImg.setBackground(new java.awt.Color(204, 204, 204));
        btnChooseImg.setLabel("Chọn ảnh");
        btnChooseImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseImgActionPerformed(evt);
            }
        });

        label3.setText("Họ tên:");

        label4.setText("Ngày sinh:");

        label6.setText("Địa chỉ:");

        label8.setText("Số điện thoại:");

        label11.setText("Giới tính:");

        label12.setText("BHYT:");

        jGioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));

        jButton1.setBackground(new java.awt.Color(204, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Xác nhận");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 51, 51));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Hủy");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setText("Mã pin:");

        imgLabel.setBackground(new java.awt.Color(255, 204, 204));
        imgLabel.setForeground(new java.awt.Color(255, 255, 255));
        imgLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        jNgaySinh.setDateFormatString("dd-MM-yyyy");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(imgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(24, 24, 24))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(48, 48, 48)
                                    .addComponent(btnChooseImg, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(51, 51, 51)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(label12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(label11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGap(22, 22, 22)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jQueQuan, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                .addComponent(jSdt, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                .addComponent(jMaBenhNhan, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                .addComponent(jhoTen)
                                .addComponent(jGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jMaPin)
                                .addComponent(jNgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(55, 55, 55)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jhoTen)
                            .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jQueQuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(imgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(label12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jMaBenhNhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jMaPin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnChooseImg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 50, 520, 410));

        jPanel4.setBackground(new java.awt.Color(51, 51, 255));

        label1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("Khởi tạo thông tin");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(180, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Collect patient info from the UI components
        String hoTen = jhoTen.getText();
        // Chuyển đổi ngày từ JDateChooser sang định dạng "dd-MM-yyyy"
        String ngaySinh = "";
        if (jNgaySinh.getDate() != null) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            ngaySinh = dateFormat.format(jNgaySinh.getDate());
        }
        String queQuan = jQueQuan.getText();
        String maBenhNhan = jMaBenhNhan.getText();
        String sdt = jSdt.getText();
        String gioiTinh = (String) jGioiTinh.getSelectedItem();
        String maPin = jMaPin.getText(); // Assuming this is needed for some authentication purposes

        // Validate fields
        if (!hoTen.matches("^[A-Za-zAĂÂBCDĐEÊGHIKLMNOÔƠPQRSTUƯVXY\n" +
                "aăâbcdđeêghiklmnoôơpqrstuưvxy\n" +
                "ÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚÝ\n" +
                "àáâãèéêìíòóôõùúý\n" +
                "ẰẮẲẴỀẾỂỄỈỊỎỐỒỔỖỚỜỞỠỤỦỨỪỬỮỲỴỶỸ\n" +
                "ằắẳẵềếểễỉịỏốồổỗớờởỡụủứừửữỳỵỷỹ\\s]{1,40}$")) {
            JOptionPane.showMessageDialog(this, "Họ tên không hợp lệ (chỉ chứa ký tự chữ và khoảng trắng, tối đa 40 ký tự).", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (jNgaySinh.getDate() == null || jNgaySinh.getDate().after(new java.util.Date())) {
            JOptionPane.showMessageDialog(this, "Ngày sinh không hợp lệ (không được là ngày tương lai và không được bỏ trống).", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (queQuan.isEmpty() || queQuan.length() > 150) {
            JOptionPane.showMessageDialog(this, "Địa chỉ không hợp lệ (tối đa 150 ký tự).", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (sdt.isEmpty() || !sdt.matches("\\d{0,10}") || sdt.length() > 10) {
            JOptionPane.showMessageDialog(this, "Số điện thoại không hợp lệ (chỉ chứa số, tối đa 10 ký tự).", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (maBenhNhan.isEmpty() || maBenhNhan.length() > 12 || maBenhNhan.contains(" ")) {
            JOptionPane.showMessageDialog(this, "Mã Bệnh Nhân không hợp lệ (không chứa dấu cách, tối đa 12 ký tự).", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (maPin.isEmpty() || !maPin.matches("\\d{3,8}")) {
            JOptionPane.showMessageDialog(this, "Mã PIN không hợp lệ (chỉ chứa số, từ 3 đến 8 ký tự).", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // save
        User user = new User();
        user.setBalance(0);
        user.setGioitinh(gioiTinh);
        user.setMabn(maBenhNhan);
        user.setHoten(hoTen);
        user.setNgaysinh(ngaySinh);
        user.setSdt(sdt);
        user.setQuequan(queQuan);
        user.setPicture(null);
        user.setPublicKey(null);
        user.setMapin(maPin);
        int idCard = HibernateService.saveOrUpdateUser(user);
        // save database
        // Attempt to update the patient info on the smart card
        card.updatePatientBalance("0");
        card.updatePatientPin(maPin);
        card.updateCardId(String.valueOf(idCard));
        boolean updated = card.updatePatientInfo(hoTen, ngaySinh, queQuan, gioiTinh, sdt, maBenhNhan);
        if (updated) {
            JOptionPane.showMessageDialog(this, "Cập nhật tài khoản bệnh nhân thành công.");
        } else {
            JOptionPane.showMessageDialog(this, "Cập nhật tài khoản bệnh nhân thất bại.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        // Update the patient instance
        patient.setId(idCard == 0 ? patient.getId() : idCard) ;
        patient.setHoten(hoTen);
        patient.setNgaysinh(ngaySinh);
        patient.setQuequan(queQuan);
        patient.setMabn(maBenhNhan);
        patient.setSdt(sdt);
        patient.setGioitinh(gioiTinh);
        patient.setBalance(0);
        patient.setMapin(maPin);
        // Disconnect from the card
        //Su dung owner goi hàm loadLoadData tu Accountform de cap nhat du lieu thay doi
        this.dispose();
        owner.loadDataToTable();
        // save public key
        HibernateService.savePublicKey(patient.getId(),card.getPatientPublicKey());
    }
//GEN-LAST:event_jButton1ActionPerformed

    private void btnChooseImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseImgActionPerformed
// Sử dụng JFileChooser để chọn file
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Ảnh (JPG, PNG)", "jpg", "jpeg", "png"));
        int result = fileChooser.showOpenDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();

            try {
                // Read the image file into a BufferedImage
                BufferedImage image = ImageIO.read(selectedFile);

                // Convert the BufferedImage to a byte array
                byte[] byteArray = HelpMethod.convertImageToByteArray(image);

                // Check if the byte array size exceeds 30 KB
                if (byteArray == null || byteArray.length > 30 * 1000) { // 30 KB = 30 * 1024 bytes
                    JOptionPane.showMessageDialog(this, "Ảnh không được vượt quá 30KB sau khi chuyển đổi.", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Update the patient picture and display the image
                card.updatePatientPicture(image);

                // Update the patient instance
                patient.setPicture(image);

                // Display the image on the UI
                displayImage();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }//GEN-LAST:event_btnChooseImgActionPerformed

    private void displayImage() {
        // Retrieve the picture as a BufferedImage
        BufferedImage image = patient.getPicture();

        if (image == null) {
            imgLabel.setText("Không có ảnh.");
            imgLabel.setIcon(null); // Clear any existing icon
            return;
        }

        // Convert the BufferedImage to an ImageIcon
        ImageIcon icon = new ImageIcon(image);

        // Resize the image to fit the JLabel
        Image img = icon.getImage();
        Image scaledImg = img.getScaledInstance(imgLabel.getWidth(), imgLabel.getHeight(), Image.SCALE_SMOOTH);
        icon = new ImageIcon(scaledImg);

        // Set the icon to the JLabel
        imgLabel.setText(null); // Clear any existing text
        imgLabel.setIcon(icon);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
            java.util.logging.Logger.getLogger(AddInfomationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddInfomationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddInfomationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddInfomationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddInfomationForm dialog = new AddInfomationForm(new javax.swing.JFrame(), true);
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
    private java.awt.Button btnChooseImg;
    private javax.swing.JLabel imgLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jGioiTinh;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jMaBenhNhan;
    private javax.swing.JPasswordField jMaPin;
    private com.toedter.calendar.JDateChooser jNgaySinh;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jQueQuan;
    private javax.swing.JTextField jSdt;
    private javax.swing.JTextField jhoTen;
    private java.awt.Label label1;
    private java.awt.Label label11;
    private java.awt.Label label12;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label6;
    private java.awt.Label label8;
    // End of variables declaration//GEN-END:variables

}
