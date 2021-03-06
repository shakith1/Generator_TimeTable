/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable;

import java.awt.event.ItemEvent;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import service.DBConnect;

/**
 *
 * @author User
 */
public class rooms_tags_mem4 extends javax.swing.JPanel {

    Generator generator;
    
    /**
     * Creates new form rooms_tags_mem4
     */
    public rooms_tags_mem4() {
        initComponents();
        
        LoadBuildings();
        LoadSubjects();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rooms_tags_mem4 = new javax.swing.JPanel();
        room_tag_tiltle = new javax.swing.JLabel();
        TagRooms = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        BuildSelect = new javax.swing.JComboBox<>();
        jLabel51 = new javax.swing.JLabel();
        roomSelect = new javax.swing.JComboBox<>();
        jLabel52 = new javax.swing.JLabel();
        tagSelect = new javax.swing.JComboBox<>();
        add_btn_tag = new javax.swing.JButton();
        SpecialTags = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        sBuildSelect = new javax.swing.JComboBox<>();
        jLabel54 = new javax.swing.JLabel();
        sRoomSelect = new javax.swing.JComboBox<>();
        jLabel55 = new javax.swing.JLabel();
        sTagSelect = new javax.swing.JComboBox<>();
        jLabel56 = new javax.swing.JLabel();
        subjectSelect = new javax.swing.JComboBox<>();
        Spec_add_btn = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 204, 204));

        rooms_tags_mem4.setBackground(new java.awt.Color(0, 204, 204));

        room_tag_tiltle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        room_tag_tiltle.setText("Room and Tag Details");

        TagRooms.setBackground(new java.awt.Color(102, 102, 102));

        jLabel48.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("Add Tags for rooms");

        jLabel50.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("Building");

        BuildSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select the building", " " }));
        BuildSelect.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                BuildSelectItemStateChanged(evt);
            }
        });
        BuildSelect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuildSelectMouseClicked(evt);
            }
        });
        BuildSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuildSelectActionPerformed(evt);
            }
        });

        jLabel51.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("Room");

        roomSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel52.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("Tag");
        jLabel52.setToolTipText("");

        tagSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        add_btn_tag.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        add_btn_tag.setText("ADD TAG");
        add_btn_tag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btn_tagActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TagRoomsLayout = new javax.swing.GroupLayout(TagRooms);
        TagRooms.setLayout(TagRoomsLayout);
        TagRoomsLayout.setHorizontalGroup(
            TagRoomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TagRoomsLayout.createSequentialGroup()
                .addContainerGap(251, Short.MAX_VALUE)
                .addComponent(jLabel48)
                .addGap(231, 231, 231))
            .addGroup(TagRoomsLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(TagRoomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(add_btn_tag, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(TagRoomsLayout.createSequentialGroup()
                        .addGroup(TagRoomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel50)
                            .addComponent(jLabel51)
                            .addComponent(jLabel52))
                        .addGap(86, 86, 86)
                        .addGroup(TagRoomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BuildSelect, 0, 347, Short.MAX_VALUE)
                            .addComponent(roomSelect, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tagSelect, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TagRoomsLayout.setVerticalGroup(
            TagRoomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TagRoomsLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel48)
                .addGap(102, 102, 102)
                .addGroup(TagRoomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(BuildSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(TagRoomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(roomSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(TagRoomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel52)
                    .addComponent(tagSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(add_btn_tag)
                .addGap(53, 53, 53))
        );

        SpecialTags.setBackground(new java.awt.Color(0, 102, 153));

        jLabel49.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("Special Requests");

        jLabel53.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText("Building");

        sBuildSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        sBuildSelect.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                sBuildSelectItemStateChanged(evt);
            }
        });

        jLabel54.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("Room");

        sRoomSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel55.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setText("Tag");

        sTagSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel56.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setText("Subject");

        subjectSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        Spec_add_btn.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        Spec_add_btn.setText("ADD SPECITAL TAG");
        Spec_add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Spec_add_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SpecialTagsLayout = new javax.swing.GroupLayout(SpecialTags);
        SpecialTags.setLayout(SpecialTagsLayout);
        SpecialTagsLayout.setHorizontalGroup(
            SpecialTagsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SpecialTagsLayout.createSequentialGroup()
                .addGroup(SpecialTagsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SpecialTagsLayout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(jLabel49))
                    .addGroup(SpecialTagsLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(SpecialTagsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel53)
                            .addComponent(jLabel54)
                            .addComponent(jLabel55)
                            .addComponent(jLabel56))
                        .addGap(75, 75, 75)
                        .addGroup(SpecialTagsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sBuildSelect, 0, 355, Short.MAX_VALUE)
                            .addComponent(sRoomSelect, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sTagSelect, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(subjectSelect, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SpecialTagsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Spec_add_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        SpecialTagsLayout.setVerticalGroup(
            SpecialTagsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SpecialTagsLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel49)
                .addGap(99, 99, 99)
                .addGroup(SpecialTagsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(sBuildSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(SpecialTagsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(sRoomSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(SpecialTagsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(sTagSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(SpecialTagsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(subjectSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(Spec_add_btn)
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout rooms_tags_mem4Layout = new javax.swing.GroupLayout(rooms_tags_mem4);
        rooms_tags_mem4.setLayout(rooms_tags_mem4Layout);
        rooms_tags_mem4Layout.setHorizontalGroup(
            rooms_tags_mem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rooms_tags_mem4Layout.createSequentialGroup()
                .addGroup(rooms_tags_mem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rooms_tags_mem4Layout.createSequentialGroup()
                        .addGap(573, 573, 573)
                        .addComponent(room_tag_tiltle))
                    .addGroup(rooms_tags_mem4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(TagRooms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(SpecialTags, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(6659, Short.MAX_VALUE))
        );
        rooms_tags_mem4Layout.setVerticalGroup(
            rooms_tags_mem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rooms_tags_mem4Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(room_tag_tiltle)
                .addGap(41, 41, 41)
                .addGroup(rooms_tags_mem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TagRooms, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SpecialTags, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(239, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8000, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(rooms_tags_mem4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 874, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(rooms_tags_mem4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BuildSelectItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_BuildSelectItemStateChanged

        if(evt.getStateChange() == ItemEvent.SELECTED){
            building = BuildSelect.getSelectedItem().toString();
            roomSelect.removeAllItems();
            LoadRoom();
        }

    }//GEN-LAST:event_BuildSelectItemStateChanged

    private void BuildSelectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuildSelectMouseClicked

    }//GEN-LAST:event_BuildSelectMouseClicked

    private void BuildSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuildSelectActionPerformed

    }//GEN-LAST:event_BuildSelectActionPerformed

    private void add_btn_tagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btn_tagActionPerformed

        String build = BuildSelect.getSelectedItem().toString();
        String room = roomSelect.getSelectedItem().toString();
        String tag = tagSelect.getSelectedItem().toString();

        if(build.equals("Select a Building") || room.equals("Select a Room") || tag.equals("Select a Tag") ){
            JOptionPane.showMessageDialog(null, "Please Select All The Related Information");
        }else{
            try{

                String q = "INSERT INTO tagged_rooms (building, room, tag) VALUES ( '" + build + "', '"+ room +"', '"+ tag +"')";
                DBConnect.iud(q);
                //pst = con.prepareStatement(q);
                //pst.execute();

                JOptionPane.showMessageDialog(null, "Data Successfully Added!");
                clearTagRooms();
            }catch(Exception e){
                e.printStackTrace();
            }
        }

    }//GEN-LAST:event_add_btn_tagActionPerformed

    private void sBuildSelectItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_sBuildSelectItemStateChanged

        if(evt.getStateChange() == ItemEvent.SELECTED){
            building2 = sBuildSelect.getSelectedItem().toString();
            sRoomSelect.removeAllItems();
            LoadSpecialRoom();
        }
    }//GEN-LAST:event_sBuildSelectItemStateChanged

    private void Spec_add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Spec_add_btnActionPerformed

        String build = sBuildSelect.getSelectedItem().toString();
        String room = sRoomSelect.getSelectedItem().toString();
        String tag = sTagSelect.getSelectedItem().toString();
        String subject = subjectSelect.getSelectedItem().toString();

        if(build.equals("Select a Building") || room.equals("Select a Room") || tag.equals("Select a Tag") || subject.equals("Select a Subject")){
            JOptionPane.showMessageDialog(null, "Please Select All The Related Information");
        }else{

            try{

                String q = "INSERT INTO special_tags (building, room, tag, subject) VALUES ( '" + build + "', '"+ room +"', '"+ tag +"', '"+ subject +"')";
                DBConnect.iud(q);
                //pst = con.prepareStatement(q);
                //pst.execute();

                JOptionPane.showMessageDialog(null, "Data Successfully Added!");
                clearTagRooms();
            }catch(Exception e){
                e.printStackTrace();
            }

        }
    }//GEN-LAST:event_Spec_add_btnActionPerformed

    String building, building2;
    private void LoadRoom(){
        try{
            
            //String building = BuildSelect.getSelectedItem().toString();
            String q = "SELECT room FROM location where buildingName = '"+ building +" '";
            ResultSet rs = DBConnect.search(q);
            roomSelect.removeAllItems();
            roomSelect.addItem("Select a Room");
            
            
            
            while(rs.next()){
                roomSelect.addItem(rs.getString("room"));
                
            }
            
        }catch(Exception e){
           e.printStackTrace();
        }
    }
    
    private void clearTagRooms(){
        BuildSelect.setSelectedItem("Select a Building");
        roomSelect.setSelectedItem("Select a Room");
        tagSelect.setSelectedItem("Select a Tag");
        
        sBuildSelect.setSelectedItem("Select a Building");
        sRoomSelect.setSelectedItem("Select a Room");
        sTagSelect.setSelectedItem("Select a Tag");
        subjectSelect.setSelectedItem("Select a Subject");
    }
    
    private void LoadSpecialRoom(){
        try{
            String q = "SELECT room FROM location where buildingName = '"+ building2 +" '";
            ResultSet rs = DBConnect.search(q);
            sRoomSelect.removeAllItems();
            sRoomSelect.addItem("Select a Room");
            
            while(rs.next()){
                sRoomSelect.addItem(rs.getString("room"));
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    private void LoadBuildings(){
        try{
            String sql = "SELECT Name FROM building";
            ResultSet rs = DBConnect.search(sql);
            BuildSelect.removeAllItems();
            BuildSelect.addItem("Select a Building");
            sBuildSelect.removeAllItems();
            sBuildSelect.addItem("Select a Building");
           
            
            while(rs.next()){
                BuildSelect.addItem(rs.getString("Name"));
                sBuildSelect.addItem(rs.getString("Name"));
                
            }
            
        
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    private void LoadSubjects(){
        try{
            String q = "SELECT name FROM subject";
            ResultSet rs = DBConnect.search(q);
            subjectSelect.removeAllItems();
            subjectSelect.addItem("Select a Subject");
            
            while(rs.next()){
                subjectSelect.addItem(rs.getString("name"));
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BuildSelect;
    private javax.swing.JButton Spec_add_btn;
    private javax.swing.JPanel SpecialTags;
    private javax.swing.JPanel TagRooms;
    private javax.swing.JButton add_btn_tag;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JComboBox<String> roomSelect;
    private javax.swing.JLabel room_tag_tiltle;
    private javax.swing.JPanel rooms_tags_mem4;
    private javax.swing.JComboBox<String> sBuildSelect;
    private javax.swing.JComboBox<String> sRoomSelect;
    private javax.swing.JComboBox<String> sTagSelect;
    private javax.swing.JComboBox<String> subjectSelect;
    private javax.swing.JComboBox<String> tagSelect;
    // End of variables declaration//GEN-END:variables
}
