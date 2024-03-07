/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplobigdecimal;

import java.math.*;

/**
 *
 * @author aluno
 */
public class ExemploBigDecimal {

    public static void main(String[] args) {
        BigDecimal valor = new BigDecimal("1.0");
        //  soma
        valor = valor.add(new BigDecimal("2.0"));
        System.out.println("Soma: "+valor);
        
        //  subtrai
        valor = valor.subtract(new BigDecimal("2.0"));
        System.out.println("subtrai: "+valor);
        
        //  dividir
        valor = new BigDecimal("10");
        valor = valor.divide(new BigDecimal("2.0"));
        System.out.println("Divisão: "+valor);
        
        //  Multiplica
        valor = new BigDecimal("2");
        valor = valor.multiply(new BigDecimal("2.0"));
        System.out.println("Divisão: "+valor);
        
        //  compare
        //  -1 é menor
        //  0 é igual
        //  1 é maior 
        valor = new BigDecimal("2");
        int compara = valor.compareTo(new BigDecimal("2"));
        System.out.println("Comparação: "+compara);
        
        //  Retorna manor entra 2 número
        valor = new BigDecimal("2");
        BigDecimal max = valor.max(new BigDecimal("5"));
        System.out.println("Maior: "+max);
        
        //  Retorna menor entra 2 número
        valor = new BigDecimal("2");
        BigDecimal min = valor.max(new BigDecimal("5"));
        System.out.println("Maior: "+min);
        
        //  Arrendodadmento para cima
        valor = new BigDecimal("111.5555");
        valor = valor.setScale(3,RoundingMode.CEILING);
        System.out.println("CEILING: "+valor);
        
        
        valor = new BigDecimal("111.5555");
        valor = valor.setScale(3,RoundingMode.DOWN);
        System.out.println("DOWN: "+valor);
        
        valor = new BigDecimal("111.5555");
        valor = valor.setScale(3,RoundingMode.UP);
        System.out.println("UP: "+valor);
        
        valor = new BigDecimal("111.5555");
        valor = valor.setScale(3,RoundingMode.HALF_UP);
        System.out.println("HALF_UP: "+valor);
        
        valor = new BigDecimal("111.5555");
        valor = valor.setScale(3,RoundingMode.HALF_DOWN);
        System.out.println("HALF_DOWN: "+valor);
        
        new FramePrincipal().setVisible(true);
        
    }
}
