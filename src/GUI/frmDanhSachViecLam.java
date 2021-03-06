/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Database.DAL;
import Helper.chuyenDoi;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class frmDanhSachViecLam extends javax.swing.JFrame {

    /**
     * Creates new form frmDanhSachViecLam
     */
    public frmDanhSachViecLam() {
        initComponents();
        loadDataSQLVaoTable();
        cbbNganh.setVisible(false);
        cbbMucLuong.setVisible(false);
        btnTimKiem.setVisible(false);
        lblImgSeach.setVisible(false);
        lblIconGifNguoc.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        hover2 = new javax.swing.JPanel();
        lblHover2 = new javax.swing.JLabel();
        hover1 = new javax.swing.JPanel();
        lblHover1 = new javax.swing.JLabel();
        hover3 = new javax.swing.JPanel();
        lblHover3 = new javax.swing.JLabel();
        hover4 = new javax.swing.JPanel();
        lblHover4 = new javax.swing.JLabel();
        btnHome = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        cbbSapXep = new javax.swing.JComboBox<>();
        lblSapXep = new javax.swing.JLabel();
        lblTextSeach = new javax.swing.JLabel();
        txtSeach = new javax.swing.JTextField();
        iconGif = new javax.swing.JLabel();
        lblImageSeach = new javax.swing.JLabel();
        cbbMucLuong = new javax.swing.JComboBox<>();
        cbbNganh = new javax.swing.JComboBox<>();
        lblImgSeach = new javax.swing.JLabel();
        btnTimKiem = new javax.swing.JButton();
        lblIconGifNguoc = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        btlBangCV = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        txtTenCv = new javax.swing.JTextField();
        txtTenCty = new javax.swing.JTextField();
        txtDiaDiem = new javax.swing.JTextField();
        lblVND = new javax.swing.JLabel();
        txtLuong = new javax.swing.JTextField();
        txtNgayDang = new javax.swing.JTextField();
        lblIconViTri = new javax.swing.JLabel();
        iconTien = new javax.swing.JLabel();
        iconLich = new javax.swing.JLabel();
        lblKhamSucKhoe = new javax.swing.JLabel();
        lblThuong = new javax.swing.JLabel();
        lblDaoTao = new javax.swing.JLabel();
        lblNghiPhep = new javax.swing.JLabel();
        lblImgCtVL = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Menu.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -11, 1220, 80));

        hover2.setBackground(new java.awt.Color(0, 185, 242));
        hover2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hover2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hover2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                hover2MouseExited(evt);
            }
        });

        lblHover2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/hover.png"))); // NOI18N

        javax.swing.GroupLayout hover2Layout = new javax.swing.GroupLayout(hover2);
        hover2.setLayout(hover2Layout);
        hover2Layout.setHorizontalGroup(
            hover2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hover2Layout.createSequentialGroup()
                .addComponent(lblHover2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1236, 1236, 1236))
        );
        hover2Layout.setVerticalGroup(
            hover2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hover2Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(lblHover2))
        );

        jPanel2.add(hover2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 110, 50));

        hover1.setBackground(new java.awt.Color(0, 185, 242));
        hover1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hover1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hover1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                hover1MouseExited(evt);
            }
        });

        lblHover1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/hover.png"))); // NOI18N

        javax.swing.GroupLayout hover1Layout = new javax.swing.GroupLayout(hover1);
        hover1.setLayout(hover1Layout);
        hover1Layout.setHorizontalGroup(
            hover1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHover1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        hover1Layout.setVerticalGroup(
            hover1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hover1Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(lblHover1))
        );

        jPanel2.add(hover1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 110, 50));

        hover3.setBackground(new java.awt.Color(0, 185, 242));
        hover3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hover3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hover3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                hover3MouseExited(evt);
            }
        });

        lblHover3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/hover.png"))); // NOI18N

        javax.swing.GroupLayout hover3Layout = new javax.swing.GroupLayout(hover3);
        hover3.setLayout(hover3Layout);
        hover3Layout.setHorizontalGroup(
            hover3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHover3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        hover3Layout.setVerticalGroup(
            hover3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hover3Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(lblHover3))
        );

        jPanel2.add(hover3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 110, 50));

        hover4.setBackground(new java.awt.Color(0, 185, 242));
        hover4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hover4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hover4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                hover4MouseExited(evt);
            }
        });

        lblHover4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/hover.png"))); // NOI18N

        javax.swing.GroupLayout hover4Layout = new javax.swing.GroupLayout(hover4);
        hover4.setLayout(hover4Layout);
        hover4Layout.setHorizontalGroup(
            hover4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHover4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        hover4Layout.setVerticalGroup(
            hover4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hover4Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(lblHover4))
        );

        jPanel2.add(hover4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, 110, 50));

        btnHome.setText("jButton1");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        jPanel2.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 60));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbbSapXep.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbbSapXep.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mặc định", "Lương: Từ Cao đến Thâp", "Lương: Từ Thấp đến Cao", "Ngày đăng mới nhất", "Ngày đăng cũ nhất" }));
        cbbSapXep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbSapXepActionPerformed(evt);
            }
        });
        jPanel3.add(cbbSapXep, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 0, -1, 43));

        lblSapXep.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSapXep.setText("Sắp xếp theo");
        jPanel3.add(lblSapXep, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, -1, -1));

        lblTextSeach.setText("Tìm kiếm việc làm, Công ty");
        jPanel3.add(lblTextSeach, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 190, 20));

        txtSeach.setBorder(null);
        txtSeach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSeachMouseClicked(evt);
            }
        });
        txtSeach.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSeachKeyReleased(evt);
            }
        });
        jPanel3.add(txtSeach, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 210, 23));

        iconGif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/unnamed-(1).gif"))); // NOI18N
        iconGif.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconGifMouseClicked(evt);
            }
        });
        jPanel3.add(iconGif, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 40, 20));

        lblImageSeach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/seach2.png"))); // NOI18N
        jPanel3.add(lblImageSeach, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 270, 40));

        cbbMucLuong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn mức lương", "Dưới 10tr", "10tr-20tr", "Trên 20tr" }));
        jPanel3.add(cbbMucLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 150, 40));

        cbbNganh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn ngành", "Quản lý", "Bất động sản", "Công nghệ cao" }));
        jPanel3.add(cbbNganh, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 150, 40));

        lblImgSeach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/imgTimKiem.png"))); // NOI18N
        jPanel3.add(lblImgSeach, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, 110, 40));

        btnTimKiem.setText("jButton1");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });
        jPanel3.add(btnTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, 110, 40));

        lblIconGifNguoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/unnamed-(nguoc).gif"))); // NOI18N
        lblIconGifNguoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIconGifNguocMouseClicked(evt);
            }
        });
        jPanel3.add(lblIconGifNguoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, 70, 40));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));

        btlBangCV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Tên Công Ty", "Tên Công Việc", "Địa Điểm", "Lương", "Ngày Đăng"
            }
        ));
        btlBangCV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btlBangCVMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(btlBangCV);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTenCv.setBackground(new java.awt.Color(245, 255, 255));
        txtTenCv.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtTenCv.setForeground(new java.awt.Color(255, 51, 51));
        txtTenCv.setBorder(null);
        jPanel4.add(txtTenCv, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 1090, 50));

        txtTenCty.setBackground(new java.awt.Color(245, 255, 255));
        txtTenCty.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTenCty.setBorder(null);
        txtTenCty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenCtyActionPerformed(evt);
            }
        });
        jPanel4.add(txtTenCty, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 1090, 40));

        txtDiaDiem.setBackground(new java.awt.Color(245, 255, 255));
        txtDiaDiem.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDiaDiem.setBorder(null);
        txtDiaDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaDiemActionPerformed(evt);
            }
        });
        jPanel4.add(txtDiaDiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 1050, 40));

        lblVND.setText("VNĐ");
        jPanel4.add(lblVND, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 30, 20));

        txtLuong.setBackground(new java.awt.Color(245, 255, 255));
        txtLuong.setBorder(null);
        jPanel4.add(txtLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 1070, 40));

        txtNgayDang.setBackground(new java.awt.Color(245, 255, 255));
        txtNgayDang.setBorder(null);
        jPanel4.add(txtNgayDang, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 1090, 40));

        lblIconViTri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iconViTri.png"))); // NOI18N
        jPanel4.add(lblIconViTri, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 20, 30));

        iconTien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/money.png"))); // NOI18N
        jPanel4.add(iconTien, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        iconLich.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iconlich.png"))); // NOI18N
        jPanel4.add(iconLich, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        lblKhamSucKhoe.setText("Khám sức khỏe");
        jPanel4.add(lblKhamSucKhoe, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 110, -1));

        lblThuong.setText("Thưởng");
        jPanel4.add(lblThuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 90, -1));

        lblDaoTao.setText("Đào tạo");
        jPanel4.add(lblDaoTao, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 270, -1, -1));

        lblNghiPhep.setText("Nghỉ phép");
        jPanel4.add(lblNghiPhep, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 270, 70, -1));

        lblImgCtVL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ChiTietViecLam.png"))); // NOI18N
        jPanel4.add(lblImgCtVL, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 19, -1, -1));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void hover1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hover1MouseClicked

    }//GEN-LAST:event_hover1MouseClicked

    private void hover1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hover1MouseEntered
        lblHover1.setVisible(true);
    }//GEN-LAST:event_hover1MouseEntered

    private void hover1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hover1MouseExited
        lblHover1.setVisible(false);
    }//GEN-LAST:event_hover1MouseExited

    private void hover2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hover2MouseClicked

    }//GEN-LAST:event_hover2MouseClicked

    private void hover2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hover2MouseEntered
        lblHover2.setVisible(true);
    }//GEN-LAST:event_hover2MouseEntered

    private void hover2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hover2MouseExited
        lblHover2.setVisible(false);
    }//GEN-LAST:event_hover2MouseExited

    private void hover3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hover3MouseClicked

    }//GEN-LAST:event_hover3MouseClicked

    private void hover3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hover3MouseEntered
        lblHover3.setVisible(true);
    }//GEN-LAST:event_hover3MouseEntered

    private void hover3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hover3MouseExited
        lblHover3.setVisible(false);
    }//GEN-LAST:event_hover3MouseExited

    private void hover4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hover4MouseClicked

    }//GEN-LAST:event_hover4MouseClicked

    private void hover4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hover4MouseEntered
        lblHover4.setVisible(true);
    }//GEN-LAST:event_hover4MouseEntered

    private void hover4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hover4MouseExited
        lblHover4.setVisible(false);
    }//GEN-LAST:event_hover4MouseExited

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        frmChinh home = new frmChinh();
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btlBangCVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btlBangCVMouseClicked

        if (btlBangCV.getSelectedRowCount() == 1) {
            //tính từ 0
            int viTriChon = btlBangCV.getSelectedRow();
            txtTenCty.setText(btlBangCV.getValueAt(viTriChon, 1).toString());
            txtTenCv.setText(btlBangCV.getValueAt(viTriChon, 2).toString());
            txtDiaDiem.setText(btlBangCV.getValueAt(viTriChon, 3).toString());
            txtLuong.setText(btlBangCV.getValueAt(viTriChon, 4).toString());
            txtNgayDang.setText(btlBangCV.getValueAt(viTriChon, 5).toString());
            lblIconViTri.setVisible(true);
            iconLich.setVisible(true);
            iconTien.setVisible(true);
            lblVND.setVisible(true);
            lblDaoTao.setVisible(true);
            lblKhamSucKhoe.setVisible(true);
            lblNghiPhep.setVisible(true);
            lblThuong.setVisible(true);

        }

    }//GEN-LAST:event_btlBangCVMouseClicked

    private void txtDiaDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaDiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaDiemActionPerformed

    private void txtTenCtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenCtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenCtyActionPerformed

    private void cbbSapXepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbSapXepActionPerformed
        loadDataSQLVaoTable();
    }//GEN-LAST:event_cbbSapXepActionPerformed

    private void txtSeachKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSeachKeyReleased
        //lblTextSeach.setVisible(false);

    }//GEN-LAST:event_txtSeachKeyReleased

    private void txtSeachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSeachMouseClicked
        cbbNganh.setVisible(true);
        cbbMucLuong.setVisible(true);
        btnTimKiem.setVisible(true);
        lblTextSeach.setVisible(false);
        lblImgSeach.setVisible(true);
        lblIconGifNguoc.setVisible(true);
    }//GEN-LAST:event_txtSeachMouseClicked

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        String TenCV = "%" + txtSeach.getText() + "%";
        String TenNganh = cbbNganh.getSelectedItem().toString();
        String MucLuong = cbbMucLuong.getSelectedItem().toString();
        
        if (TenCV.equalsIgnoreCase("%%") && TenNganh.equalsIgnoreCase("Chọn ngành") && MucLuong.equalsIgnoreCase("Chọn mức lương") ){
            JOptionPane.showMessageDialog(this, "Nhập thông tin tìm kiếm");
        }else{
            TimKiem(TenCV, TenNganh, MucLuong);
        }
        
        
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void lblIconGifNguocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconGifNguocMouseClicked
        cbbNganh.setVisible(false);
        cbbMucLuong.setVisible(false);
        btnTimKiem.setVisible(false);
        lblImgSeach.setVisible(false);
        lblIconGifNguoc.setVisible(false);
    }//GEN-LAST:event_lblIconGifNguocMouseClicked

    private void iconGifMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconGifMouseClicked
        cbbNganh.setVisible(true);
        cbbMucLuong.setVisible(true);
        btnTimKiem.setVisible(true);
        lblTextSeach.setVisible(false);
        lblImgSeach.setVisible(true);
        lblIconGifNguoc.setVisible(true);
    }//GEN-LAST:event_iconGifMouseClicked

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
            java.util.logging.Logger.getLogger(frmDanhSachViecLam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmDanhSachViecLam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmDanhSachViecLam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDanhSachViecLam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmDanhSachViecLam().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable btlBangCV;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JComboBox<String> cbbMucLuong;
    private javax.swing.JComboBox<String> cbbNganh;
    private javax.swing.JComboBox<String> cbbSapXep;
    private javax.swing.JPanel hover1;
    private javax.swing.JPanel hover2;
    private javax.swing.JPanel hover3;
    private javax.swing.JPanel hover4;
    private javax.swing.JLabel iconGif;
    private javax.swing.JLabel iconLich;
    private javax.swing.JLabel iconTien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblDaoTao;
    private javax.swing.JLabel lblHover1;
    private javax.swing.JLabel lblHover2;
    private javax.swing.JLabel lblHover3;
    private javax.swing.JLabel lblHover4;
    private javax.swing.JLabel lblIconGifNguoc;
    private javax.swing.JLabel lblIconViTri;
    private javax.swing.JLabel lblImageSeach;
    private javax.swing.JLabel lblImgCtVL;
    private javax.swing.JLabel lblImgSeach;
    private javax.swing.JLabel lblKhamSucKhoe;
    private javax.swing.JLabel lblNghiPhep;
    private javax.swing.JLabel lblSapXep;
    private javax.swing.JLabel lblTextSeach;
    private javax.swing.JLabel lblThuong;
    private javax.swing.JLabel lblVND;
    private javax.swing.JTextField txtDiaDiem;
    private javax.swing.JTextField txtLuong;
    private javax.swing.JTextField txtNgayDang;
    private javax.swing.JTextField txtSeach;
    private javax.swing.JTextField txtTenCty;
    private javax.swing.JTextField txtTenCv;
    // End of variables declaration//GEN-END:variables

    //Chỉnh sửa hàm 
    public void loadDataSQLVaoTable() {
        //Tạo 1 biến DefaultTableModel lấy Model từ table sản phẩm trong Table
        lblIconViTri.setVisible(false);
        iconLich.setVisible(false);
        iconTien.setVisible(false);
        lblVND.setVisible(false);
        lblDaoTao.setVisible(false);
        lblKhamSucKhoe.setVisible(false);
        lblNghiPhep.setVisible(false);
        lblThuong.setVisible(false);
        try {
            ResultSet rs = DAL.SXBaiDangMoiNhat();
            int cbbIndex = cbbSapXep.getSelectedIndex();
            switch (cbbIndex) {
                case 0:
                    break;
                case 1:
                    rs = DAL.SXBaiDangLuongDESC();
                    break;
                case 2:
                    rs = DAL.SXBaiDangLuongASC();
                    break;
                case 3:
                    break;
                case 4:
                    rs = DAL.SXBaiDangCuNhat();
            }
            DefaultTableModel tbmodel = (DefaultTableModel) btlBangCV.getModel();
            tbmodel.setRowCount(0);
            Object obj[] = new Object[8];

            //Tạo một mảng Object có số phẩn tử bằng số cột
            while (rs.next()) {
                obj[0] = btlBangCV.getRowCount() + 1;
                obj[1] = rs.getString("TENCTY");
                obj[2] = rs.getString("TENCV");
                obj[3] = rs.getString("DIADIEM");
                obj[4] = chuyenDoi.SoString(rs.getInt("Luong"));
                obj[5] = chuyenDoi.LayNgayString(rs.getDate("NgayDang"));

                tbmodel.addRow(obj);
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi kết nối");
        }

    }
    
    public void TimKiem(String TenCV, String TenNganh, String MucLuong){
        
            lblIconViTri.setVisible(false);
            iconLich.setVisible(false);
            iconTien.setVisible(false);
            lblVND.setVisible(false);
            lblDaoTao.setVisible(false);
            lblKhamSucKhoe.setVisible(false);
            lblNghiPhep.setVisible(false);
            lblThuong.setVisible(false);
        try {    
            ResultSet rs = DAL.DALTimKiem(TenCV, TenNganh, MucLuong);
            
            DefaultTableModel tbmodel = (DefaultTableModel) btlBangCV.getModel();
            tbmodel.setRowCount(0);
            Object obj[] = new Object[8];

            //Tạo một mảng Object có số phẩn tử bằng số cột
            while (rs.next()) {
                obj[0] = btlBangCV.getRowCount() + 1;
                obj[1] = rs.getString("NGANH");
                obj[2] = rs.getString("TENCV");
                obj[3] = rs.getString("DIADIEM");
                obj[4] = chuyenDoi.SoString(rs.getInt("Luong"));
                obj[5] = chuyenDoi.LayNgayString(rs.getDate("NgayDang"));

                tbmodel.addRow(obj);
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi kết nối");
        }
    }
}
