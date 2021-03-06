package vistas.reportes;

import algoritmo.AnalisisAsistencia;
import controladores.DetalleGrupoControlador;
import controladores.EmpleadoControlador;
import controladores.GrupoHorarioControlador;
import controladores.PeriodoControlador;
import entidades.DetalleGrupoHorario;
import entidades.GrupoHorario;
import entidades.Periodo;
import vistas.dialogos.DlgEmpleado;
import vistas.modelos.MTEmpleado;
import com.personal.utiles.FormularioUtil;
import com.personal.utiles.ReporteUtil;
import com.personal.utiles.ReporteUtil.Formato;
import controladores.MarcacionControlador;
import entidades.escalafon.Departamento;
import entidades.escalafon.Empleado;
import entidades.escalafon.FichaLaboral;
import java.awt.Component;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JButton;
import javax.swing.JList;
import net.sf.jasperreports.view.JasperViewer;
import org.jdesktop.beansbinding.AutoBinding;
import org.jdesktop.beansbinding.BindingGroup;
import org.jdesktop.observablecollections.ObservableCollections;
import org.jdesktop.swingbinding.JComboBoxBinding;
import org.jdesktop.swingbinding.SwingBindings;
import utiles.UsuarioActivo;
import vistas.dialogos.DlgOficina;
import javax.swing.JOptionPane;

/**
 *
 * @author RyuujiMD
 */
public class RptRegistroAsistencia extends javax.swing.JInternalFrame {

    /**
     * Creates new form RptRegistroAsistencia
     */
    private final ReporteUtil reporteador;
    private final DateFormat dfFecha;
    private final EmpleadoControlador ec;

    public RptRegistroAsistencia() {
        initComponents();

        ec = new EmpleadoControlador();
        pc = new PeriodoControlador();
        dfFecha = new SimpleDateFormat("dd/MM/yyyy");
        reporteador = new ReporteUtil();
//        FormularioUtil.modeloSpinnerFechaHora(spFechaInicio, "dd/MM/yyyy");
//        FormularioUtil.modeloSpinnerFechaHora(spFechaFin, "dd/MM/yyyy");
        inicializar();
        bindeoSalvaje();
        controles();
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

        grpTipoReporte = new javax.swing.ButtonGroup();
        grpRango = new javax.swing.ButtonGroup();
        grpSeleccion = new javax.swing.ButtonGroup();
        pnlOpciones = new javax.swing.JPanel();
        radConsolidado = new javax.swing.JRadioButton();
        radDetallado = new javax.swing.JRadioButton();
        chkHFH = new javax.swing.JCheckBox();
        pnlRango = new javax.swing.JPanel();
        radPorFecha = new javax.swing.JRadioButton();
        radMes = new javax.swing.JRadioButton();
        radAnio = new javax.swing.JRadioButton();
        cboMes = new com.toedter.calendar.JMonthChooser();
        cboPeriodo = new javax.swing.JComboBox();
        cboPeriodo1 = new javax.swing.JComboBox();
        dcFechaInicio = new com.toedter.calendar.JDateChooser();
        dcFechaFin = new com.toedter.calendar.JDateChooser();
        pnlEmpleados = new javax.swing.JPanel();
        radGrupo = new javax.swing.JRadioButton();
        radPersonalizado = new javax.swing.JRadioButton();
        cboGrupoHorario = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabla = new org.jdesktop.swingx.JXTable();
        btnAgregar = new javax.swing.JButton();
        btnQuitar = new javax.swing.JButton();
        radOficina = new javax.swing.JRadioButton();
        txtOficina = new javax.swing.JTextField();
        btnOficina = new javax.swing.JButton();
        pnlBotones = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        pnlReporte = new javax.swing.JPanel();
        pnlExportar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cboExportarFormato = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        pnlTab = new javax.swing.JTabbedPane();
        grpTipoReporte.add(radConsolidado);
        grpTipoReporte.add(radDetallado);

        grpRango.add(radPorFecha);
        grpRango.add(radMes);
        grpRango.add(radAnio);

        grpSeleccion.add(radGrupo);
        grpSeleccion.add(radPersonalizado);
        grpSeleccion.add(radOficina);

        setClosable(true);
        setMaximizable(true);
        setTitle("REPORTE DE REGISTRO DE ASISTENCIA");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        pnlOpciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de reporte"));
        pnlOpciones.setLayout(new java.awt.GridBagLayout());

        radConsolidado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radConsolidado.setSelected(true);
        radConsolidado.setText("Reporte resumen");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.1;
        pnlOpciones.add(radConsolidado, gridBagConstraints);

        radDetallado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radDetallado.setText("Reporte detallado");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        pnlOpciones.add(radDetallado, gridBagConstraints);

        chkHFH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkHFH.setText("Mostrar H.F.T.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        pnlOpciones.add(chkHFH, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.1;
        getContentPane().add(pnlOpciones, gridBagConstraints);

        pnlRango.setBorder(javax.swing.BorderFactory.createTitledBorder("Rango"));
        pnlRango.setLayout(new java.awt.GridBagLayout());

        radPorFecha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radPorFecha.setSelected(true);
        radPorFecha.setText("Por fechas:");
        radPorFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radPorFechaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        pnlRango.add(radPorFecha, gridBagConstraints);

        radMes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radMes.setText("Por mes:");
        radMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radMesActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        pnlRango.add(radMes, gridBagConstraints);

        radAnio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radAnio.setText("Por año:");
        radAnio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radAnioActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        pnlRango.add(radAnio, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        pnlRango.add(cboMes, gridBagConstraints);

        cboPeriodo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboPeriodo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        pnlRango.add(cboPeriodo, gridBagConstraints);

        cboPeriodo1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboPeriodo1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        pnlRango.add(cboPeriodo1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        pnlRango.add(dcFechaInicio, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.1;
        pnlRango.add(dcFechaFin, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.1;
        getContentPane().add(pnlRango, gridBagConstraints);

        pnlEmpleados.setBorder(javax.swing.BorderFactory.createTitledBorder("Selección de empleados"));
        pnlEmpleados.setLayout(new java.awt.GridBagLayout());

        radGrupo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radGrupo.setText("Por grupo horario:");
        radGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radGrupoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        pnlEmpleados.add(radGrupo, gridBagConstraints);

        radPersonalizado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radPersonalizado.setSelected(true);
        radPersonalizado.setText("Personalizado:");
        radPersonalizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radPersonalizadoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        pnlEmpleados.add(radPersonalizado, gridBagConstraints);

        cboGrupoHorario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboGrupoHorario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboGrupoHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboGrupoHorarioActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        pnlEmpleados.add(cboGrupoHorario, gridBagConstraints);

        tblTabla.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(tblTabla);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        pnlEmpleados.add(jScrollPane1, gridBagConstraints);

        btnAgregar.setText("+");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        pnlEmpleados.add(btnAgregar, gridBagConstraints);

        btnQuitar.setText("-");
        btnQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        pnlEmpleados.add(btnQuitar, gridBagConstraints);

        radOficina.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radOficina.setText("Por oficina:");
        radOficina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radOficinaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        pnlEmpleados.add(radOficina, gridBagConstraints);

        txtOficina.setEditable(false);
        txtOficina.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        pnlEmpleados.add(txtOficina, gridBagConstraints);

        btnOficina.setText("...");
        btnOficina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOficinaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        pnlEmpleados.add(btnOficina, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(pnlEmpleados, gridBagConstraints);

        pnlBotones.setLayout(new java.awt.GridBagLayout());

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("GENERAR REPORTE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        pnlBotones.add(jButton2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        getContentPane().add(pnlBotones, gridBagConstraints);

        pnlReporte.setLayout(new java.awt.GridBagLayout());

        pnlExportar.setLayout(new javax.swing.BoxLayout(pnlExportar, javax.swing.BoxLayout.LINE_AXIS));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Elegir formato:");
        pnlExportar.add(jLabel1);

        cboExportarFormato.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboExportarFormato.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PDF (*.pdf)", "Excel 2007 - 2013 (*.xlsx)", "Excel 97 - 2003 (*.xls)", "CSV (*.csv)", "DBF (*.dbf)" }));
        pnlExportar.add(cboExportarFormato);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Exportar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        pnlExportar.add(jButton1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        pnlReporte.add(pnlExportar, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.6;
        gridBagConstraints.weighty = 0.2;
        pnlReporte.add(pnlTab, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.2;
        getContentPane().add(pnlReporte, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        imprimir();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        DlgEmpleado dialogo = new DlgEmpleado(this);
        dialogo.setVisible(true);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void radAnioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radAnioActionPerformed
        // TODO add your handling code here:control
        controles();
    }//GEN-LAST:event_radAnioActionPerformed

    private void radMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radMesActionPerformed
        // TODO add your handling code here:
        controles();
    }//GEN-LAST:event_radMesActionPerformed

    private void radPorFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radPorFechaActionPerformed
        // TODO add your handling code here:
        controles();
    }//GEN-LAST:event_radPorFechaActionPerformed

    private GrupoHorario grupoSeleccionado;
    private void cboGrupoHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboGrupoHorarioActionPerformed
        // TODO add your handling code here:
        obtenerGrupo();
    }//GEN-LAST:event_cboGrupoHorarioActionPerformed

    private void radGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radGrupoActionPerformed
        // TODO add your handling code here:
        controles();
    }//GEN-LAST:event_radGrupoActionPerformed

    private void radPersonalizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radPersonalizadoActionPerformed
        // TODO add your handling code here:
        controles();
    }//GEN-LAST:event_radPersonalizadoActionPerformed

    private void radOficinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radOficinaActionPerformed
        // TODO add your handling code here:
        controles();
    }//GEN-LAST:event_radOficinaActionPerformed

    private void btnOficinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOficinaActionPerformed
        // TODO add your handling code here:
        DlgOficina oficinas = new DlgOficina(this);
        oficinaSeleccionada = oficinas.getSeleccionado();
        if (oficinaSeleccionada != null) {
            txtOficina.setText(oficinaSeleccionada.getNombre());

        }
    }//GEN-LAST:event_btnOficinaActionPerformed

    private void btnQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarActionPerformed
        // TODO add your handling code here:
        int fila;
        if ((fila = tblTabla.getSelectedRow()) != -1) {
            empleadoList.remove(fila);
        }
    }//GEN-LAST:event_btnQuitarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Formato formato = obtenerFormato();
        String ruta;
        ruta = FormularioUtil.guardarFichero(this, "Seleccione el destino donde guardará el resporte");
        System.out.println("RUTA ENVIADA: "+ruta);
        if (ruta.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un destino correcto", "Mensaje del sistema", JOptionPane.WARNING_MESSAGE);
        } else {
            exportar(formato, ruta);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private Departamento oficinaSeleccionada;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnOficina;
    private javax.swing.JButton btnQuitar;
    private javax.swing.JComboBox cboExportarFormato;
    private javax.swing.JComboBox cboGrupoHorario;
    private com.toedter.calendar.JMonthChooser cboMes;
    private javax.swing.JComboBox cboPeriodo;
    private javax.swing.JComboBox cboPeriodo1;
    private javax.swing.JCheckBox chkHFH;
    private com.toedter.calendar.JDateChooser dcFechaFin;
    private com.toedter.calendar.JDateChooser dcFechaInicio;
    private javax.swing.ButtonGroup grpRango;
    private javax.swing.ButtonGroup grpSeleccion;
    private javax.swing.ButtonGroup grpTipoReporte;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlBotones;
    private javax.swing.JPanel pnlEmpleados;
    private javax.swing.JPanel pnlExportar;
    private javax.swing.JPanel pnlOpciones;
    private javax.swing.JPanel pnlRango;
    private javax.swing.JPanel pnlReporte;
    private javax.swing.JTabbedPane pnlTab;
    private javax.swing.JRadioButton radAnio;
    private javax.swing.JRadioButton radConsolidado;
    private javax.swing.JRadioButton radDetallado;
    private javax.swing.JRadioButton radGrupo;
    private javax.swing.JRadioButton radMes;
    private javax.swing.JRadioButton radOficina;
    private javax.swing.JRadioButton radPersonalizado;
    private javax.swing.JRadioButton radPorFecha;
    private org.jdesktop.swingx.JXTable tblTabla;
    private javax.swing.JTextField txtOficina;
    // End of variables declaration//GEN-END:variables

    private List<Empleado> empleadoList;
    private List<Periodo> periodoList;
    private final PeriodoControlador pc;

    private void inicializar() {
        JasperViewer jv = new JasperViewer(null);
        pnlTab.add("Vista previa", jv.getContentPane());
        empleadoList = ObservableCollections.observableList(new ArrayList<Empleado>());
        periodoList = pc.buscarTodosOrden();
        grupoList = gc.buscarTodos();
    }

    private void controles() {
//        FormularioUtil.activarComponente(chkMarcaciones, radDetallado.isSelected());

        FormularioUtil.activarComponente(dcFechaInicio, radPorFecha.isSelected());
        FormularioUtil.activarComponente(dcFechaFin, radPorFecha.isSelected());
        FormularioUtil.activarComponente(cboMes, radMes.isSelected());
        FormularioUtil.activarComponente(cboPeriodo1, radMes.isSelected());
        FormularioUtil.activarComponente(cboPeriodo, radAnio.isSelected());

        FormularioUtil.activarComponente(cboGrupoHorario, radGrupo.isSelected());
//        FormularioUtil.activarComponente(btnOficina, radGrupo.isSelected());
        FormularioUtil.activarComponente(tblTabla, radPersonalizado.isSelected());
        FormularioUtil.activarComponente(btnAgregar, radPersonalizado.isSelected());
        FormularioUtil.activarComponente(btnQuitar, radPersonalizado.isSelected());

        FormularioUtil.activarComponente(btnOficina, radOficina.isSelected());
    }

    private List<GrupoHorario> grupoList;

    private void bindeoSalvaje() {
        MTEmpleado mt = new MTEmpleado(empleadoList);
        tblTabla.setModel(mt);

        BindingGroup bindeo = new BindingGroup();

        JComboBoxBinding binding = SwingBindings.createJComboBoxBinding(AutoBinding.UpdateStrategy.READ, periodoList, cboPeriodo);
        JComboBoxBinding binding2 = SwingBindings.createJComboBoxBinding(AutoBinding.UpdateStrategy.READ, periodoList, cboPeriodo1);
        JComboBoxBinding binding3 = SwingBindings.createJComboBoxBinding(AutoBinding.UpdateStrategy.READ, grupoList, cboGrupoHorario);

        bindeo.addBinding(binding);
        bindeo.addBinding(binding2);
        bindeo.addBinding(binding3);
        bindeo.bind();

        DefaultListCellRenderer renderGrupo = new DefaultListCellRenderer() {

            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                if (value != null) {
                    if (value instanceof GrupoHorario) {
                        value = ((GrupoHorario) value).getNombre();
                    }
                }
                return super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus); //To change body of generated methods, choose Tools | Templates.
            }

        };
        DefaultListCellRenderer renderPeriodo = new DefaultListCellRenderer() {

            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                if (value != null) {
                    if (value instanceof Periodo) {
                        value = ((Periodo) value).getAnio();
                    }
                }
                return super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            }

        };

        cboPeriodo.setRenderer(renderPeriodo);
        cboPeriodo1.setRenderer(renderPeriodo);
        cboGrupoHorario.setRenderer(renderGrupo);
    }
    private AnalisisAsistencia analisis = new AnalisisAsistencia();
    private final MarcacionControlador mc = new MarcacionControlador();

    private void imprimir() {

//        Calendar cal = Calendar.getInstance();
//
//        String usuario = UsuarioActivo.getUsuario().getLogin();
//
//
//        List<Empleado> empleados = obtenerDNI();
//        
//        List<String> dnis = new ArrayList<>();
//        
//        for(Empleado e : empleados){
//            dnis.add(e.getNroDocumento());
//        }
//
//        analisis.analizarEmpleados(empleados);
        String reporte = "";

        if (radConsolidado.isSelected()) {
            reporte = "reportes/r_registro_asistencia_consolidado.jasper";
        } else if (radDetallado.isSelected()) {
            reporte = "reportes/r_registro_asistencia_detallado_sm.jasper";
        }
//
//        int anio;
//        int mes;
//        Date fechaInicio = new Date();
//        Date fechaFin = new Date();
//        String rangoTitulo = "";
//        String rangoValor = "";
//        if (radPorFecha.isSelected()) {
//            rangoTitulo = "ENTRE: ";
//            fechaInicio = dcFechaInicio.getDate();
//            fechaFin = dcFechaFin.getDate();
//            rangoValor = dfFecha.format(fechaInicio) + " - " + dfFecha.format(fechaFin);
//        } else if (radMes.isSelected()) {
//            rangoTitulo = "MES: ";
//            anio = periodoList.get(cboPeriodo1.getSelectedIndex()).getAnio();
//            mes = cboMes.getMonth();
//            cal.set(anio, mes, 1);
//            fechaInicio = cal.getTime();
//            cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
//            fechaFin = cal.getTime();
//            rangoValor = (cboMes.getMonth() + 1) + " / " + anio;
//        } else if (radAnio.isSelected()) {
//            rangoTitulo = "AÑO: ";
//            anio = periodoList.get(cboPeriodo.getSelectedIndex()).getAnio();
//            cal.set(anio, 0, 1);
//            fechaInicio = cal.getTime();
//            cal.set(anio, 11, 31);
//            fechaFin = cal.getTime();
//            rangoValor = periodoList.get(cboPeriodo.getSelectedIndex()).getAnio() + "";
//        }

        File archivo = new File(reporte);
        Map<String, Object> parametros = this.obtenerParametros();
//        parametros.put("CONEXION_SUP", ec.getDao().getConexion());
//        parametros.put("CONEXION_BIOSTAR", mc.getDao().getConexion());

        reporteador.setConn(pc.getDao().getConexion());
        Component report = reporteador.obtenerReporte(archivo, parametros);
        report.getParent().add(new JButton("HOLI"));

//        if(bandera){
        pnlTab.removeTabAt(0);
//        }
        pnlTab.add("Vista previa", report);
        bandera = true;

    }

    private Map<String, Object> obtenerParametros() {
        Calendar cal = Calendar.getInstance();

        String usuario = UsuarioActivo.getUsuario().getLogin();

        List<Empleado> empleados = obtenerDNI();

        List<String> dnis = new ArrayList<>();

        for (Empleado e : empleados) {
            dnis.add(e.getNroDocumento());
        }

        analisis.analizarEmpleados(empleados);
        int anio;
        int mes;
        Date fechaInicio = new Date();
        Date fechaFin = new Date();
        String rangoTitulo = "";
        String rangoValor = "";
        if (radPorFecha.isSelected()) {
            rangoTitulo = "ENTRE: ";
            fechaInicio = dcFechaInicio.getDate();
            fechaFin = dcFechaFin.getDate();
            rangoValor = dfFecha.format(fechaInicio) + " - " + dfFecha.format(fechaFin);
        } else if (radMes.isSelected()) {
            rangoTitulo = "MES: ";
            anio = periodoList.get(cboPeriodo1.getSelectedIndex()).getAnio();
            mes = cboMes.getMonth();
            cal.set(anio, mes, 1);
            fechaInicio = cal.getTime();
            cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
            fechaFin = cal.getTime();
            rangoValor = (cboMes.getMonth() + 1) + " / " + anio;
        } else if (radAnio.isSelected()) {
            rangoTitulo = "AÑO: ";
            anio = periodoList.get(cboPeriodo.getSelectedIndex()).getAnio();
            cal.set(anio, 0, 1);
            fechaInicio = cal.getTime();
            cal.set(anio, 11, 31);
            fechaFin = cal.getTime();
            rangoValor = periodoList.get(cboPeriodo.getSelectedIndex()).getAnio() + "";
        }

        Map<String, Object> parametros = new HashMap<>();
        parametros.put("usuario", usuario);
        parametros.put("lista", dnis);
        parametros.put("fecha_inicio", fechaInicio);
        parametros.put("fecha_fin", fechaFin);
        parametros.put("rangoTitulo", rangoTitulo);
        parametros.put("rangoValor", rangoValor);
        parametros.put("mostrar_he", chkHFH.isSelected());

        return parametros;
    }

    boolean bandera = false;

    private List<Empleado> obtenerDNI() {

        List<Empleado> lista = new ArrayList<>();
        if (radGrupo.isSelected()) {
            obtenerGrupo();
            List<DetalleGrupoHorario> detalleGrupo = dgc.buscarXGrupo(grupoSeleccionado);
            for (DetalleGrupoHorario detalle : detalleGrupo) {
                lista.add(detalle.getEmpleado());
            }
        } else if (radPersonalizado.isSelected()) {
            for (Empleado empleado : empleadoList) {
                lista.add(empleado);
            }
        } else if (radOficina.isSelected()) {
            List<FichaLaboral> fichas = oficinaSeleccionada.getFichaLaboralList();
            for (FichaLaboral f : fichas) {
                lista.add(f.getEmpleado());
            }
        }

        return lista;
    }

    public void agregarEmpleado(Empleado empleado) {
        empleadoList.add(empleado);
        tblTabla.packAll();
    }

    private GrupoHorarioControlador gc = new GrupoHorarioControlador();
    private DetalleGrupoControlador dgc = new DetalleGrupoControlador();

    private void obtenerGrupo() {
        int seleccionado = cboGrupoHorario.getSelectedIndex();
        if (seleccionado != -1) {
            grupoSeleccionado = this.grupoList.get(seleccionado);
        }
    }

    private Formato obtenerFormato() {
        int seleccionado = cboExportarFormato.getSelectedIndex();

        switch (seleccionado) {
            case 0:
                return Formato.PDF;
            case 1:
                return Formato.XLSX;
            case 2:
                return Formato.XLS;
            case 3:
                return Formato.CSV;
            case 4:
                return Formato.DBF;
            default:
                return null;
        }
    }

    private void exportar(Formato formato, String ruta) {
        String reporte = "";
        if (radConsolidado.isSelected()) {
            reporte = "reportes/r_registro_asistencia_consolidado.jasper";
        } else if (radDetallado.isSelected()) {
            reporte = "reportes/r_registro_asistencia_detallado_sm.jasper";
        }
        File archivo = new File(reporte);
        Map<String, Object> parametros = this.obtenerParametros();
        if(formato != Formato.PDF){
            parametros.put("MOSTRAR_TITULO", false);
        }        
        reporteador.setConn(pc.getDao().getConexion());
        reporteador.exportarReporte(archivo, parametros, formato, ruta);
    }
}
