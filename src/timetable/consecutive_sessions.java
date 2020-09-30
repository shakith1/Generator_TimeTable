/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable;

import java.awt.Font;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import service.DBConnect;

/**
 *
 * @author Shakith
 */
public class consecutive_sessions extends javax.swing.JPanel {

    Generator generator;

    /**
     * Creates new form consecutive_sessions
     */
    public consecutive_sessions() {
        initComponents();

        Font font = new Font("Verdana", Font.BOLD, 14);

        jTable2.getTableHeader().setFont(font);
        ((DefaultTableCellRenderer) jTable2.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(0);
        loadData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        consecutive_sessions = new javax.swing.JPanel();
        jPanel40 = new javax.swing.JPanel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel71 = new javax.swing.JLabel();

        consecutive_sessions.setBackground(new java.awt.Color(102, 51, 109));

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
        jLabel115.setText("Consecutive Sessions");

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel40Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel114)
                .addGap(519, 519, 519)
                .addComponent(jLabel115)
                .addContainerGap(646, Short.MAX_VALUE))
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

        jScrollPane2.setBorder(null);
        jScrollPane2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jTable2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Group", "Session 1", "Session 2", "Session 3"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setGridColor(new java.awt.Color(255, 255, 255));
        jTable2.setRowHeight(25);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jLabel71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-plus-75.png"))); // NOI18N
        jLabel71.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel71MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout consecutive_sessionsLayout = new javax.swing.GroupLayout(consecutive_sessions);
        consecutive_sessions.setLayout(consecutive_sessionsLayout);
        consecutive_sessionsLayout.setHorizontalGroup(
            consecutive_sessionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(consecutive_sessionsLayout.createSequentialGroup()
                .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2536, Short.MAX_VALUE))
            .addGroup(consecutive_sessionsLayout.createSequentialGroup()
                .addGroup(consecutive_sessionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(consecutive_sessionsLayout.createSequentialGroup()
                        .addGap(784, 784, 784)
                        .addComponent(jLabel71))
                    .addGroup(consecutive_sessionsLayout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        consecutive_sessionsLayout.setVerticalGroup(
            consecutive_sessionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(consecutive_sessionsLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jLabel71)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(consecutive_sessions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(consecutive_sessions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel114MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel114MouseClicked
        // TODO add your handling code here:
        generator.Parent.removeAll();
        generator.Parent.add(new settingsPanel());
        generator.Parent.repaint();
        generator.Parent.revalidate();
    }//GEN-LAST:event_jLabel114MouseClicked

    private void jLabel114MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel114MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel114MouseEntered

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable2MouseClicked

    private void jLabel71MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel71MouseClicked
        // TODO add your handling code here:
        generator.Parent.removeAll();
        generator.Parent.add(new add_consecutive_sessions());
        generator.Parent.repaint();
        generator.Parent.revalidate();
    }//GEN-LAST:event_jLabel71MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel consecutive_sessions;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables

    public void loadData() {
        try {
            DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
            String qry = "SELECT * FROM consecutive_sessions";
            ResultSet rs = DBConnect.search(qry);
            dtm.setRowCount(0);
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("consecutive_sessions.id"));
                v.add(rs.getString("consecutive_sessions.group"));
                v.add(rs.getString("consecutive_sessions.session_1"));
                v.add(rs.getString("consecutive_sessions.session_2"));
                v.add(rs.getString("consecutive_sessions.session_3"));
                dtm.addRow(v);
            }
            for (int i = 0; i < jTable2.getColumnCount(); i++) {
                DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
                centerRenderer.setHorizontalAlignment(jLabel115.CENTER);
                jTable2.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
