package Vistas;

public class BatallaLibre extends javax.swing.JFrame {

    public BatallaLibre() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        separadorVertical = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        Jugador1 = new javax.swing.JPanel();
        AvatarJ1 = new javax.swing.JLabel();
        CBJugadorJ1 = new javax.swing.JComboBox();
        CBJugandoJ1 = new javax.swing.JComboBox();
        CBPuzzleDadosJ1 = new javax.swing.JComboBox();
        ButtonPersonalizarPuzzleJ1 = new javax.swing.JButton();
        CBEquipoJ1 = new javax.swing.JComboBox();
        Equipo = new javax.swing.JLabel();
        Fondoj1 = new javax.swing.JLabel();
        Jugador2 = new javax.swing.JPanel();
        AvatarJ2 = new javax.swing.JLabel();
        CBJugadorJ2 = new javax.swing.JComboBox();
        CBJugandoJ2 = new javax.swing.JComboBox();
        CBPuzzleDadosJ2 = new javax.swing.JComboBox();
        CBDificultadJ2 = new javax.swing.JComboBox();
        ButtonPersonalizarPuzzleJ2 = new javax.swing.JButton();
        CBEquipoJ2 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Jugador3 = new javax.swing.JPanel();
        AvatarJ3 = new javax.swing.JLabel();
        CBJugadorJ3 = new javax.swing.JComboBox();
        CBJugandoJ3 = new javax.swing.JComboBox();
        CBPuzzleDadosJ3 = new javax.swing.JComboBox();
        CBDificultadJ3 = new javax.swing.JComboBox();
        ButtonPersonalizarPuzzleJ3 = new javax.swing.JButton();
        CBEquipoJ3 = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Jugador4 = new javax.swing.JPanel();
        AvatarJ4 = new javax.swing.JLabel();
        CBJugadorJ4 = new javax.swing.JComboBox();
        CBJugandoJ4 = new javax.swing.JComboBox();
        CBPuzzleDadosJ4 = new javax.swing.JComboBox();
        CBDificultadJ4 = new javax.swing.JComboBox();
        ButtonPersonalizarPuzzleJ4 = new javax.swing.JButton();
        CBEquipoJ4 = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 700));
        getContentPane().setLayout(null);

        separadorVertical.setOrientation(javax.swing.SwingConstants.VERTICAL);
        separadorVertical.setPreferredSize(new java.awt.Dimension(5, 700));
        getContentPane().add(separadorVertical);
        separadorVertical.setBounds(342, 0, 10, 700);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 330, 700, 10);

        Jugador1.setOpaque(false);
        Jugador1.setPreferredSize(new java.awt.Dimension(342, 330));
        Jugador1.setLayout(null);

        AvatarJ1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Caras/Cara 1.png"))); // NOI18N
        AvatarJ1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AvatarJ1.setFocusable(false);
        Jugador1.add(AvatarJ1);
        AvatarJ1.setBounds(30, 30, 102, 102);

        CBJugadorJ1.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        CBJugadorJ1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Humano" }));
        CBJugadorJ1.setOpaque(false);
        Jugador1.add(CBJugadorJ1);
        CBJugadorJ1.setBounds(160, 40, 140, 28);

        CBJugandoJ1.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        CBJugandoJ1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Usuario" }));
        CBJugandoJ1.setOpaque(false);
        Jugador1.add(CBJugandoJ1);
        CBJugandoJ1.setBounds(160, 90, 140, 30);

        CBPuzzleDadosJ1.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        CBPuzzleDadosJ1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Puzzle dados 1", "Puzzle dados 2", "Puzzle dados 3", "Puzzle dados 4", "Personalizado" }));
        Jugador1.add(CBPuzzleDadosJ1);
        CBPuzzleDadosJ1.setBounds(30, 150, 270, 28);

        ButtonPersonalizarPuzzleJ1.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        ButtonPersonalizarPuzzleJ1.setText("Personalizar puzzle");
        Jugador1.add(ButtonPersonalizarPuzzleJ1);
        ButtonPersonalizarPuzzleJ1.setBounds(30, 190, 270, 31);

        CBEquipoJ1.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        CBEquipoJ1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4" }));
        CBEquipoJ1.setOpaque(false);
        Jugador1.add(CBEquipoJ1);
        CBEquipoJ1.setBounds(30, 270, 60, 20);

        Equipo.setBackground(new java.awt.Color(255, 255, 255));
        Equipo.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        Equipo.setForeground(new java.awt.Color(255, 255, 255));
        Equipo.setText("Equipo");
        Jugador1.add(Equipo);
        Equipo.setBounds(30, 240, 60, 22);

        Fondoj1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondos/FondoAzulT.png"))); // NOI18N
        Jugador1.add(Fondoj1);
        Fondoj1.setBounds(0, 0, 400, 400);
        Fondoj1.getAccessibleContext().setAccessibleName("J1Fondo");

        getContentPane().add(Jugador1);
        Jugador1.setBounds(0, 0, 342, 330);

        Jugador2.setOpaque(false);
        Jugador2.setPreferredSize(new java.awt.Dimension(342, 330));
        Jugador2.setLayout(null);

        AvatarJ2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Caras/PNJ7.png"))); // NOI18N
        AvatarJ2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AvatarJ2.setFocusable(false);
        Jugador2.add(AvatarJ2);
        AvatarJ2.setBounds(30, 30, 102, 102);

        CBJugadorJ2.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        CBJugadorJ2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Humano", "PNJ" }));
        CBJugadorJ2.setSelectedIndex(1);
        CBJugadorJ2.setOpaque(false);
        CBJugadorJ2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBJugadorJ2ActionPerformed(evt);
            }
        });
        Jugador2.add(CBJugadorJ2);
        CBJugadorJ2.setBounds(160, 40, 140, 28);

        CBJugandoJ2.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        CBJugandoJ2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yugi", "Kaiba", "Tea", "Pegasus", "Joey", "Bakura", "Duke", "Yami Yugi", "Aleatorio", " " }));
        CBJugandoJ2.setSelectedIndex(6);
        CBJugandoJ2.setOpaque(false);
        Jugador2.add(CBJugandoJ2);
        CBJugandoJ2.setBounds(160, 90, 140, 30);

        CBPuzzleDadosJ2.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        CBPuzzleDadosJ2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Puzzle dados 1", "Puzzle dados 2", "Puzzle dados 3", "Puzzle dados 4", "Personalizado" }));
        Jugador2.add(CBPuzzleDadosJ2);
        CBPuzzleDadosJ2.setBounds(400, 20, 270, 28);

        CBDificultadJ2.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        CBDificultadJ2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Facil", "Normal", "Dificil", "Aleatorio" }));
        CBDificultadJ2.setSelectedIndex(2);
        Jugador2.add(CBDificultadJ2);
        CBDificultadJ2.setBounds(30, 150, 270, 28);

        ButtonPersonalizarPuzzleJ2.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        ButtonPersonalizarPuzzleJ2.setText("Personalizar puzzle");
        Jugador2.add(ButtonPersonalizarPuzzleJ2);
        ButtonPersonalizarPuzzleJ2.setBounds(400, 60, 270, 31);

        CBEquipoJ2.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        CBEquipoJ2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4" }));
        CBEquipoJ2.setSelectedIndex(1);
        CBEquipoJ2.setOpaque(false);
        Jugador2.add(CBEquipoJ2);
        CBEquipoJ2.setBounds(30, 270, 60, 20);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Equipo");
        Jugador2.add(jLabel5);
        jLabel5.setBounds(30, 240, 60, 22);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondos/FondoRojoT.png"))); // NOI18N
        Jugador2.add(jLabel6);
        jLabel6.setBounds(0, 0, 400, 400);

        getContentPane().add(Jugador2);
        Jugador2.setBounds(342, 0, 342, 330);

        Jugador3.setOpaque(false);
        Jugador3.setPreferredSize(new java.awt.Dimension(342, 330));
        Jugador3.setLayout(null);

        AvatarJ3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Caras/PNJ9.png"))); // NOI18N
        AvatarJ3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AvatarJ3.setFocusable(false);
        Jugador3.add(AvatarJ3);
        AvatarJ3.setBounds(30, 30, 102, 102);

        CBJugadorJ3.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        CBJugadorJ3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " - - -", "Humano", "PNJ" }));
        CBJugadorJ3.setSelectedIndex(2);
        CBJugadorJ3.setOpaque(false);
        CBJugadorJ3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBJugadorJ3ActionPerformed(evt);
            }
        });
        Jugador3.add(CBJugadorJ3);
        CBJugadorJ3.setBounds(160, 40, 140, 28);

        CBJugandoJ3.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        CBJugandoJ3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yugi", "Kaiba", "Tea", "Pegasus", "Joey", "Bakura", "Duke", "Yami Yugi", "Aleatorio", " " }));
        CBJugandoJ3.setSelectedIndex(8);
        CBJugandoJ3.setOpaque(false);
        Jugador3.add(CBJugandoJ3);
        CBJugandoJ3.setBounds(160, 90, 140, 30);

        CBPuzzleDadosJ3.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        CBPuzzleDadosJ3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Puzzle dados 1", "Puzzle dados 2", "Puzzle dados 3", "Puzzle dados 4", "Personalizado" }));
        Jugador3.add(CBPuzzleDadosJ3);
        CBPuzzleDadosJ3.setBounds(400, 20, 270, 28);

        CBDificultadJ3.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        CBDificultadJ3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Facil", "Normal", "Dificil", "Aleatorio" }));
        CBDificultadJ3.setSelectedIndex(3);
        Jugador3.add(CBDificultadJ3);
        CBDificultadJ3.setBounds(30, 150, 270, 28);

        ButtonPersonalizarPuzzleJ3.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        ButtonPersonalizarPuzzleJ3.setText("Personalizar puzzle");
        Jugador3.add(ButtonPersonalizarPuzzleJ3);
        ButtonPersonalizarPuzzleJ3.setBounds(400, 60, 270, 31);

        CBEquipoJ3.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        CBEquipoJ3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4" }));
        CBEquipoJ3.setSelectedIndex(2);
        CBEquipoJ3.setOpaque(false);
        Jugador3.add(CBEquipoJ3);
        CBEquipoJ3.setBounds(30, 270, 60, 20);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Equipo");
        Jugador3.add(jLabel7);
        jLabel7.setBounds(30, 240, 60, 22);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondos/FondoVerdeT.png"))); // NOI18N
        Jugador3.add(jLabel8);
        jLabel8.setBounds(0, 0, 400, 400);

        getContentPane().add(Jugador3);
        Jugador3.setBounds(0, 333, 342, 330);

        Jugador4.setOpaque(false);
        Jugador4.setPreferredSize(new java.awt.Dimension(342, 330));
        Jugador4.setLayout(null);

        AvatarJ4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Caras/PNJ0.png"))); // NOI18N
        AvatarJ4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AvatarJ4.setFocusable(false);
        Jugador4.add(AvatarJ4);
        AvatarJ4.setBounds(30, 30, 102, 102);

        CBJugadorJ4.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        CBJugadorJ4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " - - -", "Humano", "PNJ" }));
        CBJugadorJ4.setOpaque(false);
        CBJugadorJ4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBJugadorJ4ActionPerformed(evt);
            }
        });
        Jugador4.add(CBJugadorJ4);
        CBJugadorJ4.setBounds(160, 40, 140, 28);

        CBJugandoJ4.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        CBJugandoJ4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yugi", "Kaiba", "Tea", "Pegasus", "Joey", "Bakura", "Duke", "Yami Yugi", "Aleatorio", " " }));
        CBJugandoJ4.setSelectedIndex(8);
        CBJugandoJ4.setOpaque(false);
        Jugador4.add(CBJugandoJ4);
        CBJugandoJ4.setBounds(400, 100, 140, 30);

        CBPuzzleDadosJ4.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        CBPuzzleDadosJ4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Puzzle dados 1", "Puzzle dados 2", "Puzzle dados 3", "Puzzle dados 4", "Personalizado" }));
        Jugador4.add(CBPuzzleDadosJ4);
        CBPuzzleDadosJ4.setBounds(400, 20, 270, 28);

        CBDificultadJ4.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        CBDificultadJ4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Facil", "Normal", "Dificil", "Aleatorio" }));
        CBDificultadJ4.setSelectedIndex(3);
        Jugador4.add(CBDificultadJ4);
        CBDificultadJ4.setBounds(400, 140, 270, 28);

        ButtonPersonalizarPuzzleJ4.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        ButtonPersonalizarPuzzleJ4.setText("Personalizar puzzle");
        ButtonPersonalizarPuzzleJ4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonPersonalizarPuzzleJ4MouseClicked(evt);
            }
        });
        Jugador4.add(ButtonPersonalizarPuzzleJ4);
        ButtonPersonalizarPuzzleJ4.setBounds(400, 60, 270, 31);

        CBEquipoJ4.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        CBEquipoJ4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4" }));
        CBEquipoJ4.setSelectedIndex(3);
        CBEquipoJ4.setOpaque(false);
        Jugador4.add(CBEquipoJ4);
        CBEquipoJ4.setBounds(400, 270, 60, 20);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Equipo");
        Jugador4.add(jLabel9);
        jLabel9.setBounds(400, 240, 60, 22);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondos/FondoAmarilloT.png"))); // NOI18N
        Jugador4.add(jLabel10);
        jLabel10.setBounds(0, 0, 400, 400);

        getContentPane().add(Jugador4);
        Jugador4.setBounds(341, 333, 342, 330);

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondos/Fondo.png"))); // NOI18N
        getContentPane().add(Fondo);
        Fondo.setBounds(0, 0, 700, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CBJugadorJ2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBJugadorJ2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBJugadorJ2ActionPerformed

    private void CBJugadorJ3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBJugadorJ3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBJugadorJ3ActionPerformed

    private void CBJugadorJ4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBJugadorJ4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBJugadorJ4ActionPerformed

    private void ButtonPersonalizarPuzzleJ4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonPersonalizarPuzzleJ4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonPersonalizarPuzzleJ4MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AvatarJ1;
    private javax.swing.JLabel AvatarJ2;
    private javax.swing.JLabel AvatarJ3;
    private javax.swing.JLabel AvatarJ4;
    private javax.swing.JButton ButtonPersonalizarPuzzleJ1;
    private javax.swing.JButton ButtonPersonalizarPuzzleJ2;
    private javax.swing.JButton ButtonPersonalizarPuzzleJ3;
    private javax.swing.JButton ButtonPersonalizarPuzzleJ4;
    private javax.swing.JComboBox CBDificultadJ2;
    private javax.swing.JComboBox CBDificultadJ3;
    private javax.swing.JComboBox CBDificultadJ4;
    private javax.swing.JComboBox CBEquipoJ1;
    private javax.swing.JComboBox CBEquipoJ2;
    private javax.swing.JComboBox CBEquipoJ3;
    private javax.swing.JComboBox CBEquipoJ4;
    private javax.swing.JComboBox CBJugadorJ1;
    private javax.swing.JComboBox CBJugadorJ2;
    private javax.swing.JComboBox CBJugadorJ3;
    private javax.swing.JComboBox CBJugadorJ4;
    private javax.swing.JComboBox CBJugandoJ1;
    private javax.swing.JComboBox CBJugandoJ2;
    private javax.swing.JComboBox CBJugandoJ3;
    private javax.swing.JComboBox CBJugandoJ4;
    private javax.swing.JComboBox CBPuzzleDadosJ1;
    private javax.swing.JComboBox CBPuzzleDadosJ2;
    private javax.swing.JComboBox CBPuzzleDadosJ3;
    private javax.swing.JComboBox CBPuzzleDadosJ4;
    private javax.swing.JLabel Equipo;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Fondoj1;
    private javax.swing.JPanel Jugador1;
    private javax.swing.JPanel Jugador2;
    private javax.swing.JPanel Jugador3;
    private javax.swing.JPanel Jugador4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator separadorVertical;
    // End of variables declaration//GEN-END:variables
}
