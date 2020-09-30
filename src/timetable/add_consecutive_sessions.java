/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable;

import java.awt.Label;
import java.sql.ResultSet;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import service.DBConnect;

/**
 *
 * @author Shakith
 */
public class add_consecutive_sessions extends javax.swing.JPanel {

    Generator generator;

    int id;

    /**
     * Creates new form add_consecutive_sessions
     */
    public add_consecutive_sessions() {
        initComponents();
        loadCombo1();
        loadCombo();
        loadId();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        add_consecutive_sessions = new javax.swing.JPanel();
        jPanel40 = new javax.swing.JPanel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel43 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel44 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel45 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jButton11 = new javax.swing.JButton();

        add_consecutive_sessions.setBackground(new java.awt.Color(102, 51, 109));

        jPanel40.setBackground(new java.awt.Color(135, 19, 135));
        jPanel40.setPreferredSize(new java.awt.Dimension(1592, 109));

        jLabel114.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-back-50.png"))); // NOI18N
        jLabel114.setToolTipText("");
        jLabel114.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel114MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel114MouseEntered(evt);
            }
        });

        jLabel115.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel115.setForeground(new java.awt.Color(255, 255, 255));
        jLabel115.setText("Add Consecutive Sessions");

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel40Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel114)
                .addGap(448, 448, 448)
                .addComponent(jLabel115)
                .addContainerGap(650, Short.MAX_VALUE))
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel115, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel114))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel22.setBackground(new java.awt.Color(137, 14, 137));
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel42.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("No of Consecutive Sessions");
        jPanel22.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, -1, -1));

        jComboBox2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select..." }));
        jComboBox2.setOpaque(false);
        jComboBox2.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox2PopupMenuWillBecomeVisible(evt);
            }
        });
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel22.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 340, 36));

        jLabel43.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("Session 1");
        jPanel22.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, -1, -1));

        jComboBox3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select..." }));
        jComboBox3.setOpaque(false);
        jComboBox3.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox3PopupMenuWillBecomeVisible(evt);
            }
        });
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jPanel22.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, 340, 36));

        jLabel44.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Group");
        jPanel22.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, -1));

        jTextField3.setBorder(null);
        jTextField3.setOpaque(false);
        jTextField3.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTextField3PropertyChange(evt);
            }
        });
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField3KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        jPanel22.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 175, 320, 30));

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/3.png"))); // NOI18N
        jPanel22.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, -1, -1));

        jLabel41.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("Session 2");
        jPanel22.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select..." }));
        jComboBox1.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox1PopupMenuWillBecomeVisible(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel22.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, 340, 36));

        jLabel45.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Session 2");
        jPanel22.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, -1, -1));

        jComboBox4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select..." }));
        jComboBox4.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox4PopupMenuWillBecomeVisible(evt);
            }
        });
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        jPanel22.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, 340, 36));

        jButton11.setText("Save");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel22.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 540, 99, 41));

        javax.swing.GroupLayout add_consecutive_sessionsLayout = new javax.swing.GroupLayout(add_consecutive_sessions);
        add_consecutive_sessions.setLayout(add_consecutive_sessionsLayout);
        add_consecutive_sessionsLayout.setHorizontalGroup(
            add_consecutive_sessionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(add_consecutive_sessionsLayout.createSequentialGroup()
                .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 175, Short.MAX_VALUE))
            .addGroup(add_consecutive_sessionsLayout.createSequentialGroup()
                .addGap(285, 285, 285)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, 943, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        add_consecutive_sessionsLayout.setVerticalGroup(
            add_consecutive_sessionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(add_consecutive_sessionsLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(467, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(add_consecutive_sessions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 275, Short.MAX_VALUE)
                .addComponent(add_consecutive_sessions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel114MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel114MouseClicked
        // TODO add your handling code here:
        generator.Parent.removeAll();
        generator.Parent.add(new consecutive_sessions());
        generator.Parent.repaint();
        generator.Parent.revalidate();
    }//GEN-LAST:event_jLabel114MouseClicked

    private void jLabel114MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel114MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel114MouseEntered

    private void jComboBox1PopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox1PopupMenuWillBecomeVisible
        // TODO add your handling code here:
        if ("Select...".equals(jComboBox1.getItemAt(0))) {
            jComboBox1.removeItemAt(0);
        }
        if ("Select...".equals(jComboBox1.getItemAt(jComboBox1.getItemCount() - 1))) {
            jComboBox1.removeItemAt(jComboBox1.getItemCount() - 1);
        }
    }//GEN-LAST:event_jComboBox1PopupMenuWillBecomeVisible

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:

        try {
            DBConnect.iud("INSERT INTO consecutive_sessions VALUES('" + id + "','" + jComboBox2.getSelectedItem().toString() + "','" + jComboBox3.getSelectedItem().toString() + "','" + jComboBox1.getSelectedItem().toString() + "')");
            id++;

            JOptionPane pane = new JOptionPane(new Label("Details added successfully"), JOptionPane.INFORMATION_MESSAGE);
            JDialog dialog = pane.createDialog("Data Saved");
            dialog.setModal(true);
            dialog.setVisible(true);

            //JOptionPane.showMessageDialog(this, "Data Saved", "Details added successfully", JOptionPane.INFORMATION_MESSAGE);
            generator.Parent.removeAll();
            generator.Parent.add(new consecutive_sessions());
            generator.Parent.repaint();
            generator.Parent.revalidate();

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane pane = new JOptionPane(new Label("Details not added successfully"), JOptionPane.INFORMATION_MESSAGE);
            JDialog dialog = pane.createDialog("Data Not Saved");
            dialog.setModal(true);
            dialog.setVisible(true);

            //JOptionPane.showMessageDialog(this, "Data Not Saved", "Details Not successfully", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jComboBox2PopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox2PopupMenuWillBecomeVisible
        // TODO add your handling code here:
        if ("Select...".equals(jComboBox2.getItemAt(0))) {
            jComboBox2.removeItemAt(0);
        }
        if ("Select...".equals(jComboBox2.getItemAt(jComboBox2.getItemCount() - 1))) {
            jComboBox2.removeItemAt(jComboBox2.getItemCount() - 1);
        }
    }//GEN-LAST:event_jComboBox2PopupMenuWillBecomeVisible

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox3PopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox3PopupMenuWillBecomeVisible
        // TODO add your handling code here:
        if ("Select...".equals(jComboBox3.getItemAt(0))) {
            jComboBox3.removeItemAt(0);
        }
        if ("Select...".equals(jComboBox3.getItemAt(jComboBox3.getItemCount() - 1))) {
            jComboBox3.removeItemAt(jComboBox3.getItemCount() - 1);
        }
    }//GEN-LAST:event_jComboBox3PopupMenuWillBecomeVisible

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        // TODO add your handling code here:
        if (!(Character.isDigit(evt.getKeyChar()))) {
            evt.consume();
        }
        if (jTextField3.getText().length() == 1) {
            evt.consume();
        }


    }//GEN-LAST:event_jTextField3KeyTyped

    private void jComboBox4PopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox4PopupMenuWillBecomeVisible
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4PopupMenuWillBecomeVisible

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyReleased
        // TODO add your handling code here:
        try {
            int count = Integer.parseInt(jTextField3.getText());

            if (count == 1) {
                jLabel43.setOpaque(true);
                jComboBox3.setOpaque(true);
            }

            if (count == 2) {
                jLabel43.setOpaque(true);
                jLabel45.setOpaque(true);
                jComboBox3.setOpaque(true);
                jComboBox4.setOpaque(true);
            }

            if (count == 3) {
                jLabel43.setOpaque(true);
                jLabel45.setOpaque(true);
                jLabel41.setOpaque(true);
                jComboBox3.setOpaque(true);
                jComboBox4.setOpaque(true);
                jComboBox1.setOpaque(true);
            }
        } catch (Exception e) {
        }

    }//GEN-LAST:event_jTextField3KeyReleased

    private void jTextField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyPressed
        // TODO add your handling code here:
        try {
            if (Integer.parseInt(jTextField3.getText()) > 3) {
                jTextField3.setText("");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jTextField3KeyPressed

    private void jTextField3PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTextField3PropertyChange
        // TODO add your handling code here:
                try {
            if (Integer.parseInt(jTextField3.getText()) > 3) {
                jTextField3.setText("");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jTextField3PropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel add_consecutive_sessions;
    private javax.swing.JButton jButton11;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

    public void loadCombo() {
        try {
            String qry = "SELECT tag FROM tag";
            ResultSet rs = DBConnect.search(qry);
            jComboBox1.removeAllItems();
            jComboBox3.removeAllItems();
            jComboBox1.addItem("Select...");
            jComboBox3.addItem("Select...");
            while (rs.next()) {
                jComboBox1.addItem(rs.getString("tag"));
                jComboBox3.addItem(rs.getString("tag"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void loadCombo1() {
        try {
            String qry = "SELECT name FROM subject";
            ResultSet rs = DBConnect.search(qry);
            jComboBox2.removeAllItems();
            jComboBox2.addItem("Select...");
            while (rs.next()) {
                jComboBox2.addItem(rs.getString("name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void loadId() {
        try {
            String qry = "SELECT COUNT(consecutive_sessions.id) as count FROM consecutive_sessions";
            ResultSet rs = DBConnect.search(qry);
            rs.next();
            if (rs.getInt("count") == 0) {
                id = id + 1;
            } else {
                int i = rs.getInt("count");
                i++;
                id = id + i;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}