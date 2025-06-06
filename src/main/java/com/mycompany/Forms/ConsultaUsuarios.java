package com.mycompany.Forms;

import com.mycompany.Clases.Usuario;
import java.awt.HeadlessException;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ConsultaUsuarios extends javax.swing.JFrame {

    private Usuario usuario;
    private java.util.List<Usuario> usuariosActivos;
    
    public ConsultaUsuarios() {
        initComponents();
        setLocationRelativeTo(null);
        pintar_tabla();
        
        jComboBox1.removeAllItems(); // Inicializando el JcomboBox
        jComboBox1.addItem("Administrador");
        jComboBox1.addItem("Vendedor");
        
        this.setDefaultCloseOperation(Login.DISPOSE_ON_CLOSE); // Para evitar que al dar en la equis, se cierre el form principal.
    }
    
    private void pintar_tabla(){
                
        String encabezado [] = {"Nombre", "Usuario", "Password", "Rol"};
        
        // Filtrando usuarios activos
        usuariosActivos = new java.util.ArrayList<>();
        for (Usuario u : Proyecto_Final_Log_In.usuarios) {
            if (u.isActivo()) {
                usuariosActivos.add(u);
            }
        }
        
        
        // Crear modelo con columnas, pero sin filas
        DefaultTableModel t = new DefaultTableModel(encabezado, 0);
        jTable1.setModel(t);
        
        TableModel tabla = jTable1.getModel();
        
        for (Usuario u : usuariosActivos) {
            Object[] fila = {u.getNombre(), u.getUsuario(), u.getPassword(), u.getRol()};
            t.addRow(fila);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Cerrar = new javax.swing.JButton();
        Borrar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        Guardar = new javax.swing.JButton();
        CargaMasiva1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Consulta de Usuarios");

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
        jScrollPane1.setViewportView(jTable1);

        Cerrar.setText("Cerrar");
        Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarActionPerformed(evt);
            }
        });

        Borrar.setText("Borrar");
        Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarActionPerformed(evt);
            }
        });

        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        jLabel1.setText("Usuario:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Password:");

        jLabel4.setText("Rol:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        CargaMasiva1.setText("Carga Masiva");
        CargaMasiva1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargaMasiva1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                                            .addComponent(jTextField2)
                                            .addComponent(jTextField1))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Borrar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Modificar)
                                        .addGap(34, 34, 34)
                                        .addComponent(CargaMasiva1)
                                        .addGap(42, 42, 42))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cerrar)
                            .addComponent(Guardar))
                        .addGap(28, 28, 28)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Borrar)
                    .addComponent(Cerrar)
                    .addComponent(Modificar)
                    .addComponent(CargaMasiva1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Guardar))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_CerrarActionPerformed

    private void BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarActionPerformed
        
        int eliminar = jTable1.getSelectedRow();
        
        if(eliminar > 0){
            if(JOptionPane.showConfirmDialog(this, "¿Estás seguro que deseas eliminar el usuario seleccionado?") == 0){
                
                usuario = usuariosActivos.get(eliminar);
                //Proyecto_Final_Log_In.usuarios.remove(eliminar);  Ya no se elmina de la lista de objetos de tipo Usuario.
                usuario.setActivo(false);
                pintar_tabla();
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Selecciona un usuario válido para eliminar.");
        }
    }//GEN-LAST:event_BorrarActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
 
        if(jTable1.getSelectedRow() >= 0 ){
            usuario = usuariosActivos.get(jTable1.getSelectedRow());
            jTextField1.setText(usuario.getNombre());
            jTextField2.setText(usuario.getUsuario());
            jTextField3.setText(usuario.getPassword());

            if(usuario.getRol().equals("Administrador")){
                jComboBox1.setSelectedIndex(0);
            }
            else{
                jComboBox1.setSelectedIndex(1);
            }
            
        }
        else{
            JOptionPane.showMessageDialog(this, "Selecciona un usuario válido para modificar.");
        }     
    }//GEN-LAST:event_ModificarActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        
        if (usuario != null) {
            usuario.setNombre(jTextField1.getText());
            usuario.setPassword(jTextField3.getText());

            String Rol = jComboBox1.getSelectedItem().toString();

            if(Rol.equals("Administrador")){
                usuario.setRol(Rol);
            }else{
                usuario.setRol(Rol);
            }

            usuario.setUsuario(jTextField2.getText());
            pintar_tabla();

            JOptionPane.showMessageDialog(this, "Usuario modificado exitosamente.");
        }
    }//GEN-LAST:event_GuardarActionPerformed

    private String obtenerRuta(){
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos XML (*.xml)", "xml");
        
        fileChooser.setFileFilter(filtro);
        
        fileChooser.showOpenDialog(null);
        File archivo = fileChooser.getSelectedFile();
        
       int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea  cargar el archivo: \"" + archivo.getAbsolutePath() + "\"?", "Confirmación", JOptionPane.INFORMATION_MESSAGE);
        
       if (respuesta == JOptionPane.YES_OPTION) {
            return archivo.getAbsolutePath();
        } else {
            JOptionPane.showMessageDialog(
                null,
                "Selección cancelada.",
                "Cancelado",
                JOptionPane.WARNING_MESSAGE
            );
        } 
       
        return null;
    }
    
    private void leer(String ruta){
        
        try {
            DocumentBuilderFactory constructor = DocumentBuilderFactory.newInstance();
            DocumentBuilder lector = constructor.newDocumentBuilder();
            
            Document document = lector.parse(new File(ruta));
            document.getDocumentElement().normalize(); //limpiar
            
            NodeList nodos = document.getElementsByTagName("usuario");
            
            for(int j = 0; j < nodos.getLength(); j++){
                Node nodo = nodos.item(j);
                
                if(nodo.getNodeType() == Node.ELEMENT_NODE){
                    
                    try{
                        Element elemento = (Element) nodo;
                        String pass = elemento.getElementsByTagName("contraseña").item(0).getTextContent();

                        boolean validLength = true;
                        boolean validNumber = false;
                        boolean validLower = false;
                        boolean validCapital = false;
        
                        if(pass.length() < 6){
                            validLength = false;
                            continue;
                        }
        
                        
                        for(int i = 0; i < pass.length(); i++){
                            int ascii = (int) pass.charAt(i);
            
                            if(ascii >= 48 && ascii <= 57){ // Rango ASCII de los dígitos.
                                validNumber = true;
                            }
                        }
                        if(!validNumber){
                            continue;
                        }
        
                        
                        for(int i = 0; i < pass.length(); i++){ // Rango ASCII de las mayusculas.
                            int ascii = (int) pass.charAt(i);
            
                            if(ascii >= 65 && ascii <= 90){
                                validCapital = true;
                            }
                        }
                        if(!validCapital){
                            continue;
                        }
        
                        
                        for(int i = 0; i < pass.length(); i++){
                            int ascii = (int) pass.charAt(i);
            
                            if(ascii >= 97 && ascii <= 122){ // Rango ASCII de las minusculas.
                                validLower = true;
                            }
                        }
                        if(!validLower){
                            continue;
                        }
                
                        
                        if((validLength == true)&&(validNumber == true)&&(validCapital == true)&&(validLower == true)){
                            Usuario u = new Usuario();
                            u.setNombre(elemento.getElementsByTagName("nombre").item(0).getTextContent());
                            u.setUsuario(elemento.getElementsByTagName("user").item(0).getTextContent());
                            u.setPassword(pass);
                            String Rol = elemento.getElementsByTagName("rol").item(0).getTextContent();
                            
                            if(Rol.equalsIgnoreCase("Administrador")){
                                u.setRol("Administrador");
                            }else if(Rol.equalsIgnoreCase("Vendedor")){
                                u.setRol("Vendedor");
                            }else{
                                continue;
                            }
                            u.setActivo(true);
                            
                            Proyecto_Final_Log_In.usuarios.add(u);
                            
                        }
                    }
                    catch(HeadlessException e){
                        JOptionPane.showMessageDialog(this, "Error: " + e);
                    }
                }
            }
            
            JOptionPane.showMessageDialog(this, "Carga Masiva de Usuarios exitosa.");
            
        } catch (Exception ex) {
            Logger.getLogger(ConsultaUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void CargaMasiva1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargaMasiva1ActionPerformed
        String ruta = obtenerRuta();
        leer(ruta);
        pintar_tabla();
    }//GEN-LAST:event_CargaMasiva1ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Borrar;
    private javax.swing.JButton CargaMasiva1;
    private javax.swing.JButton Cerrar;
    private javax.swing.JButton Guardar;
    private javax.swing.JButton Modificar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
