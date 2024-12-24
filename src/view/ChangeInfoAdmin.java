package view;

import Card.HelpMethod;
import Card.Patient;
import Card.SmartCard;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class ChangeInfoAdmin extends javax.swing.JDialog {

    /**
     * Creates new form AddInfomationForm
     */
    SmartCard card = SmartCard.getInstance();
    private BufferedImage tempImage; // Temporary variable to hold the new selected image

    private AccountForm owner;
    
    public ChangeInfoAdmin(javax.swing.JInternalFrame parent, javax.swing.JFrame frame, boolean modal) {
        super(frame, modal);
        this.owner = (AccountForm) parent;
        initComponents();
        init();
    }

    private ChangeInfoAdmin(JFrame jFrame, boolean b) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void init(){
        Patient patient = Patient.getInstance();
        jhoTen.setText(patient.getHoten());
        //jNgaySinh.set(patient.getNgaysinh());
        // Chuyển đổi String sang Date để gán cho JDateChooser
      
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            Date ngaySinh = dateFormat.parse(patient.getNgaysinh()); 
            jNgaySinh.setDate(ngaySinh); 
        } catch (ParseException e) {
            e.printStackTrace();
            System.out.println("Ngày sinh không đúng định dạng");
        }

        jGioiTinh.setSelectedItem(patient.getGioitinh());
        jQueQuan.setText(patient.getQuequan());
        jSdt.setText(patient.getSdt());
        jMaBenhNhan.setText(patient.getMabn());

        BufferedImage image = patient.getPicture();
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
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
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
        imgLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jNgaySinh = new com.toedter.calendar.JDateChooser();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
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
                                    .addComponent(label11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jQueQuan, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                    .addComponent(jSdt, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                    .addComponent(jMaBenhNhan, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                    .addComponent(jhoTen)
                                    .addComponent(jGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jNgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
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
                                .addComponent(jMaBenhNhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(btnChooseImg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, 390));

        jPanel5.setBackground(new java.awt.Color(51, 51, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cập nhật thông tin");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(jLabel1)
                .addContainerGap(194, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 50));

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

        try {
            if(jNgaySinh.getDate().after(new java.util.Date())){
                JOptionPane.showMessageDialog(this, "Ngày sinh không hợp lệ (không được là ngày tương lai).", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ngày sinh không hợp lệ (không được là ngày tương lai).", "Lỗi", JOptionPane.ERROR_MESSAGE);
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


        // Attempt to update the patient info
        boolean updated = card.updatePatientInfo(hoTen, ngaySinh, queQuan, gioiTinh, maBenhNhan, sdt);
        
        if (updated) {
            // Update the patient instance
            Patient patient = Patient.getInstance();
            patient.setHoten(hoTen);
            patient.setNgaysinh(ngaySinh);
            patient.setQuequan(queQuan);
            patient.setMabn(maBenhNhan);
            patient.setSdt(sdt);
            patient.setGioitinh(gioiTinh);
            if(tempImage != null) {
                card.updatePatientPicture(tempImage);
                patient.setPicture(tempImage);
            }
            JOptionPane.showMessageDialog(this, "Cập nhập thông tin bệnh nhân thành công.");
            
            //su dung owner goi hàm loadLoadData tu Accountform de cap nhat du lieu thay doi
            this.dispose();
            owner.loadDataToTable();
            
        } else {
            JOptionPane.showMessageDialog(this, "Failed to update patient information.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnChooseImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseImgActionPerformed
// Display the current image first
        displayImage();

        // Use JFileChooser to select a file
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

                // Store the new image in the temporary variable
                tempImage = image;

                // Preview the selected image without updating the patient instance
                displayChoosingImage(tempImage);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }//GEN-LAST:event_btnChooseImgActionPerformed

    private void displayImage() {
        // Get the Patient instance
        Patient patient = Patient.getInstance();

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

    private void displayChoosingImage(BufferedImage image) {
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
        imgLabel.setText("Ảnh đang được chọn."); // Optional: Add a label or text to indicate preview
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
            java.util.logging.Logger.getLogger(ChangeInfoAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangeInfoAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangeInfoAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangeInfoAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ChangeInfoAdmin dialog = new ChangeInfoAdmin(new javax.swing.JFrame(), true);
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
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JComboBox<String> jGioiTinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jMaBenhNhan;
    private com.toedter.calendar.JDateChooser jNgaySinh;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jQueQuan;
    private javax.swing.JTextField jSdt;
    private javax.swing.JTextField jhoTen;
    private java.awt.Label label11;
    private java.awt.Label label12;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label6;
    private java.awt.Label label8;
    // End of variables declaration//GEN-END:variables

}
