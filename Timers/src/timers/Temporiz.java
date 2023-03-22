package timers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import javax.swing.Timer;

public class Temporiz extends javax.swing.JFrame {

    private Calendar calendario;
    private int hor, min, seg, h, m, s, tho, tmi, tse;
    private Timer timer;
    private Timer ten;
    private Timer tem;
    private ActionListener actliste;
    private ActionListener ala;
    private ActionListener actili;
    int a = 0;

    public Temporiz() {

        calendario = Calendar.getInstance();

        ala = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                a++;
                mostrar2();

            }
        };

        actliste = new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                mostrar1();
                corr();

            }
        };
        actili = new ActionListener() {

            public void actionPerformed(ActionEvent u) {
                tempori();

            }
        };
        timer = new Timer(990, actliste);
        ten = new Timer(990, ala);
        tem = new Timer(990, actili);

        initComponents();

        datos();
        timer.start();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Chor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Cmin = new javax.swing.JLabel();
        Cseg = new javax.swing.JLabel();
        Chora = new javax.swing.JTextField();
        Ccron = new javax.swing.JTextField();
        Inibu = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        horbo = new javax.swing.JComboBox<>();
        minbo = new javax.swing.JComboBox<>();
        segbo = new javax.swing.JComboBox<>();
        tempa = new javax.swing.JTextField();
        Acett = new javax.swing.JButton();
        Acis = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Hora");

        Cmin.setText("min");

        Cseg.setText("seg");

        Chora.setEditable(false);
        Chora.setBackground(new java.awt.Color(204, 255, 255));
        Chora.setFont(new java.awt.Font("Trebuchet MS", 0, 50)); // NOI18N
        Chora.setForeground(new java.awt.Color(0, 153, 51));
        Chora.setToolTipText("");
        Chora.setBorder(new javax.swing.border.MatteBorder(null));
        Chora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChoraActionPerformed(evt);
            }
        });

        Ccron.setEditable(false);
        Ccron.setBackground(java.awt.SystemColor.activeCaption);
        Ccron.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Ccron.setText("00:00:00");

        Inibu.setText("Reanudar");
        Inibu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InibuActionPerformed(evt);
            }
        });

        jButton2.setText("Stop");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        horbo.setBackground(new java.awt.Color(204, 255, 204));
        horbo.setMaximumRowCount(23);
        horbo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        horbo.setToolTipText("");
        horbo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horboActionPerformed(evt);
            }
        });

        minbo.setBackground(new java.awt.Color(204, 255, 204));
        minbo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "1", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));

        segbo.setBackground(new java.awt.Color(204, 255, 204));
        segbo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "1", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        segbo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                segboActionPerformed(evt);
            }
        });

        tempa.setEditable(false);
        tempa.setBackground(new java.awt.Color(153, 204, 255));
        tempa.setText("Temporizador");
        tempa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tempaActionPerformed(evt);
            }
        });

        Acett.setText("Añadir");
        Acett.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcettActionPerformed(evt);
            }
        });

        Acis.setEditable(false);
        Acis.setBackground(new java.awt.Color(255, 153, 153));
        Acis.setText("!!");
        Acis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ChorLayout = new javax.swing.GroupLayout(Chor);
        Chor.setLayout(ChorLayout);
        ChorLayout.setHorizontalGroup(
            ChorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChorLayout.createSequentialGroup()
                .addGroup(ChorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ChorLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(Chora, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ChorLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(ChorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ChorLayout.createSequentialGroup()
                                .addComponent(Inibu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2))
                            .addComponent(Ccron, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(ChorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ChorLayout.createSequentialGroup()
                        .addGroup(ChorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ChorLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ChorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(horbo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(ChorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Cmin, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(minbo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(ChorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Cseg, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(segbo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(ChorLayout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(Acett)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(tempa, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(ChorLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Acis, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        ChorLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {minbo, segbo});

        ChorLayout.setVerticalGroup(
            ChorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ChorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ChorLayout.createSequentialGroup()
                        .addComponent(Chora, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(Ccron, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ChorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Inibu)
                            .addComponent(jButton2))
                        .addGap(0, 37, Short.MAX_VALUE))
                    .addGroup(ChorLayout.createSequentialGroup()
                        .addGroup(ChorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ChorLayout.createSequentialGroup()
                                .addComponent(tempa)
                                .addGap(33, 33, 33))
                            .addGroup(ChorLayout.createSequentialGroup()
                                .addGroup(ChorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(horbo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(minbo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(segbo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ChorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Cmin, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Cseg))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Acett)))
                        .addComponent(Acis)))
                .addContainerGap())
        );

        ChorLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {horbo, minbo, segbo});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Chor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Chor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ChoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChoraActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ten.stop();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void InibuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InibuActionPerformed
        a = 0;
        ten.start();
    }//GEN-LAST:event_InibuActionPerformed

    private void segboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_segboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_segboActionPerformed

    private void tempaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tempaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tempaActionPerformed

    private void horboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horboActionPerformed

    }//GEN-LAST:event_horboActionPerformed

    private void AcettActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcettActionPerformed
//        int t=ordenamiento.getSelectedIndex();
//        int o=valores.getSelectedIndex();
        int thor = horbo.getSelectedIndex();
        int tmin = minbo.getSelectedIndex();
        int tseg = segbo.getSelectedIndex();
        int u=0;
        tem.start();

    }//GEN-LAST:event_AcettActionPerformed

    private void AcisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcisActionPerformed
     
        int thor = horbo.getSelectedIndex();
        int tmin = minbo.getSelectedIndex();
        int tseg = segbo.getSelectedIndex();
        String tex="Tiempo completado";
        if(tho==thor &&tmi==tmin && tse==tseg)
     {
         Acis.setText(tex);
     }
    }//GEN-LAST:event_AcisActionPerformed
    private void mostrar1() {
        Chora.setText(hor + ": " + min + " : " + seg);
    }

    private void datos() {
        hor = calendario.get(Calendar.HOUR_OF_DAY);
        min = calendario.get(Calendar.MINUTE);
        seg = calendario.get(Calendar.SECOND);
    }

    private void corr() {

        if (seg > 59) {
            min++;
            seg = 0;
            if (min > 59) {
                hor++;
                min = 0;
                seg = 0;
            }

        } else {
            seg++;
        }
    }

    private void mostrar2() {
        if (s > 59) {
            m++;
            s = 0;
            if (m > 59) {
                h++;
                m = 0;
                s = 0;
            }

        } else {
            s++;
        }
        Ccron.setText(h + " : " + m + " : " + s);
    }

    private void tempori() {
        if (tse > 59) {
            tmi++;
            tse = 0;
            if (tmi > 59) {
                tho++;
                tmi = 0;
                tse = 0;
            }

        } else {
            tse++;
        }

        tempa.setText(tho + ":" + tmi + ":" + tse);
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
            java.util.logging.Logger.getLogger(Temporiz.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Temporiz.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Temporiz.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Temporiz.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Temporiz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Acett;
    private javax.swing.JTextField Acis;
    private javax.swing.JTextField Ccron;
    private javax.swing.JPanel Chor;
    private javax.swing.JTextField Chora;
    private javax.swing.JLabel Cmin;
    private javax.swing.JLabel Cseg;
    private javax.swing.JButton Inibu;
    private javax.swing.JComboBox<String> horbo;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox<String> minbo;
    private javax.swing.JComboBox<String> segbo;
    private javax.swing.JTextField tempa;
    // End of variables declaration//GEN-END:variables
}
