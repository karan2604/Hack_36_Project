/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hack_36_project;

import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javafx.scene.Node;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileFilter;
import org.icepdf.ri.common.ComponentKeyBinding;
import org.icepdf.ri.common.SwingController;
import org.icepdf.ri.common.SwingViewBuilder;
import org.json.JSONArray;

/**
 *
 * @author asus
 */
public class Pdf_Viewer extends javax.swing.JFrame {
    private Node question;
    String query = "";
    String meaning_query="";
    APIHandler obj;
    String[] Urls = new String[4];
    /**
     * Creates new form PDF_Viewer
     */
    public Pdf_Viewer() {
        
        System.getProperties().put("org.icepdf.core.views.background.color", "#FFFFFF");
        System.getProperties().put("org.icepdf.core.views.page.border.color", "#FFFFFF");
        System.getProperties().put("org.icepdf.core.views.page.shadow.color", "#FFFFFF");
        
        initComponents();
       
    }
    
    
    
  
   
    
   
        



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_open_pdf = new javax.swing.JButton();
        pdf_scroll_pane = new javax.swing.JScrollPane();
        AboveJPanel = new javax.swing.JPanel();
        search_video = new javax.swing.JButton();
        txt3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BelowJPanel = new javax.swing.JPanel();
        search_dict = new javax.swing.JButton();
        txt2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1630, 1120));

        btn_open_pdf.setBackground(new java.awt.Color(255, 255, 255));
        btn_open_pdf.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_open_pdf.setForeground(new java.awt.Color(255, 51, 0));
        btn_open_pdf.setText("Open Pdf");
        btn_open_pdf.setOpaque(false);
        btn_open_pdf.setRequestFocusEnabled(false);
        btn_open_pdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_open_pdfActionPerformed(evt);
            }
        });

        pdf_scroll_pane.setBackground(new java.awt.Color(255, 255, 255));
        pdf_scroll_pane.setAutoscrolls(true);
        pdf_scroll_pane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pdf_scroll_paneMouseReleased(evt);
            }
        });

        AboveJPanel.setBackground(new java.awt.Color(204, 255, 255));
        AboveJPanel.setForeground(new java.awt.Color(204, 255, 204));

        search_video.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/iconfinder_SEO_search_969259 (3).png"))); // NOI18N
        search_video.setBorder(null);
        search_video.setContentAreaFilled(false);
        search_video.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_videoActionPerformed(evt);
            }
        });

        txt3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt3.setText("Youtube Search");
        txt3.setToolTipText("Search Here");
        txt3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        txt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt3ActionPerformed(evt);
            }
        });
        txt3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt3KeyTyped(evt);
            }
        });

        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout AboveJPanelLayout = new javax.swing.GroupLayout(AboveJPanel);
        AboveJPanel.setLayout(AboveJPanelLayout);
        AboveJPanelLayout.setHorizontalGroup(
            AboveJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AboveJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AboveJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AboveJPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(txt3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(search_video, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AboveJPanelLayout.createSequentialGroup()
                        .addGroup(AboveJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
        );
        AboveJPanelLayout.setVerticalGroup(
            AboveJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AboveJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AboveJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search_video, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        BelowJPanel.setBackground(new java.awt.Color(204, 204, 255));

        search_dict.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/iconfinder_SEO_search_969259 (3).png"))); // NOI18N
        search_dict.setBorder(null);
        search_dict.setContentAreaFilled(false);
        search_dict.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_dictActionPerformed(evt);
            }
        });

        txt2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt2.setText("Dictionary Search");
        txt2.setToolTipText("Search Here");
        txt2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        txt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt2ActionPerformed(evt);
            }
        });
        txt2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt2KeyTyped(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout BelowJPanelLayout = new javax.swing.GroupLayout(BelowJPanel);
        BelowJPanel.setLayout(BelowJPanelLayout);
        BelowJPanelLayout.setHorizontalGroup(
            BelowJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BelowJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BelowJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(txt2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(search_dict, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BelowJPanelLayout.setVerticalGroup(
            BelowJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BelowJPanelLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(BelowJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search_dict, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_open_pdf)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pdf_scroll_pane, javax.swing.GroupLayout.PREFERRED_SIZE, 1066, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AboveJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BelowJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_open_pdf)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AboveJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BelowJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pdf_scroll_pane, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt2KeyTyped

    private void search_dictActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_dictActionPerformed
        meaning_query = txt2.getText();
        obj = new APIHandler(query,meaning_query);
        parseOxfordResponse o = new parseOxfordResponse(obj.HandleOxford());
        String m = o.getMeaning();
        m = m.replaceAll("(.{39})", "$1\n");
        jTextArea1.setText("Meaning :\n"+ m);
    }//GEN-LAST:event_search_dictActionPerformed

    private void txt3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt3KeyTyped

    private void search_videoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_videoActionPerformed
//        query = txt3.getText();
//        obj = new APIHandler(query,meaning_query);
//        parseYTResponse o = new parseYTResponse(obj.HandleYT());
//        txt4.setText(o.getTitle()+" -"+ o.getUrlToWatch());
          NetClientGet net=new NetClientGet();
           String search=txt3.getText();
           search=search.replaceAll("\\s", "%20");
           JSONArray items=net.returnUrl(search);
           
           for(int i = 1 ; i < 5 ; i++){
               StringBuilder strb = new StringBuilder();
               String str="<html><body><b><u>";
                       str+= items.getJSONObject(i).getJSONObject("snippet").getString("title");
               Urls[i-1]="http://www.youtube.com/embed/" + items.getJSONObject(i).getJSONObject("id").getString("videoId");    
                    strb.append(str+"<br></b></u>");
                    str="";
                    str= items.getJSONObject(i).getJSONObject("snippet").getString("description");
                    str=str.substring(0, 50)+"<br>"+str.substring(50, 100);
                    strb.append(str);
                    str=strb.toString();
                     jLabel1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                     jLabel2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                     jLabel3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                     jLabel4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                    str+="</body></html>";
                     String img=items.getJSONObject(i).getJSONObject("snippet").getJSONObject("thumbnails").getJSONObject("default").getString("url");
                      Image image = null;
        try {
            URL url = new URL(img);
            image = ImageIO.read(url);
        } catch (IOException e) {
        	e.printStackTrace();
        }
        
        ImageIcon icon=new ImageIcon(image);
       
                    if(i==1){
                         jLabel1.setIcon(icon);
                          jLabel1.setText(str);
                    }
                    if(i==2){
                         jLabel2.setIcon(icon);
                          jLabel2.setText(str);
                    }
                    if(i==3){
                         jLabel3.setIcon(icon);
                          jLabel3.setText(str);
                    }
                    if(i==4){
                         jLabel4.setIcon(icon);
                          jLabel4.setText(str);
                    }
                                   
           }
    }//GEN-LAST:event_search_videoActionPerformed

    private void pdf_scroll_paneMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pdf_scroll_paneMouseReleased

    }//GEN-LAST:event_pdf_scroll_paneMouseReleased

    private void btn_open_pdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_open_pdfActionPerformed
        // TODO add your handling code here:

        JFileChooser ch=new JFileChooser();
        ch.setFileFilter(new FileFilter(){

            @Override
            public boolean accept(File f) {
                String name = f.getName();
                return f.isDirectory() || name.endsWith(".pdf");
            }

            @Override
            public String getDescription() {
                return "pdf";
            }

        });
        int c=ch.showOpenDialog(this);
        if(c==JFileChooser.APPROVE_OPTION)
        {
            openpdf(ch.getSelectedFile().getAbsolutePath());
            
            BookMark_Index.getallindex(ch.getSelectedFile().getAbsolutePath());
        }
    }//GEN-LAST:event_btn_open_pdfActionPerformed

    private void txt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt2ActionPerformed

    private void txt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt3ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        try{
        Desktop.getDesktop().browse(new URL(Urls[0]).toURI());
                }
       catch(Exception e){
           
           
       }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        try{
        Desktop.getDesktop().browse(new URL(Urls[1]).toURI());
                }
       catch(Exception e){
           
           
       }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
       try{
        Desktop.getDesktop().browse(new URL(Urls[3]).toURI());
                }
       catch(Exception e){
           
           
       }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        try{
        Desktop.getDesktop().browse(new URL(Urls[2]).toURI());
                }
       catch(Exception e){
           
           
       }
    }//GEN-LAST:event_jLabel2MouseClicked

    /**
     * @param args the command line arguments
     */
    
    void openpdf(String file){
  
    try {
 
           SwingController control=new SwingController();
           
            SwingViewBuilder factry=new SwingViewBuilder(control);
            
            JPanel veiwerCompntpnl=factry.buildViewerPanel();
            ComponentKeyBinding.install(control, veiwerCompntpnl);
            control.getDocumentViewController().setAnnotationCallback(
                    new org.icepdf.ri.common.MyAnnotationCallback(
                    control.getDocumentViewController()));
                    control.openDocument(file);
            pdf_scroll_pane.setViewportView(veiwerCompntpnl); 
            
          
    
      } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,"Cannot Load Pdf");
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
            java.util.logging.Logger.getLogger(Pdf_Viewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pdf_Viewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pdf_Viewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pdf_Viewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pdf_Viewer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AboveJPanel;
    private javax.swing.JPanel BelowJPanel;
    private javax.swing.JButton btn_open_pdf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JScrollPane pdf_scroll_pane;
    private javax.swing.JButton search_dict;
    private javax.swing.JButton search_video;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    // End of variables declaration//GEN-END:variables
}
