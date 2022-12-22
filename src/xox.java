
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author root
 */
public class xox extends javax.swing.JFrame {
    String[] hucre= new String[9];
    String[] skorlardata = new String[10];
    int i = 0;
    String ad = "";
    int oyuncu_skor = 0;
    int bilgisayar_skor = 0;
    
    
    
   
    public xox() {
        initComponents();
           panel_oyunalani.setVisible(false);
           panel_durum.setVisible(false);
           panel_skor.setVisible(false);
           btn_sifirla.setVisible(false);   
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        panel_oyuncubilgi = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtf_oyuncu = new javax.swing.JTextField();
        btn_basla = new javax.swing.JButton();
        panel_oyunalani = new javax.swing.JPanel();
        btn3 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        panel_durum = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_yenidenoyna = new javax.swing.JButton();
        label_oyuncu = new javax.swing.JLabel();
        label_bilgisayar = new javax.swing.JLabel();
        panel_skor = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        list_skor = new javax.swing.JList<>();
        btn_sifirla = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_oyuncubilgi.setBorder(javax.swing.BorderFactory.createTitledBorder("Oyuncu Bilgisi"));
        panel_oyuncubilgi.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Oyuncu Adi:");

        txtf_oyuncu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtf_oyuncuActionPerformed(evt);
            }
        });

        btn_basla.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_basla.setForeground(new java.awt.Color(0, 0, 255));
        btn_basla.setText("Başla");
        btn_basla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_baslaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_oyuncubilgiLayout = new javax.swing.GroupLayout(panel_oyuncubilgi);
        panel_oyuncubilgi.setLayout(panel_oyuncubilgiLayout);
        panel_oyuncubilgiLayout.setHorizontalGroup(
            panel_oyuncubilgiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_oyuncubilgiLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtf_oyuncu, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_basla, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel_oyuncubilgiLayout.setVerticalGroup(
            panel_oyuncubilgiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_oyuncubilgiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_oyuncubilgiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtf_oyuncu, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_basla))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        panel_oyunalani.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Oyun Alanı\n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(153, 0, 153))); // NOI18N

        btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cicek.png"))); // NOI18N
        btn3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn3.setBorderPainted(false);
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cicek.png"))); // NOI18N
        btn2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn2.setBorderPainted(false);
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cicek.png"))); // NOI18N
        btn1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn1.setBorderPainted(false);
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cicek.png"))); // NOI18N
        btn4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn4.setBorderPainted(false);
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cicek.png"))); // NOI18N
        btn5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn5.setBorderPainted(false);
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cicek.png"))); // NOI18N
        btn6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn6.setBorderPainted(false);
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cicek.png"))); // NOI18N
        btn7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn7.setBorderPainted(false);
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cicek.png"))); // NOI18N
        btn8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn8.setBorderPainted(false);
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cicek.png"))); // NOI18N
        btn9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn9.setBorderPainted(false);
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_oyunalaniLayout = new javax.swing.GroupLayout(panel_oyunalani);
        panel_oyunalani.setLayout(panel_oyunalaniLayout);
        panel_oyunalaniLayout.setHorizontalGroup(
            panel_oyunalaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_oyunalaniLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_oyunalaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_oyunalaniLayout.createSequentialGroup()
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_oyunalaniLayout.createSequentialGroup()
                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_oyunalaniLayout.createSequentialGroup()
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_oyunalaniLayout.setVerticalGroup(
            panel_oyunalaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_oyunalaniLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panel_oyunalaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_oyunalaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_oyunalaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        panel_durum.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Durum\n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(51, 102, 255))); // NOI18N

        jLabel3.setText("Oyuncu: ");

        jLabel4.setText("Bilgisayar:   ");

        btn_yenidenoyna.setText("Yeniden Oyna");
        btn_yenidenoyna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_yenidenoynaActionPerformed(evt);
            }
        });

        label_oyuncu.setText("0");

        label_bilgisayar.setText("0");

        javax.swing.GroupLayout panel_durumLayout = new javax.swing.GroupLayout(panel_durum);
        panel_durum.setLayout(panel_durumLayout);
        panel_durumLayout.setHorizontalGroup(
            panel_durumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_durumLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_durumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_yenidenoyna, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addGroup(panel_durumLayout.createSequentialGroup()
                        .addGroup(panel_durumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_durumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_bilgisayar)
                            .addGroup(panel_durumLayout.createSequentialGroup()
                                .addComponent(label_oyuncu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel_durumLayout.setVerticalGroup(
            panel_durumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_durumLayout.createSequentialGroup()
                .addGroup(panel_durumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_durumLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(panel_durumLayout.createSequentialGroup()
                        .addGroup(panel_durumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(label_oyuncu))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_durumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(label_bilgisayar))))
                .addGap(18, 18, 18)
                .addComponent(btn_yenidenoyna, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        panel_skor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Skorlar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(255, 204, 0))); // NOI18N

        jScrollPane1.setViewportView(list_skor);

        javax.swing.GroupLayout panel_skorLayout = new javax.swing.GroupLayout(panel_skor);
        panel_skor.setLayout(panel_skorLayout);
        panel_skorLayout.setHorizontalGroup(
            panel_skorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_skorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_skorLayout.setVerticalGroup(
            panel_skorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_skorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                .addContainerGap())
        );

        btn_sifirla.setText("Oyuncu Sıfırla");
        btn_sifirla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sifirlaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_oyuncubilgi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_oyunalani, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_durum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_skor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_sifirla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panel_oyuncubilgi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel_oyunalani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(panel_durum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_sifirla, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel_skor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_yenidenoynaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_yenidenoynaActionPerformed
        panel_oyunalani.setVisible(true);
        butonsifirla();
        degerleri_sifirla();
    }//GEN-LAST:event_btn_yenidenoynaActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
          btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/X.png"))); 
          btn1.setEnabled(false);
          hucre[0] = "x";
          say++;
          kontrol();
          bilgisayar_oyna();
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/X.png"))); 
          btn2.setEnabled(false);
          hucre[1] = "x";
          say++;
          kontrol();
          bilgisayar_oyna();
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
         btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/X.png"))); 
          btn3.setEnabled(false);
          hucre[2] = "x";
          say++;
          kontrol();
          bilgisayar_oyna();
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/X.png"))); 
          btn4.setEnabled(false);
          hucre[3] = "x";
          say++;
          kontrol();
          bilgisayar_oyna();
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
       btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/X.png"))); 
          btn5.setEnabled(false);
          hucre[4] = "x";
          say++;
          kontrol();
          bilgisayar_oyna();
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        btn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/X.png"))); 
          btn6.setEnabled(false);
          hucre[5] = "x";
          say++;
          kontrol();
          bilgisayar_oyna();
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
       btn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/X.png"))); 
          btn7.setEnabled(false);
          hucre[6] = "x";
          say++;
          kontrol();
          bilgisayar_oyna();
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
     btn8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/X.png"))); 
          btn8.setEnabled(false);
          hucre[7] = "x";
          say++;
          kontrol();
          bilgisayar_oyna();
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        btn9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/X.png"))); 
          btn9.setEnabled(false);
          hucre[8] = "x";
          say++;
          kontrol();
          bilgisayar_oyna();
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn_sifirlaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sifirlaActionPerformed
        butonsifirla();
        degerleri_sifirla();
        skorlardata[i] = ad + "-" + oyuncu_skor;
        i++;
        ad = "";
        panel_skor.setVisible(true);
        panel_durum.setVisible(false);
        panel_oyunalani.setVisible(false);
        panel_oyuncubilgi.setVisible(true);
        txtf_oyuncu.setEnabled(true);
        btn_basla.setEnabled(true);
        list_skor.setListData(skorlardata);
        btn_sifirla.setVisible(false);
    }//GEN-LAST:event_btn_sifirlaActionPerformed

    int say = 0;
    private void btn_baslaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_baslaActionPerformed
        ad = txtf_oyuncu.getText();
        txtf_oyuncu.setEnabled(false);
        panel_oyuncubilgi.setEnabled(false);
        btn_basla.setEnabled(false);
        panel_skor.setVisible(false);
        oyuncu_skor = 0;
        say=0;
        bilgisayar_skor=0;
        panel_oyunalani.setVisible(true);
        for (int i = 0; i < 9; i++)
        {
            hucre[i] = "";
        }

        oyun_durum = true;
    }//GEN-LAST:event_btn_baslaActionPerformed

     boolean oyun_durum = false;
    private void txtf_oyuncuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtf_oyuncuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtf_oyuncuActionPerformed

    public void butonsifirla(){
          btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cicek.png"))); 
          btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cicek.png"))); 
          btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cicek.png"))); 
          btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cicek.png"))); 
          btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cicek.png")));
          btn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cicek.png"))); 
          btn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cicek.png"))); 
          btn8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cicek.png")));
          btn9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cicek.png")));
          btn1.setEnabled(true);
           btn2.setEnabled(true);
            btn3.setEnabled(true);
             btn4.setEnabled(true);
              btn5.setEnabled(true);
               btn6.setEnabled(true);
                btn7.setEnabled(true);
                 btn8.setEnabled(true);
                  btn9.setEnabled(true);
              
          
    }
    
    public void degerleri_sifirla(){
        for (int j = 0; j < 9; j++) {
            hucre[j] = "";
            say = 0;
        }
        oyun_durum = true;
    }
    
    
    public void kontrol (){
           xox f = new xox();
           if(say < 9){
               if(hucre[0] == "x" & hucre[3] == "x" & hucre[6] == "x" 
                       || hucre[1] == "x" & hucre[4] == "x" & hucre[7] == "x" 
                       || hucre[2] == "x" & hucre[5] == "x" & hucre[8] == "x"
                       || hucre[0] == "x" & hucre[1] == "x" & hucre[2] == "x"
                       || hucre[3] == "x" & hucre[4] == "x" & hucre[5] == "x"
                       || hucre[6] == "x" & hucre[7] == "x" & hucre[8] == "x"
                       ){
                   JOptionPane.showMessageDialog(f, "Oyuncu Kazandı");
                   oyuncu_skor++;
                   oyun_durum = false;
                   label_oyuncu.setText(String.valueOf(oyuncu_skor));

                   }
               else  if(hucre[0] == "o" & hucre[3] == "o" & hucre[6] == "o" 
                       || hucre[1] == "o" & hucre[4] == "o" & hucre[7] == "o" 
                       || hucre[2] == "o" & hucre[5] == "o" & hucre[8] == "o"
                       || hucre[0] == "o" & hucre[1] == "o" & hucre[2] == "o"
                       || hucre[3] == "o" & hucre[4] == "o" & hucre[5] == "o"
                       || hucre[6] == "o" & hucre[7] == "o" & hucre[8] == "o"
                       ){
                   JOptionPane.showMessageDialog(f, "Bilgisayar Kazandı");
                   bilgisayar_skor++;
                   oyun_durum = false;
                   label_bilgisayar.setText(String.valueOf(bilgisayar_skor));

                   }
               else if (say == 9){
                    JOptionPane.showMessageDialog(f , "Kazanan Yoktur");
                    oyun_durum= false;
               }
               if(oyun_durum == false){
                   panel_durum.setVisible(true);
                   panel_oyunalani.setVisible(false);
                   btn_sifirla.setVisible(true); 
               }
           }
       }
    public void bilgisayar_oyna(){
        if (oyun_durum == true){
           int h = -1;
           boolean durum = false;

           do {
               h = (int)(Math.random()*9);
               if(hucre[h] == "x"){
                   durum=false;
               }else if(hucre[h] =="o"){
                   durum = false;
               }else {
                   durum = true;
               }
           } while (durum == false);

           hucre[h] = "o";
           say++;
           if(h == 0){
               btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/O.png")));
               btn1.setEnabled(false);
           }
           else if(h == 1){
               btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/O.png")));
               btn2.setEnabled(false);
           }
           else if(h == 2){
               btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/O.png")));
               btn3.setEnabled(false);
           }
           else   if(h == 3){
               btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/O.png")));
               btn4.setEnabled(false);
           }
            else   if(h == 4){
               btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/O.png")));
               btn5.setEnabled(false);
           }
            else   if(h == 5){
               btn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/O.png")));
               btn6.setEnabled(false);
           }
            else   if(h ==6){
               btn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/O.png")));
               btn7.setEnabled(false);
           }
            else   if(h == 7){
               btn8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/O.png")));
               btn8.setEnabled(false);
           }
            else   if(h == 8){
               btn9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/O.png")));
               btn9.setEnabled(false);
           }

           kontrol();

        }
        else {
            
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(xox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(xox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(xox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(xox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new xox().setVisible(true);
            }
        });
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btn_basla;
    private javax.swing.JButton btn_sifirla;
    private javax.swing.JButton btn_yenidenoyna;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_bilgisayar;
    private javax.swing.JLabel label_oyuncu;
    private javax.swing.JList<String> list_skor;
    private javax.swing.JPanel panel_durum;
    private javax.swing.JPanel panel_oyunalani;
    private javax.swing.JPanel panel_oyuncubilgi;
    private javax.swing.JPanel panel_skor;
    private javax.swing.JTextField txtf_oyuncu;
    // End of variables declaration//GEN-END:variables
}
