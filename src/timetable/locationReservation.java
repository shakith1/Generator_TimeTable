/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable;

import java.awt.event.ItemEvent;
import java.sql.Date;
import java.sql.ResultSet;
import java.text.DateFormat;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import service.DBConnect;

/**
 *
 * @author User
 */
public class locationReservation extends javax.swing.JPanel {

    ResultSet rs;
    String building1, room1, building;
    /**
     * Creates new form locationReservation
     */
    public locationReservation() {
        initComponents();
        
        LoadReservationBuilding();
        reserveTableLoad();
    }
    
    private void clearReserveRoom(){
        reserveBuild.setSelectedItem("Select a Building");
        reserveRoom.setSelectedItem("Select a Room");
        Date date = new Date(0);
        reserveDateChooser.setDate(date);
        startTime.setText("");
        endTime.setText("");
        start_am_pm.setSelectedItem("am");
        end_am_pm.setSelectedItem("pm");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        locationReservation = new javax.swing.JPanel();
        jPanel44 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        reservationDetailTable = new javax.swing.JTable();
        reserveSearchBuildLable = new javax.swing.JLabel();
        reserveSearchBuild = new javax.swing.JTextField();
        reserveSearch = new javax.swing.JButton();
        DeleteReservation = new javax.swing.JButton();
        reservBuildLabel = new javax.swing.JLabel();
        reserveBuild = new javax.swing.JComboBox<>();
        reserveRoomLabel = new javax.swing.JLabel();
        reserveRoom = new javax.swing.JComboBox<>();
        reserveDateLabel = new javax.swing.JLabel();
        reserveTimeLabel = new javax.swing.JLabel();
        AddReservation = new javax.swing.JButton();
        reserveDateChooser = new com.toedter.calendar.JDateChooser();
        jLabel144 = new javax.swing.JLabel();
        startTime = new javax.swing.JTextField();
        endTime = new javax.swing.JTextField();
        start_am_pm = new javax.swing.JComboBox<>();
        end_am_pm = new javax.swing.JComboBox<>();
        jLabel142 = new javax.swing.JLabel();

        locationReservation.setBackground(new java.awt.Color(0, 204, 204));

        jPanel44.setBackground(new java.awt.Color(0, 153, 153));

        reservationDetailTable.setModel(new javax.swing.table.DefaultTableModel(
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
        reservationDetailTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reservationDetailTableMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(reservationDetailTable);

        reserveSearchBuildLable.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        reserveSearchBuildLable.setForeground(new java.awt.Color(255, 255, 255));
        reserveSearchBuildLable.setText("Building");

        reserveSearchBuild.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N

        reserveSearch.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        reserveSearch.setText("SEARCH");
        reserveSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reserveSearchActionPerformed(evt);
            }
        });

        DeleteReservation.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        DeleteReservation.setText("DELETE");
        DeleteReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteReservationActionPerformed(evt);
            }
        });

        reservBuildLabel.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        reservBuildLabel.setText("Building");

        reserveBuild.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        reserveBuild.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                reserveBuildItemStateChanged(evt);
            }
        });

        reserveRoomLabel.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        reserveRoomLabel.setText("Room");

        reserveRoom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        reserveDateLabel.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        reserveDateLabel.setText("Date");

        reserveTimeLabel.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        reserveTimeLabel.setText("Time");

        AddReservation.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        AddReservation.setText("Reserve");
        AddReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddReservationActionPerformed(evt);
            }
        });

        jLabel144.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel144.setText("To");

        start_am_pm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "am", "pm" }));

        end_am_pm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "am", "pm" }));

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel44Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reservBuildLabel)
                    .addComponent(reserveRoomLabel)
                    .addComponent(reserveDateLabel)
                    .addComponent(reserveTimeLabel))
                .addGap(39, 39, 39)
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(reserveRoom, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reserveBuild, javax.swing.GroupLayout.Alignment.LEADING, 0, 303, Short.MAX_VALUE)
                    .addComponent(reserveDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addComponent(startTime, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(start_am_pm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel44Layout.createSequentialGroup()
                                .addComponent(AddReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE))
                            .addGroup(jPanel44Layout.createSequentialGroup()
                                .addComponent(jLabel144)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(endTime, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(end_am_pm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel44Layout.createSequentialGroup()
                                .addComponent(reserveSearchBuildLable)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                                .addComponent(reserveSearchBuild, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(90, 90, 90)
                                .addComponent(reserveSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel44Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(DeleteReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel44Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel44Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reserveSearchBuild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reserveSearch)
                    .addComponent(reserveSearchBuildLable))
                .addGap(18, 18, 18)
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(reservBuildLabel)
                            .addComponent(reserveBuild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(reserveRoomLabel)
                            .addComponent(reserveRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(reserveDateLabel)
                            .addComponent(reserveDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(reserveTimeLabel)
                            .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel144)
                                .addComponent(startTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(endTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(start_am_pm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(end_am_pm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AddReservation)))
                .addGap(59, 59, 59)
                .addComponent(DeleteReservation)
                .addGap(176, 176, 176))
        );

        jLabel142.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel142.setText("Room Reservation");

        javax.swing.GroupLayout locationReservationLayout = new javax.swing.GroupLayout(locationReservation);
        locationReservation.setLayout(locationReservationLayout);
        locationReservationLayout.setHorizontalGroup(
            locationReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locationReservationLayout.createSequentialGroup()
                .addGroup(locationReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(locationReservationLayout.createSequentialGroup()
                        .addGap(634, 634, 634)
                        .addComponent(jLabel142))
                    .addGroup(locationReservationLayout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jPanel44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(6693, Short.MAX_VALUE))
        );
        locationReservationLayout.setVerticalGroup(
            locationReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, locationReservationLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel142)
                .addGap(56, 56, 56)
                .addComponent(jPanel44, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(212, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8003, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(locationReservation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 874, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(locationReservation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void reservationDetailTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reservationDetailTableMouseClicked

        int row = reservationDetailTable.getSelectedRow();

        building1 = reservationDetailTable.getValueAt(row, 0).toString();
        room1 = reservationDetailTable.getValueAt(row, 1).toString();
    }//GEN-LAST:event_reservationDetailTableMouseClicked

    private void DeleteReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteReservationActionPerformed

        int x = JOptionPane.showConfirmDialog(null, "Do you really want to Delete");

        if(x == 0){

            try{
                String query = "DELETE from reserved_rooms where building = '"+ building1 +"' and room = '"+ room1 +"'";
                DBConnect.iud(query);
                //pst = con.prepareStatement(query);
                //pst.execute();

                reserveTableLoad();
            }catch(Exception e){
                e.printStackTrace();
            }
        }

    }//GEN-LAST:event_DeleteReservationActionPerformed

    private void reserveBuildItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_reserveBuildItemStateChanged

        if(evt.getStateChange() == ItemEvent.SELECTED){
            building = reserveBuild.getSelectedItem().toString();
            reserveRoom.removeAllItems();
            LoadReservRoom();
        }
    }//GEN-LAST:event_reserveBuildItemStateChanged

    private void AddReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddReservationActionPerformed

        //Reservations Details Adding code and query
        String build = reserveBuild.getSelectedItem().toString();
        String room = reserveRoom.getSelectedItem().toString();
        java.util.Date date = reserveDateChooser.getDate();
        String strDate = DateFormat.getDateInstance().format(date);
        String stime = startTime.getText();
        String am_pm_s = start_am_pm.getSelectedItem().toString();
        String etime = endTime.getText();
        String am_pm_e = end_am_pm.getSelectedItem().toString();

        String sTime = stime + " " + am_pm_s;
        String endTime = etime + " " + am_pm_e;

        if(build.equals("Select a Building") || room.equals("Select a Room")){
            JOptionPane.showMessageDialog(null, "Please Select All The Related Information");
        }else{

            try{

                String q = "INSERT INTO reserved_rooms (building, room, date, start_time, end_time) VALUES ( '" + build + "', '"+ room +"', '"+ strDate +"', '"+ sTime +"', '"+ endTime +"')";
                DBConnect.iud(q);
                //pst = con.prepareStatement(q);
                //pst.execute();

                JOptionPane.showMessageDialog(null, "Data Successfully Added!");

                clearReserveRoom();
                reserveTableLoad();
            }catch(Exception e){
                e.printStackTrace();
            }

        }

    }//GEN-LAST:event_AddReservationActionPerformed

    private void reserveSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reserveSearchActionPerformed
        
        String name = reserveSearchBuild.getText();
       
            try{
            String query = "SELECT * from reserved_rooms where building LIKE '%"+ name +"%'";
            //pst = con.prepareStatement(query);
            rs = DBConnect.search(query);
            

            reservationDetailTable.setModel(DbUtils.resultSetToTableModel(rs));

        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_reserveSearchActionPerformed

     public void reserveTableLoad(){
        try{
            String q = "SELECT * FROM reserved_rooms";
            //pst = con.prepareStatement(q);
            //rs = pst.executeQuery();
            rs = DBConnect.search(q);
            
            reservationDetailTable.setModel(DbUtils.resultSetToTableModel(rs));
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
     
     private void LoadReservationBuilding(){
        try{
            String sql = "SELECT Name FROM building";
            ResultSet rs = DBConnect.search(sql);
            reserveBuild.removeAllItems();
            reserveBuild.addItem("Select a Building");
            
            
            while(rs.next()){
                reserveBuild.addItem(rs.getString("Name"));
                
            }
            
        
        }catch(Exception e){
            e.printStackTrace();
        }
    }
     
     private void LoadReservRoom(){
        try{
            String q = "SELECT room FROM location where buildingName = '"+ building +"' ";
            ResultSet rs = DBConnect.search(q);
            reserveRoom.removeAllItems();
            reserveRoom.addItem("Select a Room");
            
            while(rs.next()){
                reserveRoom.addItem(rs.getString("room"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddReservation;
    private javax.swing.JButton DeleteReservation;
    private javax.swing.JTextField endTime;
    private javax.swing.JComboBox<String> end_am_pm;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JPanel locationReservation;
    private javax.swing.JLabel reservBuildLabel;
    private javax.swing.JTable reservationDetailTable;
    private javax.swing.JComboBox<String> reserveBuild;
    private com.toedter.calendar.JDateChooser reserveDateChooser;
    private javax.swing.JLabel reserveDateLabel;
    private javax.swing.JComboBox<String> reserveRoom;
    private javax.swing.JLabel reserveRoomLabel;
    private javax.swing.JButton reserveSearch;
    private javax.swing.JTextField reserveSearchBuild;
    private javax.swing.JLabel reserveSearchBuildLable;
    private javax.swing.JLabel reserveTimeLabel;
    private javax.swing.JTextField startTime;
    private javax.swing.JComboBox<String> start_am_pm;
    // End of variables declaration//GEN-END:variables
}