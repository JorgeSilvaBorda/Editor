package editor;

import java.awt.*;
import java.util.Calendar;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.SyntaxConstants;
import org.fife.ui.rtextarea.RTextScrollPane;

/**
 *
 * @author jasilvab
 */
public class Ventana extends javax.swing.JFrame {
    RSyntaxTextArea textArea = new RSyntaxTextArea(20, 60);
    JTable salida = new JTable();
    String lenguaje = "";
    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();/*
        JPanel cp = new JPanel(new BorderLayout());*/
        //RSyntaxTextArea textArea = new RSyntaxTextArea(20, 60);
        textArea.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_JAVA);
        textArea.setCodeFoldingEnabled(true);
        RTextScrollPane sp = new RTextScrollPane(textArea);
        panelIzquierdo.add(sp);
        
        //setContentPane(cp);
        //setTitle("Text Editor Demo");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        
        salida.setAutoscrolls(true);
        //salidas.setLayout(new BorderLayout());
        JScrollPane scroll = new JScrollPane(salida);
        scroll.setViewportView(salida);
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("Hora");
        modelo.addColumn("Mensaje");
        salida.setModel(modelo);
        salida.getColumn("Hora").setWidth(120);
        salida.getColumn("Hora").setMaxWidth(120);
        salida.getColumn("Hora").setPreferredWidth(120);
        salida.setGridColor(Color.WHITE);
        panelFondo.add(scroll);
        splitHor.setDividerLocation(0.90);
        splitVer.setDividerLocation(0.90);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cp = new javax.swing.JPanel();
        splitHor = new javax.swing.JSplitPane();
        splitVer = new javax.swing.JSplitPane();
        panelIzquierdo = new javax.swing.JPanel();
        panelDerecho = new javax.swing.JPanel();
        panelFondo = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        btnJava = new javax.swing.JMenuItem();
        btnSql = new javax.swing.JMenuItem();
        btnPhp = new javax.swing.JMenuItem();
        btnJavascript = new javax.swing.JMenuItem();
        btnHtml = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });

        cp.setLayout(new java.awt.BorderLayout());

        splitHor.setDividerLocation(400);
        splitHor.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        splitVer.setDividerLocation(640);

        panelIzquierdo.setMinimumSize(new java.awt.Dimension(800, 400));
        panelIzquierdo.setLayout(new javax.swing.BoxLayout(panelIzquierdo, javax.swing.BoxLayout.LINE_AXIS));
        splitVer.setLeftComponent(panelIzquierdo);

        panelDerecho.setMaximumSize(new java.awt.Dimension(200, 2147483647));
        panelDerecho.setMinimumSize(new java.awt.Dimension(100, 0));
        panelDerecho.setPreferredSize(new java.awt.Dimension(200, 2147483647));
        panelDerecho.setLayout(new java.awt.BorderLayout());
        splitVer.setRightComponent(panelDerecho);

        splitHor.setTopComponent(splitVer);

        panelFondo.setMaximumSize(new java.awt.Dimension(2147483647, 200));
        panelFondo.setMinimumSize(new java.awt.Dimension(0, 50));
        panelFondo.setLayout(new java.awt.BorderLayout());
        splitHor.setRightComponent(panelFondo);

        cp.add(splitHor, java.awt.BorderLayout.CENTER);

        jMenu1.setText("Archivo");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edición");

        jMenu3.setText("Lenguaje");

        btnJava.setText("Java");
        btnJava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJavaActionPerformed(evt);
            }
        });
        jMenu3.add(btnJava);

        btnSql.setText("Sql");
        btnSql.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSqlActionPerformed(evt);
            }
        });
        jMenu3.add(btnSql);

        btnPhp.setText("Php");
        btnPhp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhpActionPerformed(evt);
            }
        });
        jMenu3.add(btnPhp);

        btnJavascript.setText("JavaScript");
        btnJavascript.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJavascriptActionPerformed(evt);
            }
        });
        jMenu3.add(btnJavascript);

        btnHtml.setText("HTML");
        btnHtml.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHtmlActionPerformed(evt);
            }
        });
        jMenu3.add(btnHtml);

        jMenu2.add(jMenu3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cp, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged
        
    }//GEN-LAST:event_formWindowStateChanged

    private void btnSqlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSqlActionPerformed
        textArea.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_SQL);
        this.lenguaje = "SQL";
        log("Lenguaje cambiado a SQL.");
    }//GEN-LAST:event_btnSqlActionPerformed

    private void btnJavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJavaActionPerformed
        textArea.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_JAVA);
        this.lenguaje = "Java";
        log("Lenguaje cambiado a Java.");
    }//GEN-LAST:event_btnJavaActionPerformed

    private void btnPhpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhpActionPerformed
        textArea.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_PHP);
        this.lenguaje = "PHP";
        log("Lenguaje cambiado a PHP.");
    }//GEN-LAST:event_btnPhpActionPerformed

    private void btnJavascriptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJavascriptActionPerformed
        textArea.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_JAVASCRIPT);
        this.lenguaje = "JavaScript";
        log("Lenguaje cambiado a JavaScript.");
    }//GEN-LAST:event_btnJavascriptActionPerformed

    private void btnHtmlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHtmlActionPerformed
        textArea.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_HTML);
        this.lenguaje = "HTML";
        log("Lenguaje cambiado a HTML.");
    }//GEN-LAST:event_btnHtmlActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnHtml;
    private javax.swing.JMenuItem btnJava;
    private javax.swing.JMenuItem btnJavascript;
    private javax.swing.JMenuItem btnPhp;
    private javax.swing.JMenuItem btnSql;
    private javax.swing.JPanel cp;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel panelDerecho;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPanel panelIzquierdo;
    private javax.swing.JSplitPane splitHor;
    private javax.swing.JSplitPane splitVer;
    // End of variables declaration//GEN-END:variables
    
    public void log(String mensaje){
        Calendar Cal= Calendar.getInstance(); 
        String fec= Cal.get(Cal.DATE)+"/"
                +(Cal.get(Cal.MONTH)+1)+"/"
                +Cal.get(Cal.YEAR)+" "
                +Cal.get(Cal.HOUR_OF_DAY)+":"
                +Cal.get(Cal.MINUTE)+":"
                +Cal.get(Cal.SECOND); 
        SimpleAttributeSet attrs = new SimpleAttributeSet();
        StyleConstants.setBold(attrs, true);
        java.awt.Font MyFont = new java.awt.Font ("Arial", Font.BOLD, 10);
        DefaultTableModel modelo = (DefaultTableModel) salida.getModel();
        JLabel l = new JLabel();
        l.setText(fec);
        l.setFont(MyFont);
        Object[] data = {fec, mensaje};
        modelo.addRow(data);   
    }
    public void ejecutar(){
        switch (this.lenguaje){
            case "SQL":
                break;
            case "Java":
                break;
            case "JavaScript":
                break;
            case "PHP":
                break;
            case "HTML":
                break;
        }
    }
}
