/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controladores.MarcacionControlador;
import entidades.Empleado;
import entidades.Marcacion;
import vistas.dialogos.DlgEmpleado;
import vistas.modelos.MTMarcacion;
import com.personal.utiles.FormularioUtil;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.SpinnerNumberModel;
import org.jdesktop.observablecollections.ObservableCollections;

/**
 *
 * @author fesquivelc
 */
public class VistaMarcaciones extends javax.swing.JInternalFrame {

    /**
     * Creates new form VistaEmpleado
     */
    private List<Marcacion> lista;
    private MarcacionControlador mc;

    public VistaMarcaciones() {
        initComponents();
        mc = new MarcacionControlador();
        inicializar();
        bindeoSalvaje();
        buscar();
        actualizarControlesNavegacion();
//        buscar();
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

        grpOpcion = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblBusqueda = new org.jdesktop.swingx.JXBusyLabel();
        txtBusqueda = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpleado = new org.jdesktop.swingx.JXTable();
        spHoraInicio = new javax.swing.JSpinner();
        spHoraFin = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        pnlNavegacion = new javax.swing.JPanel();
        btnPrimero = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        spPagina = new javax.swing.JSpinner();
        txtTotal = new javax.swing.JTextField();
        btnSiguiente = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        cboTamanio = new javax.swing.JComboBox();
        dcFechaInicio = new com.toedter.calendar.JDateChooser();
        dcFechaFin = new com.toedter.calendar.JDateChooser();
        radFechas = new javax.swing.JRadioButton();
        radHora = new javax.swing.JRadioButton();
        grpOpcion.add(radHora);
        grpOpcion.add(radFechas);

        setClosable(true);
        setMaximizable(true);
        setTitle("LISTADO DE MARCACIONES SIN PROCESAR");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setLayout(new java.awt.GridBagLayout());

        lblBusqueda.setText("Empleado");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel1.add(lblBusqueda, gridBagConstraints);

        txtBusqueda.setEditable(false);
        txtBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusquedaKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel1.add(txtBusqueda, gridBagConstraints);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel1.add(btnBuscar, gridBagConstraints);

        jScrollPane1.setViewportView(tblEmpleado);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 13;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel1.add(jScrollPane1, gridBagConstraints);

        spHoraInicio.setModel(new javax.swing.SpinnerDateModel());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel1.add(spHoraInicio, gridBagConstraints);

        spHoraFin.setModel(new javax.swing.SpinnerDateModel());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 11;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel1.add(spHoraFin, gridBagConstraints);

        jLabel1.setText("-");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel1.add(jLabel1, gridBagConstraints);

        jButton4.setText("...");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel1.add(jButton4, gridBagConstraints);

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel1.add(btnLimpiar, gridBagConstraints);

        pnlNavegacion.setLayout(new java.awt.GridLayout(1, 0, 2, 0));

        btnPrimero.setText("<<");
        btnPrimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeroActionPerformed(evt);
            }
        });
        pnlNavegacion.add(btnPrimero);

        btnAnterior.setText("<");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });
        pnlNavegacion.add(btnAnterior);

        spPagina.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));
        spPagina.setMinimumSize(new java.awt.Dimension(60, 20));
        spPagina.setPreferredSize(new java.awt.Dimension(60, 20));
        spPagina.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spPaginaStateChanged(evt);
            }
        });
        pnlNavegacion.add(spPagina);

        txtTotal.setEditable(false);
        txtTotal.setColumns(3);
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotal.setText("1");
        pnlNavegacion.add(txtTotal);

        btnSiguiente.setText(">");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        pnlNavegacion.add(btnSiguiente);

        btnUltimo.setText(">>");
        btnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoActionPerformed(evt);
            }
        });
        pnlNavegacion.add(btnUltimo);

        cboTamanio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "5", "10", "15", "20", "25", "40", "50" }));
        cboTamanio.setMinimumSize(new java.awt.Dimension(53, 24));
        cboTamanio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTamanioActionPerformed(evt);
            }
        });
        pnlNavegacion.add(cboTamanio);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 13;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel1.add(pnlNavegacion, gridBagConstraints);

        dcFechaInicio.setDateFormatString("dd/MM/yyyy");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel1.add(dcFechaInicio, gridBagConstraints);

        dcFechaFin.setDateFormatString("dd/MM/yyyy");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel1.add(dcFechaFin, gridBagConstraints);

        radFechas.setSelected(true);
        radFechas.setText("Entre fechas:");
        radFechas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radFechasActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        jPanel1.add(radFechas, gridBagConstraints);

        radHora.setText("Entre horas:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 0;
        jPanel1.add(radHora, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 115;
        gridBagConstraints.ipady = 545;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(jPanel1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        lblBusqueda.setBusy(true);
        paginaActual = 1;
        buscar();
        actualizarControlesNavegacion();
        lblBusqueda.setBusy(false);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyReleased
        // TODO add your handling code here:
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            lblBusqueda.setBusy(true);
            buscar();
            lblBusqueda.setBusy(false);
        }
    }//GEN-LAST:event_txtBusquedaKeyReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        DlgEmpleado dialogo = new DlgEmpleado(this);
        dialogo.setAgregar(false);
        this.empleadoSeleccionado = dialogo.getSeleccionado();
        if (this.empleadoSeleccionado != null) {
            this.txtBusqueda.setText(
                    empleadoSeleccionado.getNroDocumento()
                    + " " + empleadoSeleccionado.getApellidoPaterno()
                    + " " + empleadoSeleccionado.getApellidoMaterno()
                    + " " + empleadoSeleccionado.getNombre());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        FormularioUtil.limpiarComponente(this.txtBusqueda);
        this.empleadoSeleccionado = null;
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeroActionPerformed
        // TODO add your handling code here:
        primero();
    }//GEN-LAST:event_btnPrimeroActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        // TODO add your handling code here:
        anterior();
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void spPaginaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spPaginaStateChanged
        // TODO add your handling code here:
        this.seleccionPagina();
    }//GEN-LAST:event_spPaginaStateChanged

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        // TODO add your handling code here:
        siguiente();
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        // TODO add your handling code here:
        ultimo();
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void cboTamanioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTamanioActionPerformed
        // TODO add your handling code here:
        this.paginaActual = 1;
        buscar();
        this.actualizarControlesNavegacion();
    }//GEN-LAST:event_cboTamanioActionPerformed

    private void radFechasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radFechasActionPerformed
        // TODO add your handling code here:
        checkboxes();
    }//GEN-LAST:event_radFechasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnPrimero;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JComboBox cboTamanio;
    private com.toedter.calendar.JDateChooser dcFechaFin;
    private com.toedter.calendar.JDateChooser dcFechaInicio;
    private javax.swing.ButtonGroup grpOpcion;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXBusyLabel lblBusqueda;
    private javax.swing.JPanel pnlNavegacion;
    private javax.swing.JRadioButton radFechas;
    private javax.swing.JRadioButton radHora;
    private javax.swing.JSpinner spHoraFin;
    private javax.swing.JSpinner spHoraInicio;
    private javax.swing.JSpinner spPagina;
    private org.jdesktop.swingx.JXTable tblEmpleado;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

    private Empleado empleadoSeleccionado;

    private void bindeoSalvaje() {
        lista = ObservableCollections.observableList(new ArrayList<Marcacion>());

        String[] columnas = {"Nro de documento", "Empleado", "Fecha", "Hora", "Ip de Equipo"};
        MTMarcacion mt = new MTMarcacion(lista, columnas);
        tblEmpleado.setModel(mt);
    }

//    private void buscar() {
//        lista.clear();
//        Date fechaInicio = (Date) spFechaInicio.getValue();
//        Date fechaFin = (Date) spFechaFin.getValue();
//        if (empleadoSeleccionado == null) {
//            lista.addAll(mc.buscarXFecha(fechaInicio, fechaFin));
//        } else {
//            lista.addAll(mc.buscarXFecha(empleadoSeleccionado.getNroDocumento(), fechaInicio, fechaFin));
//        }
//        tblEmpleado.packAll();
//    }

    private void inicializar() {
        FormularioUtil.modeloSpinnerFechaHora(this.spHoraInicio, "HH:mm:ss");
        FormularioUtil.modeloSpinnerFechaHora(this.spHoraFin, "HH:mm:ss");
        Date fechaMax = new Date();
        dcFechaInicio.setMaxSelectableDate(fechaMax);
        dcFechaInicio.setDate(fechaMax);
        dcFechaFin.setMaxSelectableDate(fechaMax);
        dcFechaFin.setDate(fechaMax);
        
    }

    private int paginaActual = 1;
    private int totalPaginas = 0;
    private int tamanioPagina = 0;

    private void buscar() {
        Date fechaInicio = (Date) spHoraInicio.getValue();
        Date fechaFin = (Date) spHoraFin.getValue();

        tamanioPagina = Integer.parseInt(cboTamanio.getSelectedItem().toString());

        lista.clear();

        lista.addAll(this.listar(empleadoSeleccionado, fechaInicio, fechaFin, paginaActual, tamanioPagina));
        
        tblEmpleado.packAll();
    }

    private List<Marcacion> listar(Empleado empleado, Date fechaInicio, Date fechaFin, int pagina, int tamanio) {
        int total;
        if (empleado == null) {
            total = mc.totalXFecha(fechaInicio, fechaFin);
        } else {
            total = mc.totalXEmpleadoXFecha(empleado.getNroDocumento(), fechaInicio, fechaFin);
        }
        if (total % tamanio == 0) {
            totalPaginas = total / tamanio;
        } else {
            totalPaginas = (total / tamanio) + 1;
        }
        
        if(totalPaginas == 0){
            totalPaginas = 1;
        }

        if (empleado == null) {
            return this.mc.buscarXFecha(fechaInicio, fechaFin, (pagina - 1) * tamanio, tamanio);
        } else {
            return this.mc.buscarXFecha(empleado.getNroDocumento(), fechaInicio, fechaFin, (pagina - 1) * tamanio, tamanio);
        }

    }

    private void siguiente() {
        paginaActual++;
        buscar();
        this.actualizarControlesNavegacion();
    }

    private void ultimo() {
        paginaActual = totalPaginas;
        buscar();
        this.actualizarControlesNavegacion();
    }

    private void primero() {
        paginaActual = 1;
        buscar();
        this.actualizarControlesNavegacion();
    }

    private void anterior() {
        paginaActual--;
        buscar();
        this.actualizarControlesNavegacion();
    }

    private void seleccionPagina() {
        paginaActual = (int) spPagina.getValue();
        buscar();
        this.actualizarControlesNavegacion();
    }

    private void actualizarControlesNavegacion() {
        spPagina.setValue(paginaActual);
        txtTotal.setText(totalPaginas + "");

        SpinnerNumberModel modeloSP = (SpinnerNumberModel) spPagina.getModel();
        Comparable<Integer> maximo = totalPaginas;
        modeloSP.setMaximum(maximo);

        this.btnSiguiente.setEnabled(paginaActual != totalPaginas);
        this.btnUltimo.setEnabled(paginaActual != totalPaginas);

        this.btnAnterior.setEnabled(paginaActual != 1);
        this.btnPrimero.setEnabled(paginaActual != 1);
    }

    private void checkboxes() {
        FormularioUtil.activarComponente(dcFechaInicio, true);
        FormularioUtil.activarComponente(dcFechaFin, radFechas.isSelected());
        
        FormularioUtil.activarComponente(spHoraInicio, radHora.isSelected());
        FormularioUtil.activarComponente(spHoraFin, radHora.isSelected());
    }
}
