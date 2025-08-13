/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ifelse00;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * Autor: Diogenes
 */

/*
 * IFelse00 - Aplicação Java Swing para verificar maioridade
 * (Adaptado do código original)
 */


public class IFelse00 extends JFrame {
    
    private final JTextField txtIdade;  // Campo para a idade (substitui txtValor1)
    private final JLabel lblResultado;
    
    public IFelse00() {
        setTitle("IFelse00 - Verificador de Maioridade");
        setSize(400, 300);
        setLayout(new GridLayout(4, 2, 10, 10));
        
        // Componentes
        JLabel lblIdade = new JLabel("Digite sua idade:");
        txtIdade = new JTextField();
        
        JButton btnVerificar = new JButton("Verificar");
        btnVerificar.addActionListener(e -> verificarMaioridade());
        
        lblResultado = new JLabel(" ", SwingConstants.CENTER);
        lblResultado.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        lblResultado.setFont(new Font("Arial", Font.BOLD, 14));
        
        // Adiciona componentes à janela
        add(lblIdade);
        add(txtIdade);
        add(btnVerificar);
        add(new JLabel());  // Espaço vazio (para manter o layout)
        add(new JLabel("Resultado:"));
        add(lblResultado);
        
        setLocationRelativeTo(null);
    }
    
    private void verificarMaioridade() {
        try {
            int idade = Integer.parseInt(txtIdade.getText());
            
            // ESTRUTURA CONDICIONAL (IF/ELSE)
            if (idade >= 18) {
                lblResultado.setText("MAIOR DE IDADE (≥18 anos)");
                lblResultado.setForeground(Color.GREEN);
            } else {
                lblResultado.setText("MENOR DE IDADE (" + idade + " anos)");
                lblResultado.setForeground(Color.RED);
            }
            
        } catch (NumberFormatException ex) {
            lblResultado.setText("Erro: Digite um número válido!");
            lblResultado.setForeground(Color.RED);
        }
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            IFelse00 app = new IFelse00();
            app.setVisible(true);
        });
    }
}


    

