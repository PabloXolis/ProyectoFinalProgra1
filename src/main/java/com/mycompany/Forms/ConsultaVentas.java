package com.mycompany.Forms;

import com.mycompany.Clases.Libro_Vendido;
import com.mycompany.Clases.Venta;
import java.awt.Dimension;
import java.awt.Font;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class ConsultaVentas extends javax.swing.JFrame {
    
    
    public static Venta ventaSelected;
    public java.util.List<Venta> ventasActivas;
    private boolean esAdmin;
    
    public ConsultaVentas(boolean esAdmin){
        this.esAdmin = esAdmin;
        initComponents();
        setLocationRelativeTo(null);
        this.setDefaultCloseOperation(Login.DISPOSE_ON_CLOSE); 
        
        getContentPane().setBackground(new java.awt.Color(0, 0, 0));
        customizeTableHeader();
        
        pintar_tabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        regresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        EliminarSeleccion = new javax.swing.JButton();
        detalleVenta = new javax.swing.JButton();
        exportacionACsv = new javax.swing.JButton();
        exportacionDetalladaACsv1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Consulta de Ventas");
        setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Consulta de Ventas");

        regresar.setBackground(new java.awt.Color(0, 0, 0));
        regresar.setForeground(new java.awt.Color(255, 255, 255));
        regresar.setText("Regresar");
        regresar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 0));

        jTable1.setBackground(new java.awt.Color(0, 0, 0));
        jTable1.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jTable1.setSelectionForeground(new java.awt.Color(15, 42, 61));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Liberation Sans", 0, 18), new java.awt.Color(255, 255, 255)), "Funciones de Administrador", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Liberation Sans", 0, 24), new java.awt.Color(255, 255, 255))); // NOI18N

        EliminarSeleccion.setBackground(new java.awt.Color(0, 0, 0));
        EliminarSeleccion.setForeground(new java.awt.Color(255, 255, 255));
        EliminarSeleccion.setText("Eliminar Selección");
        EliminarSeleccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        EliminarSeleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarSeleccionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(EliminarSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(127, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(EliminarSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        detalleVenta.setBackground(new java.awt.Color(0, 0, 0));
        detalleVenta.setForeground(new java.awt.Color(255, 255, 255));
        detalleVenta.setText("Detalle de la Venta");
        detalleVenta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        detalleVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detalleVentaActionPerformed(evt);
            }
        });

        exportacionACsv.setBackground(new java.awt.Color(0, 0, 0));
        exportacionACsv.setForeground(new java.awt.Color(255, 255, 255));
        exportacionACsv.setText("Informe de Ventas a CSV");
        exportacionACsv.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        exportacionACsv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportacionACsvActionPerformed(evt);
            }
        });

        exportacionDetalladaACsv1.setBackground(new java.awt.Color(0, 0, 0));
        exportacionDetalladaACsv1.setForeground(new java.awt.Color(255, 255, 255));
        exportacionDetalladaACsv1.setText("Informe de Ventas Detallado a CSV");
        exportacionDetalladaACsv1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        exportacionDetalladaACsv1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportacionDetalladaACsv1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(exportacionDetalladaACsv1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exportacionACsv, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addComponent(detalleVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(488, 488, 488))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(exportacionACsv, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(exportacionDetalladaACsv1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(detalleVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void pintar_tabla(){
                
            String encabezado [] = {"Cliente", "NIT", "Dirección", "Total", "Total Sin IVA", "Descuento", "Tipo de Descuento", "Vendedor", "Fecha"};
            
            // Filtrando libros activos
            ventasActivas = new java.util.ArrayList<>();
            for (Venta v : Proyecto_Final_Log_In.ventas) {
                if (v.isActivo()) {
                    ventasActivas.add(v);
                }
            }
            
            // Crear modelo con columnas, pero sin filas
            DefaultTableModel t = new DefaultTableModel(encabezado, 0);
            jTable1.setModel(t);

            TableModel tabla = jTable1.getModel();
            
            SimpleDateFormat formatoFecha = new SimpleDateFormat(
                "EEEE, d 'de' MMMM 'de' yyyy, HH:mm:ss",
                Locale.of("es", "ES")
            ); 
            
            for (Venta v : ventasActivas) {
                String fechaHoraFormateada = formatoFecha.format(v.getFechaYHora().getTime());
                Object[] fila = {v.getNombre(), v.getNit(), v.getDireccion(), v.getTotal(), Math.round(v.getTotalSinIVA()*100.0)/100.0, 
                                 Math.round(v.getDescuento()*100.0)/100.0, v.getTipoDescuento(), v.getVendedor(), fechaHoraFormateada};
                t.addRow(fila);
            }
        }
    
    private void customizeTableHeader() {
        // 1. Obtener el header de la tabla
        javax.swing.table.JTableHeader header = jTable1.getTableHeader();  // Nombre de tu tabla

        // 2. Configurar estilo
        Font headerFont = new Font("Liberation Sans", Font.BOLD, 16); // Cambia el tamaño aquí (14, 16, etc.)
        header.setPreferredSize(new Dimension(header.getWidth(), 35));
        header.setFont(headerFont);
        header.setBackground(new java.awt.Color(0, 0, 0));  // Color de fondo (RGB)
        header.setForeground(java.awt.Color.WHITE);             // Color del texto
        
        jScrollPane1.getViewport().setBackground(new java.awt.Color(0, 0, 0));
        
        // 3. (Opcional) Forzar repintado
        header.repaint();
    }
    
    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_regresarActionPerformed

    private void EliminarSeleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarSeleccionActionPerformed
        if (esAdmin) {
            Proyecto_Final_Log_In.itemVentaSeleccionada = jTable1.getSelectedRow();

            if(Proyecto_Final_Log_In.itemVentaSeleccionada >= 0){
                if(JOptionPane.showConfirmDialog(this, "¿Estás seguro que deseas eliminar la venta seleccionada?") == 0){

                    ventaSelected = ventasActivas.get(Proyecto_Final_Log_In.itemVentaSeleccionada);
                    ventaSelected.setActivo(false);
                    pintar_tabla();
                }
            }
            else{
                JOptionPane.showMessageDialog(this, "Selecciona una venta válida para eliminar.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Tienes que ser administrador para usar esta función.");
        }
        
    }//GEN-LAST:event_EliminarSeleccionActionPerformed

    private void detalleVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detalleVentaActionPerformed
        Proyecto_Final_Log_In.itemVentaSeleccionada = jTable1.getSelectedRow();
        
        if(Proyecto_Final_Log_In.itemVentaSeleccionada >= 0){
            ventaSelected = ventasActivas.get(Proyecto_Final_Log_In.itemVentaSeleccionada);

            DetalleVenta ventana =  new DetalleVenta(ventaSelected);
            ventana.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(this, "Selecciona una venta válida para desplegar su detalle.");
        }
    }//GEN-LAST:event_detalleVentaActionPerformed

    private String obtenerRuta(String nombreArchivo){
        String nombre = nombreArchivo;
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        int resultado = fileChooser.showOpenDialog(null);

        if (resultado == JFileChooser.APPROVE_OPTION) {
            File carpeta = fileChooser.getSelectedFile();
            return carpeta.getAbsolutePath() + File.separator + nombre;
        } else {
            return null;
        }
    }
    
    private void exportacionACsvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportacionACsvActionPerformed
        String ruta = obtenerRuta("Informe de Ventas.csv");
        
        if (ruta == null) {
            JOptionPane.showMessageDialog(null, "Exportación cancelada.");
            return;
        }
        
        try (PrintWriter escribir = new PrintWriter(new FileWriter(ruta))){
            StringBuilder contenido = new StringBuilder();
            
            int i = 1;
            
            for (Venta ventaActiva : ventasActivas) {
                contenido.append("Venta " + i + ": , ,\n")
                .append("Libro, Cantidad, Subtotal\n");
                for (Libro_Vendido libroVendido : ventaActiva.getLibrosVendidos()) {
                    contenido.append(libroVendido.getLibro())
                    .append(", ")
                    .append(libroVendido.getCantidad())
                    .append(", ")
                    .append(libroVendido.getSubtotal())
                    .append("\n");
                }
                i++;
            }
            escribir.write(contenido.toString());
            JOptionPane.showMessageDialog(null, "Exportación de reportes de ventas a CSV hecha con éxito en:\n" + ruta);
            
        } catch (IOException ex) {
            Logger.getLogger(ConsultaVentas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_exportacionACsvActionPerformed

    private void exportacionDetalladaACsv1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportacionDetalladaACsv1ActionPerformed
        String ruta = obtenerRuta("Informe Detallado de Ventas.csv");
        
        if (ruta == null) {
            JOptionPane.showMessageDialog(null, "Exportación cancelada.");
            return;
        }
        
        try (PrintWriter escribir = new PrintWriter(new FileWriter(ruta))){
            StringBuilder contenido = new StringBuilder();
            
            contenido.append("Cliente, NIT, Dirección, Total, Total Sin IVA, Descuento, Tipo de Descuento, Vendedor, Fecha\n");
            
            SimpleDateFormat formatoFecha = new SimpleDateFormat(
                "EEEE, d 'de' MMMM 'de' yyyy, HH:mm:ss",
                Locale.of("es", "ES")
            );
            
            for (Venta ventaActiva : ventasActivas) {
                String fechaHoraFormateada = formatoFecha.format(ventaActiva.getFechaYHora().getTime());
                fechaHoraFormateada = fechaHoraFormateada.replace(",", "");
                double cantidadRedondeada = Math.round(ventaActiva.getTotalSinIVA()*100.0)/100.0;
                
                contenido.append(ventaActiva.getNombre())
                .append(", ")
                .append(ventaActiva.getNit())
                .append(", ")
                .append(ventaActiva.getDireccion())
                .append(", ")
                .append(ventaActiva.getTotal())
                .append(", ")
                .append(cantidadRedondeada)
                .append(", ")       
                .append(Math.round(ventaActiva.getDescuento()*100.0)/100.0)
                .append(", ")  
                .append(ventaActiva.getTipoDescuento())
                .append(", ")  
                .append(ventaActiva.getVendedor())
                .append(", ")
                .append(fechaHoraFormateada)
                .append("\n");
            }
            escribir.write(contenido.toString());
            JOptionPane.showMessageDialog(null, "Exportación de informes de ventas a CSV hecha con éxito en:\n" + ruta);
            
        } catch (IOException ex) {
            Logger.getLogger(ConsultaVentas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_exportacionDetalladaACsv1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EliminarSeleccion;
    private javax.swing.JButton detalleVenta;
    private javax.swing.JButton exportacionACsv;
    private javax.swing.JButton exportacionDetalladaACsv1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton regresar;
    // End of variables declaration//GEN-END:variables
}
