/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class FrameCalculadora extends javax.swing.JFrame {

    public String x = ""; 
    public String op = "";
    public String y = "";

    public FrameCalculadora() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tfResultado = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btZero = new javax.swing.JButton();
        btUm = new javax.swing.JButton();
        btSete = new javax.swing.JButton();
        btQuadro = new javax.swing.JButton();
        btDois = new javax.swing.JButton();
        btCinco = new javax.swing.JButton();
        btOito = new javax.swing.JButton();
        btTres = new javax.swing.JButton();
        btMenos = new javax.swing.JButton();
        btMultiplicar = new javax.swing.JButton();
        btSeis = new javax.swing.JButton();
        btNove = new javax.swing.JButton();
        btDivisao = new javax.swing.JButton();
        btIgual = new javax.swing.JButton();
        btMais = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.lightGray, null, null));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tfResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tfResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btZero.setText("0");
        btZero.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, java.awt.Color.gray));
        btZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btZeroActionPerformed(evt);
            }
        });

        btUm.setText("1");
        btUm.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, java.awt.Color.gray));
        btUm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUmActionPerformed(evt);
            }
        });

        btSete.setText("7");
        btSete.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, java.awt.Color.gray));
        btSete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSeteActionPerformed(evt);
            }
        });

        btQuadro.setText("4");
        btQuadro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, java.awt.Color.gray));
        btQuadro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQuadroActionPerformed(evt);
            }
        });

        btDois.setText("2");
        btDois.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, java.awt.Color.gray));
        btDois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDoisActionPerformed(evt);
            }
        });

        btCinco.setText("5");
        btCinco.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, java.awt.Color.gray));
        btCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCincoActionPerformed(evt);
            }
        });

        btOito.setText("8");
        btOito.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, java.awt.Color.gray));
        btOito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOitoActionPerformed(evt);
            }
        });

        btTres.setText("3");
        btTres.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, java.awt.Color.gray));
        btTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTresActionPerformed(evt);
            }
        });

        btMenos.setText("-");
        btMenos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, java.awt.Color.gray));
        btMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMenosActionPerformed(evt);
            }
        });

        btMultiplicar.setText("*");
        btMultiplicar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, java.awt.Color.gray));
        btMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMultiplicarActionPerformed(evt);
            }
        });

        btSeis.setText("6");
        btSeis.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, java.awt.Color.gray));
        btSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSeisActionPerformed(evt);
            }
        });

        btNove.setText("9");
        btNove.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, java.awt.Color.gray));
        btNove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNoveActionPerformed(evt);
            }
        });

        btDivisao.setText("/");
        btDivisao.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, java.awt.Color.gray));
        btDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDivisaoActionPerformed(evt);
            }
        });

        btIgual.setText("=");
        btIgual.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, java.awt.Color.gray));
        btIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIgualActionPerformed(evt);
            }
        });

        btMais.setText("+");
        btMais.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, java.awt.Color.gray));
        btMais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMaisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btZero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btUm, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btSete, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btQuadro, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btDois, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btOito, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btTres, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btNove, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btMais, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btSete, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btQuadro, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btUm, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btOito, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btDois, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btNove, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btTres, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btZero, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btMais, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btZeroActionPerformed
        String btZero = tfResultado.getText();
        tfResultado.setText(btZero + " 0");
        
        if(op == null){
            x = "0";
        }else{
            y = "0";
        }
                   

    }//GEN-LAST:event_btZeroActionPerformed

    private void btUmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUmActionPerformed
        String btUm = tfResultado.getText();
        tfResultado.setText(btUm + " 1");
        
        if(op == null){
            x = "1";
        }else{
            y = "1";
        }


    }//GEN-LAST:event_btUmActionPerformed

    private void btSeteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSeteActionPerformed
        String btSete = tfResultado.getText();
        tfResultado.setText(btSete + " 7");
        
        if(op == null){
            x = "7";
        }else{
            y = "7";
        }
    }//GEN-LAST:event_btSeteActionPerformed

    private void btQuadroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQuadroActionPerformed
        String btQuatro = tfResultado.getText();
        tfResultado.setText(btQuatro + " 4");
        
        if(op == null){
            x = "4";
        }else{
            y = "4";
        }
    }//GEN-LAST:event_btQuadroActionPerformed

    private void btDoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDoisActionPerformed
        String btDois = tfResultado.getText();
        tfResultado.setText(btDois + " 2");
        
        if(op == null){
            x = "2";
        }else{
            y = "2";
        }
    }//GEN-LAST:event_btDoisActionPerformed

    private void btCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCincoActionPerformed
        String btCinco = tfResultado.getText();
        tfResultado.setText(btCinco + " 5");
        
        if(op == null){
            x = "5";
        }else{
            y = "5";
        }
    }//GEN-LAST:event_btCincoActionPerformed

    private void btOitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOitoActionPerformed
        String btOito = tfResultado.getText();
        tfResultado.setText(btOito + " 8");
        
        if(op == null){
            x = "8";
        }else{
            y = "8";
        }
    }//GEN-LAST:event_btOitoActionPerformed

    private void btTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTresActionPerformed
        String btTres = tfResultado.getText();
        tfResultado.setText(btTres + " 3");
        
        if(op == ""){
            x += "3";
        }else{
            y += "3";
        }
        System.out.println("x"+x);
        System.out.println("op"+op);
        System.out.println("y"+y);
    }//GEN-LAST:event_btTresActionPerformed

    private void btMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMenosActionPerformed
        String btMenos = tfResultado.getText();
        if (btMenos.equals("")) {
            JOptionPane.showMessageDialog(null, "Formato usado Invalido");
        } else {
            tfResultado.setText(btMenos + " -");
            op = "-";
        }
    }//GEN-LAST:event_btMenosActionPerformed

    private void btMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMultiplicarActionPerformed
        String btMultiplicar = tfResultado.getText();
        if (btMultiplicar.equals("")) {
            JOptionPane.showMessageDialog(null, "Formato usado Invalido");
        } else {
            tfResultado.setText(btMultiplicar + " *");
            op = "*";
        }
    }//GEN-LAST:event_btMultiplicarActionPerformed

    private void btSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSeisActionPerformed
        String btSeis = tfResultado.getText();
        tfResultado.setText(btSeis + " 6");
        if(op == null){
            x += "6";
        }else{
            y += "6";
        }
        
    }//GEN-LAST:event_btSeisActionPerformed

    private void btNoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNoveActionPerformed
        String btNove = tfResultado.getText();
        tfResultado.setText(btNove + " 9");
        
        if(op == null){
            x += "9";
        }else{
            y += "9";
        }
       
        
    }//GEN-LAST:event_btNoveActionPerformed

    private void btDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDivisaoActionPerformed
        String btDivisao = tfResultado.getText();
        if (btDivisao.equals("")) {
            JOptionPane.showMessageDialog(null, "Formato usado Invalido");
        } else {
            tfResultado.setText(btDivisao + " /");
            op = "/";
        }
    }//GEN-LAST:event_btDivisaoActionPerformed

    private void btIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIgualActionPerformed
        String btIgual = tfResultado.getText();

        if (btIgual.equals("")) {
            JOptionPane.showMessageDialog(null, "Formato usado Invalido");
        } else {
            tfResultado.setText(btIgual + " =");
        }
    }//GEN-LAST:event_btIgualActionPerformed

    private void btMaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMaisActionPerformed
        String btMais = tfResultado.getText();
        if (btMais.equals("")) {
            JOptionPane.showMessageDialog(null, "Formato usado Invalido");
        } else {
            tfResultado.setText(btMais + " +");
            op = "+";
        }
    }//GEN-LAST:event_btMaisActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCinco;
    private javax.swing.JButton btDivisao;
    private javax.swing.JButton btDois;
    private javax.swing.JButton btIgual;
    private javax.swing.JButton btMais;
    private javax.swing.JButton btMenos;
    private javax.swing.JButton btMultiplicar;
    private javax.swing.JButton btNove;
    private javax.swing.JButton btOito;
    private javax.swing.JButton btQuadro;
    private javax.swing.JButton btSeis;
    private javax.swing.JButton btSete;
    private javax.swing.JButton btTres;
    private javax.swing.JButton btUm;
    private javax.swing.JButton btZero;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField tfResultado;
    // End of variables declaration//GEN-END:variables
}
