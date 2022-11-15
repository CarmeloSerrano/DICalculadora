package com.mycompany.dicalculadora;

import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.KeyStroke;
import java.awt.GridBagConstraints;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author DAM2
 */
public class Vista_Presentador extends javax.swing.JFrame {

    Modelo modelo;
    boolean haEscritoNum;
    char operador;
    
    
   
    
    public Vista_Presentador() {
        initComponents();
        modelo=new Modelo();
       
        
        this.boton1.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                        .put(KeyStroke.getKeyStroke("1"), "1");
        this.boton1.getActionMap().put("1", new AbstractAction() {
          @Override public void actionPerformed(ActionEvent ae) {
            boton1.doClick();
          }
        });
        
        this.boton1.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                        .put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD1, 0), "1");
        this.boton1.getActionMap().put("1", new AbstractAction() {
          @Override public void actionPerformed(ActionEvent ae) {
            boton1.doClick();
          }
        });
        
        this.boton2.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                        .put(KeyStroke.getKeyStroke("2"), "2");
        this.boton2.getActionMap().put("2", new AbstractAction() {
          @Override public void actionPerformed(ActionEvent ae) {
            boton2.doClick();
          }
        });
        
        this.boton2.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                        .put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD2, 0), "2");
        this.boton2.getActionMap().put("2", new AbstractAction() {
          @Override public void actionPerformed(ActionEvent ae) {
            boton2.doClick();
          }
        });
        
        this.boton3.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                        .put(KeyStroke.getKeyStroke("3"), "3");
        this.boton3.getActionMap().put("3", new AbstractAction() {
          @Override public void actionPerformed(ActionEvent ae) {
            boton3.doClick();
          }
        });
        
        this.boton3.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                        .put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD3, 0), "3");
        this.boton3.getActionMap().put("3", new AbstractAction() {
          @Override public void actionPerformed(ActionEvent ae) {
            boton3.doClick();
          }
        });
        
        this.boton4.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                        .put(KeyStroke.getKeyStroke("4"), "4");
        this.boton4.getActionMap().put("4", new AbstractAction() {
          @Override public void actionPerformed(ActionEvent ae) {
            boton4.doClick();
          }
        });
        
        this.boton4.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                        .put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD4, 0), "4");
        this.boton4.getActionMap().put("4", new AbstractAction() {
          @Override public void actionPerformed(ActionEvent ae) {
            boton4.doClick();
          }
        });
        
        this.boton5.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                        .put(KeyStroke.getKeyStroke("5"), "5");
        this.boton5.getActionMap().put("5", new AbstractAction() {
          @Override public void actionPerformed(ActionEvent ae) {
            boton5.doClick();
          }
        });
        
        this.boton5.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                        .put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD5, 0), "5");
        this.boton5.getActionMap().put("5", new AbstractAction() {
          @Override public void actionPerformed(ActionEvent ae) {
            boton5.doClick();
          }
        });
        
        this.boton6.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                        .put(KeyStroke.getKeyStroke("6"), "6");
        this.boton6.getActionMap().put("6", new AbstractAction() {
          @Override public void actionPerformed(ActionEvent ae) {
            boton6.doClick();
          }
        });
        
        this.boton6.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                        .put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD6, 0), "6");
        this.boton6.getActionMap().put("6", new AbstractAction() {
          @Override public void actionPerformed(ActionEvent ae) {
            boton6.doClick();
          }
        });
        
        this.boton7.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                        .put(KeyStroke.getKeyStroke("7"), "7");
        this.boton7.getActionMap().put("7", new AbstractAction() {
          @Override public void actionPerformed(ActionEvent ae) {
            boton7.doClick();
          }
        });
        
        this.boton7.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                        .put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD7, 0), "7");
        this.boton7.getActionMap().put("7", new AbstractAction() {
          @Override public void actionPerformed(ActionEvent ae) {
            boton7.doClick();
          }
        });
        
        this.boton8.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                        .put(KeyStroke.getKeyStroke("8"), "8");
        this.boton8.getActionMap().put("8", new AbstractAction() {
          @Override public void actionPerformed(ActionEvent ae) {
            boton8.doClick();
          }
        });
        
        this.boton8.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                        .put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD8, 0), "8");
        this.boton8.getActionMap().put("8", new AbstractAction() {
          @Override public void actionPerformed(ActionEvent ae) {
            boton8.doClick();
          }
        });
        
        this.boton9.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                        .put(KeyStroke.getKeyStroke("9"), "9");
        this.boton9.getActionMap().put("9", new AbstractAction() {
          @Override public void actionPerformed(ActionEvent ae) {
            boton9.doClick();
          }
        });
        
        this.boton9.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                        .put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD9, 0), "9");
        this.boton9.getActionMap().put("9", new AbstractAction() {
          @Override public void actionPerformed(ActionEvent ae) {
            boton9.doClick();
          }
        });
        
        this.boton0.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                        .put(KeyStroke.getKeyStroke("0"), "0");
        this.boton0.getActionMap().put("0", new AbstractAction() {
          @Override public void actionPerformed(ActionEvent ae) {
            boton0.doClick();
          }
        });
        
        this.boton0.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                        .put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD0, 0), "0");
        this.boton0.getActionMap().put("0", new AbstractAction() {
          @Override public void actionPerformed(ActionEvent ae) {
            boton0.doClick();
          }
        });
        
        this.botoncoma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                        .put(KeyStroke.getKeyStroke(KeyEvent.VK_COMMA, 0), ",");
        this.botoncoma.getActionMap().put(",", new AbstractAction() {
          @Override public void actionPerformed(ActionEvent ae) {
            botoncoma.doClick();
          }
        });
        
        this.botoncoma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                        .put(KeyStroke.getKeyStroke(KeyEvent.VK_DECIMAL, 0), ",");
        this.botoncoma.getActionMap().put(",", new AbstractAction() {
          @Override public void actionPerformed(ActionEvent ae) {
            botoncoma.doClick();
          }
        });
        
        this.botondivision.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                        .put(KeyStroke.getKeyStroke(KeyEvent.VK_7, InputEvent.SHIFT_DOWN_MASK),"/");
        this.botondivision.getActionMap().put("/", new AbstractAction() {
          @Override public void actionPerformed(ActionEvent ae) {
            botondivision.doClick();
          }
        });
        
        this.botondivision.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                        .put(KeyStroke.getKeyStroke(KeyEvent.VK_DIVIDE, 0), "/");
        this.botondivision.getActionMap().put("/", new AbstractAction() {
          @Override public void actionPerformed(ActionEvent ae) {
            botondivision.doClick();
          }
        });
        
        this.botonmultiplicacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                        .put(KeyStroke.getKeyStroke(KeyEvent.VK_PLUS, InputEvent.SHIFT_DOWN_MASK),"*");
        this.botonmultiplicacion.getActionMap().put("*", new AbstractAction() {
          @Override public void actionPerformed(ActionEvent ae) {
            botonmultiplicacion.doClick();
          }
        });
        
        this.botonmultiplicacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                        .put(KeyStroke.getKeyStroke(KeyEvent.VK_MULTIPLY, 0), "*");
        this.botonmultiplicacion.getActionMap().put("*", new AbstractAction() {
          @Override public void actionPerformed(ActionEvent ae) {
            botonmultiplicacion.doClick();
          }
        });
        
        this.botonresta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                        .put(KeyStroke.getKeyStroke(KeyEvent.VK_MINUS, 0), "-");
        this.botonresta.getActionMap().put("-", new AbstractAction() {
          @Override public void actionPerformed(ActionEvent ae) {
            botonresta.doClick();
          }
        });
        
        this.botonresta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                        .put(KeyStroke.getKeyStroke(KeyEvent.VK_SUBTRACT, 0), "-");
        this.botonresta.getActionMap().put("-", new AbstractAction() {
          @Override public void actionPerformed(ActionEvent ae) {
            botonresta.doClick();
          }
        });
        
        this.botonsuma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                        .put(KeyStroke.getKeyStroke(KeyEvent.VK_PLUS, 0), "+");
        this.botonsuma.getActionMap().put("+", new AbstractAction() {
          @Override public void actionPerformed(ActionEvent ae) {
            botonsuma.doClick();
          }
        });
        
        this.botonsuma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                        .put(KeyStroke.getKeyStroke(KeyEvent.VK_ADD, 0), "+");
        this.botonsuma.getActionMap().put("+", new AbstractAction() {
          @Override public void actionPerformed(ActionEvent ae) {
            botonsuma.doClick();
          }
        });
        
    }
    
    
    private void calcula() {
        
        pantalla.getText();
        
        
        
        double a = Double.parseDouble(pantalla.getText());
        modelo.setNum(a);
        double b = modelo.calcula(operador);
        pantalla.setText(""+b);
        
     
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel2 = new javax.swing.JPanel();
        pantalla = new javax.swing.JTextField();
        botondivision = new javax.swing.JButton();
        boton8 = new javax.swing.JButton();
        boton9 = new javax.swing.JButton();
        boton7 = new javax.swing.JButton();
        boton4 = new javax.swing.JButton();
        boton5 = new javax.swing.JButton();
        boton6 = new javax.swing.JButton();
        boton1 = new javax.swing.JButton();
        botonresta = new javax.swing.JButton();
        botonmultiplicacion = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        boton0 = new javax.swing.JButton();
        botoncoma = new javax.swing.JButton();
        botonsuma = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new java.awt.GridBagLayout());

        pantalla.setEditable(false);
        pantalla.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        pantalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pantallaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 138;
        gridBagConstraints.ipady = 18;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 6);
        jPanel2.add(pantalla, gridBagConstraints);

        botondivision.setText("/");
        botondivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botondivisionActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 14;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 0, 6);
        jPanel2.add(botondivision, gridBagConstraints);

        boton8.setText("8");
        boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 14;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 0, 0);
        jPanel2.add(boton8, gridBagConstraints);

        boton9.setText("9");
        boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton9ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 14;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 0, 0);
        jPanel2.add(boton9, gridBagConstraints);

        boton7.setText("7");
        boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton7ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 14;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanel2.add(boton7, gridBagConstraints);

        boton4.setText("4");
        boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 14;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanel2.add(boton4, gridBagConstraints);

        boton5.setText("5");
        boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 14;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 0, 0);
        jPanel2.add(boton5, gridBagConstraints);

        boton6.setText("6");
        boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 14;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 0, 0);
        jPanel2.add(boton6, gridBagConstraints);

        boton1.setText("1");
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 14;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanel2.add(boton1, gridBagConstraints);

        botonresta.setText("-");
        botonresta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonrestaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 14;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 0, 6);
        jPanel2.add(botonresta, gridBagConstraints);

        botonmultiplicacion.setText("*");
        botonmultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonmultiplicacionActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 14;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 0, 6);
        jPanel2.add(botonmultiplicacion, gridBagConstraints);

        boton2.setText("2");
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 14;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 0, 0);
        jPanel2.add(boton2, gridBagConstraints);

        boton3.setText("3");
        boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 14;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 0, 0);
        jPanel2.add(boton3, gridBagConstraints);

        boton0.setText("0");
        boton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton0ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 69;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(7, 6, 0, 0);
        jPanel2.add(boton0, gridBagConstraints);

        botoncoma.setText(",");
        botoncoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoncomaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 14;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(7, 18, 0, 0);
        jPanel2.add(botoncoma, gridBagConstraints);

        botonsuma.setText("+");
        botonsuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonsumaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 14;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(7, 18, 0, 6);
        jPanel2.add(botonsuma, gridBagConstraints);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pantallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pantallaActionPerformed
        // TODO add your handling code here:
        
        /*this.boton8.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                        .put(KeyStroke.getKeyStroke("8"), "8");
        this.boton8.getActionMap().put("8", new AbstractAction() {
          @Override public void actionPerformed(ActionEvent ae) {
            boton8.doClick();
          }
        });*/
        
    }//GEN-LAST:event_pantallaActionPerformed

    private void botondivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botondivisionActionPerformed
        this.pantalla.setText(this.pantalla.getText()+"/");
        
    }//GEN-LAST:event_botondivisionActionPerformed

    private void boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton8ActionPerformed
        this.pantalla.setText(this.pantalla.getText()+"8");
         
    }//GEN-LAST:event_boton8ActionPerformed

    private void boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton9ActionPerformed
        this.pantalla.setText(this.pantalla.getText()+"9");
        
    }//GEN-LAST:event_boton9ActionPerformed

    private void boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton7ActionPerformed
       this.pantalla.setText(this.pantalla.getText()+"7");
       
    }//GEN-LAST:event_boton7ActionPerformed

    private void boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton4ActionPerformed
        this.pantalla.setText(this.pantalla.getText()+"4");
        
    }//GEN-LAST:event_boton4ActionPerformed

    private void boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton5ActionPerformed
        this.pantalla.setText(this.pantalla.getText()+"5");
        
    }//GEN-LAST:event_boton5ActionPerformed

    private void boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton6ActionPerformed
        this.pantalla.setText(this.pantalla.getText()+"6");
        
    }//GEN-LAST:event_boton6ActionPerformed

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        this.pantalla.setText(this.pantalla.getText()+"1");
        
    }//GEN-LAST:event_boton1ActionPerformed

    private void botonrestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonrestaActionPerformed
        this.pantalla.setText(this.pantalla.getText()+"-");
        
    }//GEN-LAST:event_botonrestaActionPerformed

    private void botonmultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonmultiplicacionActionPerformed
        this.pantalla.setText(this.pantalla.getText()+"*");
        
    }//GEN-LAST:event_botonmultiplicacionActionPerformed

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
        this.pantalla.setText(this.pantalla.getText()+"2");
        
    }//GEN-LAST:event_boton2ActionPerformed

    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3ActionPerformed
        this.pantalla.setText(this.pantalla.getText()+"3");
        
    }//GEN-LAST:event_boton3ActionPerformed

    private void boton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton0ActionPerformed
        this.pantalla.setText(this.pantalla.getText()+"0");
        
    }//GEN-LAST:event_boton0ActionPerformed

    private void botoncomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoncomaActionPerformed
        this.pantalla.setText(this.pantalla.getText()+",");
        
    }//GEN-LAST:event_botoncomaActionPerformed

    private void botonsumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonsumaActionPerformed
        this.pantalla.setText(this.pantalla.getText()+"+");
        
    }//GEN-LAST:event_botonsumaActionPerformed

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
            java.util.logging.Logger.getLogger(Vista_Presentador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista_Presentador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista_Presentador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_Presentador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista_Presentador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton0;
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton3;
    private javax.swing.JButton boton4;
    private javax.swing.JButton boton5;
    private javax.swing.JButton boton6;
    private javax.swing.JButton boton7;
    private javax.swing.JButton boton8;
    private javax.swing.JButton boton9;
    private javax.swing.JButton botoncoma;
    private javax.swing.JButton botondivision;
    private javax.swing.JButton botonmultiplicacion;
    private javax.swing.JButton botonresta;
    private javax.swing.JButton botonsuma;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField pantalla;
    // End of variables declaration//GEN-END:variables
}
