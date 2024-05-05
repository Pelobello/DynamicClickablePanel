/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package DynamicUi.Forms;

import DynamicUi.EventItem.EventItem;
import DynamicUi.Items.Item;
import DynamicUi.Items.Item2;
import DynamicUi.Model.ModelItem;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;

/**
 *
 * @author USER
 */
public class MainForm extends javax.swing.JPanel {

   
 


    public EventItem getEventItem() {
        return eventItem;
    }

  
    public void setEventItem(EventItem eventItem) {
        this.eventItem = eventItem;
    }

 
    public MainForm() {
        initComponents();
    }
 
    private EventItem eventItem;
   public void addItem(ModelItem data){
       Item item = new Item();
       item.setData(data);
       item.addMouseListener(new MouseAdapter() {
           @Override
           public void mousePressed(MouseEvent e) {
                          if (SwingUtilities.isLeftMouseButton(e)) {
                    eventItem.itemClick(item, data);
                }
           }
       });
       panelItem.add(item);
       repaint();
       revalidate();
   }
   public void addItem2(ModelItem data){
       Item2 item = new Item2();
       item.setData(data);
       item.addMouseListener(new MouseAdapter() {
           @Override
           public void mousePressed(MouseEvent e) {
                          if (SwingUtilities.isLeftMouseButton(e)) {
                    eventItem.itemClick(item, data);
                }
           }
       });
       panelItem2.add(item);
       repaint();
       revalidate();
   }
   public void setSelected(Component item) {
        for (Component com : panelItem.getComponents()) {
            Item i = (Item) com;
            if (i.isSelected()) {
                i.setSelected(false);
            }
        }
        ((Item) item).setSelected(true);
    }
   public void showItem(ModelItem data){
       Name.setText(data.getExamName());
       ID.setText(data.getExamID());
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelItem = new DynamicUi.Swing.PanelItem();
        Name = new javax.swing.JLabel();
        ID = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        panelItem2 = new DynamicUi.Swing.PanelItem();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setViewportView(panelItem);

        Name.setText("test");

        ID.setText("test");

        jScrollPane2.setViewportView(panelItem2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ID;
    private javax.swing.JLabel Name;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private DynamicUi.Swing.PanelItem panelItem;
    public DynamicUi.Swing.PanelItem panelItem2;
    // End of variables declaration//GEN-END:variables
}
