/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import content.data_buku;
import content.data_distributor;
import content.data_laporan;
import content.data_pelanggan;
import content.data_penjualan;
import content.data_user;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import views.*;
import javax.swing.JFrame;
import javax.swing.Timer;

/**
 * Nama : Aceng Abdul Wahid
 * NIM  : A2.1700001
 * @author Ceng
 */
public class admin extends javax.swing.JFrame {

    /**
     * Creates new form admin
     */
    public admin() {
        initComponents();
        setTanggal();
        setJam();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        lblAdministrator = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblMenu = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblContact = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lblAbout = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        lblTanggal = new javax.swing.JLabel();
        lblWaktu = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btnBuku = new javax.swing.JButton();
        btnPelanggan = new javax.swing.JButton();
        btnPenjualan = new javax.swing.JButton();
        btnDistributor = new javax.swing.JButton();
        btnUser = new javax.swing.JButton();
        btnLaporan = new javax.swing.JButton();
        screen = new javax.swing.JScrollPane();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(51, 0, 153));

        lblAdministrator.setBackground(new java.awt.Color(255, 255, 255));
        lblAdministrator.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblAdministrator.setForeground(new java.awt.Color(255, 255, 255));
        lblAdministrator.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/admin.png"))); // NOI18N
        lblAdministrator.setText("Administrator");

        jPanel1.setBackground(new java.awt.Color(51, 0, 204));

        lblMenu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMenu.setForeground(new java.awt.Color(255, 255, 255));
        lblMenu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/menu.png"))); // NOI18N
        lblMenu.setText("Menu");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(51, 0, 204));

        lblContact.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblContact.setForeground(new java.awt.Color(255, 255, 255));
        lblContact.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblContact.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/contact.png"))); // NOI18N
        lblContact.setText("Contact");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblContact, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblContact, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(51, 0, 204));

        lblAbout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAbout.setForeground(new java.awt.Color(255, 255, 255));
        lblAbout.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/about.png"))); // NOI18N
        lblAbout.setText("About");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAbout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnLogout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logout.png"))); // NOI18N
        btnLogout.setText("  Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        lblTanggal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTanggal.setForeground(new java.awt.Color(255, 255, 255));
        lblTanggal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/calendar.png"))); // NOI18N

        lblWaktu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblWaktu.setForeground(new java.awt.Color(255, 255, 255));
        lblWaktu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/time.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAdministrator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblWaktu)
                            .addComponent(lblTanggal))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAdministrator, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 269, Short.MAX_VALUE)
                .addComponent(lblTanggal)
                .addGap(18, 18, 18)
                .addComponent(lblWaktu)
                .addGap(18, 18, 18)
                .addComponent(btnLogout)
                .addContainerGap())
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.LINE_START);

        jPanel5.setBackground(new java.awt.Color(0, 153, 255));

        btnBuku.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBuku.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/buku.png"))); // NOI18N
        btnBuku.setText("Data Buku");
        btnBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBukuActionPerformed(evt);
            }
        });

        btnPelanggan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPelanggan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pelanggan.png"))); // NOI18N
        btnPelanggan.setText("Data Pelanggan");
        btnPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPelangganActionPerformed(evt);
            }
        });

        btnPenjualan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPenjualan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/penjualan.png"))); // NOI18N
        btnPenjualan.setText("Data Penjualan");
        btnPenjualan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPenjualanActionPerformed(evt);
            }
        });

        btnDistributor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDistributor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/distributor.png"))); // NOI18N
        btnDistributor.setText("Data Distributor");
        btnDistributor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDistributorActionPerformed(evt);
            }
        });

        btnUser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/kasir.png"))); // NOI18N
        btnUser.setText("Data User");
        btnUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserActionPerformed(evt);
            }
        });

        btnLaporan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLaporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/laporan.png"))); // NOI18N
        btnLaporan.setText("Laporan");
        btnLaporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaporanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPenjualan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPelanggan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDistributor, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUser, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLaporan, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPenjualan)
                    .addComponent(btnDistributor)
                    .addComponent(btnUser)
                    .addComponent(btnLaporan)
                    .addComponent(btnPelanggan))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        screen.setBorder(null);
        screen.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        screen.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cengbookstore.png"))); // NOI18N
        screen.setViewportView(jLabel1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(screen)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(screen, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setTanggal(){
        java.util.Date skrg = new java.util.Date();
        java.text.SimpleDateFormat kal = new java.text.SimpleDateFormat("dd/MM/yyyy");
        lblTanggal.setText(kal.format(skrg));
    }
    
    public void setJam(){
        ActionListener taskPerformer = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                String nol_jam = "",nol_menit ="",nol_detik ="";
                
                java.util.Date dateTime = new java.util.Date();
                int nilai_jam = dateTime.getHours();
                int nilai_menit = dateTime.getMinutes();
                int nilai_detik = dateTime.getSeconds();
                
                if(nilai_jam <=9) nol_jam ="0";
                if(nilai_menit <=9) nol_menit ="0";
                if(nilai_detik <=9) nol_detik ="0";
                
                String waktu = nol_jam + Integer.toString(nilai_jam);
                String menit = nol_menit + Integer.toString(nilai_menit);
                String detik = nol_detik + Integer.toString(nilai_detik);
                
                lblWaktu.setText(waktu+":"+menit+":"+detik+"");
            }
        };
        new Timer(1000,taskPerformer).start();
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowOpened

    private void btnBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBukuActionPerformed
        screen.setViewportView(new data_buku());
    }//GEN-LAST:event_btnBukuActionPerformed

    private void btnPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPelangganActionPerformed
         screen.setViewportView(new data_pelanggan());
    }//GEN-LAST:event_btnPelangganActionPerformed

    private void btnDistributorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDistributorActionPerformed
        screen.setViewportView(new data_distributor());
    }//GEN-LAST:event_btnDistributorActionPerformed

    private void btnPenjualanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPenjualanActionPerformed
        screen.setViewportView(new data_penjualan());
    }//GEN-LAST:event_btnPenjualanActionPerformed

    private void btnUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserActionPerformed
        screen.setViewportView(new data_user());
    }//GEN-LAST:event_btnUserActionPerformed

    private void btnLaporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaporanActionPerformed
        screen.setViewportView(new data_laporan());
    }//GEN-LAST:event_btnLaporanActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        login formlogin = new login();
        formlogin.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnLogoutActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuku;
    private javax.swing.JButton btnDistributor;
    private javax.swing.JButton btnLaporan;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnPelanggan;
    private javax.swing.JButton btnPenjualan;
    private javax.swing.JButton btnUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblAbout;
    private javax.swing.JLabel lblAdministrator;
    private javax.swing.JLabel lblContact;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblTanggal;
    private javax.swing.JLabel lblWaktu;
    private javax.swing.JScrollPane screen;
    // End of variables declaration//GEN-END:variables
}
