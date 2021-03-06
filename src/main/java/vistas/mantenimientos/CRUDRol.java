/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas.mantenimientos;

/**
 *
 * @author RyuujiMD
 */
public class CRUDRol extends javax.swing.JInternalFrame {

    /**
     * Creates new form CRUDRol
     */
    public CRUDRol() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        pnlDatos = new javax.swing.JPanel();
        pnlBasicos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        pnlAccesos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAccesos = new org.jdesktop.swingx.JXTable();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        pnlListado = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTabla = new org.jdesktop.swingx.JXTable();
        pnlNuevoModificar = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setTitle("CREACIÓN DE ROLES DE USUARIO");
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        pnlDatos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));
        java.awt.GridBagLayout pnlDatosLayout = new java.awt.GridBagLayout();
        pnlDatosLayout.columnWidths = new int[] {0, 5, 0};
        pnlDatosLayout.rowHeights = new int[] {0, 5, 0, 5, 0};
        pnlDatos.setLayout(pnlDatosLayout);

        java.awt.GridBagLayout pnlBasicosLayout = new java.awt.GridBagLayout();
        pnlBasicosLayout.columnWidths = new int[] {0, 5, 0};
        pnlBasicosLayout.rowHeights = new int[] {0, 5, 0};
        pnlBasicos.setLayout(pnlBasicosLayout);

        jLabel1.setText("Código:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        pnlBasicos.add(jLabel1, gridBagConstraints);

        txtCodigo.setColumns(45);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.1;
        pnlBasicos.add(txtCodigo, gridBagConstraints);

        jLabel2.setText("Nombre:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        pnlBasicos.add(jLabel2, gridBagConstraints);

        txtNombre.setColumns(45);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.1;
        pnlBasicos.add(txtNombre, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        pnlDatos.add(pnlBasicos, gridBagConstraints);

        pnlAccesos.setBorder(javax.swing.BorderFactory.createTitledBorder("Accesos"));
        pnlAccesos.setLayout(new java.awt.GridBagLayout());

        jScrollPane1.setViewportView(tblAccesos);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 279;
        gridBagConstraints.ipady = 360;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        pnlAccesos.add(jScrollPane1, gridBagConstraints);

        jButton3.setText("+");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        pnlAccesos.add(jButton3, gridBagConstraints);

        jButton5.setText("-");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        pnlAccesos.add(jButton5, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        pnlDatos.add(pnlAccesos, gridBagConstraints);

        jPanel1.setLayout(new java.awt.GridLayout(1, 0, 5, 0));

        btnGuardar.setText("Guardar");
        jPanel1.add(btnGuardar);

        jButton4.setText("Modificar");
        jPanel1.add(jButton4);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        pnlDatos.add(jPanel1, gridBagConstraints);

        getContentPane().add(pnlDatos);

        pnlListado.setBorder(javax.swing.BorderFactory.createTitledBorder("Roles"));
        pnlListado.setLayout(new java.awt.GridBagLayout());

        jScrollPane2.setViewportView(tblTabla);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        pnlListado.add(jScrollPane2, gridBagConstraints);

        pnlNuevoModificar.setLayout(new java.awt.GridLayout(1, 0, 5, 0));

        jButton1.setText("Nuevo");
        pnlNuevoModificar.add(jButton1);

        jButton2.setText("Modificar");
        pnlNuevoModificar.add(jButton2);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        pnlListado.add(pnlNuevoModificar, gridBagConstraints);

        getContentPane().add(pnlListado);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pnlAccesos;
    private javax.swing.JPanel pnlBasicos;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JPanel pnlListado;
    private javax.swing.JPanel pnlNuevoModificar;
    private org.jdesktop.swingx.JXTable tblAccesos;
    private org.jdesktop.swingx.JXTable tblTabla;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
